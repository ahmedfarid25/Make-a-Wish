package gui;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import client.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONObject;

public class SignUpController implements Initializable {

    @FXML
    private TextField emailTxt;
    @FXML
    private TextField passwordTxt;
    @FXML
    private TextField usernameTxt;
    @FXML
    private TextField conPasswordTxt;
    @FXML
    private Button signUpButton;
    @FXML
    private TextField phoneTxt;
    @FXML
    private TextField balanceTxt;

    Socket mySocket ;
    DataInputStream dis ;
    PrintStream ps;
    int port = 4015;
    String ip = "127.0.0.1";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private Scene signUpScene(){
        SignUpBase root = new SignUpBase();

        root.signUpButton.setOnAction(e -> {
            // Get username and password
            String username = root.usernameTxt.getText().trim();
            String password = root.passwordTxt.getText().trim();
            String conPass = root.conPasswordTxt.getText().trim();

            String email = root.emailTxt.getText().trim();
            String phone = root.phoneTxt.getText().trim();
            String balanceStr = root.balanceTxt.getText().trim();


            Client client = new Client();
            client.setEmail(email);
            client.setPassword(password);
            client.setUsername(username);
            client.setPhone(phone);

            switch(validate(client, conPass, balanceStr)){
                case "Good":
                    Long balance = Long.parseLong(balanceStr);
                    client.setBalance(balance);
                    // Perform Sign Up asynchronously in a separate thread

                    int results = handleSignUp(client);
                    if(results == 1){
                        root.usernameTxt.clear();
                        root.passwordTxt.clear();
                        root.conPasswordTxt.clear();
                        root.emailTxt.clear();
                        root.phoneTxt.clear();
                        root.balanceTxt.clear();
                        //TODO1: Go to the home page
                    }
                    else if(results == -1)
                        showAlert("Server is Down! We maybe on a break.\nTry Later");
                    else if (results == -2){
                        showAlert("Username is used!! Choose another one");
                    }
                    break;
                case "Empty Field":
                    showAlert("Enter all required Fields");
                    break;
                case "Invalid Password":
                    showAlert("Passwords Don't match");
                    break;
                case "Invalid Email":
                    showAlert("Enter a valid Email Address");
                    break;
                case "Invalid Balance":
                    showAlert("Enter a valid balance number");
                    break;
            }
        });
        Scene signUpScene = new Scene(root);
        return signUpScene;
    }

    public static String validate(Client client, String conPassword, String balance){
        // Define the email pattern using regex
        String emailRegex = "([a-zA-Z0-9_.%+-]{3,}@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(client.getEmail());
        try{
            Long balanceLong = Long.parseLong(balance);
        }
        catch(Exception e){
            return "Invalid Balance";
        }

        // Check if the email matches the pattern
        if(!matcher.matches())
            return "Invalid Email";
        else if (!client.getPassword().equals(conPassword))
            return "Invalid Password";
        else if(client.getUsername().isEmpty() ||
                client.getPassword().isEmpty() ||
                client.getEmail().isEmpty() ||
                client.getPhone().isEmpty())
            return "Empty Field";
        else
            return "Good";
    }

    private Scene homePageScene(Stage stage){
        HomeBase root = new HomeBase(stage);

        Scene signUpScene = new Scene(root);
        return signUpScene;
    }

    private int handleSignUp(Client client) {
        try {
            // Replace the IP address and port with your server's IP and port
            Socket socket = new Socket(ip, port);

            // Create data input and output streams
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            PrintStream ps = new PrintStream(socket.getOutputStream());

            JSONObject signUpData = new JSONObject();
            signUpData.put("Type", "sign up");
            signUpData.put("username", client.getUsername());
            signUpData.put("password", client.getPassword());
            signUpData.put("email", client.getEmail());
            signUpData.put("phone", client.getPhone());
            signUpData.put("balance", new Long(client.getBalance()));
            // Send the JSON string to the server
            ps.println(signUpData);
            ps.flush();

            // Read the server response
            String response = dis.readLine();
            System.out.println(response + "Here We Go");
            if(response == "-1"){
                return -2;
            }
            System.out.println(response);

            // Process the response (you can customize this part)
            System.out.println("Server Response: " + response);
            dis.close();
            ps.close();
            // Close the socket
            socket.close();
            return 1;
        } catch (Exception e) {
            return -1;


        }
    }

    public void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(message);
        a.setHeaderText("An Error Happened!");
        a.setTitle("Error!!");
        a.show();
    }

}

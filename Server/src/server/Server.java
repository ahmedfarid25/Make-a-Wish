package server;

import database.DataAccessLayer;
import gui.Person;
import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import utilities.Client;

public class Server extends Application implements Runnable{
    ServerSocket serverSocket;
    Thread listenThread;
    int port = 4015;
    private static Server instance;
    public Server() {
        // Private constructor to prevent instantiation
    }
        
    public void listen(){
        listenThread = new Thread(this);
        listenThread.start();
    }
    
    public static synchronized Server getInstance() {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
       tempUI root = new tempUI();
       Server server = new Server();
       

        root.startButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                server.listen();
                }
        });
        Scene scene = new Scene(root);
        
       stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                closeResources();
            }
        });

        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
       
    }

    @Override
    public void run() {
        try{
        serverSocket = new ServerSocket(port);
        }
        catch(Exception e){
             e.printStackTrace();
        }
        while (true){
            try{      
                Socket socket = serverSocket.accept();
                new Listener(socket);
            }
            catch(Exception e){
                     e.printStackTrace();
            }
        }
    }
    
    private void closeResources() {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
            stopApplication();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     private void stopApplication() {
      Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Platform.exit();
                System.exit(0);
            }
        });
     }

    public String addFriend(String jsonPerson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int handleSearchFriend(JSONObject jsonQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Listener extends Thread{
        DataInputStream inputData;
        PrintStream outputData;
        String message;
          
    public Listener(Socket socket){
        try{
            inputData = new DataInputStream(socket.getInputStream());
            outputData = new PrintStream(socket.getOutputStream());
            start();
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
    public void run(){
        while (true){
            try{
                message = inputData.readLine();
            
                if (message != null){
                 // Listen to the client
                 System.out.println(message);
                 Object clientData = JSONValue.parse(message);
                 JSONObject clientMessage = (JSONObject)clientData;
                 
                 String type
                    = (String)clientMessage.get("Type");
                 
                 int status = 0;
                 switch (type) {
                    case "sign in":
                        status = handleSignIn(clientMessage);
                    break;
                    case "sign up":
                        status = handleSignUp(clientMessage);
                        
                    break;
                    case "addFriend": // New case for addFriend
                        status = handleAddFriend(clientMessage);
                    break;
                    case "searchFriend":
                            // New case for searchFriend
                            status = handleSearchFriend(clientMessage);
                    break;
                    // additional cases as needed
                    default:
                    break;
}
                 // Respond to the client: according to the status update the user
                 this.outputData.println(status);
                 this.outputData.flush(); // Added1
                }
            }
        
            catch(Exception e){
            e.printStackTrace();
            }
    }
    }
    
    public int handleSignIn(JSONObject message){
            
        return 1;
    }
    
    public int handleSignUp(JSONObject message){
        Client client = new Client();
        
        String username
            = (String)message.get("username");
        String password
            = (String)message.get("password");
        String email
            = (String)message.get("email");
        String phone
            = (String)message.get("phone");
        Long balance
            = (Long)message.get("balance");
        
        client.setUsername(username);
        client.setPassword(password);           
        client.setEmail(email);
        client.setPhone(phone);
        client.setBalance(balance);
        
            try {
                int results = DataAccessLayer.addUser(client);
                return 1;
            } catch (SQLException ex) {
                switch(ex.getErrorCode())
                {
                    case 1:
                        return -1;   
                }
            }
        return 1;
    } 
    
    public int handleAddFriend(JSONObject message) {
        String sender_username = (String) message.get("sender_username");
        String receiver_username = (String) message.get("receiver_username");

        try {
            // Call your data access layer method to add a friend
            int results = DataAccessLayer.addFriend(sender_username, receiver_username);
            return results;
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle database-related exceptions
            return -1;
        }
    }
    
    
    public int handleSearchFriend(JSONObject jsonQuery) {
    String username = (String) jsonQuery.get("username");
    String searchQuery = (String) jsonQuery.get("searchQuery");

    try {
        // Call your data access layer method to search for friends
        ObservableList<Person> searchResults = DataAccessLayer.searchFriends(username, searchQuery);

        // Convert the ObservableList<Person> to a JSONArray
        JSONArray jsonArray = convertObservableListToJSONArray(searchResults);

        // Send the search results back to the client
        this.outputData.println(jsonArray.toJSONString());
        this.outputData.flush();

        // Return a status code (you can customize this based on your needs)
        return 1;
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle database-related exceptions
        return -1;
    }
}




     
     private JSONArray convertObservableListToJSONArray(ObservableList<Person> observableList) {
    JSONArray jsonArray = new JSONArray();

    for (Person person : observableList) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", person.getUsername());
        jsonObject.put("email", person.getEmail());
        jsonArray.add(jsonObject);
    }

    return jsonArray;
}
    


 
 
 
}
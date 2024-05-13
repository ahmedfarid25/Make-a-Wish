package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomeController implements Initializable {

    @FXML
    private Button profileButton;
    @FXML
    private Button addItemButton;
    @FXML
    private Button addFriendButton;
    @FXML
    private Button friendListButton;
    @FXML
    private Button notificationButton;
    @FXML
    private Button logOutButton;
    @FXML
    private Button aboutButton;
    @FXML
    private Label usernameTxt;
    @FXML
    private Label balanceTxt;

    private String username;
    private long balance;
    private Stage stage;
    private Scene scene;


    public void setData(String data, long balance) {
        this.username = data;
        this.balance = balance;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       usernameTxt.setText(username);
       balanceTxt.setText(Long.toString(balance));
       aboutButton.setOnAction(e -> {
          popUpAbout();
       });

        logOutButton.setOnAction(e -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        switchToLogIn(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        showAlert("An Error Happened");
                    }
                }
            });
        });

    }    

    public void popUpAbout(){
        Stage popupStage = new Stage();
        About root = new About();
        Scene aboutScene = new Scene(root);
        popupStage.setScene(aboutScene);
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.show();
    }

    public void switchToLogIn(ActionEvent event) throws Exception{
        Parent logIn = FXMLLoader.load(getClass().getResource("../gui/LogIn.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(logIn);
        stage.setScene(scene);
        stage.show();
    }

    public void showAlert(String message) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(message);
        a.setHeaderText("An Error Happened!");
        a.setTitle("Error!!");
        a.show();
    }
}

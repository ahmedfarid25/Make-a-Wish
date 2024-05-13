package gui;

import client.ClientSide;
import java.io.IOException;
import java.lang.String;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomeBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final RowConstraints rowConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final ImageView imageView6;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints14;
    protected final Label label;
    protected final Label label0;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints15;
    protected final RowConstraints rowConstraints16;
    protected final RowConstraints rowConstraints17;

    public HomeBase(Stage stage) {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        gridPane = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        rowConstraints12 = new RowConstraints();
        rowConstraints13 = new RowConstraints();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        imageView6 = new ImageView();
        gridPane0 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints14 = new RowConstraints();
        label = new Label();
        label0 = new Label();
        gridPane1 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints15 = new RowConstraints();
        rowConstraints16 = new RowConstraints();
        rowConstraints17 = new RowConstraints();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(673.0);
        setPrefWidth(1200.0);
        getStylesheets().add("/gui/../Styles/Style.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(468.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(297.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(717.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(650.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);


        GridPane.setRowSpan(gridPane, 3);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(688.0);
        gridPane.setPrefWidth(300.0);
        gridPane.setStyle("-fx-background-color: #F5F7FF;");

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(199.0);
        columnConstraints1.setPrefWidth(98.0);

        columnConstraints2.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints2.setMaxWidth(Double.MAX_VALUE);

        rowConstraints2.setMaxHeight(144.0);
        rowConstraints2.setMinHeight(98.0);
        rowConstraints2.setPercentHeight(18.25);
        rowConstraints2.setPrefHeight(144.0);

        rowConstraints3.setMaxHeight(144.0);
        rowConstraints3.setMinHeight(98.0);
        rowConstraints3.setPercentHeight(0.0);
        rowConstraints3.setPrefHeight(144.0);

        rowConstraints4.setMaxHeight(101.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPercentHeight(7.3);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(87.0);
        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPercentHeight(7.3);
        rowConstraints5.setPrefHeight(61.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMaxHeight(91.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPercentHeight(7.3);
        rowConstraints6.setPrefHeight(69.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(64.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPercentHeight(7.3);
        rowConstraints7.setPrefHeight(62.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPercentHeight(7.3);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPercentHeight(7.3);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPercentHeight(7.3);
        rowConstraints10.setPrefHeight(30.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPercentHeight(7.3);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPercentHeight(7.3);
        rowConstraints12.setPrefHeight(30.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints13.setMaxHeight(81.0);
        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPercentHeight(11.55);
        rowConstraints13.setPrefHeight(81.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(imageView, javafx.geometry.HPos.CENTER);
        GridPane.setHgrow(imageView, javafx.scene.layout.Priority.ALWAYS);
        GridPane.setRowIndex(imageView, 4);
        GridPane.setValignment(imageView, javafx.geometry.VPos.CENTER);
        GridPane.setVgrow(imageView, javafx.scene.layout.Priority.ALWAYS);
        imageView.setFitHeight(50.0);
        imageView.setFitWidth(50.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        //imageView.setImage(new Image(getClass().getResource("../Images/icons8-home-96.png").toExternalForm()));

        GridPane.setHalignment(imageView0, javafx.geometry.HPos.CENTER);
        GridPane.setHgrow(imageView0, javafx.scene.layout.Priority.SOMETIMES);
        GridPane.setRowIndex(imageView0, 5);
        GridPane.setValignment(imageView0, javafx.geometry.VPos.CENTER);
        imageView0.setFitHeight(50.0);
        imageView0.setFitWidth(50.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        //imageView0.setImage(new Image(getClass().getResource("../Images/icons8-add-96.png").toExternalForm()));

        GridPane.setHalignment(imageView1, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView1, 6);
        GridPane.setValignment(imageView1, javafx.geometry.VPos.CENTER);
        imageView1.setFitHeight(50.0);
        imageView1.setFitWidth(70.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        //imageView1.setImage(new Image(getClass().getResource("../Images/icons8-add-male-user-group-96%20(1).png").toExternalForm()));

        GridPane.setHalignment(imageView2, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView2, 7);
        GridPane.setValignment(imageView2, javafx.geometry.VPos.CENTER);
        imageView2.setFitHeight(50.0);
        imageView2.setFitWidth(50.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        //imageView2.setImage(new Image(getClass().getResource("../Images/icons8-bulleted-list-96.png").toExternalForm()));

        GridPane.setHalignment(imageView3, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView3, 8);
        GridPane.setValignment(imageView3, javafx.geometry.VPos.CENTER);
        imageView3.setFitHeight(50.0);
        imageView3.setFitWidth(50.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        //imageView3.setImage(new Image(getClass().getResource("../Images/icons8-bell-96.png").toExternalForm()));

        GridPane.setHalignment(imageView4, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView4, 9);
        GridPane.setValignment(imageView4, javafx.geometry.VPos.CENTER);
        imageView4.setFitHeight(50.0);
        imageView4.setFitWidth(50.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        //imageView4.setImage(new Image(getClass().getResource("../Images/icons8-log-out-96.png").toExternalForm()));

        GridPane.setHalignment(imageView5, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView5, 11);
        GridPane.setValignment(imageView5, javafx.geometry.VPos.CENTER);
        imageView5.setFitHeight(75.0);
        imageView5.setFitWidth(75.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        //imageView5.setImage(new Image(getClass().getResource("../Images/icons8-about-96.png").toExternalForm()));

        GridPane.setColumnIndex(button, 1);
        GridPane.setHgrow(button, javafx.scene.layout.Priority.ALWAYS);
        GridPane.setRowIndex(button, 4);
        GridPane.setValignment(button, javafx.geometry.VPos.CENTER);
        GridPane.setVgrow(button, javafx.scene.layout.Priority.ALWAYS);
        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMnemonicParsing(false);
        button.setText("Profile");
        GridPane.setMargin(button, new Insets(0.0, 10.0, 10.0, 0.0));
        button.setFont(new Font("System Bold", 20.0));

        GridPane.setColumnIndex(button0, 1);
        GridPane.setRowIndex(button0, 5);
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(88.0);
        button0.setPrefWidth(208.0);
        button0.setText("Add Item");
        GridPane.setMargin(button0, new Insets(0.0, 10.0, 10.0, 0.0));
        button0.setFont(new Font("System Bold", 20.0));

        GridPane.setColumnIndex(button1, 1);
        GridPane.setRowIndex(button1, 6);
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(76.0);
        button1.setPrefWidth(205.0);
        button1.setText("Add Friend");
        GridPane.setMargin(button1, new Insets(0.0, 10.0, 10.0, 0.0));
        button1.setFont(new Font("System Bold", 20.0));
        
  button1.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/src/gui/AddFriend.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            String currentPath = System.getProperty("user.dir");

        // Print the current path
        System.out.println("current Path:" + currentPath);
        System.err.println("Error loading AddFriend.fxml: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
});


       
        
       
        
        
        
        
        
        

        GridPane.setColumnIndex(button2, 1);
        GridPane.setRowIndex(button2, 7);
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(87.0);
        button2.setPrefWidth(212.0);
        button2.setText("Friend List");
        GridPane.setMargin(button2, new Insets(0.0, 10.0, 10.0, 0.0));
        button2.setFont(new Font("System Bold", 20.0));

        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 8);
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(72.0);
        button3.setPrefWidth(262.0);
        button3.setText("Notifications");
        GridPane.setMargin(button3, new Insets(0.0, 10.0, 10.0, 0.0));
        button3.setFont(new Font("System Bold", 20.0));

        GridPane.setColumnIndex(button4, 1);
        GridPane.setRowIndex(button4, 9);
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(87.0);
        button4.setPrefWidth(339.0);
        button4.setText("Log Out");
        GridPane.setMargin(button4, new Insets(0.0, 10.0, 10.0, 0.0));
        button4.setFont(new Font("System Bold", 20.0));
        
        GridPane.setColumnIndex(button5, 1);
        GridPane.setRowIndex(button5, 11);
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(85.0);
        button5.setPrefWidth(223.0);
        button5.setText("About");
        GridPane.setMargin(button5, new Insets(10.0, 10.0, 10.0, 0.0));
        button5.setFont(new Font("System Bold", 20.0));
        button5.setOnAction(e -> {
               Stage popupStage = new Stage();
               
               About root = new About();
        
               Scene aboutScene = new Scene(root);
               
               popupStage.setScene(aboutScene);
               popupStage.initModality(Modality.APPLICATION_MODAL);
               popupStage.show();
        });

        GridPane.setColumnSpan(imageView6, 2);
        GridPane.setHalignment(imageView6, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(imageView6, javafx.geometry.VPos.CENTER);
        imageView6.setFitHeight(125.0);
        imageView6.setFitWidth(125.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        //imageView6.setImage(new Image(getClass().getResource("../Images/icons8-user-default-96.png").toExternalForm()));
        GridPane.setMargin(imageView6, new Insets(85.0, 0.0, 0.0, 0.0));

        GridPane.setColumnSpan(gridPane0, 2);
        GridPane.setRowIndex(gridPane0, 3);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPercentWidth(66.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPercentWidth(66.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(30.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(label, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(label, javafx.geometry.VPos.CENTER);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setPrefHeight(74.0);
        label.setPrefWidth(297.0);
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 18;");
        label.setText("Rahaf");

        GridPane.setColumnIndex(label0, 1);
        label0.setMaxHeight(Double.MAX_VALUE);
        label0.setMaxWidth(Double.MAX_VALUE);
        label0.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
        label0.setText("0 $");

        GridPane.setColumnIndex(gridPane1, 1);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints15.setMinHeight(10.0);
        rowConstraints15.setPrefHeight(30.0);
        rowConstraints15.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints16.setMinHeight(10.0);
        rowConstraints16.setPrefHeight(30.0);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints17.setMinHeight(10.0);
        rowConstraints17.setPrefHeight(30.0);
        rowConstraints17.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getRowConstraints().add(rowConstraints5);
        gridPane.getRowConstraints().add(rowConstraints6);
        gridPane.getRowConstraints().add(rowConstraints7);
        gridPane.getRowConstraints().add(rowConstraints8);
        gridPane.getRowConstraints().add(rowConstraints9);
        gridPane.getRowConstraints().add(rowConstraints10);
        gridPane.getRowConstraints().add(rowConstraints11);
        gridPane.getRowConstraints().add(rowConstraints12);
        gridPane.getRowConstraints().add(rowConstraints13);
        gridPane.getChildren().add(imageView);
        gridPane.getChildren().add(imageView0);
        gridPane.getChildren().add(imageView1);
        gridPane.getChildren().add(imageView2);
        gridPane.getChildren().add(imageView3);
        gridPane.getChildren().add(imageView4);
        gridPane.getChildren().add(imageView5);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(imageView6);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints14);
        gridPane0.getChildren().add(label);
        gridPane0.getChildren().add(label0);
        gridPane.getChildren().add(gridPane0);
        getChildren().add(gridPane);
        gridPane1.getColumnConstraints().add(columnConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints15);
        gridPane1.getRowConstraints().add(rowConstraints16);
        gridPane1.getRowConstraints().add(rowConstraints17);
        getChildren().add(gridPane1);

    }
}

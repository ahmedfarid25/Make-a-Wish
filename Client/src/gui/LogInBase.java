package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class LogInBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    public final TextField usernameTxt;
    public final TextField passwordTxt;
    public final Button loginButton;
    public final Button signUpButton;

    public LogInBase() {
        String currentPath = System.getProperty("user.dir");
        System.out.println("Current Path: " + currentPath);

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        gridPane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        usernameTxt = new TextField();
        passwordTxt = new TextField();
        loginButton = new Button();
        signUpButton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(673.0);
        setPrefWidth(1200.0);
        getStyleClass().add("backgroundedLogin");
        getStylesheets().add("./Source Packages/Styles/Style.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPercentWidth(60.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPercentWidth(32.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPercentWidth(8.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPercentHeight(5.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(Double.MAX_VALUE);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPercentHeight(69.0);
        rowConstraints0.setPrefHeight(158.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(214.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPercentHeight(36.0);
        rowConstraints1.setPrefHeight(214.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(gridPane, 1);
        GridPane.setRowIndex(gridPane, 1);
        gridPane.setStyle("-fx-background-color: transparent; -fx-background-radius: 10;");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPercentHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPercentHeight(20.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPercentHeight(20.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPercentHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPercentHeight(22.5);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPercentHeight(22.5);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(usernameTxt, 1);
        usernameTxt.setAlignment(javafx.geometry.Pos.CENTER);
        usernameTxt.setMaxHeight(Double.MAX_VALUE);
        usernameTxt.setMaxWidth(Double.MAX_VALUE);
        usernameTxt.setPromptText("Username");
        usernameTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        GridPane.setMargin(usernameTxt, new Insets(20.0, 0.0, 0.0, 0.0));
        usernameTxt.setFont(new Font(24.0));
        usernameTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setRowIndex(passwordTxt, 2);
        passwordTxt.setAlignment(javafx.geometry.Pos.CENTER);
        passwordTxt.setMaxHeight(Double.MAX_VALUE);
        passwordTxt.setMaxWidth(Double.MAX_VALUE);
        passwordTxt.setPromptText("Password");
        passwordTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        GridPane.setMargin(passwordTxt, new Insets(0.0, 0.0, 20.0, 0.0));
        passwordTxt.setFont(new Font(24.0));
        passwordTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setRowIndex(loginButton, 4);
        loginButton.setMaxHeight(Double.MAX_VALUE);
        loginButton.setMaxWidth(Double.MAX_VALUE);
        loginButton.setMnemonicParsing(false);
        loginButton.setStyle("-fx-background-radius: 100;");
        loginButton.setText("Log In");
        GridPane.setMargin(loginButton, new Insets(20.0, 40.0, 20.0, 40.0));
        loginButton.setFont(new Font(22.0));

        GridPane.setRowIndex(signUpButton, 5);
        signUpButton.setMaxHeight(Double.MAX_VALUE);
        signUpButton.setMaxWidth(Double.MAX_VALUE);
        signUpButton.setMnemonicParsing(false);
        signUpButton.setStyle("-fx-background-radius: 100;");
        signUpButton.setText("Sign Up");
        GridPane.setMargin(signUpButton, new Insets(20.0, 40.0, 20.0, 40.0));
        signUpButton.setFont(new Font(22.0));
        GridPane.setMargin(gridPane, new Insets(0.0));
        gridPane.setPadding(new Insets(0.0, 20.0, 0.0, 20.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getRowConstraints().add(rowConstraints5);
        gridPane.getRowConstraints().add(rowConstraints6);
        gridPane.getRowConstraints().add(rowConstraints7);
        gridPane.getChildren().add(usernameTxt);
        gridPane.getChildren().add(passwordTxt);
        gridPane.getChildren().add(loginButton);
        gridPane.getChildren().add(signUpButton);
        getChildren().add(gridPane);

    }
}

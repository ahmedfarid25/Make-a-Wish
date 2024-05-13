package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class SignUpBase extends GridPane {

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
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    public final TextField emailTxt;
    public final TextField passwordTxt;
    public final TextField usernameTxt;
    public final TextField conPasswordTxt;
    public final Button signUpButton;
    public final TextField phoneTxt;
    public final TextField balanceTxt;

    public SignUpBase() {

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
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        emailTxt = new TextField();
        passwordTxt = new TextField();
        usernameTxt = new TextField();
        conPasswordTxt = new TextField();
        signUpButton = new Button();
        phoneTxt = new TextField();
        balanceTxt = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(673.0);
        setPrefWidth(1200.0);
        getStyleClass().add("backgroundedSignUp");
        getStylesheets().add("/gui/../Styles/Style.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPercentWidth(51.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPercentWidth(39.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPercentWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPercentHeight(19.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(Double.MAX_VALUE);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPercentHeight(75.0);
        rowConstraints0.setPrefHeight(158.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(214.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPercentHeight(16.0);
        rowConstraints1.setPrefHeight(214.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(gridPane, 1);
        GridPane.setRowIndex(gridPane, 1);
        gridPane.setStyle("-fx-background-color: transparent; -fx-background-radius: 10;");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPercentHeight(15.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPercentHeight(15.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPercentHeight(15.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPercentHeight(15.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPercentHeight(15.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMaxHeight(90.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPercentHeight(15.0);
        rowConstraints7.setPrefHeight(90.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMaxHeight(71.0);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPercentHeight(10.0);
        rowConstraints8.setPrefHeight(37.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPercentHeight(22.5);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(emailTxt, 1);
        emailTxt.setAlignment(javafx.geometry.Pos.CENTER);
        emailTxt.setMaxHeight(Double.MAX_VALUE);
        emailTxt.setMaxWidth(Double.MAX_VALUE);
        emailTxt.setPromptText("Email");
        emailTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        GridPane.setMargin(emailTxt, new Insets(0.0));
        emailTxt.setFont(new Font(24.0));
        emailTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setRowIndex(passwordTxt, 2);
        passwordTxt.setAlignment(javafx.geometry.Pos.CENTER);
        passwordTxt.setMaxHeight(Double.MAX_VALUE);
        passwordTxt.setMaxWidth(Double.MAX_VALUE);
        passwordTxt.setPromptText("Password");
        passwordTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        GridPane.setMargin(passwordTxt, new Insets(0.0));
        passwordTxt.setFont(new Font(24.0));
        passwordTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        usernameTxt.setAlignment(javafx.geometry.Pos.CENTER);
        usernameTxt.setMaxHeight(Double.MAX_VALUE);
        usernameTxt.setMaxWidth(Double.MAX_VALUE);
        usernameTxt.setPromptText("Username");
        usernameTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        usernameTxt.setFont(new Font(24.0));
        usernameTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
        GridPane.setMargin(usernameTxt, new Insets(0.0));

        GridPane.setRowIndex(conPasswordTxt, 3);
        conPasswordTxt.setAlignment(javafx.geometry.Pos.CENTER);
        conPasswordTxt.setMaxHeight(Double.MAX_VALUE);
        conPasswordTxt.setMaxWidth(Double.MAX_VALUE);
        conPasswordTxt.setPrefHeight(99.0);
        conPasswordTxt.setPrefWidth(310.0);
        conPasswordTxt.setPromptText("Confirm Password");
        conPasswordTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        conPasswordTxt.setFont(new Font(24.0));
        conPasswordTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setRowIndex(signUpButton, 7);
        signUpButton.setMaxHeight(Double.MAX_VALUE);
        signUpButton.setMaxWidth(Double.MAX_VALUE);
        signUpButton.setMnemonicParsing(false);
        signUpButton.setStyle("-fx-background-radius: 100;");
        signUpButton.setText("Sign Up");
        GridPane.setMargin(signUpButton, new Insets(10.0, 40.0, 10.0, 40.0));
        signUpButton.setFont(new Font(22.0));

        GridPane.setRowIndex(phoneTxt, 4);
        phoneTxt.setAlignment(javafx.geometry.Pos.CENTER);
        phoneTxt.setMaxHeight(Double.MAX_VALUE);
        phoneTxt.setMaxWidth(Double.MAX_VALUE);
        phoneTxt.setPromptText("Phone Number");
        phoneTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-text-fill: white; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75);");
        phoneTxt.setFont(new Font(24.0));
        phoneTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));

        GridPane.setRowIndex(balanceTxt, 5);
        balanceTxt.setAlignment(javafx.geometry.Pos.CENTER);
        balanceTxt.setMaxHeight(Double.MAX_VALUE);
        balanceTxt.setMaxWidth(Double.MAX_VALUE);
        balanceTxt.setPromptText("Balance");
        balanceTxt.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.75); -fx-text-fill: white;");
        balanceTxt.setFont(new Font(24.0));
        balanceTxt.setPadding(new Insets(0.0, 10.0, 0.0, 10.0));
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
        gridPane.getRowConstraints().add(rowConstraints8);
        gridPane.getRowConstraints().add(rowConstraints9);
        gridPane.getChildren().add(emailTxt);
        gridPane.getChildren().add(passwordTxt);
        gridPane.getChildren().add(usernameTxt);
        gridPane.getChildren().add(conPasswordTxt);
        gridPane.getChildren().add(signUpButton);
        gridPane.getChildren().add(phoneTxt);
        gridPane.getChildren().add(balanceTxt);
        getChildren().add(gridPane);

    }
}

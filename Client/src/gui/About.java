package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class About extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Label label;
    protected final Blend blend;
    protected final Label label0;
    protected final Label label1;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints5;
    protected final Label label2;
    protected final Label label3;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;

    public About() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        label = new Label();
        blend = new Blend();
        label0 = new Label();
        label1 = new Label();
        gridPane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        label2 = new Label();
        label3 = new Label();
        gridPane0 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(673.0);
        setPrefWidth(1200.0);
        setStyle("-fx-background-color: F3EEEA;");
        getStyleClass().add("backgroundedAbout");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setPercentWidth(49.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setPercentWidth(60.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setPercentWidth(49.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints0.setMaxHeight(103.0);
        rowConstraints0.setMinHeight(69.0);
        rowConstraints0.setPercentHeight(23.0);
        rowConstraints0.setPrefHeight(103.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(Double.MAX_VALUE);
        rowConstraints1.setMinHeight(15.0);
        rowConstraints1.setPercentHeight(15.0);
        rowConstraints1.setPrefHeight(15.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(465.0);
        rowConstraints2.setMinHeight(424.0);
        rowConstraints2.setPercentHeight(80.0);
        rowConstraints2.setPrefHeight(442.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(379.0);
        rowConstraints3.setMinHeight(90.0);
        rowConstraints3.setPercentHeight(16.0);
        rowConstraints3.setPrefHeight(113.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(379.0);
        rowConstraints4.setMinHeight(90.0);
        rowConstraints4.setPercentHeight(16.0);
        rowConstraints4.setPrefHeight(113.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(label, 1);
        GridPane.setRowIndex(label, 1);
        GridPane.setValignment(label, javafx.geometry.VPos.BOTTOM);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setMaxHeight(USE_PREF_SIZE);
        label.setMaxWidth(USE_PREF_SIZE);
        label.setPrefHeight(86.0);
        label.setPrefWidth(455.0);
        label.setStyle("-fx-text-fill: Black;");
        label.setText("WishBook");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("Georgia", 49.0));

        label.setEffect(blend);

        GridPane.setColumnIndex(label0, 1);
        GridPane.setRowIndex(label0, 2);
        GridPane.setValignment(label0, javafx.geometry.VPos.TOP);
        label0.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        label0.setMaxHeight(USE_PREF_SIZE);
        label0.setMaxWidth(USE_PREF_SIZE);
        label0.setPrefHeight(68.0);
        label0.setPrefWidth(456.0);
        label0.setStyle("-fx-text-fill: black;");
        label0.setText("Gift Register");
        label0.setFont(new Font("Georgia", 30.0));

        GridPane.setRowIndex(label1, 4);
        label1.setPrefHeight(72.0);
        label1.setPrefWidth(372.0);
        label1.setStyle("-fx-text-fill: black;");
        label1.setText("Meet The Developers");
        label1.setFont(new Font("Georgia", 30.0));
        label1.setPadding(new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(gridPane, 1);
        GridPane.setRowIndex(gridPane, 4);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(label2, 1);
        label2.setPrefHeight(89.0);
        label2.setPrefWidth(224.0);
        label2.setStyle("-fx-text-fill: black;");
        label2.setText("Abdelrhman Ahmed");
        label2.setFont(new Font("Georgia", 24.0));

        label3.setPrefHeight(88.0);
        label3.setPrefWidth(224.0);
        label3.setStyle("-fx-text-fill: black;");
        label3.setText("Mohamed Alghaly");
        label3.setFont(new Font("Georgia", 24.0));

        GridPane.setColumnIndex(gridPane0, 2);
        GridPane.setRowIndex(gridPane0, 4);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(label4, 1);
        label4.setPrefHeight(87.0);
        label4.setPrefWidth(193.0);
        label4.setStyle("-fx-text-fill: black;");
        label4.setText("Rahaf Mohamed");
        label4.setFont(new Font("Georgia", 24.0));

        label5.setAlignment(javafx.geometry.Pos.CENTER);
        label5.setPrefHeight(88.0);
        label5.setPrefWidth(194.0);
        label5.setStyle("-fx-text-fill: black;");
        label5.setText("Ahmed Farid");
        label5.setFont(new Font("Georgia", 24.0));

        GridPane.setColumnSpan(label6, 3);
        GridPane.setRowIndex(label6, 3);
        label6.setAlignment(javafx.geometry.Pos.CENTER);
        label6.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label6.setPrefHeight(468.0);
        label6.setPrefWidth(1200.0);
        label6.setStyle("-fx-text-fill: black; -fx-background-color: transparent;");
        label6.setText("WishBook app is a simple tool that allows users to create a list of items they want to purchase or receive as gifts . Users can add items to their wish list by searching for them within the app or manually entering the item details.\n\nOnce an item as added to the wish list , users can organize it by category.Users can add friends who can view the items on the list and choose to purchase them as gifts.");
        label6.setWrapText(true);
        label6.setFont(new Font(28.0));
        label6.setPadding(new Insets(0.0, 20.0, 0.0, 20.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints5);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label3);
        getChildren().add(gridPane);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getColumnConstraints().add(columnConstraints5);
        gridPane0.getRowConstraints().add(rowConstraints6);
        gridPane0.getChildren().add(label4);
        gridPane0.getChildren().add(label5);
        getChildren().add(gridPane0);
        getChildren().add(label6);

    }
}

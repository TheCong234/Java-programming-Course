
package bai12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Bai12 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //tao text Field va label
        TextField textField = new TextField("JavaFx is haha");
        textField.setPrefWidth(300);
        Label lb = new Label("Text Field");
        
        //Tao radio buttons, Text Field, label.
        RadioButton rdLeft = new RadioButton("Left");
        RadioButton rdCenter = new RadioButton("Center");
        RadioButton rdRight = new RadioButton("Right");
        
        Label lbSize = new Label("Custom Size");
        lbSize.setStyle("-fx-padding: 0px 0px 0px 20px;");
        TextField txtFdSize = new TextField("12");
        txtFdSize.setPrefWidth(60);
        
        //Tao hbox chua elements
        HBox hbTop = new HBox(10,lb,textField);
        hbTop.setAlignment(Pos.CENTER);
        
        HBox hBoxBottom = new HBox(10,rdLeft,rdCenter,rdRight,lbSize,txtFdSize);
        hBoxBottom.setAlignment(Pos.CENTER);
        
        //Set click Actions
        rdLeft.setOnAction((event) -> {
            Bai12.ChangeSelected(rdLeft, rdCenter, rdRight);
            textField.setAlignment(Pos.CENTER_LEFT);
        });
        rdCenter.setOnAction((event) -> {
            Bai12.ChangeSelected(rdCenter, rdLeft, rdRight);
            textField.setAlignment(Pos.CENTER);
        });
        rdRight.setOnAction((event) -> {
            Bai12.ChangeSelected(rdRight, rdCenter, rdLeft);
            textField.setAlignment(Pos.CENTER_RIGHT);
        });
        
        //Set change text actions
        txtFdSize.textProperty().addListener((observable, oldValue, newValue) -> {
            int size = Integer.parseInt(txtFdSize.getText());
            Font f = new Font(size);
            textField.setFont(f);
        });
        //largest
        VBox vBoxAll = new VBox(20,hbTop,hBoxBottom);
        vBoxAll.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBoxAll, 600, 200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void ChangeSelected(RadioButton rd1,RadioButton rd2,RadioButton rd3){
        rd1.setSelected(true);
        rd2.setSelected(false);
        rd3.setSelected(false);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

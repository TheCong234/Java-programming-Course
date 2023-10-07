
package bai14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bai14 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Tao Labels va text fields
        Label lbDecimal = new Label("Decimal:   ");
        Label lbHex = new Label("Hex:");
        Label lbBinary = new Label("Binary:");
        
        TextField txtFdDecimal = new TextField();
        txtFdDecimal.setAlignment(Pos.CENTER_RIGHT);
        TextField txtFdHex = new TextField();
        txtFdHex.setAlignment(Pos.CENTER_RIGHT);
        TextField txtFdBinary = new TextField();
        txtFdBinary.setAlignment(Pos.CENTER_RIGHT);
        
        //Tao grid pane chua nodes
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,30,20,30));
        gridPane.add(lbDecimal, 0, 0);
        gridPane.add(lbHex, 0, 1);
        gridPane.add(lbBinary, 0, 2);
        gridPane.add(txtFdDecimal, 1, 0);
        gridPane.add(txtFdHex, 1, 1);
        gridPane.add(txtFdBinary, 1, 2);
        
        //Set Events
        txtFdDecimal.textProperty().addListener((observable, oldValue, newValue) -> {
            if(txtFdDecimal.isFocused()){
                String str = txtFdDecimal.getText();
                int x = Integer.parseInt(str);
                txtFdHex.setText(Integer.toHexString(x));
                txtFdBinary.setText(Integer.toBinaryString(x));
            }
        });
        txtFdHex.textProperty().addListener((observable, oldValue, newValue) -> {
            if(txtFdHex.isFocused()){
                String str = txtFdHex.getText();
                int x = Integer.parseInt(str);
                int y = Integer.parseInt(str,2);
                txtFdDecimal.setText(x+"");
                txtFdBinary.setText(y+"");
            }
        });
        txtFdBinary.textProperty().addListener((observable, oldValue, newValue) -> {
            if(txtFdBinary.isFocused()){
                String str = txtFdBinary.getText();
                int x = Integer.parseInt(str);
                int y = Integer.parseInt(str, 16);
                txtFdDecimal.setText(x+"");
                txtFdHex.setText(y+"");
            }
        });
        
        
        Scene scene = new Scene(gridPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

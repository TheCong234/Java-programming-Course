/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package bai2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author trant
 */
public class Bai2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.CENTER);
        Font f = Font.font("Time new Roman",FontWeight.BOLD,20);
        for(int i = 0; i<5;i++){
            Text txt = new Text("Java");
            txt.setRotate(90);
            txt.setFont(f);
            txt.setFill(Color.color(Math.random(),Math.random(),Math.random(),1));
            hb.getChildren().add(txt);
        }
        Scene scene = new Scene(hb, 300, 250);
        
        primaryStage.setTitle("Bai 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

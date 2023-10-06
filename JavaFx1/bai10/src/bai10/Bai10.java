
package bai10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bai10 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //Tao checkbox
        CheckBox cbRed = new CheckBox("Red");
        cbRed.setSelected(true);
        CheckBox cbYellow = new CheckBox("Yellow");
        CheckBox cbBlack = new CheckBox("Black");
        CheckBox cbOrange = new CheckBox("Orange");
        CheckBox cbGreen = new CheckBox("Green");
        
        //Tao chu
        Text text = new Text(50,150,"Programming is Fun");
        Font f = Font.font("Arial", FontWeight.BOLD,30);
        text.setFont(f);
        text.setFill(Color.RED);
        
        //Tao button
        Button btn1 = new Button("<");
        Button btn2 = new Button(">");
        Button btn3 = new Button("^");
        Button btn4 = new Button("v");
        
        //Tao Hbox chua checkboxs
        HBox hbTop = new HBox(10);
        hbTop.getChildren().addAll(cbRed,cbYellow,cbBlack,cbOrange,cbGreen);
        hbTop.setAlignment(Pos.CENTER_LEFT);
        
        //Tao Hbox chua Buttons
        HBox hbBot = new HBox(5);
        hbBot.getChildren().addAll(btn1,btn3,btn4,btn2);
        hbBot.setAlignment(Pos.CENTER);
        
        //Tao pane chua text
        Pane pn = new Pane();
        pn.getChildren().add(text);
        pn.setStyle("-fx-border-color: purple;" + "-fx-border-width: 3px;");
        
        //Tao boderPane chua Hboxs va Pane
        BorderPane bdBox = new BorderPane();
        bdBox.setTop(hbTop);
        bdBox.setBottom(hbBot);
        bdBox.setCenter(pn);
        
        //Set CheckBox Actions
        cbRed.setOnAction((ActionEvent e) -> {
            text.setFill(Color.RED);
            Bai10.ChangeSelected(cbRed, cbYellow, cbBlack, cbOrange, cbGreen);
        });
        cbYellow.setOnAction((ActionEvent e) -> {
            text.setFill(Color.YELLOW);
            Bai10.ChangeSelected(cbYellow, cbRed, cbBlack, cbOrange, cbGreen);
        });
        cbBlack.setOnAction((ActionEvent e) -> {
            text.setFill(Color.BLACK);
            Bai10.ChangeSelected(cbBlack, cbYellow, cbRed, cbOrange, cbGreen);
        });
        cbOrange.setOnAction((ActionEvent e) -> {
            text.setFill(Color.ORANGE);
            Bai10.ChangeSelected(cbOrange, cbYellow, cbBlack, cbRed, cbGreen);
        });
        cbGreen.setOnAction((ActionEvent e) -> {
            text.setFill(Color.GREEN);
            Bai10.ChangeSelected(cbGreen, cbYellow, cbBlack, cbOrange, cbRed);
        });
        
        //Set button Actions
        btn2.setOnAction((ActionEvent e) -> {
            int x = (int)text.getX();
            if(x<400){
                text.setX(x+10);
            }
        });
        btn1.setOnAction((ActionEvent e) -> {
            int x = (int)text.getX();
            if(x>10){
                text.setX(x-10);
            }
        });
        btn3.setOnAction((ActionEvent e) -> {
            int y = (int)text.getY();
            if(y>50){
                text.setY(y-10);
            }
        });
        btn4.setOnAction((ActionEvent e) -> {
            int y = (int)text.getY();
            if(y<550){
                text.setY(y+10);
            }
        });
        
        Scene scene = new Scene(bdBox, 600, 650);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void ChangeSelected(CheckBox cb1,CheckBox cb2,CheckBox cb3,CheckBox cb4,CheckBox cb5){
        //setSelected
        cb1.setSelected(true);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
        cb5.setSelected(false);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

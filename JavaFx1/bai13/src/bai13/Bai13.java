
package bai13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Bai13 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Tao hinh
        Circle cir = new Circle(200,Color.WHITE);
        cir.setStroke(Color.GREEN);
        Rectangle rec = new Rectangle(200,200,Color.WHITE);
        rec.setStroke(Color.GREEN);
        Ellipse ellip = new Ellipse(100, 200);
        ellip.setStroke(Color.GREEN);
        ellip.setFill(Color.WHITE);
        
        //Tao buttons
        RadioButton rdCircle = new RadioButton("Circle");
        rdCircle.setSelected(true);
        RadioButton rdRectangle = new RadioButton("Rectangle");
        RadioButton rdEllipse = new RadioButton("Ellipse");
        CheckBox checkBox = new CheckBox("Fill");
        
        //Tao Hbox chua button, va stackPane chua hinh
        HBox hBoxBot = new HBox(10,rdCircle,rdRectangle,rdEllipse,checkBox);
        hBoxBot.setAlignment(Pos.CENTER);
        
        StackPane stPane = new StackPane(cir);
        stPane.setStyle("-fx-border-width:3px;"+"-fx-border-color: pink;");
        
        BorderPane bdPane = new BorderPane();
        bdPane.setBottom(hBoxBot);
        bdPane.setCenter(stPane);
        
        //Set radioButton Actions
        rdCircle.setOnAction((event) -> {
            Bai13.ChangeSelected(rdCircle, rdRectangle, rdEllipse, stPane);
            stPane.getChildren().add(cir);
        });
        rdRectangle.setOnAction((event) -> {
            Bai13.ChangeSelected(rdRectangle, rdCircle, rdEllipse, stPane);
            stPane.getChildren().add(rec);
        });
        rdEllipse.setOnAction((event) -> {
            Bai13.ChangeSelected(rdEllipse, rdRectangle, rdCircle, stPane);
            stPane.getChildren().add(ellip);
        });
        checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue){
                cir.setFill(Color.PINK);
                rec.setFill(Color.PURPLE);
                ellip.setFill(Color.AQUA);
            }else{
                cir.setFill(Color.WHITE);
                rec.setFill(Color.WHITE);
                ellip.setFill(Color.WHITE);
            }
        });
        
        
        Scene scene = new Scene(bdPane, 600, 600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void ChangeSelected(RadioButton rd1,RadioButton rd2,RadioButton rd3, StackPane st){
        rd1.setSelected(true);
        rd2.setSelected(false);
        rd3.setSelected(false);
        
        //Xoa hinh hien tai
        st.getChildren().clear();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

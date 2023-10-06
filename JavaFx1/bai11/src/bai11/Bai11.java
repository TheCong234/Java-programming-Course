package bai11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bai11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Tao Text thong bao
        Text nofity = new Text("\nCong dtrai");
        
        //Tao RadioButtons
        RadioButton rdRed = new RadioButton("Red");
        RadioButton rdYellow = new RadioButton("Yellow");
        RadioButton rdGreen = new RadioButton("Green");
        
        //Tao circles
        Circle cirRed = new Circle(20,Color.WHITE);
        cirRed.setStroke(Color.BLACK);
        Circle cirYellow = new Circle(20,Color.WHITE);
        cirYellow.setStroke(Color.BLACK);
        Circle cirGreen = new Circle(20,Color.WHITE);
        cirGreen.setStroke(Color.BLACK);
        
        //Tao VBox chua circles
        VBox vBox = new VBox(10,cirRed,cirYellow,cirGreen);
        vBox.setPadding(new Insets(5,0,5,0));
        vBox.setStyle("-fx-border-width:3px;"+"-fx-border-color: black;");
        vBox.setAlignment(Pos.CENTER);
        
        //Can giua cho den giao thong
        HBox hBox1 = new HBox(vBox);
        hBox1.setAlignment(Pos.CENTER);
        VBox vBox1 = new VBox(hBox1);
        vBox1.setAlignment(Pos.CENTER);
        
        //Tao HBox chua Radio Buttons
        HBox hBox = new HBox(10,rdRed,rdYellow,rdGreen);
        hBox.setAlignment(Pos.CENTER);
        
        //Tao Border Pane chua den giao thong va buttons
        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        borderPane.setCenter(vBox1);
        borderPane.setTop(nofity);
        
        //Set Actions
        rdRed.setOnAction((event) -> {
            Bai11.ChangeSelected(rdRed, rdYellow, rdGreen, cirRed, cirYellow, cirGreen, Color.RED);
            nofity.setText("\nDen do roi, dung lai di ban oi!");
            nofity.setFill(Color.RED);
        });
        rdYellow.setOnAction((event) -> {
            Bai11.ChangeSelected(rdYellow, rdRed, rdGreen, cirYellow, cirRed, cirGreen, Color.YELLOW);
            nofity.setText("\nDen vang roi, di cham lai di ban oi!");
            nofity.setFill(Color.YELLOW);
        });
        rdGreen.setOnAction((event) -> {
            Bai11.ChangeSelected(rdGreen, rdYellow, rdRed, cirGreen, cirYellow, cirRed, Color.GREEN);
            nofity.setText("\nDi thoi, con chan chu gi nua?");
            nofity.setFill(Color.GREEN);
        });
        
        //!hehe
        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void ChangeSelected(RadioButton rd1,RadioButton rd2,RadioButton rd3,Circle cir1,Circle cir2,Circle cir3,Color cl) {
        //Doi mau duoc chon
        rd1.setSelected(true);
        cir1.setFill(cl);
        
        //Xoa mau cho 2 den con lai
        rd2.setSelected(false);
        cir2.setFill(Color.WHITE);
        
        rd3.setSelected(false);
        cir3.setFill(Color.WHITE);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

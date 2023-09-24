
package bai3;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Bai3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        String str = "WELCOME TO JAVA";
        String[] arr = str.split("");
        Font f = Font.font("Arial",20);
        Point2D center = new Point2D(120,120);
        double radius = 100;
        double angle = 0;
        double rotate = 90;
        Pane pn = new Pane();
        
        Circle cir = new Circle(130,120,120);
        cir.setFill(Color.TRANSPARENT);
        cir.setStroke(Color.RED);
        pn.getChildren().add(cir);
        
        for(int i = 0;i<arr.length; i++){
            
            double x = center.getX() +radius * Math.cos(Math.toRadians(angle));
            double y = center.getY() +radius * Math.sin(Math.toRadians(angle));
            
            Text txt = new Text(x,y,arr[i]);
            txt.setRotate(rotate);
            txt.setFont(f);
            pn.getChildren().add(txt);
            angle +=22.5;
            rotate +=23.5;
        }
        //
        Scene scene = new Scene(pn, 400, 450);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

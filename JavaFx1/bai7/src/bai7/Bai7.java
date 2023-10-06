
package bai7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bai7 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();
        Polygon polygon = new Polygon();
        
        double WIDTH = 400, HEIGHT = 400;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH,HEIGHT) * 0.6;
        Double[] arr = new Double[16];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            arr[count++] = (centerX + radius * Math.cos(2 * i * Math.PI / 8));
            arr[count++] = (centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }
        polygon.getPoints().addAll(arr);
        polygon.setFill(Color.RED);
        
        Font f = Font.font("Times New Roman",FontWeight.BOLD,100);
        Text stop = new Text("STOP");
        stop.setFont(f);
        stop.setFill(Color.WHITE);
        
//        polygon.getPoints().addAll(new Double[]{
//            r * Math.cos(0), r * Math.sin(0),
//            r * Math.cos(pi/4), r * Math.sin(pi/4),
//            r * Math.cos(pi/2), r * Math.sin(pi/2),
//            r * Math.cos(3*pi/4), r * Math.sin(3*pi/4),
//            r * Math.cos(pi), r * Math.sin(pi),
//            r * Math.cos(5*pi/4), r * Math.sin(5*pi/4),
//            r * Math.cos(3*pi/2), r * Math.sin(3*pi/2),
//            r * Math.cos(7*pi/4), r * Math.sin(7*pi/4),
//            
//        });
        stackPane.getChildren().addAll(polygon,stop);
        Scene scene = new Scene(stackPane, 600, 600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

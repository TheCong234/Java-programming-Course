
package bai1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bai1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image img1 = new Image("File:src/img/us.png");
        Image img2 = new Image("File:src/img/uk.png");
        Image img3 = new Image("File:src/img/cn.png");
        Image img4 = new Image("File:src/img/vn.png");
        
        GridPane grPane = new GridPane();
        grPane.setAlignment(Pos.CENTER);
        grPane.add(new ImageView(img1),0,0);
        grPane.add(new ImageView(img2),0,1);
        grPane.add(new ImageView(img3),1,0);
        grPane.add(new ImageView(img4),1,1);
        
        Scene scene = new Scene(grPane, 1000, 600);
        
        primaryStage.setTitle("Bai 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

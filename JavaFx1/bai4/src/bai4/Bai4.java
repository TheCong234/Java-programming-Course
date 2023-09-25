
package bai4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Bai4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grPane = new GridPane();
        for(int i = 0; i<8;i++){
            for(int j = 0; j<8;j++){
                if((i+j)%2 == 0){
                    grPane.add(new Rectangle(40,40,Color.BLACK), j, i);
                }else{
                    grPane.add(new Rectangle(40,40,Color.WHITE), j, i);
                }
            }
        }
        
        Scene scene = new Scene(grPane, 320, 320);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

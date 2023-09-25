
package bai5;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Bai5 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList("Project","Quiz","Midterm","Final")));
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Percent");
        
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Fia");
        series1.getData().add(new XYChart.Data<>("Speed",4.0));
        series1.getData().add(new XYChart.Data<>("User rating", 3.0)); 
        series1.getData().add(new XYChart.Data<>("Milage", 5.0)); 
        series1.getData().add(new XYChart.Data<>("Safety", 5.0)); 
        
        XYChart.Series<String, Number> series2 = new XYChart.Series<>(); 
        series2.setName("Audi"); 
        series2.getData().add(new XYChart.Data<>("Speed", 5.0)); 
        series2.getData().add(new XYChart.Data<>("User rating", 6.0));  

        series2.getData().add(new XYChart.Data<>("Milage", 10.0)); 
        series2.getData().add(new XYChart.Data<>("Safety", 4.0));  

        XYChart.Series<String, Number> series3 = new XYChart.Series<>(); 
        series3.setName("Ford"); 
        series3.getData().add(new XYChart.Data<>("Speed", 4.0)); 
        series3.getData().add(new XYChart.Data<>("User rating", 2.0)); 
        series3.getData().add(new XYChart.Data<>("Milage", 3.0)); 
        series3.getData().add(new XYChart.Data<>("Safety", 6.0));
        
        
        BarChart<String, Number> barChart = new BarChart<>(xAxis,yAxis);
        barChart.setTitle("Bai 5: TheCong BarChart");
        barChart.getData().addAll(series1,series2,series3);
        Scene scene = new Scene(barChart, 600,600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

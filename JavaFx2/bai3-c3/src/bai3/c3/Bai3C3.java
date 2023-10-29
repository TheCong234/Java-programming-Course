
package bai3.c3;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
    
public class Bai3C3 extends Application{
    public static Connection connection;
    public static Statement statement;
    @Override
    public void start(Stage primaryStage) throws SQLException{
        //tao elements
        Label lbTable1 = new Label("Table 1: ");
        Label lbTable2 = new Label("Table 2: ");
        Label lbTable3 = new Label("Table 3: ");
        
        TextField txtTable1 = new TextField();
        TextField txtTable2 = new TextField();
        TextField txtTable3 = new TextField();
        
        GridPane grpInput = new GridPane();
        grpInput.add(lbTable1,0,0);
        grpInput.add(lbTable2,0,1);
        grpInput.add(lbTable3,0,2);
        
        grpInput.add(txtTable1,1,0);
        grpInput.add(txtTable2,1,1);
        grpInput.add(txtTable3,1,2);
        grpInput.setVgap(10);
        grpInput.setHgap(10);
        
        Button btnShow = new Button("Show");
        
        //Tao grid chua Data
        GridPane grpData = new GridPane();
        grpData.setGridLinesVisible(true);
        btnShow.setOnAction((event) -> {
            try {
                String table1 = txtTable1.getText();
                String table2 = txtTable2.getText();
                String key = txtTable3.getText();
                //lay ten cac cot bang 1
                DatabaseMetaData metaData = (DatabaseMetaData) connection.getMetaData();
                ResultSet resultColoumName1 = metaData.getColumns(null, null, table1, null);
                ResultSet resultColoumName2 = metaData.getColumns(null, null, table2, null);
                
                int count = 0;
                while(resultColoumName1.next()){
                    grpData.add(new Text(resultColoumName1.getString("COLUMN_NAME")), count++, 0);
                }
                while(resultColoumName2.next()){
                    grpData.add(new Text(resultColoumName2.getString("COLUMN_NAME")), count++, 0);
                }
                
                //lay data 
                String query = "Select * from "+table1+", "+table2+" where "+table1+"."+key+" = "+table2+"."+key;
                ResultSet result = statement.executeQuery(query);
                int row = 1;
                int columnQuantity = result.getMetaData().getColumnCount();
                while(result.next()){
                    for(int col = 0; col <columnQuantity;col++){
                        Text data = new Text(result.getString(col+1));
                        grpData.add(data, col, row);
                    }
                    row++;
                }
            } catch (SQLException e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(e.toString());
                alert.showAndWait();
            }
        });
        
        
        
        //
        VBox vbRoot = new VBox(20,grpInput,btnShow,grpData);
        vbRoot.setPadding(new Insets(20));
        vbRoot.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbRoot, 650, 750);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost/qlsv","root","");
        statement = connection.createStatement();
        launch(args);
    }
    
}

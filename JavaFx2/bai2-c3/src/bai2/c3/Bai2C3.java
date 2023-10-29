
package bai2.c3;

import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Bai2C3 extends Application {
    public static Connection connection;
    public static Statement statement;
    
    @Override
    public void start(Stage primaryStage) throws SQLException {
        //tao phan tu
        Label lbTable = new Label("Table: ");
        TextField txtTable = new TextField();
        Button btnQuery = new Button("Query");
        
        HBox hbTabelInput = new HBox(10,lbTable,txtTable,btnQuery);
        
        GridPane grpData = new GridPane();
        grpData.setGridLinesVisible(true);
        
        //
        btnQuery.setOnAction((event) -> {
            try {
                //lay ten cac cot
                DatabaseMetaData metaData = (DatabaseMetaData) connection.getMetaData();
                ResultSet resultColoumName = metaData.getColumns(null, null, 
                        txtTable.getText(), null);
                for(int i = 0; i<3;i++){
                    resultColoumName.next();
                    grpData.add(new Text(resultColoumName.getString("COLUMN_NAME")), i, 0);
                }
                
                //lay du lieu cho table
                String select = "Select * from "+txtTable.getText().trim();
                ResultSet result = statement.executeQuery(select);
                int row = 1;
                while(result.next()){
                    for(int col = 0; col <3;col++){
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
        
        VBox vbRoot = new VBox(20,hbTabelInput,grpData);
        vbRoot.setPadding(new Insets(20));
        
        Scene scene = new Scene(vbRoot, 500, 750);
        
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

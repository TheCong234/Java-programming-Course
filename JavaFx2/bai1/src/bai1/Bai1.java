
package bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.stage.Stage;

public class Bai1 extends Application {
    @Override
    public void start(Stage primaryStage) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/qlsv","root","");
        Statement statement = connection.createStatement();
        //tao label
        Label lbID = new Label("IDd: ");
        Label lbLastName = new Label("Last Name: ");
        Label lbFirstName = new Label("First Name: ");
        Label lbGender = new Label("Gender: ");
        Label lbPhone = new Label("Phone: ");

        //Tao textFild
        TextField txtFlID = new TextField();
        TextField txtFlLastName = new TextField();
        TextField txtFlFirstName = new TextField();
        TextField txtFlGender = new TextField();
        TextField txtFlPhone = new TextField();
        
        //Tao buttons
        Button btnView = new Button("View");
        Button btnInsert = new Button("Insert");
        Button btnUpdate = new Button("Update");
        Button btnDelete = new Button("Delete");
        Button btnClear = new Button("Clear");
        
        //tao Grid chua label va text Field
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.add(lbID, 0, 0);
        gridPane.add(lbLastName, 0, 1);
        gridPane.add(lbFirstName, 0, 2);
        gridPane.add(lbGender, 0, 3);
        gridPane.add(lbPhone, 0, 4);
        
        gridPane.add(txtFlID, 1, 0);
        gridPane.add(txtFlLastName, 1, 1);
        gridPane.add(txtFlFirstName, 1, 2);
        gridPane.add(txtFlGender, 1, 3);
        gridPane.add(txtFlPhone, 1, 4);
        
        //Tao Hbox chua button
        HBox hbButton = new HBox(15,btnView,btnInsert,btnUpdate,btnDelete,btnClear);
        //Root Pane
        VBox vbRoot = new VBox(20, gridPane,hbButton);
        
        //DATA
        btnInsert.setOnAction((event) -> {
            String insert = "INSERT INTO Staff VALUES ('" + txtFlID.getText() + "', '"+ txtFlLastName.getText() + "','"
                    + txtFlFirstName.getText() + "','"+ txtFlGender.getText().charAt(0)
                    + "','"+txtFlPhone.getText()+"')";
            try{
                statement.executeUpdate(insert);
            }catch(SQLException ex){
                
            }
        });
        
        btnView.setOnAction((event) -> {
            String selectById = "SELECT * FROM Staff WHERE id = '"+txtFlID.getText()+"'";
            try {
                ResultSet resultSet = statement.executeQuery(selectById);
                resultSet.next();
                txtFlLastName.setText(resultSet.getString(2));
                txtFlFirstName.setText(resultSet.getString(3));
                txtFlGender.setText(resultSet.getString(4));
                txtFlPhone.setText(resultSet.getString(5));
                
            } catch (SQLException ex) {
                Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btnUpdate.setOnAction((event) -> {
            String updateStr = "update staff set lastName = '" + txtFlLastName.getText()+
                    "', firstName = '" + txtFlFirstName.getText()+
                    "', gender = '" + txtFlGender.getText()+
                    "', phone = '" + txtFlPhone.getText()+
                    "' where id = '"+txtFlID.getText()+"'";
            try {
                statement.executeUpdate(updateStr);
            } catch (SQLException ex) {
                Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btnDelete.setOnAction((event) -> {
            String deleteStr = "DELETE FROM Staff WHERE id = '"+txtFlID.getText()+"'";
            try {
                if(statement.executeUpdate(deleteStr)>0){
                    Alert alertFinishedDelete = new Alert(Alert.AlertType.CONFIRMATION);
                    alertFinishedDelete.setTitle("Thong bao!");
                    alertFinishedDelete.setContentText("Da xoa thanh cong.");
                    alertFinishedDelete.showAndWait();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Scene scene = new Scene(vbRoot, 350, 350);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        launch(args);
    }
    
}


package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.ResultSet;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class Bai4{
    private String[] tenLop;
    private String slTenLop;
    public static Connection connection;
    public static Statement statement;
    public Bai4() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/qlsv","root","");
        statement = connection.createStatement();
        CreateSelectItem();
    }
    //get and set
    public String[] getTenLop() {
        return tenLop;
    }

    public void setTenLop(String[] tenLop) {
        this.tenLop = tenLop;
    }

    public String getSlTenLop() {
        return slTenLop;
    }

    public void setSlTenLop(String slTenLop) {
        this.slTenLop = slTenLop;
    }
    
    //lay danh sach ten lop.
    public void CreateSelectItem()throws SQLException{
        String query = "SELECT tenLop FROM lop";
        ResultSet result = statement.executeQuery(query);
        ArrayList<String> list = new ArrayList<>();
        while(result.next()){
            list.add(result.getString("tenLop"));
        }
        tenLop = new String[list.size()];
        list.toArray(tenLop);
    }
    
    //lay thong tin sinh vien cua lop dang chon.
    public ResultSet getSinhVien() throws SQLException{
        if(slTenLop==null){
            slTenLop = tenLop[0];
        }
        String getSVQuery = "SELECT MSSV, Ho, Ten,NgaySinh, GioiTinh FROM sinhvien, lop WHERE sinhvien.MaLop = lop.MaLop AND lop.TenLop = '"+slTenLop+"'";
        Statement statement1 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement1.executeQuery(getSVQuery);
        return resultSet;
    }
}

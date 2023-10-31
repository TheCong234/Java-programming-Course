/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NewJSFManagedBean {
    public String ContentHTML() {
        String table = "<table> <body> <tr> <td>So nguyen</td> <td>Giai thua</td></tr>"
                +this.CreateBody()
                +"</body></table>";
        return table;
    }
    public String CreateBody(){
        String body = "";
        int n = 8;
        for(int i = 0; i<=n;i++){
            body += "<tr><td>"+i+"</td><td>"+this.GiaiThua(i)+"</td></tr>";
        }
        return body;
    }
    public int GiaiThua(int n){
        int gt = 1;
        if(n == 0 || n == 1){
            return gt;
        }
        for(int i = 2; i<=n;i++){
            gt*=i;
        }
        return gt;
    }
}


package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import jdk.jfr.Name;

@Name(value = "submit")
@ManagedBean
@RequestScoped
public class Bai2 {
    private String taxable;
    private String filing;

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public String getFiling() {
        return filing;
    }

    public void setFiling(String filing) {
        this.filing = filing;
    }
    
    public String Bai2() {
        return "hehehe";
    }
    
    public String getResult(){
        String kq= "";
        if(taxable!=null){
            double salary = Double.parseDouble(taxable);
            double thue = 0;
            switch (filing) {
                case "Single":
                    if(salary<=10000)
                        thue = (salary*10)/100;
                    else if(salary<=30000)
                        thue = (salary*15)/100;
                    else if(salary<=50000)
                        thue = (salary*20)/100;
                    else if(salary<=100000)
                        thue = (salary*25)/100;
                    else
                        thue = (salary*30)/100;
                    break;
                case "Married":
                    if(salary<=15000)
                        thue = (salary*10)/100;
                    else if(salary<=40000)
                        thue = (salary*15)/100;
                    else if(salary<=70000)
                        thue = (salary*20)/100;
                    else if(salary<=120000)
                        thue = (salary*25)/100;
                    else
                        thue = (salary*30)/100;
                    break;
                default:
                    throw new AssertionError();
            }
            kq += "<span>Taxable Income: "+taxable+"<br />Filing Status: "+filing+"<br />Tax: "+thue+"</span>";
        }
        return kq;
    }
}

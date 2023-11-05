
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import jdk.jfr.Name;

@Name(value = "submit")
@ManagedBean
@RequestScoped
public class Submit {
    private String lastName;
    private String firstName;
    private String dateOfBirthDay;
    private String gender;
    private String[] language;
    private String reason;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getResponse(){
        String result = "";
        if(lastName != null && firstName != null){
            result += "Họ lót: " + lastName +
                "<br />" +
                "Tên: " + firstName + "<br />"+
                "Ngày sinh: " + dateOfBirthDay +
                "<br />" +
                "Giới tính: " + gender +
                "<br />" +
                "Ngôn ngữ đã chọn: ";
                for (String s: language)
                    result += s + " ";
                result += "<br />" +

                "Ý kiến khác: "+reason+"<br/>";
                }
        return result;
    }
    public String Test(){
        return "<h1>hehehe</h1>";
    }
}

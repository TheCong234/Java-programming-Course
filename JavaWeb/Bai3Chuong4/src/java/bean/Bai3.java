package bean;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Bai3 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num10;
    
    private int input1;
    private int input2;
    private int input3;
    private int input4;
    private int input5;
    
    

    
    //
    public Bai3(){
        Random rand = new Random();
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
        num3 = rand.nextInt(10);
        num4 = rand.nextInt(10);
        num5 = rand.nextInt(10);
        num6 = rand.nextInt(10);
        num7 = rand.nextInt(10);
        num8 = rand.nextInt(10);
        num9 = rand.nextInt(10);
        num10 = rand.nextInt(10);
    }
    //
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }
//
    public int getNum9() {
        return num9;
    }

    public void setNum9(int num9) {
        this.num9 = num9;
    }

    public int getNum10() {
        return num10;
    }

    public void setNum10(int num10) {
        this.num10 = num10;
    }
    
    //
    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput3() {
        return input3;
    }

    public void setInput3(int input3) {
        this.input3 = input3;
    }

    public int getInput4() {
        return input4;
    }

    public void setInput4(int input4) {
        this.input4 = input4;
    }

    public int getInput5() {
        return input5;
    }

    public void setInput5(int input5) {
        this.input5 = input5;
    }
    public String Check(int a, int b, int c){
        if((a + b) == c){
            return "Dung";
        }
        return "Sai";
    }
    //
    public String layAns1(){
        return Check(num1, num2, input1);
    }
    
    public String layAns2(){
        return Check(num3, num4, input2);
    }
    
    public String layAns3(){
        return Check(num5, num6, input3);
    }
    
    public String layAns4(){
        return Check(num7, num8, input4);
    }
    
    public String layAns5(){
        return Check(num9, num10, input5);
    }
    
    public void reloadPage() {
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("caculatorForm");
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        externalContext.invalidateSession();
    }
}

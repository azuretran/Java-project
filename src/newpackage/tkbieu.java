/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author azure Tran
 */
public class tkbieu {
    protected String date;
    protected String time;
    protected  String Class1;
    protected String GVNN; 
    protected String Teacher;   protected String daythay;
      protected String session;   protected String trogiang;
       protected String status_tkb;

    public tkbieu(String date, String time, String Class, String GVNN, String Teacher, String daythay, String session, String trogiang, String status_tkb) {
        this.date = date;
        this.time = time;
        this.Class1 = Class;
        this.GVNN = GVNN;
        this.Teacher = Teacher;
        this.daythay = daythay;
        this.session = session;
        this.trogiang = trogiang;
        this.status_tkb = status_tkb;
    }
public tkbieu(){

}
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getClass1() {
        return Class1;
    }

    public String getGVNN() {
        return GVNN;
    }

    public String getTeacher() {
        return Teacher;
    }

    public String getDaythay() {
        return daythay;
    }

    public String getSession() {
        return session;
    }

    public String getTrogiang() {
        return trogiang;
    }

    public String getStatus_tkb() {
        return status_tkb;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setClass1(String Class1) {
        this.Class1 = Class1;
    }

    public void setGVNN(String GVNN) {
        this.GVNN = GVNN;
    }

    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }

    public void setDaythay(String daythay) {
        this.daythay = daythay;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setTrogiang(String trogiang) {
        this.trogiang = trogiang;
    }

    public void setStatus_tkb(String status_tkb) {
        this.status_tkb = status_tkb;
    }
       
}

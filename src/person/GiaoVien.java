/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.List;

/**
 *
 * @author azure Tran
 */
public class GiaoVien extends Person{
    private  float gross;
   private String center;
   private String nhomgv;private String ctday;
   private String trogiang;private String trangthai;
    public float getGross() {
        return gross;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public void setNhomgv(String nhomgv) {
        this.nhomgv = nhomgv;
    }

    public void setCtday(String ctday) {
        this.ctday = ctday;
    }

    public void setTrogiang(String trogiang) {
        this.trogiang = trogiang;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getCenter() {
        return center;
    }

    public String getNhomgv() {
        return nhomgv;
    }

    public String getCtday() {
        return ctday;
    }

    public String getTrogiang() {
        return trogiang;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setGross(float gross) {
        this.gross = gross;
    }
    public GiaoVien (String hovaten,String phonenumber,String address,String Email, int age,float  gross){
            super(hovaten,phonenumber,address,Email,age);
            this.gross=gross;
    }
   /* public List<GiaoVien> tinhgross(){
            
    }
    */
}

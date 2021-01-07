/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thoikhoabieu;

/**
 *
 * @author azure Tran
 */
public class timetable {
    private int ID_nguoilap;
     private String nguoinhap;
     private String noidung_yeucau;
     private String ngay_nhap;
     private String ghichu;
     private String nguoixuli;
     private String tgxuli;
     private String state_xuli;

   
    public int getId() {
        return ID_nguoilap;
    }
   
    /**
     *
     * @return
     */
 
    public void setId(int ID_nguoilap) {
        this.ID_nguoilap = ID_nguoilap;
    }
  
    public String getNguoinhap() {
        return nguoinhap;
    }

    public String getNoidung() {
        return noidung_yeucau;
    }

    public String getNgaythang() {
        return ngay_nhap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public String getNguoixuli() {
        return nguoixuli;
    }

    public String getTgxuli() {
        return tgxuli;
    }

    public String getState() {
        return state_xuli;
    }

   

    public void setNguoinhap(String nguoinhap) {
        this.nguoinhap = nguoinhap;
    }

    public void setNoidung(String Noidung) {
        this.noidung_yeucau = Noidung;
    }

    public void setNgaythang(String ngaythang) {
        this.ngay_nhap = ngaythang;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setNguoixuli(String nguoixuli) {
        this.nguoixuli = nguoixuli;
    }

    public void setTgxuli(String tgxuli) {
        this.tgxuli = tgxuli;
    }

    public void setState(String state) {
        this.state_xuli = state;
    }

    
         
    
}

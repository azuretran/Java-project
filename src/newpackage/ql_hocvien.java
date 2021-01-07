/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Button;
import java.util.Objects;

/**
 *
 * @author azure Tran
 */
public class ql_hocvien {
    private  String chinhanh;
    private String namehv;
   private int oldhv;
   private int sdthv;
   private String classhv;
   private String notehv;
   private String state_hv;
   private String tinhtrang_hocphiString;
   private Button button;

    public ql_hocvien(String chinhanh, String namehv, int oldhv, int sdthv, String classhv, String notehv, String state_hv, String tinhtrang_hocphiString,Button button) {
        this.chinhanh = chinhanh;
        this.namehv = namehv;
        this.oldhv = oldhv;
        this.sdthv = sdthv;
        this.classhv = classhv;
        this.notehv = notehv;
        this.state_hv = state_hv;
        this.tinhtrang_hocphiString = tinhtrang_hocphiString;
        this.button=new Button("click nộp");
    }

    public String getChinhanh() {
        return chinhanh;
    }

    public String getNamehv() {
        return namehv;
    }

    public int getOldhv() {
        return oldhv;
    }

    public int getSdthv() {
        return sdthv;
    }

    public String getClasshv() {
        return classhv;
    }

    public String getNotehv() {
        return notehv;
    }

    public String getState_hv() {
        return state_hv;
    }

    public String getTinhtrang_hocphiString() {
        return tinhtrang_hocphiString;
    }

    public void setChinhanh(String chinhanh) {
        this.chinhanh = chinhanh;
    }

    public void setNamehv(String namehv) {
        this.namehv = namehv;
    }

    public void setOldhv(int oldhv) {
        this.oldhv = oldhv;
    }

    public void setSdthv(int sdthv) {
        this.sdthv = sdthv;
    }

    public void setClasshv(String classhv) {
        this.classhv = classhv;
    }

    public void setNotehv(String notehv) {
        this.notehv = notehv;
    }

    public void setState_hv(String state_hv) {
        this.state_hv = state_hv;
    }

    public void setTinhtrang_hocphiString(String tinhtrang_hocphiString) {
        this.tinhtrang_hocphiString = tinhtrang_hocphiString;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ql_hocvien other = (ql_hocvien) obj;
        if (!Objects.equals(this.namehv, other.namehv)) {
            return false;
        }
        return true;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
   
}

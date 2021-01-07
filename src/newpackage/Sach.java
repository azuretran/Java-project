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
public abstract class  Sach {
        protected  String masach;
        protected String bookname;
        protected int sl;
        protected String trangthai_muonsachString;

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTrangthai_muonsachString() {
        return trangthai_muonsachString;
    }

    public void setTrangthai_muonsachString(String trangthai_muonsachString) {
        this.trangthai_muonsachString = trangthai_muonsachString;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", bookname=" + bookname + ", sl=" + sl + ", trangthai_muonsachString=" + trangthai_muonsachString + '}';
    }

    public Sach(String masach, String bookname, int sl, String trangthai_muonsachString) {
        this.masach = masach;
        this.bookname = bookname;
        this.sl = sl;
        this.trangthai_muonsachString = trangthai_muonsachString;
    }
        
}

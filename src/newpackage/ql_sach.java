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
public class ql_sach extends Sach{
    private int tonkho;
    private String note_muonsach;

    public ql_sach(String masach, String bookname, int sl, String trangthai_muonsachString,int tonkho,
     String note_muonsach) {
        
        super(masach, bookname, sl, trangthai_muonsachString);
        this.tonkho=tonkho; this.note_muonsach=note_muonsach;
    }

    public int getTonkho() {
        return tonkho;
    }

    public String getNote_muonsach() {
        return note_muonsach;
    }

    public void setTonkho(int tonkho) {
        this.tonkho = tonkho;
    }

    public void setNote_muonsach(String note_muonsach) {
        this.note_muonsach = note_muonsach;
    }

    @Override
    public String toString() {
        return "ql_sach{" + "tonkho=" + tonkho + ", note_muonsach=" + note_muonsach + '}';
    }
    
}

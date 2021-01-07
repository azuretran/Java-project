/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Date;
/**
 *
 * @author azure Tran
 */
public class ql_muonsach extends Sach {
        
    
    private Date ngaymuon;
    private  String nguoimuon;
    private String state_tinhtrang;
    private Date ngaytra;
    private String nguoinhan;

    public void setNguoinhan(String nguoinhan) {
        this.nguoinhan = nguoinhan;
    }

    public String getNguoinhan() {
        return nguoinhan;
    }
    public ql_muonsach(String masach, String bookname, int sl, String trangthai_muonsachString,Date ngaymuon,
      String nguoimuon,  String state_tinhtrang, Date ngaytra) {
        super(masach, bookname, sl, trangthai_muonsachString);
        this.ngaymuon=ngaymuon; this.nguoimuon=nguoimuon;
        this.state_tinhtrang=state_tinhtrang;this.ngaytra=ngaytra;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public String getNguoimuon() {
        return nguoimuon;
    }

    public String getState_tinhtrang() {
        return state_tinhtrang;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public void setNguoimuon(String nguoimuon) {
        this.nguoimuon = nguoimuon;
    }

    public void setState_tinhtrang(String state_tinhtrang) {
        this.state_tinhtrang = state_tinhtrang;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    @Override
    public String toString() {
        return "ql_muonsach{" + "ngaymuon=" + ngaymuon + ", nguoimuon=" + nguoimuon + ", state_tinhtrang=" + state_tinhtrang + ", ngaytra=" + ngaytra + '}';
    }
    
}

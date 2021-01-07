/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.logging.Logger;

/**
 *
 * @author azure Tran
 */
public class qllichtrinh {
    private String ndnhacnho; private String mota; private String tgnhacnho;
     private String tgketthuc; private String trangthai;
    private static final Logger LOG = Logger.getLogger(qllichtrinh.class.getName());

    public void setNdnhacnho(String ndnhacnho) {
        this.ndnhacnho = ndnhacnho;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setTgnhacnho(String tgnhacnho) {
        this.tgnhacnho = tgnhacnho;
    }

    public void setTgketthuc(String tgketthuc) {
        this.tgketthuc = tgketthuc;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getNdnhacnho() {
        return ndnhacnho;
    }

    public String getMota() {
        return mota;
    }

    public String getTgnhacnho() {
        return tgnhacnho;
    }

    public String getTgketthuc() {
        return tgketthuc;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public static Logger getLOG() {
        return LOG;
    }
  
}

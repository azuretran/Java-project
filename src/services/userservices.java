/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import person.GiaoVien;
import javadoan.user_down;
import javadoan.user_down;
import java.util.List;
import newpackage.Ql_sukien;
import newpackage.khieunaipp;
import newpackage.ql_hocvien;
import thoikhoabieu.timetable;
import  newpackage.ql_muonsach;
import newpackage.ql_sach;
import newpackage.qldanhba;
import newpackage.qllichtrinh;
import newpackage.tkbieu;
/**
 *
 * @author azure Tran
 */

public class userservices {
    private user_down  user_donwnn;

    public userservices(user_down user_donwnn) {
        this.user_donwnn = user_donwnn;
    }
    
    public userservices(){
    user_donwnn=new user_down();
    
}
    public List<timetable> getAllUsers(){
        return user_donwnn.getAllUsers();
    }
    //tim kiem
        public List<timetable> getAllUsers_search(int id){
        return user_donwnn.getAllUsers_search(id);
    }
        public void adDuser(timetable tb){
            user_donwnn.adDuser(tb);
        }
    public void deleteuser(int id){
    user_donwnn.deleteUser(id);
    
    }
    public timetable getUserbyID(int id){
        return user_donwnn.getUserbyid(id);
    
    }
    public void updateuser(timetable  id)
    {
    user_donwnn.updateuser(id);
    
    
    }
    // quan li muon sach va tra sach
    public List<ql_muonsach> getAllUsers_qlmuonsach(){
        return user_donwnn.getAllUsers_qlmuonsach();
    }
     public void adDuser_qlmuonsach(ql_muonsach tb){
            user_donwnn.adDuser_qlmuonsach(tb);
        }
    public void deleteuser_qlsach(String id){
    user_donwnn.deleteUser_qlmuonsach(id);
    
    }
    public ql_muonsach getUserbyname_qlmuonsach(String id){
        return user_donwnn.getUserbyname_qlmuonsach(id);
    
    }
    public void updateuser_qlmuonsach(ql_muonsach  id)
    {
    user_donwnn.updateuser_qlmuonsach(id);
    
    
    }
    // Quan ly hoc vien
    public List<ql_hocvien> getAllUsers_qlhocvien(){
        return user_donwnn.getAllUsers_qlhocvien();
    }
    //Quản lý Sách
      public List<ql_sach> getAllUsers_qlhsach(){
        return user_donwnn.getAllUsers_qlhsach();
    }
     public ql_sach getUserbyname_qlsach(String id){
        return user_donwnn.getUserbyname_qlsach(id);
    
    }
     //Quản lí thời khoá Biểu
      public List<tkbieu> getAllUsers_qltkbieu(){
        return user_donwnn.getAllUsers_qltkbieu();
    }
       public void adDuser_tkbieu(tkbieu tb){
            user_donwnn.adDuser_tkbieu(tb);
        }
       //Quản lí giáo viên
        public List<GiaoVien> getAllUsers_qlgiaovien(){
        return user_donwnn.getAllUsers_Giaovien();
    }
       //Quản lí phòng Học
       //tiếp nhận khiếu nại
          public void adDuser_khieunai(khieunaipp tb){
            user_donwnn.adDuser_khieunai(tb);
        }
          public List<khieunaipp> getAllUsers_khieunai(){
        return user_donwnn.getAllUsers_khieunai();
    }
           public void deleteuser_khieunai(String id){
    user_donwnn.deleteUser_khieunai(id);
    
    }
           //Quản lí sự kện
            public void adDuser_sukien(Ql_sukien tb){
            user_donwnn.adDuser_sukien(tb);
        }
          public List<Ql_sukien> getAllUsers_sukien(){
        return user_donwnn.getAllUsers_sukien();
    }
           public void deleteUser_sukien(String id){
    user_donwnn.deleteUser_sukien(id);
    
    }
           // quản lí lịch trình
           public List<qllichtrinh> getAllUsers_lichtrinh(){
        return user_donwnn.getAllUsers_lichtrinh();
    }
           //quản lí danh bạ
              public List<qldanhba> getAllUsers_danhba(){
        return user_donwnn.getAllUsers_danhba();
    }
}

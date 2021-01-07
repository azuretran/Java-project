/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import thoikhoabieu.timetable;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.xml.transform.Result;
import newpackage.ql_muonsach;
import newpackage.JDBCconnection;
import newpackage.Ql_sukien;
import newpackage.khieunaipp;
import newpackage.ql_hocvien;
import newpackage.ql_sach;
import newpackage.qldanhba;
import newpackage.qllichtrinh;
import newpackage.tkbieu;
import person.GiaoVien;
/**
 *
 * @author azure Tran
 */
public class user_down {
    // quản lí hồ sơ
    
    // quản lí danh bạ
    public List<qldanhba> getAllUsers_danhba()
    {
        List<qldanhba> usersList=new LinkedList<qldanhba>();
     
        String sqlString="SELECT *FROM ql_danhba";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
             
               qldanhba user=new qldanhba();
              user.setTen(rs.getString("tencanhan"));
              user.setPhone(rs.getInt("phone"));
              user.setEmail(rs.getString("Email"));
              user.setState_danhbaString(rs.getString("state_danhba")); 
             
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
    // quản lí lịch trình
    
     public List<qllichtrinh> getAllUsers_lichtrinh()
    {
        List<qllichtrinh> usersList=new LinkedList<qllichtrinh>();
     
        String sqlString="SELECT *FROM lichtrinh";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
             
               qllichtrinh user=new qllichtrinh();
              user.setNdnhacnho(rs.getString("ndnhacnho"));
              user.setMota(rs.getString("mota"));
              user.setTgketthuc(rs.getString("tgnhacnho"));
              user.setTgketthuc(rs.getString("tgketthuc")); user.setTrangthai(rs.getString("status_lichtrinh"));
             
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
    
    
    
    
    
    
    //Quản lí Sự kiện
    public List<Ql_sukien> getAllUsers_sukien()
    {
        List<Ql_sukien> usersList=new LinkedList<Ql_sukien>();
     
        String sqlString="SELECT *FROM sukien";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
             
               Ql_sukien user=new Ql_sukien();
              user.setTenct(rs.getString("tenct"));
              user.setNgaydr(rs.getString("ngaydienra"));
              user.setTrangthai(rs.getString("trangthai"));
             
             
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
    public void deleteUser_sukien(String  tenct){
         try
    {
            String sqlString="delete from khieunai where tenct=? ";
            
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
         PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         preparedStatement.setString(1,tenct);
           preparedStatement.executeUpdate();
    }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    }
    
    public void adDuser_sukien(Ql_sukien user){
        
    try
    {
            String sqlString="insert into sukien (tenct,ngaydienra,trangthai) values(?,?,?)";
            
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setString(1,  user.getTenct());
           preparedStatement.setString(2, user.getNgaydr());
            preparedStatement.setString(3,user.getTrangthai());
        
           
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    }
    
    
    //Quản lí khiếu nại
    public List<khieunaipp> getAllUsers_khieunai()
    {
        List<khieunaipp> usersList=new LinkedList<khieunaipp>();
     
        String sqlString="SELECT *FROM khieunai";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
             
               khieunaipp user=new khieunaipp();
              user.setTime(rs.getString("time"));
              user.setNd(rs.getString("ndkhieunai"));
              user.setNguontin(rs.getString("nguontin"));
              user.setNvtiepnhan(rs.getString("nhanvientiepnhan"));
              user.setYkien(rs.getString("ykienxuly"));
             
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    public void deleteUser_khieunai(String  nhanvientiepnhan){
         try
    {
            String sqlString="delete from khieunai where nhanvientiepnhan=? ";
            
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
         PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         preparedStatement.setString(1,  nhanvientiepnhan);
           preparedStatement.executeUpdate();
    }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    }
    public void adDuser_khieunai(khieunaipp user){
        
    try
    {
            String sqlString="insert into khieunai (time,ndkhieunai,nguontin,nhanvientiepnhan,ykienxuly) values(?,?,?,?,?)";
            
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setString(1,  user.getTime());
           preparedStatement.setString(2,user.getNd());
            preparedStatement.setString(3,user.getNguontin());
             preparedStatement.setString(4,user.getNvtiepnhan());
              preparedStatement.setString(5,user.getYkien()); 
           
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    }
    
    //quản lý lớp học
    
    
    
    
    //Quản lí giáo viên
    
     public List<GiaoVien> getAllUsers_Giaovien()
    {
        List<GiaoVien> usersList=new LinkedList<GiaoVien>();
     
        String sqlString="SELECT *FROM GIAO_VIEN";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
             
               GiaoVien user=new GiaoVien(null, null, null, null, 0, 0);
              user.setCenter(rs.getString("Tentt"));
              user.setHovaten(rs.getString("gvname"));
              user.setPhonenumber(rs.getString("sodt"));
              user.setEmail(rs.getString("email_gv"));
              user.setNhomgv(rs.getString("group_gv"));
              user.setCtday(rs.getString("ctday"));
             user.setTrogiang(rs.getString("trogiang"));
             user.setTrangthai(rs.getString("gv_state"));
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
    
    
    //Quản Lí thời Khoá Biểu 
    
     public List<tkbieu> getAllUsers_qltkbieu()
    {
        List<tkbieu> usersList=new LinkedList<tkbieu>();
     
        String sqlString="SELECT *FROM ql_tkbieu";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               tkbieu user=new tkbieu();
              user.setDate(rs.getString("day1"));
              user.setTime(rs.getString("time1"));
              user.setClass1(rs.getString("classroom"));
              user.setGVNN(rs.getString("GVNN"));
              user.setTeacher(rs.getString("Teacher"));
              user.setDaythay(rs.getString("daythay"));
             user.setSession(rs.getString("session1"));
             user.setTrogiang(rs.getString("trogiang"));
             user.setStatus_tkb(rs.getString("status_tkb"));
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    
    public void adDuser_tkbieu(tkbieu user){
        
    try
    {
            String sqlString="insert into ql_tkbieu (day1,time1,classroom,GVNN,Teacher,daythay,session1,trogiang,status_tkb) values(?,?,?,?,?,?,?,?,?)";
            
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setString(1,user.getDate());
           preparedStatement.setString(2,user.getTime());
            preparedStatement.setString(3,user.getClass1());
             preparedStatement.setString(4,user.getGVNN());
              preparedStatement.setString(5,user.getTeacher()); 
              preparedStatement.setString(6,user.getDaythay()); 
              preparedStatement.setString(7,user.getSession());
              preparedStatement.setString(8,user.getTrogiang());
              preparedStatement.setString(9,user.getStatus_tkb());
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    }
    public void deleteUser_tkbieu(String  classroom){
         try
    {
            String sqlString="delete from ql_tkb where classroom=? ";
            
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
         PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         preparedStatement.setString(1,  classroom);
           preparedStatement.executeUpdate();
    }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    
    }
    //quản lí sách sách
    public List<ql_sach> getAllUsers_qlhsach()
    {
        List<ql_sach> usersList=new LinkedList<ql_sach>();
     
        String sqlString="SELECT *FROM ql_sach";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               ql_sach user=new ql_sach(null, null, 0, null, 0, null);
              user.setMasach(rs.getString("masach"));
              user.setBookname(rs.getString("bookname"));
              user.setSl(rs.getInt("sl"));
              user.setTonkho(rs.getInt("tonkho"));
              user.setNote_muonsach(rs.getString("note_muonsach"));
              user.setTrangthai_muonsachString(rs.getString("state_trangthai"));
             
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    //tìm sách theo tên
     public ql_sach getUserbyname_qlsach(String bookname)
    {
     
     
        String sqlString="SELECT *FROM ql_sach where  bookname=?";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             preparedStatement.setString(1, bookname);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               ql_sach user1=new ql_sach(null, null, 0, null, 0, null);
              user1.setMasach(rs.getString("masach"));
              user1.setBookname(rs.getString("bookname"));
              user1.setSl(rs.getInt("sl"));
              user1.setTonkho(rs.getInt("tonkho"));
              user1.setNote_muonsach(rs.getString("note_muonsach"));
              user1.setTrangthai_muonsachString(rs.getString("state_trangthai"));
            
             return user1;
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return null;
    }
    
    
    
    //quản lí học viên -hồ sơ học viên -đăng kí all in
    public List<ql_hocvien> getAllUsers_qlhocvien()
    {
        List<ql_hocvien> usersList=new LinkedList<ql_hocvien>();
     
        String sqlString="SELECT *FROM ql_hocvien";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               ql_hocvien user=new ql_hocvien(null, null, 0, 0, null, null, null, null,null);
              user.setChinhanh(rs.getString("chinhanh"));
              user.setNamehv(rs.getString("namehv"));
              user.setOldhv(rs.getInt("agehv"));
              user.setSdthv(rs.getInt("phonehv"));
              user.setClasshv(rs.getString("classroom"));
              user.setNotehv(rs.getString("note"));
              user.setState_hv(rs.getString("statehv"));
              user.setTinhtrang_hocphiString(rs.getString("tinhtrang_hocphiString"));
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    // ham lay tat ca gia tri set vao table timetable
    
    public List<timetable> getAllUsers()
    {
        List<timetable> usersList=new LinkedList<timetable>();
     
        String sqlString="SELECT *FROM SO_GIAO_CA_GIAOVIEC";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               timetable user=new timetable();
              user.setId(rs.getInt("ID_nguoilap"));
              user.setNguoinhap(rs.getString("nguoinhap"));
              user.setNgaythang(rs.getString("ngay_nhap"));
              user.setNoidung(rs.getString("noidung_yeucau"));
              user.setGhichu(rs.getString("ghichu"));
              user.setNguoixuli(rs.getString("nguoixuli"));
              user.setTgxuli(rs.getString("tgxuli"));
              user.setState(rs.getString("state_xuli"));
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
   public List<timetable> getAllUsers_search(int ID_nguoilap)
    {
        List<timetable> usersList=new LinkedList<timetable>();
     
        String sqlString="SELECT *FROM SO_GIAO_CA_GIAOVIEC where ID_nguoilap=?";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
               preparedStatement.setInt(1, ID_nguoilap);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               timetable user=new timetable();
              user.setId(rs.getInt("ID_nguoilap"));
              user.setNguoinhap(rs.getString("nguoinhap"));
              user.setNgaythang(rs.getString("ngay_nhap"));
              user.setNoidung(rs.getString("noidung_yeucau"));
              user.setGhichu(rs.getString("ghichu"));
              user.setNguoixuli(rs.getString("nguoixuli"));
              user.setTgxuli(rs.getString("tgxuli"));
              user.setState(rs.getString("state_xuli"));
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    }
    //get user by id
    public void updateuser(timetable user){
    
    try
    {
            String sqlString="update SO_GIAO_CA_GIAOVIEC set nguoinhap=?,ngay_nhap=?,noidung_yeucau=?,ghichu=?,nguoixuli=?,tgxuli=?,state_xuli=?";
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
        Connection con = DriverManager.getConnection(dbURL);
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         /// preparedStatement.setInt(1,user.getId());
           preparedStatement.setString(1,user.getNguoinhap());
            preparedStatement.setString(2,user.getNgaythang());
             preparedStatement.setString(3,user.getNoidung());
              preparedStatement.setString(4,user.getGhichu()); 
              preparedStatement.setString(5,user.getNguoixuli()); 
              preparedStatement.setString(6,user.getTgxuli());
              preparedStatement.setString(7,user.getState());
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    
    
    }
   public timetable getUserbyid(int ID_nguoilap)
    {
     
     
        String sqlString="SELECT *FROM SO_GIAO_CA_GIAOVIEC where  ID_nguoilap=?";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             preparedStatement.setInt(1, ID_nguoilap);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               timetable user=new timetable();
              user.setId(rs.getInt("ID_nguoilap"));
              user.setNguoinhap(rs.getString("nguoinhap"));
              user.setNgaythang(rs.getString("ngay_nhap"));
              user.setNoidung(rs.getString("noidung_yeucau"));
              user.setGhichu(rs.getString("ghichu"));
              user.setNguoixuli(rs.getString("nguoixuli"));
              user.setTgxuli(rs.getString("tgxuli"));
              user.setState(rs.getString("state_xuli"));
             return user;
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return null;
    }
    public void adDuser(timetable user){
        
    try
    {
            String sqlString="insert into SO_GIAO_CA_GIAOVIEC (ID_nguoilap,nguoinhap,ngay_nhap,noidung_yeucau,ghichu,nguoixuli,tgxuli,state_xuli) values(?,?,?,?,?,?,?,?)";
            
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setInt(1,user.getId());
           preparedStatement.setString(2,user.getNguoinhap());
            preparedStatement.setString(3,user.getNgaythang());
             preparedStatement.setString(4,user.getNoidung());
              preparedStatement.setString(5,user.getGhichu()); 
              preparedStatement.setString(6,user.getNguoixuli()); 
              preparedStatement.setString(7,user.getTgxuli());
              preparedStatement.setString(8,user.getState());
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
        
    }
    public void deleteUser(int  ID_nguoilap){
         try
    {
            String sqlString="delete from SO_GIAO_CA_GIAOVIEC where ID_nguoilap=? ";
            
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
         PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         preparedStatement.setInt(1,  ID_nguoilap);
           preparedStatement.executeUpdate();
    }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    
    }
    //Phần Quản lý Mượn Sách
    //lay gia tri ql_muon sach
     public List<ql_muonsach> getAllUsers_qlmuonsach()
    {
        List<ql_muonsach> usersList=new LinkedList<ql_muonsach>();
     
        String sqlString="SELECT *FROM qlmuon_sach";
         try{
          
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               ql_muonsach user=new ql_muonsach(null, null, 0, null, null, null, null, null);
              user.setNgaymuon(rs.getDate("ngaymuon"));
              user.setBookname(rs.getString("bookname"));
              user.setNguoimuon(rs.getString("nguoimuon"));
              user.setSl(rs.getInt("sl"));
              user.setTrangthai_muonsachString(rs.getString("state_muonsach"));
              user.setNgaytra(rs.getDate("ngaytra"));
              user.setState_tinhtrang(rs.getString("state_tinhtrang"));
              user.setNguoinhan(rs.getString("nguoinhan"));
              usersList.add(user);
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return usersList;
    } 
 //  update quan li muon sach
     
      public void updateuser_qlmuonsach(ql_muonsach user){
    
    try
    {
            String sqlString="update qlmuon_sach set ngaymuon=?,bookname=?,nguoimuon=?,sl=?,state_muonsach=?,ngaytra=?,state_tinhtrang=?,nguoinhan=?";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setDate(1, (Date) user.getNgaymuon());
           preparedStatement.setString(2,user.getBookname());
            preparedStatement.setString(3,user.getNguoimuon());
             preparedStatement.setInt(4,user.getSl());
              preparedStatement.setString(5,user.getTrangthai_muonsachString()); 
              preparedStatement.setDate(6, (Date) user.getNgaytra()); 
              preparedStatement.setString(7,user.getState_tinhtrang());
              preparedStatement.setString(8,user.getNguoimuon());
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
    
  
     
  } 
      
 public void adDuser_qlmuonsach(ql_muonsach user){
        
    try
    {
            String sqlString="insert into qlmuon_sach (ngaymuon,bookname,nguoimuon,sl,state_muonsach,ngaytra,state_tinhtrang,nguoinhan) values(?,?,?,?,?,?,?,?)";
            
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
            
          PreparedStatement preparedStatement=con.prepareStatement(sqlString);
          preparedStatement.setDate(1, (Date) user.getNgaymuon());
           preparedStatement.setString(2,user.getBookname());
            preparedStatement.setString(3,user.getNguoimuon());
             preparedStatement.setInt(4,user.getSl());
              preparedStatement.setString(5,user.getTrangthai_muonsachString()); 
              preparedStatement.setDate(6, (Date) user.getNgaytra()); 
              preparedStatement.setString(7,user.getState_tinhtrang());
              preparedStatement.setString(8,user.getNguoimuon());
              preparedStatement.executeUpdate();
           
         
        
    }
    catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
        
    }
  public void deleteUser_qlmuonsach(String  nguoimuon){
         try
    {
            String sqlString="delete from qlmuon_sach where nguoimuon=? ";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
              
         PreparedStatement preparedStatement=con.prepareStatement(sqlString);
         preparedStatement.setString(1,  nguoimuon);
           preparedStatement.executeUpdate();
    }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
    }
  }
  //get qlmuonsach
    public ql_muonsach getUserbyname_qlmuonsach(String nguoimuon)
    {
     
     
        String sqlString="SELECT *FROM qlmuon_sach where  nguoimuon=?";
         try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement preparedStatement=con.prepareStatement(sqlString);
             preparedStatement.setString(1, nguoimuon);
             ResultSet rs=preparedStatement.executeQuery();
             while (rs.next()) {                 
               ql_muonsach user1=new ql_muonsach(null, null, 0, null, null, null, null, null);
              user1.setNgaymuon(rs.getDate("nguoimuon"));
              user1.setBookname(rs.getString("bookname"));
              user1.setNguoimuon(rs.getString("nguoimuon"));
              user1.setSl(rs.getInt("sl"));
              user1.setTrangthai_muonsachString(rs.getString("state_muonsach"));
              user1.setNgaytra(rs.getDate("ngaytra"));
              user1.setState_tinhtrang(rs.getString("state_tinhtrang"));
              user1.setNguoinhan(rs.getString("nguoinhan"));
             return user1;
               
             }
         }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
         return null;
    }

    
    
    
    public static void main(String[] args){
        
}
}

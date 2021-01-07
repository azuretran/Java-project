/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;  
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JLabel;
import services.userservices;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hemf.record.emfplus.HemfPlusDraw;
import thoikhoabieu.timetable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.lowagie.text.rtf.document.RtfDocument;

import com.lowagie.text.pdf.PdfPTable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.RowFilter;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
//import com.itextpdf.text.Document;
import javax.swing.text.Segment;
/**
 *
 * @author azure Tran
 */

public class homepage extends javax.swing.JFrame {
    
        DefaultTableModel defaultTableModel=new DefaultTableModel();
    userservices user= new userservices();
    timetable tb=new timetable();
    
     List<timetable> usersList=user.getAllUsers();
    
      private void settableuser( List<timetable> usersList)
      {
        
    DefaultTableModel defaultTableModel=new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                
           };
           jTable1.setModel(defaultTableModel);
             defaultTableModel.addColumn("ID_Người Nhập");
           defaultTableModel.addColumn("Người Nhập");
             defaultTableModel.addColumn("Nội dung");
            defaultTableModel.addColumn("Ngày Tháng");
            defaultTableModel.addColumn("Ghi Chú");
            defaultTableModel.addColumn("Người xử lý");  
            defaultTableModel.addColumn("Thời gian xử lí");
            defaultTableModel.addColumn("Trạng thái");
            
            
          
        
        
        usersList.stream().forEach((usersList1) -> 
           
        {
            defaultTableModel.addRow(new Object[]{usersList1.getId(),usersList1.getNguoinhap(),usersList1.getNoidung(),usersList1.getNgaythang(),usersList1.getGhichu()
                    ,usersList1.getNguoixuli(),usersList1.getTgxuli(),usersList1.getState()});
        });
        
        
    }
    public homepage() 
       {
        initComponents();
        
       jPanel5.setVisible(false);
     
       //Userservices =new userservices();
       
       
       //tat button 3 chon 1
       
         jPanel6.setVisible(false);
         //jTable1.getTableHeader().setFont(new Font("Tahoma ",Font.BOLD,18));
         jTable1.getTableHeader().setOpaque(false);
         jTable1.getTableHeader().setBackground(new Color(241, 196, 15));
         jTable1.getTableHeader().setForeground(new Color(41, 128, 185));
          setTitle("CHƯƠNG TRÌNH QUẢN LÍ TRUNG TÂM ANH NGỮ");
                  setIconImage();
       
          
               settableuser(user.getAllUsers());
              
               
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jDialog1 = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog2 = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        subbmit = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        jDialog3 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        changpassword = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        JP2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TAB1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox();
        quanlythuvien = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();

        jDialog1.setBackground(new java.awt.Color(99, 205, 218));
        jDialog1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDialog1.setForeground(java.awt.Color.green);
        jDialog1.setLocation(new java.awt.Point(100, 100));
        jDialog1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel7.setBackground(new java.awt.Color(255, 153, 102));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jPanel7.setAutoscrolls(true);
        jPanel7.setName(""); // NOI18N

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 102, 102));
        jLabel35.setText("ID");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 255));
        jLabel36.setText("NGƯỜI NHẬP");

        jLabel37.setBackground(new java.awt.Color(255, 153, 102));
        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 255));
        jLabel37.setText("NỘI DUNG ");
        jLabel37.setAlignmentX(0.5F);
        jLabel37.setAutoscrolls(true);
        jLabel37.setName(""); // NOI18N

        jLabel38.setBackground(new java.awt.Color(255, 153, 102));
        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setText("NGÀY THÁNG");
        jLabel38.setAlignmentX(0.5F);
        jLabel38.setAutoscrolls(true);
        jLabel38.setName(""); // NOI18N

        jLabel39.setBackground(new java.awt.Color(255, 153, 102));
        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("GHI CHÚ");
        jLabel39.setAlignmentX(0.5F);
        jLabel39.setAutoscrolls(true);
        jLabel39.setName(""); // NOI18N

        jLabel40.setBackground(new java.awt.Color(255, 153, 102));
        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel40.setText("NGƯỜI XỬ LÍ");
        jLabel40.setAlignmentX(0.5F);
        jLabel40.setAutoscrolls(true);
        jLabel40.setName(""); // NOI18N

        jLabel41.setBackground(new java.awt.Color(255, 153, 102));
        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("TG XỬ LÍ");
        jLabel41.setAlignmentX(0.5F);
        jLabel41.setAutoscrolls(true);
        jLabel41.setName(""); // NOI18N

        jLabel42.setBackground(new java.awt.Color(255, 153, 102));
        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setText("TRẠNG THÁI");
        jLabel42.setAlignmentX(0.5F);
        jLabel42.setAutoscrolls(true);
        jLabel42.setName(""); // NOI18N

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jDateChooser2.setDateFormatString("dd/MM/yyyy");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Chưa xử lí");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 0));
        jRadioButton2.setText("Đã xử lí");
        jRadioButton2.setPreferredSize(new java.awt.Dimension(73, 73));

        jButton7.setBackground(new java.awt.Color(204, 255, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-icon.png"))); // NOI18N
        jButton7.setText("THÊM VÀO TABLE");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButton7, org.jdesktop.beansbinding.ELProperty.create("Thêm vào cơ sở dữ liệu"), jButton7, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jDateChooser8.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(jButton7))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateChooser2, jDateChooser8, jTextField1, jTextField2, jTextField3, jTextField4, jTextField5});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooser2, jDateChooser8, jTextField1, jTextField2, jTextField3, jTextField4, jTextField5});

        jButton6.setBackground(new java.awt.Color(0, 255, 153));
        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person/icons8-return-64.png"))); // NOI18N
        jButton6.setText("BACK");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButton6, org.jdesktop.beansbinding.ELProperty.create("Quay lại trang trước"), jButton6, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-image-64.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("THÊM GIAO CA GIAO VIỆC");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel34)
                .addGap(83, 83, 83)
                .addComponent(jButton6)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialog2.getContentPane().setLayout(new java.awt.CardLayout());

        jPanel14.setBackground(new java.awt.Color(255, 204, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jPanel14.setForeground(new java.awt.Color(255, 51, 51));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 0, 255));
        jLabel55.setText("Sửa Thông Tin Giao Ca");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-love-book-100_1.png"))); // NOI18N

        jLabel57.setText("ID NGƯỜI NHẬP");

        jLabel58.setText("NGƯỜI NHẬP");

        jLabel59.setText("NỘI DUNG");

        jLabel60.setText("NGÀY THÁNG");

        jLabel61.setText("GHI CHÚ");

        jLabel62.setText("NGƯỜI XỬ LÝ");

        jLabel63.setText("TG XỬ LÝ");

        jLabel64.setText("TRẠNG THÁI");

        jButton19.setBackground(new java.awt.Color(102, 51, 255));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(240, 240, 240));
        jButton19.setText("REFRESH");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        subbmit.setBackground(new java.awt.Color(102, 51, 255));
        subbmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        subbmit.setForeground(new java.awt.Color(240, 240, 240));
        subbmit.setText("LƯU LẠI");
        subbmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbmitActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Đã Xử Lý");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Chưa Xử Lý");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel56)
                .addGap(49, 49, 49)
                .addComponent(jLabel55)
                .addGap(194, 194, 194))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addComponent(subbmit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(55, 55, 55)
                                        .addComponent(jRadioButton4))
                                    .addComponent(jTextField17)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField16)
                                    .addComponent(jDateChooser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33)
                .addComponent(jButton19)
                .addGap(123, 123, 123))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateChooser10, jDateChooser9, jTextField12});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel56))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel55)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subbmit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel63)))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel64)
                    .addComponent(jRadioButton4))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooser10, jDateChooser9, jTextField12});

        jDialog2.getContentPane().add(jPanel14, "card2");

        jPopupMenu1.setForeground(new java.awt.Color(255, 255, 0));
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(120, 130));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red-cross-icon.png"))); // NOI18N
        delete.setText("Xoá");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(delete);

        edit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 102, 51));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Text-Edit-icon.png"))); // NOI18N
        edit.setText("Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPopupMenu1.add(edit);

        jDialog3.getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thoikhoabieu/Apps-preferences-desktop-user-password-icon.png"))); // NOI18N
        jLabel45.setText("ĐỔI MẬT KHẨU");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel46.setText("Nhập Mật Khẩu Cũ");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel47.setText("NHẬP MẬT KHẨU MỚI");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setText("Xác Nhận Mật khẩu mới");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel49.setText("Mã Xác Nhận");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel50.setText("Nhập mã Xác Nhận");

        changpassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        changpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-icon.png"))); // NOI18N
        changpassword.setText("SAVE");
        changpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        changpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changpasswordActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Reload-icon.png"))); // NOI18N
        jButton15.setText("REFRESH");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 51));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton16.setText("Đổi Mã");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(changpassword)
                        .addGap(82, 82, 82)
                        .addComponent(jButton15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel45)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel46, jLabel47, jLabel48, jLabel49, jLabel50, jTextField10, jTextField11, jTextField7, jTextField8, jTextField9});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {changpassword, jButton15});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel45)
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel46))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel47))
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel48))
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel50))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changpassword)
                    .addComponent(jButton15))
                .addGap(20, 20, 20))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {changpassword, jButton15});

        jDialog3.getContentPane().add(jPanel4, "card2");

        jDialog4.getContentPane().setLayout(new java.awt.CardLayout());

        jPanel13.setBackground(new java.awt.Color(85, 230, 193));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thoikhoabieu/icons8-bouquet-96.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 51));
        jLabel52.setText("LẬP THỜI KHOÁ BIỂU");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Tuần Trước");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Tuần Tiếp Theo");

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton17.setText("Xuất Thời Khoá Biểu");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton18.setText("Huỷ Bỏ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel52))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateChooser1, jDateChooser5, jDateChooser6, jDateChooser7});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel51))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel52)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooser1, jDateChooser5, jDateChooser6, jDateChooser7});

        jDialog4.getContentPane().add(jPanel13, "card2");

        jPopupMenu2.setBackground(new java.awt.Color(255, 102, 102));
        jPopupMenu2.setPreferredSize(new java.awt.Dimension(120, 130));

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Text-Edit-icon.png"))); // NOI18N
        jMenuItem3.setText("Sửa");
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red-cross-icon.png"))); // NOI18N
        jMenuItem4.setText("Xoá");
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(46, 204, 113));

        JP2.setBackground(new java.awt.Color(236, 240, 241));
        JP2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 51, 51), null));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-100.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-facebook-like-100.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(223, 228, 234));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("GIAO CA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(46, 204, 113));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(236, 240, 241));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-tag-96.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bank-building-96.png"))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "THỜI KHOÁ BIỂU", "QUẢN LÍ GIÁO VIÊN", "LỚP HỌC", "PHÒNG HỌC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOẠT ĐỘNG ĐIỀU HÀNH", "TIẾP NHẬN ", "TỔ CHỨC SỰ KIỆN", "LỊCH TRÌNH", "DANH BẠ TỔ CHỨC ", "HỒ SƠ" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-group-100.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-book-100.png"))); // NOI18N

        TAB1.setBackground(new java.awt.Color(223, 228, 234));
        TAB1.setRequestFocusEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/graph-icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("GIAO CA GIAO VIỆC");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Telephone-icon.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("GHI DANH");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Books-2-icon.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("QUẢN LÍ HỌC VIÊN");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Generate-keys-icon.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("ĐỔI MẬT KHẨU");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Apps-Google-Drive-Sheets-icon.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Messages-icon.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("THỜI KHOÁ BIỂU");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 102, 102));
        jLabel27.setText("KHIẾU NẠI &GIẢI QUYẾT");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 204, 0));
        jLabel24.setText("HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG-ĐỒ ÁN MÔN LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG");

        jLabel30.setForeground(new java.awt.Color(255, 102, 51));
        jLabel30.setText("@copywrite: Trần Quang Linh-Lê  Ngọc Hiếu (nhóm trưởng)");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-project-management-48.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadoan/icons8-complaint-48.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/caculator-icon (1).png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("Công Cụ ");

        javax.swing.GroupLayout TAB1Layout = new javax.swing.GroupLayout(TAB1);
        TAB1.setLayout(TAB1Layout);
        TAB1Layout.setHorizontalGroup(
            TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB1Layout.createSequentialGroup()
                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAB1Layout.createSequentialGroup()
                                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TAB1Layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TAB1Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel4)))
                                .addGap(309, 309, 309)
                                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TAB1Layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(jLabel26)))
                        .addGap(49, 49, 49)
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel13))
                                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TAB1Layout.createSequentialGroup()
                                        .addGap(237, 237, 237)
                                        .addComponent(jLabel16))
                                    .addGroup(TAB1Layout.createSequentialGroup()
                                        .addGap(292, 292, 292)
                                        .addComponent(jLabel21))))))
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel17)
                        .addGap(531, 531, 531)
                        .addComponent(jLabel20)
                        .addGap(306, 306, 306)
                        .addComponent(jLabel23))
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAB1Layout.createSequentialGroup()
                                .addGap(454, 454, 454)
                                .addComponent(jLabel31)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel24))
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addGap(671, 671, 671)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        TAB1Layout.setVerticalGroup(
            TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel16)
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(123, 123, 123)
                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26)
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel21))))
                .addGap(37, 37, 37)
                .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel31))
                    .addGroup(TAB1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(TAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAB1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel30))
                            .addGroup(TAB1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(2365, 806));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("SỔ GIAO CA & GIAO VIỆC");

        jPanel5.setBackground(new java.awt.Color(46, 204, 113));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-stack-100.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 153));
        jLabel19.setText("DANH SÁCH CÔNG VIỆC");

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-new-96.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButton4, org.jdesktop.beansbinding.ELProperty.create("Thêm mới giao ca"), jButton4, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jButton4AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person/icons8-search-client-80.png"))); // NOI18N
        jButton8.setActionCommand("SEARCH");

        jTextField6.setBackground(new java.awt.Color(240, 240, 240));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField6.setToolTipText("Tìm theo tên");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 51));
        jButton9.setForeground(new java.awt.Color(255, 255, 51));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-microsoft-excel-64.png"))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButton9, org.jdesktop.beansbinding.ELProperty.create("Xuất Dữ Liệu Ra Excel"), jButton9, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 0));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reload-icon (1).png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pdf-icon_2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(104, 104, 104)
                .addComponent(jButton9)
                .addGap(106, 106, 106)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(60, 60, 60)
                .addComponent(jButton13)
                .addGap(441, 441, 441))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton9)
                                        .addComponent(jLabel19)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(263, 263, 263))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(0, 153, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Người nhập", "Ngày Tháng", "Nội dung yêu cầu", "Ghi chú/ phản hồi", "Những người xử lí", "Thời gian xử lí", "Trạng Thái", "Thao tác"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 153, 255));
        jTable1.setRowHeight(50);
        jTable1.setRowMargin(2);
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(204, 255, 0));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 267, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 102, 102));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QUẢN LÍ HỌC VIÊN", "HỒ SƠ HỌC VIÊN", " ", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        quanlythuvien.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        quanlythuvien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QUẢN LÍ THƯ VIỆN", "SÁCH GỐC", "MƯỢN TRẢ" }));
        quanlythuvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlythuvienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP2Layout = new javax.swing.GroupLayout(JP2);
        JP2.setLayout(JP2Layout);
        JP2Layout.setHorizontalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(JP2Layout.createSequentialGroup()
                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(quanlythuvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP2Layout.createSequentialGroup()
                        .addComponent(TAB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JP2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        JP2Layout.setVerticalGroup(
            JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP2Layout.createSequentialGroup()
                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP2Layout.createSequentialGroup()
                        .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP2Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP2Layout.createSequentialGroup()
                                .addComponent(quanlythuvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(TAB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(JP2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel9)
                        .addGap(716, 716, 716))))
            .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JP2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP2, javax.swing.GroupLayout.PREFERRED_SIZE, 2019, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void setIconImage(){
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-heart-outline-96.png")));
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        TAB1.setVisible(false);
         jPanel6.setVisible(true);
         jTable1.setVisible(true);
         jPanel5.setVisible(true);jPanel2.setVisible(true);
       
            
       jTable1.setComponentPopupMenu(jPopupMenu1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TAB1.setVisible(true);
          jTable1.setVisible(false);
            jPanel6.setVisible(false);// quay ve home
            jPanel5.setVisible(false);
            jPanel2.setVisible(true);
          //tat button 3
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       jDialog1.setVisible(true);
       jDialog1.setSize(984, 489);
      
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jButton4AncestorMoved
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton4AncestorMoved

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int index =jComboBox1.getSelectedIndex();
        if(index==0) {
        Quanlythoikhoabieu knn=new Quanlythoikhoabieu();
        knn.setVisible(true);
           
        }
      if(index==2){
          Quanlylophoc ql=new Quanlylophoc();
          ql.setVisible(true);   
    
      }
      if(index==1){
          QuanLiGiaoVien qlgv=new QuanLiGiaoVien();
          qlgv.setVisible(true);
      }
      
       if(index==3){
          PhongHoc qlgv=new PhongHoc();
          qlgv.setVisible(true);
      }
      
      
      
      
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        jDialog3.setVisible(true);
        jDialog3.setTitle("Đổi Mật Khẩu");
        jDialog3.setSize(917, 620);
        randomnumers();
    }//GEN-LAST:event_jLabel16MouseClicked
    public void randomnumers(){
        Random ran=new Random();
        int n=ran.nextInt(1000)+1;
        String valString=String.valueOf(n);
        jTextField10.setText(valString);
    
    }
    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        if(jTextField6.getText().equals("Search by name"))
        {
            jTextField6.setText(""); 
            jTextField6.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
          if(jTextField6.getText().equals(""))
        {
            jTextField6. setText("Search by name"); 
            jTextField6.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(false);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String xx=jTextField1.getText();
      tb.setId(Integer.parseInt(xx));
      tb.setNguoinhap(jTextField2.getText());
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
       tb.setNgaythang(formatter.format(jDateChooser8.getDate()));
       tb.setNoidung(jTextField3.getText());
       tb.setGhichu(jTextField4.getText());
       tb.setNguoixuli(jTextField5.getText());
    tb.setTgxuli(formatter.format(jDateChooser2.getDate()));
    String stateString=" ";
    if(jRadioButton1.isSelected()){
        stateString+="Chưa xử lý";
    }
     if(jRadioButton2.isSelected()){
        stateString+="Đã xử lý";
    }
      tb.setState(stateString);
    user.adDuser(tb);
      JOptionPane.showMessageDialog(rootPane,"Thêm Thành Công");
   
     
 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
           if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("Nhập ID là số "); 
            jTextField1.setForeground(new Color(153,153,153));
        }
        if(this.isVisible()){
            String idString=jTextField1.getText();
            String reg;
            reg = ".*[0-9].*";
            if(idString.length()>0){
                if(!idString.matches(reg)){
                    JOptionPane.showMessageDialog(jDialog1, "ID là số từ 0-9 ");
                }
            }
            else{
                JOptionPane.showMessageDialog(jDialog1, "ID không được để trống");
            }
            
           
              
               
               
               
               
               
               
               
               
               
               
        }
        
                
        
        
        
        
        
        
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        try{
        if(row==-1){
            
            //String nameString=jTable1.getValueAt(row, 1).toString();
            JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        }
        else{
             int userid=Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0)));
            int confirm=JOptionPane.showConfirmDialog(homepage.this, "Bạn Có Chắc Muốn Xoá Không Với ID là:"+jTable1.getValueAt(row, 0));
            if(confirm==JOptionPane.YES_OPTION){
           
            user.deleteuser(userid);
            //refresh table 
              ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        settableuser(user.getAllUsers());
            }
        }
        }
        catch(Exception e){
        
         JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        
       
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        settableuser(user.getAllUsers());
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
   /*   try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Sổ Giao Ca");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH Giao Ca Giao Việc");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("người Nhập");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Nội Dung");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("ngày tháng");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Ghi Chú");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Người xử lý");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("tg xử lý");
           cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("trạng thái xử lý");
 
            for (int i = 0; i < usersList.size(); i++) {
                timetable tb = usersList.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(tb.getId());
                row.createCell(2).setCellValue(tb.getNguoinhap().toString());
                row.createCell(3).setCellValue(tb.getNoidung());
                row.createCell(4).setCellValue(tb.getNgaythang());
                row.createCell(5).setCellValue(tb.getGhichu());
                row.createCell(6).setCellValue(tb.getNguoixuli());
                row.createCell(7).setCellValue(tb.getTgxuli());
                row.createCell(8).setCellValue(tb.getState());
            }

            FileOutputStream out = new FileOutputStream(new File("E:/"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       */

                //

    }//GEN-LAST:event_jButton9ActionPerformed

    private void quanlythuvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlythuvienActionPerformed
        // TODO add your handling code here:
        int index =quanlythuvien.getSelectedIndex();
        if(index==1) {
            QuanLyMuonTraSach ql=new QuanLyMuonTraSach();
            ql.setVisible(true);
           
        }
        else if(index==2) {
            QuanLySach ql=new QuanLySach();
            ql.setVisible(true);
           
        }
        
        
        
        
    }//GEN-LAST:event_quanlythuvienActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
         jDialog3.setVisible(true);
        jDialog3.setTitle("Đổi Mật Khẩu");
        jDialog3.setSize(917, 620);
        randomnumers();
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jTextField10.setText("");
          randomnumers();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    
          int row=jTable1.getSelectedRow();
          tb=user.getUserbyID(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))));
       try{
         if(row==-1){
            
            //String nameString=jTable1.getValueAt(row, 1).toString();
            JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        }
         else{
            jDialog2.setVisible(true);
            jDialog2.setSize(984, 618);
           jTextField12.setText(String.valueOf(tb.getId()));
           jTextField13.setText(tb.getNguoinhap());
           jTextField14.setText(tb.getNoidung());
           //set date
           String sDate1=tb.getNgaythang();Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
           jDateChooser9.setDate(date1);
               jTextField16.setText(tb.getGhichu());
                  jTextField17.setText(tb.getNguoixuli());
                    String sDate2=tb.getTgxuli();Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
           jDateChooser10.setDate(date2);
           String ffString=tb.getState();
           if(ffString!=null){
               String [] favs=ffString.split(",");
               for(String f:favs){
               if(f.equals("Chưa xử lý")){
                   jRadioButton3.setSelected(true);
                   
               }
               if(f.equals("Đã xử lý"))
                   jRadioButton4.setSelected(true);
           
               }
           }
           
         }
       }
        catch(Exception e){
        
        // JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        }
    }//GEN-LAST:event_editActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        if(evt.getButton()==MouseEvent.BUTTON3){
            if(evt.isPopupTrigger()&&jTable1.getSelectedRowCount()!=0)
            {
                jPopupMenu1.show(evt.getComponent(),evt.getX(),evt.getY());
            }
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void subbmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbmitActionPerformed
        // TODO add your handling code here:
        try{
        String xx=jTextField12.getText();
     // tb.setId(Integer.parseInt(xx));
      tb.setNguoinhap(jTextField13.getText());
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
       tb.setNgaythang( formatter.format(jDateChooser9.getDate()));
       tb.setNoidung(jTextField14.getText());
       tb.setGhichu(jTextField16.getText());
       tb.setNguoixuli(jTextField17.getText());
    tb.setTgxuli(formatter.format(jDateChooser10.getDate()));
    String stateString=" ";
    if(jRadioButton3.isSelected()){
        stateString+="Chưa xử lý";
    }
     if(jRadioButton4.isSelected()){
        stateString+="Đã xử lý";
    }
      tb.setState(stateString);
    user.updateuser(tb);
      JOptionPane.showMessageDialog(rootPane,"Sửa Thành Công ");
        }
        catch(Exception e){
        
        e.printStackTrace();
        }
        
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        settableuser(user.getAllUsers());
    }//GEN-LAST:event_subbmitActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
        
         if(jTextField1.getText().equals("Nhập ID là số"))
        {
            jTextField1.setText(" "); 
            jTextField1.setForeground(new Color(153,153,153));
        }
               
        
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
          if(jTextField1.getText().equals("Nhập Nội Dung Muốn Giao"))
        {
            jTextField3.setText(" "); 
            jTextField3.setForeground(new Color(153,153,153));
        }
               
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        // TODO add your handling code here:
          if(jTextField1.getText().equals(""))
        {
            jTextField3.setText("Nhập Nội Dung Muốn Giao "); 
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void changpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changpasswordActionPerformed
        // TODO add your handling code here:
         if(jTextField10.getText().equals(jTextField11.getText())){
          String sqlString="update mk_1 set password1=?";
         
          try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement  preparedStatement=con.prepareStatement(sqlString);
             //ResultSet rs=preparedStatement.executeQuery();
               preparedStatement.setString(1,jTextField8.getText());  
                  preparedStatement.executeUpdate();
                  
                  
                  
                  
                  
                 }
           
          
             catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(jDialog3, "Cập Nhật Mật Khẩu Thành Công");
        
         }
        
        else{
         JOptionPane.showMessageDialog(jDialog3, "Nhập Sai Mã Xác Nhận !Nhập Lại","Thông báo", JOptionPane.ERROR_MESSAGE, null);
         
         }
    }//GEN-LAST:event_changpasswordActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int index=jComboBox2.getSelectedIndex();
        if(index==1){
        KhieuNai kn=new KhieuNai();
        kn.setVisible(true);
        
        }
         if(index==2){
        QuanLySuKien  kn2;
            kn2 = new QuanLySuKien();
        kn2.setVisible(true);
        
        }
          if(index==3){
        QuanLyLichTrinh  kn3=new QuanLyLichTrinh();
        kn3.setVisible(true);
        
        }
           if(index==4){
        QuanLyDanhBa  kn4=new QuanLyDanhBa();
        kn4.setVisible(true);
        
        }
             if(index==5){
        QuanLyHoSo  kn5=new QuanLyHoSo();
        kn5.setVisible(true);
        
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
          int index=jComboBox3.getSelectedIndex();
         if(index==0){
        QuanLyHoSoHocVien  kn5=new QuanLyHoSoHocVien();
        kn5.setVisible(true);
        
        }
         else if(index==2){
        QuanLyHocVienDangKi  kn55=new QuanLyHocVienDangKi();
        kn55.setVisible(true);
        
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
         String sqlString="select password1 from mk_1";
          int password = 0; 
          try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://DESKTOP-HKM3DED\\SQLEXPRESS:1433;databaseName=JAVA_DOAN;user=sa;password=123456";
             Connection con = DriverManager.getConnection(dbURL);
             PreparedStatement  preparedStatement=con.prepareStatement(sqlString);
             ResultSet rs=preparedStatement.executeQuery();
                 while (rs.next()) {      
                        password=rs.getInt("password1");
                        
                 }
                 }
           
          
             catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
      
         int mkcu=Integer.parseInt(jTextField7.getText());
         if(mkcu==password){
         
         
         }
         else{
         JOptionPane.showMessageDialog(jDialog3, "Nhập Sai Mật khẩu cũ !Nhập Lại","Thông báo", JOptionPane.ERROR_MESSAGE, null);
         
         }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:
        if(jTextField8.getText().equals(jTextField9.getText())){
        
        }
        else{
               JOptionPane.showMessageDialog(jDialog3, "Hai Mật Khẩu Không Khớp !Nhập Lại","Thông báo", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jTextField7.setText(""); jTextField8.setText(""); jTextField9.setText(""); jTextField10.setText(""); jTextField11.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row=jTable1.getSelectedRow();
          tb=user.getUserbyID(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))));
       try{
         if(row==-1){
            
            //String nameString=jTable1.getValueAt(row, 1).toString();
            JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        }
         else{
            jDialog2.setVisible(true);
            jDialog2.setSize(984, 618);
           jTextField12.setText(String.valueOf(tb.getId()));
           jTextField13.setText(tb.getNguoinhap());
           jTextField14.setText(tb.getNoidung());
           //set date
           String sDate1=tb.getNgaythang();Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
           jDateChooser9.setDate(date1);
               jTextField16.setText(tb.getGhichu());
                  jTextField17.setText(tb.getNguoixuli());
                    String sDate2=tb.getTgxuli();Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
           jDateChooser10.setDate(date2);
           String ffString=tb.getState();
           if(ffString!=null){
               String [] favs=ffString.split(",");
               for(String f:favs){
               if(f.equals("Chưa xử lý")){
                   jRadioButton3.setSelected(true);
                   
               }
               if(f.equals("Đã xử lý"))
                   jRadioButton4.setSelected(true);
           
               }
           }
           
         }
       }
        catch(Exception e){
        
        // JOptionPane.showMessageDialog(homepage.this, "Vui Lòng Chọn User Trước","Lỗi!",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        App pp=new App();
        pp.setVisible(true);
  
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String pathString="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      int x= j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            pathString=j.getSelectedFile().getPath();
        
        Document document=new Document();

            
            try {
                PdfWriter.getInstance(document, new FileOutputStream(pathString+"Sogiaoca.pdf"));
                document.open();
              
                com.itextpdf.text.pdf.PdfPTable table=new com.itextpdf.text.pdf.PdfPTable(1);
                table.addCell("ID_Người Nhập");
                table.addCell("Người Nhập");
                  table.addCell("Nội Dung"); table.addCell("Ngày Tháng"); table.addCell("Ghi Chú"); table.addCell("Người Xử lý");
                   table.addCell("Thời Gian Xử lý");
                    table.addCell("Trạng Thái");
                for(int i=0;i<jTable1.getRowCount();i++){
                    String id=jTable1.getValueAt(i, 0).toString();
                     String nguoinhap=jTable1.getValueAt(i, 1).toString();
                     String noidung=jTable1.getValueAt(i, 2).toString();
                      String ngaythang=jTable1.getValueAt(i, 3).toString();
                       String ghichu=jTable1.getValueAt(i, 4).toString();
                        String xuly=jTable1.getValueAt(i, 5).toString();
                         String tgxuly=jTable1.getValueAt(i, 6).toString();
                          String tranthai=jTable1.getValueAt(i, 7).toString();
                    table.addCell(id);table.addCell(nguoinhap);table.addCell(noidung);
                    table.addCell(ngaythang);table.addCell(ghichu);table.addCell(xuly);
                    table.addCell(tgxuly);  table.addCell(tranthai);
                }
               
                document.add(table);
              document.addTitle("Sổ Giao Ca Giao Việc");
             
            } catch (FileNotFoundException ex) {
                Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
               document.close();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
     /*   TableRowSorter<DefaultTableModel>tr=new TableRowSorter<DefaultTableModel>(defaultTableModel);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField6.getText().trim()));
     */
           String x=jTextField6.getText();
       ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
      
         ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
          settableuser(user.getAllUsers_search(Integer.parseInt(x)));
            
        
        
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        Quanlythoikhoabieu ppQuanlythoikhoabieu=new Quanlythoikhoabieu();
        ppQuanlythoikhoabieu.setVisible(true);
                
    }//GEN-LAST:event_jLabel17MouseClicked

    /**
     * @param args the command line arguments
     */
     public void setLblColor(JLabel jTable1)
    {
        jTable1.setBackground(new Color(0,150,62));
    }
    
      public void resetLblColor(JLabel jTable1)
    {
        jTable1.setBackground(new Color(1,198,83));
    }
      
       
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP2;
    private javax.swing.JPanel TAB1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton changpassword;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox quanlythuvien;
    private javax.swing.JButton subbmit;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

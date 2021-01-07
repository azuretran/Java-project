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
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.WindowConstants;



public class App extends javax.swing.JFrame {
private JPanel contentPane;
	private JTextField textField;
	private boolean newOperation = true;
	private float score = 0;
	private String operation = null;
                    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                    
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
          
           
		setResizable(false);
		setAutoRequestFocus(false);
		setTitle("Công Cụ Tính Toán");
		setIconImage();
                                  setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 389, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setText("0");
		textField.setBounds(10, 26, 353, 51);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button1.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button1.getText());
				}
			}
		});
		button1.setBounds(10, 100, 55, 51);
		contentPane.add(button1);

		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button2.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button2.getText());
				}
			}
		});
		button2.setBounds(83, 100, 55, 51);
		contentPane.add(button2);

		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button3.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button3.getText());
				}
			}
		});
		button3.setBounds(153, 100, 55, 51);
		contentPane.add(button3);

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button4.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button4.getText());
				}
			}
		});
		button4.setBounds(10, 173, 55, 51);
		contentPane.add(button4);

		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button5.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button5.getText());
				}
			}
		});
		button5.setBounds(83, 173, 55, 51);
		contentPane.add(button5);

		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button6.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button6.getText());
				}
			}
		});
		button6.setBounds(153, 173, 55, 51);
		contentPane.add(button6);

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button7.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button7.getText());
				}
			}
		});
		button7.setBounds(10, 245, 55, 51);
		contentPane.add(button7);

		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button8.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button8.getText());
				}
			}
		});
		button8.setBounds(83, 245, 55, 51);
		contentPane.add(button8);

		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText(button9.getText());
					newOperation = false;
				} else {
					String currentText = textField.getText();
					textField.setText(currentText + button9.getText());
				}
			}
		});
		button9.setBounds(153, 245, 55, 51);
		contentPane.add(button9);

		JButton btnClr = new JButton("Clr");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				newOperation = true;
				operation = null;
			}
		});
		btnClr.setBounds(308, 100, 55, 51);
		contentPane.add(btnClr);

		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(textField.getText());
						break;
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					}
				} else {
					score = Float.parseFloat(textField.getText());
				}
				textField.setText("");
				newOperation = true;
				operation = "+";
			}
		});
		buttonAdd.setBounds(243, 100, 55, 51);
		contentPane.add(buttonAdd);

		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(textField.getText());
						break;
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					}
				} else {
					score = Float.parseFloat(textField.getText());
				}
				textField.setText("");
				newOperation = true;
				operation = "-";
			}
		});
		buttonMinus.setBounds(243, 173, 55, 51);
		contentPane.add(buttonMinus);

		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
					return;
				if(operation != null){
					switch (operation) {
					case "+":
						score += Float.parseFloat(textField.getText());
						break;
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					}
				} else {
					score = Float.parseFloat(textField.getText());
				}
				textField.setText(String.valueOf(score));
				newOperation = true;
				operation = null;
			}
		});
		buttonEqual.setBounds(308, 173, 55, 51);
		contentPane.add(buttonEqual);

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation != true){
					String currentText = textField.getText();
					textField.setText(currentText + button0.getText());
				}
			}
		});
		button0.setBounds(243, 245, 55, 51);
		contentPane.add(button0);

		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newOperation == true){
					textField.setText("0.");
					newOperation = false;
				} else {
					String currentText = textField.getText();
					if(currentText.indexOf(".") == -1){ // currentText.indexOf(".") != -1 thi bo qua
						textField.setText(currentText + ".");
					}
				}
			}
		});
		buttonDot.setBounds(308, 245, 55, 51);
		contentPane.add(buttonDot);
	}
        private void setIconImage(){
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-heart-outline-96.png")));
    }

    /**
     * Creates new form App
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

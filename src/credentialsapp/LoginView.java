/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

/**
 *
 * @author nsterling76
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener{
    
    private JButton btnLogin;
    private LoginModel model = new LoginModel();
   // private JButton blogin;
    private final JTextField userField;
    private final JTextField passField;
    private JButton newUSer;
    private final JLabel userName;
    private final JLabel passWord;

   
    public LoginView(LoginModel model){
        //this.model = model;
        super("Credentials Application");
       
        this.userField = new JTextField(15);
        this.passField = new JPasswordField(15);
       //this.passField.setEchoChar('*');
        this.btnLogin = new JButton(" Login ");
        this.newUSer = new JButton("New User?");
        this.userName = new JLabel("Username");
        this.passWord = new JLabel("Password");
        
        JPanel content = new JPanel();
        
        setSize(470,270);
        setLocation(500,280);
        content.setLayout(null); 
       
        content.add(btnLogin);
        content.add(userField);
        content.add(passField);
        content.add(passWord);
        content.add(newUSer);
        content.add(userName);
        content.add(passWord);
       
         
     this.userName.setBounds(20, 30, 150, 30);
     this.passWord.setBounds(20, 65, 150, 30);
     this.btnLogin.setBounds(180,130,80,20);
     this.newUSer.setBounds(180, 170, 80, 20);
     this.userField.setBounds(150,30,150,30);
     this.passField.setBounds(150,65,150,30);
        
        //btnLogin.addActionListener(this);
       getContentPane().add(content);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);

    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
   
    public String getUser(){
        model = new LoginModel();
        return model.getUsername() + model.getPassword();       
    }
   
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
   
    public void addLoginListener(ActionListener log) {
          getBtnLogin().addActionListener(log);
          getNewUSer().addActionListener(log);
        }

    /**
     * @return the btnLogin
     */
    public JButton getBtnLogin() {
        return btnLogin;
    }

    /**
     * @param btnLogin the btnLogin to set
     */
    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    /**
     * @return the userField
     */
    public String getUserField() {
        return userField.getText();
    }

    /**
     * @param userField the userField to set
     */
    public void setUserField(String userField) {
        userField = userField;
    }

    /**
     * @return the passField
     */
    public String getPassField() {
        return passField.getText();
    }

    /**
     * @param passField the passField to set
     */
    public void setPassField(String passField) {
        passField = passField;
    }

    /**
     * @return the newUSer
     */
    public JButton getNewUSer() {
        return newUSer;
    }

    /**
     * @param newUSer the newUSer to set
     */
    public void setNewUSer(JButton newUSer) {
        this.newUSer = newUSer;
    }
    
}

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
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NewUser extends JFrame implements Serializable{
  private JButton create; 
  private JButton backButton;
  private JLabel user, pass, emailLabel;
  
  private JTextField userField;
  private JTextField passField;
  private JTextField email;
  private LoginModel model = new LoginModel();
  private LoginView view; 
  

  public NewUser(LoginModel model){
      
    super("New User");

    create = new JButton("Sign In!");
    backButton = new JButton("Go Back");
     
    userField = new JTextField(15);
    passField = new JPasswordField(15);
    email = new JTextField(15);
    user = new JLabel("Enter New Username: ");
    pass = new JLabel("Enter New Password: ");
    emailLabel = new JLabel("Enter your Email: ");
    view = new LoginView(model);
    JPanel newUserPanel = new JPanel();
    setSize(400,280);
    setLocation(500,280);
    newUserPanel.setLayout(null); 
    
    newUserPanel.add(create);
    newUserPanel.add(backButton);
    newUserPanel.add(userField);
    newUserPanel.add(passField);
    newUserPanel.add(user);
    newUserPanel.add(pass);
    newUserPanel.add(email);
    newUserPanel.add(emailLabel);
    
    user.setBounds(20, 30, 150, 30);
    pass.setBounds(20, 65, 150, 30);
    emailLabel.setBounds(20,100 , 150, 30);
    userField.setBounds(150,30,150,30);
    passField.setBounds(150,30,150,30);
    email.setBounds(150,100,150,30);
    create.setBounds(180,150,80,20);
    backButton.setBounds(180, 195, 80, 20);

    getContentPane().add(newUserPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    /*Writer writer = null;
    File check = new File("userInfo.txt");
    if(check.exists()){

      //Checks if the file exists. will not add anything if the file does exist.
    }else{
     try{
       File texting = new File("userInfo.txt");
       writer = new BufferedWriter(new FileWriter(texting));
        writer.write("message");
        
      }
     catch(IOException e){
       e.printStackTrace();
     }
    }*/


    create.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
    
      
       //while (scan.hasNext()) {
       //String userText = scan.nextLine();
       //String passText = scan.nextLine();
       //String emailText = scan.nextLine();
       
       String getName = "UserName: "+ userField.getText();
       String getPassword = "PassWord: "+ passField.getText();
       String getEmail = "Email: "+ email.getText();
       File file = new File(userField.getText()+".txt");
        if(!file.exists()){
            
    
                                System.out.println("File is created!");
   // Scanner scan = new Scanner(file);

                                PrintWriter filewrite = new PrintWriter(file);
                                filewrite.println(getName + "\r\n" + getPassword + "\r\n" + getEmail+ "\r\n");
                                filewrite.flush();
                                filewrite.close();
                                JOptionPane.showMessageDialog(null, "Your Account has been Created! Welcome, " + userField.getText());
                                dispose();
                                MainMenu menu = new MainMenu();
                            }
        else if(file.exists()){
            JOptionPane.showMessageDialog(null, "This Username/Password/Email is already in use");
                               userField.setText("");
                               passField.setText("");
                               email.setText("");
                               userField.requestFocus();
        }
        
        else if(getPassword.length()<=10){
            JOptionPane.showMessageDialog(null, "This password is too short (Less than 10 characters). Remeber to Include Numbers and Characters");
            userField.setText("");
                        passField.setText("");
                            email.setText("");
                               userField.requestFocus();
        
        
        }
        
        /*if(getName.equals(userText) && getPassword.equals(passText) && getEmail.equals(emailText)) {
          JOptionPane.showMessageDialog(null,"This Username/Password/Email is already in use");
                            userField.setText("");
                            passField.setText("");
                            email.setText("");
                            userField.requestFocus();
          break;

        } 
        else if(getName.equals("UserName: ") && getPassword.equals("PassWord: ")&& getEmail.equals("Email: ")){
        JOptionPane.showMessageDialog(null,"Please insert Username and Password");
        break;
        }
        
        else {
        filewrite.write(getName+"\r\n" +getPassword+ "\r\n"+ getEmail);
        filewrite.close();
        JOptionPane.showMessageDialog(null,"Your Account has been Created! Welcome, "+ userField.getText());
        dispose();
        MainMenu menu = new MainMenu();
        break;

        }*/
      }   catch (FileNotFoundException ex) {
              Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
          }
    
    
    
        } 
   
      
    });
    
    backButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton eventSource = (JButton) ae.getSource();
           
            if(eventSource == backButton){
               
                //remove(newUserPanel);
              dispose();
              LoginView view = new LoginView(model);
             //  validate();
    	} 
    }
               //remove(newUserPanel);
               //dispose();
              // LoginView view = new LoginView(model);
               //validate();
              
            //}
             
        
        
    
    });
  }

  } 
  
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        
//    }
//     
//    public JButton getCreate() {
//        return create;
//    }
//
//    /**
//     * @return the backButton
//     */
//    public JButton getBackButton() {
//        return backButton;
//    }
//
//    /**
//     * @return the userField
//     */
//    public JTextField getUserField() {
//        return userField;
//    }
//
//    /**
//     * @return the passField
//     */
//    public JTextField getPassField() {
//        return passField;
//    }
//
//    /**
//     * @return the email
//     */
//    public JTextField getEmail() {
//        return email;
//    }
//
//    /**
//     * @param userField the userField to set
//     */
//    public void setUserField(JTextField userField) {
//        this.userField = userField;
//    }
//
//    /**
//     * @param passField the passField to set
//     */
//    public void setPassField(JTextField passField) {
//        this.passField = passField;
//    }
//
//    /**
//     * @param email the email to set
//     */
//    public void setEmail(JTextField email) {
//        this.email = email;
//    }
//
//    /**
//     * @param create the create to set
//     */
//    public void setCreate(JButton create) {
//        this.create = create;
//    }
//
//    /**
//     * @param backButton the backButton to set
//     */
//    public void setBackButton(JButton backButton) {
//        this.backButton = backButton;
//    }
//
//    void addListener(NewUserController.Authenticate authenticate) {
//        getCreate().addActionListener(this);
//    }


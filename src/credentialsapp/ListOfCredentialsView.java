/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nsterling76
 */
public class ListOfCredentialsView extends JFrame{
    private JTextField listUsername,listPassword,listEmail,listUrl;
    private final JLabel usernameLabel,passwordLabel,emailLabel,urlLabel;
    private JButton backButton, addButton, saveButton;
    private JTextArea listOfCred;
    private JScrollPane sp;
    private ListOfCredentialsModel model;
    JTable table;
    
    ListOfCredentialsView(ListOfCredentialsModel model){
        super("List of Credentials");
       
        this.model = new ListOfCredentialsModel();
        this.listUsername = new JTextField(25);
        this.listPassword = new JTextField(25);
        this.listEmail = new JTextField(25);
        this.listUrl = new JTextField(25);
        this.backButton = new JButton(" Back ");
        this.addButton = new JButton("Add");
        this.saveButton = new JButton("Save");
        this.usernameLabel = new JLabel("Insert your Existing Userame: ");
        this.passwordLabel = new JLabel("Insert your Existing Password: ");
        this.emailLabel = new JLabel("Insert your Existing Email: ");
        this.urlLabel = new JLabel("Insert the url OR Name of the website: ");
        this.listOfCred = new JTextArea();
        this.table = new JTable();
        this.sp = new JScrollPane(table);
        Object[] columns = {"Username","Password","Email","Website/Software/url"};
        DefaultTableModel mode = new DefaultTableModel();
        mode.setColumnIdentifiers(columns);
        
        int[] a = {1,2,3,4,5};
        System.out.println(a.length-1);
        //file encryption/decryption should be the very last

        JFrame content = new JFrame();
        
        setSize(900,405);
        setLocationRelativeTo(null);
        content.setLayout(null); 
       
        content.add(listUsername);
        content.add(listPassword);
        content.add(listEmail);
        content.add(listUrl);
        content.add(backButton);
        content.add(addButton);
        content.add(saveButton);
      //  content.add(usernameLabel);
      //  content.add(passwordLabel);
      //  content.add(emailLabel);
      //  content.add(urlLabel);
       // content.add(listOfCred);
        content.add(sp);
        content.add(table);
        
         
        this.listUsername.setBounds(20, 220, 100, 25);
        this.listPassword.setBounds(20, 250, 100, 25);
        this.listEmail.setBounds(20, 280, 100, 25);
        this.listUrl.setBounds(20, 310, 100, 25);
        this.backButton.setBounds(150, 220, 100, 25);
        this.addButton.setBounds(150, 265, 100, 25);
        this.saveButton.setBounds(150, 310, 100, 25);
        this.usernameLabel.setBounds(20, 30, 180, 30);
        this.passwordLabel.setBounds(20, 65, 180, 30);
        this.emailLabel.setBounds(20, 100 , 180, 30);
        this.urlLabel.setBounds(20, 135, 200, 30);
        this.listOfCred.setBounds(150, 170, 350, 100);
        this.table.setBackground(Color.LIGHT_GRAY);
        this.table.setForeground(Color.black);
        this.sp.setBounds(0, 0, 880, 200);
        Font font = new Font("",1,16);
        this.table.setFont(font);
        this.table.setRowHeight(25);
    
        content.setSize(900,400);
        content.setLocationRelativeTo(null);
        content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content.setVisible(true); 
    
    }

    /**
     * @return the listUsername
     */
    public JTextField getListUsername() {
        return listUsername;
    }

    /**
     * @param listUsername the listUsername to set
     */
    public void setListUsername(JTextField listUsername) {
        this.listUsername = listUsername;
    }

    /**
     * @return the listPassword
     */
    public JTextField getListPassword() {
        return listPassword;
    }

    /**
     * @param listPassword the listPassword to set
     */
    public void setListPassword(JTextField listPassword) {
        this.listPassword = listPassword;
    }

    /**
     * @return the listEmail
     */
    public JTextField getListEmail() {
        return listEmail;
    }

    /**
     * @param listEmail the listEmail to set
     */
    public void setListEmail(JTextField listEmail) {
        this.listEmail = listEmail;
    }

    /**
     * @return the listUrl
     */
    public JTextField getListUrl() {
        return listUrl;
    }

    /**
     * @param listUrl the listUrl to set
     */
    public void setListUrl(JTextField listUrl) {
        this.listUrl = listUrl;
    }

    /**
     * @return the usernameLabel
     */
    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    /**
     * @return the passwordLabel
     */
    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    /**
     * @return the emailLabel
     */
    public JLabel getEmailLabel() {
        return emailLabel;
    }

    /**
     * @return the urlLabel
     */
    public JLabel getUrlLabel() {
        return urlLabel;
    }

    /**
     * @return the backButton
     */
    public JButton getBackButton() {
        return backButton;
    }

    /**
     * @param backButton the backButton to set
     */
    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    /**
     * @return the addButton
     */
    public JButton getAddButton() {
        return addButton;
    }

    /**
     * @param addButton the addButton to set
     */
    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    /**
     * @return the listOfCred
     */
    public JTextArea getListOfCred() {
        return listOfCred;
    }

    /**
     * @param listOfCred the listOfCred to set
     */
    public void setListOfCred(JTextArea listOfCred) {
        this.listOfCred = listOfCred;
    }

  public void addLoginListener(ActionListener log) {
          getBackButton().addActionListener(log);
          getAddButton().addActionListener(log);
          getSaveButton().addActionListener(log);
        }

    /**
     * @return the saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }

    /**
     * @param saveButton the saveButton to set
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }
    
}

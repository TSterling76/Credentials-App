/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nsterling76
 */
public class LoginModel {
 
private String userName;
private String passWord;
private JTextField userField;
private JTextField passwordField;
private JButton login,newUser,create;

public LoginModel()
{        
}
/**
 * @return the username
 */
public String getUsername() {
    return userName;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
    this.userName = username;
}
/**
 * @return the password
 */
public String getPassword() {
    return passWord;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
    this.passWord = password;
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
    public void setUserField(JTextField userField) {
        this.userField = userField;
    }

    /**
     * @return the passwordField
     */
    public String getPasswordField() {
        return passwordField.getText();
    }

    /**
     * @param passwordField the passwordField to set
     */
    public void setPasswordField(JTextField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * @return the login
     */
    public JButton getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(JButton login) {
        this.login = login;
    }

    /**
     * @return the newUser
     */
    public JButton getNewUser() {
        return newUser;
    }

    /**
     * @param newUser the newUser to set
     */
    public void setNewUser(JButton newUser) {
        this.newUser = newUser;
    }

    /**
     * @return the create
     */
    public JButton getCreate() {
        return create;
    }

    /**
     * @param create the create to set
     */
    public void setCreate(JButton create) {
        this.create = create;
    }
    
    public String getInfo(){
        return "Your Credentials For this App are Username: " + userName + " , Password: " + passWord;
    }
    
   
    
}

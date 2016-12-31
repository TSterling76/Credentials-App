/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author nsterling76
 */
public class ListOfCredentialsModel {
    ArrayList<String> credArrayList = new ArrayList<String>();
    private JTextField listUsername,listPassword,listEmail,listUrl;
    private JLabel usernameLabel,passwordLabel,emailLabel,urlLabel;
    private JButton backButton, addButton;
    private JTable listOfCred;
    
    ListOfCredentialsModel(){
    
    
    }

    /**
     * @return the credArrayList
     */
    public ArrayList<String> getCredArrayList() {
        return credArrayList;
    }

    /**
     * @param credArrayList the credArrayList to set
     */
    public void setCredArrayList(ArrayList<String> credArrayList) {
        this.credArrayList = credArrayList;
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
    public JTable getListOfCred() {
        return listOfCred;
    }

    /**
     * @param listOfCred the listOfCred to set
     */
    public void setListOfCred(JTable listOfCred) {
        this.listOfCred = listOfCred;
    }
}

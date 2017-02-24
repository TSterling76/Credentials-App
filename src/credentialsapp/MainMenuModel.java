/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author nsterling76
 */
public class MainMenuModel {
    private JButton saveInfo;
    private JButton loadInfo;
    private JButton generatePass;
    private JButton generateUser;
    private JButton generateHash;
    private LoginModel model;
    
    public MainMenuModel(){
    
    }
    
    public JButton getSaveInfo() {
        return saveInfo;
    }

    /**
     * @param saveInfo the saveInfo to set
     */
    public void setSaveInfo(JButton saveInfo) {
        this.saveInfo = saveInfo;
    }

    /**
     * @return the loadInfo
     */
    public JButton getLoadInfo() {
        return loadInfo;
    }

    /**
     * @param loadInfo the loadInfo to set
     */
    public void setLoadInfo(JButton loadInfo) {
        this.loadInfo = loadInfo;
    }

    /**
     * @return the generatePass
     */
    public JButton getGeneratePass() {
        return generatePass;
    }

    /**
     * @param generatePass the generatePass to set
     */
    public void setGeneratePass(JButton generatePass) {
        this.generatePass = generatePass;
    }

    /**
     * @return the generateUser
     */
    public JButton getGenerateUser() {
        return generateUser;
    }

    /**
     * @param generateUser the generateUser to set
     */
    public void setGenerateUser(JButton generateUser) {
        this.generateUser = generateUser;
    }

    /**
     * @return the generateHash
     */
    public JButton getGenerateHash() {
        return generateHash;
    }

    /**
     * @param generateHash the generateHash to set
     */
    public void setGenerateHash(JButton generateHash) {
        this.generateHash = generateHash;
    }
    
    public void addActionListener(ActionListener log) {
          getSaveInfo().addActionListener(log);
          getLoadInfo().addActionListener(log);
          getGeneratePass().addActionListener(log);
          getGenerateUser().addActionListener(log);
          getGenerateHash().addActionListener(log);
        }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

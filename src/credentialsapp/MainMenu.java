/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author nsterling76
 */
public class MainMenu extends JFrame{
    private JButton saveInfo;
    private JButton loadInfo;
    private JButton generatePass;
    private JButton generateUser;
    private JButton generateHash;
    private LoginModel model;
    
    MainMenu(){
        //this.model = model;
        super("Main Menu");
        saveInfo = new JButton("List Credentials");
        loadInfo = new JButton("Encrypt your Files");
        generatePass  = new JButton("Generate Password");
        generateUser = new JButton("Generate Username");
        generateHash = new JButton("Generate Hashes");
         
        JPanel content = new JPanel();
        content.add(saveInfo);
        content.add(loadInfo);
        content.add(generatePass);
        content.add(generateUser);
        content.add(generateHash);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(500,500);
        this.setVisible(true);
       
        
    }
    
//    public void addButtonListener(ActionListener al) { 
//    
//        saveInfo.addActionListener(al);
//        loadInfo.addActionListener(al);
//    }
//
//    public JButton getSaveInfo() {
//        return saveInfo;
//    }
//
//
//    public JButton getLoadInfo() {
//        return loadInfo;
//    }
//
//    
//    public String getFname() {
//        return fname.getText();
//    }
//
//    public void setFname(JTextField fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname.getText();
//    }
//
//    public void setLname(JTextField lname) {
//        this.lname = lname;
//    }
//
//    public int getAgeSlider() {
//        return ageSlider.getValue();
//    }
//
//    public void setAgeSlider(JSlider ageSlider) {
//        this.ageSlider = ageSlider;
//    }
//
//     public void setOutputLabel(String ae){
//        outputLabel.setText(ae);
//    }
//     
//     public JLabel getOutputLabel(){
//         return outputLabel;
//     }

    /**
     * @return the saveInfo
     */
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
}

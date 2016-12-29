/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author nsterling76
 */
public class MainMenu extends JFrame{
    private final JButton saveInfo, loadInfo,generatePass,generateUser,generateHash;
    private JTextField fname, lname, gpa;
    private JSlider ageSlider;
    private JLabel outputLabel;
    private JLabel title,lname1, age; 
    //private LoginModel model;
    
    MainMenu(){
        //this.model = model;
        super("Main Menu");
        title = new JLabel(" Enter Your First Name: ");
        fname = new JTextField(20);
        lname1 = new JLabel(" Enter Your Last Name: ");
        lname = new JTextField(20);
        age = new JLabel("  Enter your Age: ");
        ageSlider = new JSlider(JSlider.HORIZONTAL, 1,30,2);
        ageSlider.setMajorTickSpacing(2);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
        saveInfo = new JButton("List Credentials");
        loadInfo = new JButton("Encrypt your Files");
        generatePass  = new JButton("Generate Password");
        generateUser = new JButton("Generate Username");
        generateHash = new JButton("Generate Hashes");
        
        outputLabel = new JLabel("   Output: No info yet");
        
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
}

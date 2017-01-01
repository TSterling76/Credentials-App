/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author nsterling76
 */
public class MainMenuCntl {
     private MainMenuView view;
     private LoginController cntl;
     private LoginView login;
     private ListOfCredentialsView list;
     private ListOfCredentialsModel model;
    
    MainMenuCntl(MainMenuView view){
        this.view = view;
        view.addActionListener(new Activate());
    }
   
    class Activate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            JButton btu = (JButton) ae.getSource();
            if (btu == view.getLoadInfo()) {
                
            }

            if (btu == view.getSaveInfo()) {
                view.dispose();
                list = new ListOfCredentialsView(model);
                System.out.println(1);
            }
            
            if(btu == view.getGenerateHash()){
            
            }
            
            if(btu == view.getGeneratePass()){
            
            }
            
            if(btu == view.getGenerateUser()){
            
            
            }

        }
    }
}

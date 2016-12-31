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
     private MainMenu menu;
     private LoginController cntl;
     private LoginView view;
    
    MainMenuCntl(){
    
    }
   
    class Authenticate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            JButton btu = (JButton) ae.getSource();
            if (btu == menu.getLoadInfo()) {
                
            }

            if (btu == menu.getSaveInfo()) {
                
            }
            
            if(btu == menu.getGenerateHash()){
            
            }
            
            if(btu == menu.getGeneratePass()){
            
            }
            
            if(btu == menu.getGenerateUser()){
            
            
            }

        }
    }
}

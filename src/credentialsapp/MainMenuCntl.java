/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author nsterling76
 */
public class MainMenuCntl {
     private MainMenuView view;
    
     private LoginController cntl;
     private LoginView login;
     //private ListOfCredentialsView list;
    
    MainMenuCntl(MainMenuView view){
        this.view = view;
        view.addActionListener(new Activate());
    }
   
    class Activate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton btu = (JButton) ae.getSource();
            if (btu == view.getLoadInfo()) {
                System.out.println(1);
            }
            if (btu == view.getSaveInfo()) {
                view.dispose();
                ListOfCredentialsModel mod = new ListOfCredentialsModel();
                ListOfCredentialsView list = new ListOfCredentialsView(mod);
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

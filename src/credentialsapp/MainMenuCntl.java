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
    private MainMenuModel model;
    private LoginController cntl;
    private LoginView login;

    MainMenuCntl(MainMenuModel model, MainMenuView view) {
        this.view = view;
        this.model = model;
        view.addActionListener(new Activate());
    }

    class Activate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton btu = (JButton) ae.getSource();
            if (btu == view.getLoadInfo()) {
                System.out.println(1);
                EncryptFiles files = new EncryptFiles();
                files.setVisible(true);
            }
            if (btu == view.getSaveInfo()) {
                System.out.println(1);
                ListOfCredentials1 list = new ListOfCredentials1();
            }
            
            if (btu == view.getGenerateHash()) {
                System.out.println(1);
                GenerateHash hash = new GenerateHash();
                hash.setVisible(true);
            }
            if (btu == view.getGeneratePass()) {
                System.out.println(1);
            }
            if (btu == view.getGenerateUser()) {
                System.out.println(2);
                GeneratorUI generate = new GeneratorUI();
                generate.setVisible(true);
                
                
            }

        }
    }
}

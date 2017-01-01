/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author nsterling76
 */
public class ListOfCredentialsCntl implements Serializable {

    private ListOfCredentialsModel model;
    private ListOfCredentialsView view;
    //  private Loginview2;

    ListOfCredentialsCntl(ListOfCredentialsView view, ListOfCredentialsModel model) {
        this.model = model;
        this.view = view;

        view.addLoginListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        
        int i = 0;
        @Override
        public void actionPerformed(ActionEvent ae) {

            JButton eventSource = (JButton) ae.getSource();
            
            i++;
            File file = new File("newuser.txt");
            if (eventSource == view.getAddButton()) {
                //i+=1;
                
                view.setEnabled(true);
                view.getListOfCred().append(i + "\n. Your Username: " + view.getListUsername().getText() + ", Your Password: " + view.getListPassword().getText() + ", Your Email: "
                        + view.getListEmail().getText() + ", Your Site/Software Name: "+view.getListUrl().getText() + "\n");

                System.out.println("succ");
                
                try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(file,true))) {
                    view.getListOfCred().write(fileOut);
                } catch (IOException ex) {
                    Logger.getLogger(ListOfCredentialsCntl.class.getName()).log(Level.SEVERE, null, ex);
                }

                //view.getListOfCred()
                // view.getListOfCred()
                // view.getListOfCred()
                //  view.getListOfCred().setValueAt(view.getListUsername().getText(), j, 0);
                // view.getListOfCred().setValueAt(view.getListUsername().getText(), j, 0);
                // break;
            }

            if (eventSource == view.getSaveButton()) {
                
                JOptionPane.showMessageDialog(null, "Your Credentials are saved to " + file.getAbsolutePath());
                //System.out.print(i);
            }

        }

        public void readUserListFile() {

        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentialsapp;

/**
 *
 * @author nsterling76
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LoginController {

    private final LoginModel model;
    private final LoginView view;
    MainMenuView menu;
   
    //Test comment
    //another
    LoginController(LoginModel model, LoginView view) {
        this.view = view;
        this.model = model;

        view.addLoginListener(new Authenticate());

    }

    class Authenticate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int w = 1;
            BufferedReader br;
            JButton btu = (JButton) ae.getSource();
            if (btu == view.getBtnLogin()) {
                try {
                    br = new BufferedReader(new FileReader(view.getUserField()+".txt"));
                    // StringBuilder sb = new StringBuilder();
                    Scanner scan = new Scanner(br);
                    //String line = null;
                    String usertxt;
                    String passtxt;
                    String puname = "UserName: " + view.getUserField();
                    String ppaswd = "PassWord: " + view.getPassField();

                    while (scan.hasNextLine()) {
                        usertxt = scan.nextLine();
                        passtxt = scan.nextLine();

                        if ((puname.equals(usertxt)) && (ppaswd.equals(passtxt))) {
                            JOptionPane.showMessageDialog(null, " WELCOME! ");
                            menu = new MainMenuView();
                            view.dispose();
                           // break;
                        } 
                        else if (puname.equals("UserName: ") && ppaswd.equals("Password: ")) {
                            JOptionPane.showMessageDialog(null, " Please insert Username and Password "); 
                            System.out.print("Didnt Work");
                          //  break;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Wrong Username / Password");
                            //view.setUserField("");
                            // view.setPassField("");
                            // view.requestFocus();
                            System.out.print("Didnt Work");
                          //  break;
                        }
                    }
                } catch (IOException ex) {
                  //  ex.printStackTrace();
                }

            }

            if (btu == view.getNewUSer()) {
                view.dispose();
                NewUser user = new NewUser(model);

            }

        }
    }
}

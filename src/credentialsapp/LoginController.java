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
  //  MainMenuModel model1;
  //  MainMenuCntl cntl;

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
                    br = new BufferedReader(new FileReader(view.getUserField() + ".txt"));
                    // StringBuilder sb = new StringBuilder();
                    Scanner scan = new Scanner(br);
                    String usertxt;
                    String passtxt;
                    String puname = "UserName: " + view.getUserField();
                    String ppaswd = "PassWord: " + view.getPassField();

                    while (scan.hasNextLine()) {
                        usertxt = scan.nextLine();
                        passtxt = scan.nextLine();

                        if ((puname.equals(usertxt)) && (ppaswd.equals(passtxt))) {
                            
                            MainMenuModel model1 = new MainMenuModel();
                            MainMenuView menu = new MainMenuView(model1);
                            MainMenuCntl cntl = new MainMenuCntl(model1,menu);
                            JOptionPane.showMessageDialog(null, "  WELCOME!  " + view.getUserField());
                            
                            view.dispose();
                        }
                    }
                } catch (IOException ex) {

                }

            }

            if (btu == view.getNewUSer()) {
                view.dispose();
                NewUser user = new NewUser(model);

            }

        }
    }
}

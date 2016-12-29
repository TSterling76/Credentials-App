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
    MainMenu menu;
   
    //Test
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
                            menu = new MainMenu();
                            view.dispose();
                            break;
                        } else if (puname.equals("UserName: ") && ppaswd.equals("Password: ")) {
                            JOptionPane.showMessageDialog(null, "Please insert Username and Password"); 
                            //System.out.print("Didnt Work");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Username / Password");
                            //view.setUserField("");
                            // view.setPassField("");
                            // view.requestFocus();
                            break;
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

/* } catch (IOException d) {
                d.printStackTrace(); //
                }*/
 /*if(eventSource == view.getBtnLogin())
                {
                MainMenu menu = new MainMenu();
                view.dispose();
                }
                
                if(eventSource == view.getNewUSer()){
                NewUser user = new NewUser();
                view.dispose();
                
                }*/
// JButton getEvent = (JButton)
/*try {
                File file = new File("userInfo.txt");
                Scanner scan = new Scanner(file);;
                String line = null; //
                
                FileWriter writeToFile = new FileWriter(file, true);
                
                String userText = null;
                String passText = null;
                String uName = "UserName: " + view.getUserField().getText();
                String passWd = "PassWord: " + view.getPassField().getText();
                
                
                while (scan.hasNext()) {
                userText = scan.nextLine();
                passText = scan.nextLine();
                
                if(uName.equals(userText) && passWd.equals(passText)) {
                MainMenu menu = new MainMenu();
                view.validate();
                view.repaint();
                view.dispose();
                
                }
                else if(uName.equals("") && passWd.equals("")){
                JOptionPane.showMessageDialog(null,"Please insert Username and Password");  //
                }
                
                else {
                
                JOptionPane.showMessageDialog(null,"Wrong Username OR Password");
                view.getUserField().setText("");
                view.getPassField().setText("");
                view.getUserField().requestFocus();   //Javadoc
                }
                
                }
                
                
                
                } catch (IOException d) {
                d.printStackTrace(); //
                }*/
 /* view.getNewUSer().addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                NewUser user = new NewUser();
                view.dispose();
                
                }
                });*/

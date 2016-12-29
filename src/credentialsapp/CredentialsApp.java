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
public class CredentialsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginModel model = new LoginModel();
        LoginView view = new LoginView(model);
        LoginController controller = new LoginController(model, view);
      //  MainMenu menu = new MainMenu();
        
        view.setVisible(true);
    }
    
}

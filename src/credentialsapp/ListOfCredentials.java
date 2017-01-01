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
public class ListOfCredentials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListOfCredentialsModel model = new ListOfCredentialsModel();
        ListOfCredentialsView view = new ListOfCredentialsView(model);
        ListOfCredentialsCntl controller = new ListOfCredentialsCntl(view, model);
        
        
    }
    
}

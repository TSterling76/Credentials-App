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


import javax.swing.*;

public class GenerateUsernameView extends JFrame
{
    public static void GenerateUsernameView()
    {
       GenerateUsername frame = new GenerateUsername();
       frame.setTitle("Generate Password");
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
        
    }
    
}


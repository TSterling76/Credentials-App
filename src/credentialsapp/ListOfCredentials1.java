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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ListOfCredentials1 {
    
    public ListOfCredentials1(){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        Object[] columns = {"Username","Password","Email","Website/Software/url"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,16);
        table.setFont(font);
        table.setRowHeight(30);
        
        JTextField textId = new JTextField();
        JTextField textFname = new JTextField();
        JTextField textLname = new JTextField();
        JTextField textAge = new JTextField();
        
        
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");  
        JButton back = new JButton("Back");
        
        JLabel user = new JLabel("Enter Username");
        JLabel pass = new JLabel("Enter Password");
        JLabel email = new JLabel("Enter Email");
        JLabel url = new JLabel("Enter URL");
        JLabel ins = new JLabel("Click table indexes first then press Update/Delete");
        
        textId.setBounds(120, 220, 100, 25);
        textFname.setBounds(120, 250, 100, 25);
        textLname.setBounds(120, 280, 100, 25);
        textAge.setBounds(120, 310, 100, 25);
        
        btnAdd.setBounds(260, 220, 100, 25);
        btnUpdate.setBounds(260, 265, 100, 25);
        btnDelete.setBounds(260, 310, 100, 25);
        back.setBounds(260, 350, 100, 25);
        
        user.setBounds(15, 220, 105, 25);
        pass.setBounds(15, 250, 105, 25);
        email.setBounds(15, 280, 105, 25);
        url.setBounds(15, 310, 105, 25);
        ins.setBounds(15, 380, 300, 25);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(textAge);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(back);
        
        frame.add(user);
        frame.add(pass);
        frame.add(email);
        frame.add(url);
        frame.add(ins);
        
        // create an array of objects to set the row data
        Object[] row = new Object[4];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){
            BufferedReader br;
            @Override
            
            public void actionPerformed(ActionEvent e) {
             File file = new File("newuser.txt");
                row[0] = textId.getText();
                row[1] = textFname.getText();
                row[2] = textLname.getText();
                row[3] = textAge.getText();
                
                // add row to the model
                model.addRow(row);
                
                for(int row = 0; row < table.getRowCount(); row++) {

                    for(int column = 0; column < table.getColumnCount(); column++) {
            System.out.println(table.getColumnName(column) + ": ");
            System.out.println(table.getValueAt(row, column));
        }
        System.out.println(""); // Add line space
    }
                
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent ae) {
                JButton eventSource = (JButton) ae.getSource();

                if (eventSource == back) {
                    frame.dispose();
                }
            }
        
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            textId.setText(model.getValueAt(i, 0).toString());
            textFname.setText(model.getValueAt(i, 1).toString());
            textLname.setText(model.getValueAt(i, 2).toString());
            textAge.setText(model.getValueAt(i, 3).toString());
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(textFname.getText(), i, 1);
                   model.setValueAt(textLname.getText(), i, 2);
                   model.setValueAt(textAge.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setSize(900,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}


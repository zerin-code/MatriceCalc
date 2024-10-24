package fr.zerin.main;

import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame{

	JFrame f;
	 
    // create a label to display text
    JLabel textLigne;
    JLabel textColonne;

    // create a new button
    JButton b;
    
    JTextField inputLigne;
    JTextField inputColonne;
    
    
    JPanel p;
    
    int numberligne;
    int numbercolonne;
    
	public Fenetre(){ 
		
		
	
		// create a new frame to store text field and button
				f = new JFrame("Matrice calc");
				f.setSize(600, 600);
		        setLayout(null);
		        p = new JPanel();
		 
		        // create a label to display text
		        textLigne = new JLabel("Nombre de Ligne");
		        textColonne = new JLabel("Nombre de Colonne");
		        
		       //button
		        b = new JButton("submit");
		 
		        // create a object of the text class
		   
		 
		        // addActionListener to button
		       
		 
		        // create a object of JTextField with 16 columns
		        inputLigne = new JTextField(2);
		        inputColonne = new JTextField(2);
		 
		        
		        // create a panel to add buttons and textfield
		       
		        b.addActionListener(new ActionListener() {

		            public void actionPerformed(ActionEvent e)
		            {
		                //Execute when button is pressed
		            	 try {
		                     numberligne = Integer.valueOf(inputLigne.getText());
		                     

		                     numbercolonne = Integer.valueOf(inputColonne.getText());
		                     
		                 } catch (NumberFormatException e1) {
		                     System.out.println("Invalid integer input");
		                 }
		                
		            }
		        });  
		        // add buttons and textfield to panel
		        p.add(textLigne);
		        p.add(inputLigne);
		        p.add(textColonne);
		        p.add(inputColonne);
		        p.add(b);
		        
		 
		        // add panel to frame
		        f.add(p);
		 
		        // set the size of frame
		        
		 
		        f.setVisible(true);
		       

		
  }


}
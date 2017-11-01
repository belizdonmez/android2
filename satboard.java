package odev;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class satboard {
	public static void main(String[] args) {JFrame frame;
	ArrayList<JButton> board = new ArrayList<JButton>();
	
	
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
    	constraints.gridy = 0;
    	
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0; j<8; j++)
    		{
    			JButton button=new JButton("Tas");
    			
    			constraints.gridx=i;
    			constraints.gridy=j;
    			board.add(button);
    			frame.add(button,constraints);
    			if(i%2==0 && j%2==0 || i%2==1 && j%2==1)
    			{
    				button.setBackground(Color.WHITE);
    			}
    			else {
    				button.setBackground(Color.BLACK);
    			}
    			
    			
    		}
    	}
    	
   		frame.pack();
   		frame.setVisible(true);
                 
    		 }
    		 
    	 });
    		 
   	

	
	
}
	
            
            } 
				
	

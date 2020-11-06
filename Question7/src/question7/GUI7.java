/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/*
 * @author User
 */

public class GUI7 extends JFrame{
    //Attributes.  
    JLabel cbLbl1,cbLbl2;
    final JTextField tx1,tx2;
    JButton PrcsBtn;
    JTextArea Area1;
    
    
    //Constructor.  
    public GUI7 (){
        super("Sweet delicious App");
        this.setSize(350,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Panel contains pane 1, 2, 3.  
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3,1));
        
        //Pane1.  
        JPanel pane1 = new JPanel();
        
        JPanel pane1_1 = new JPanel();
        cbLbl1 = new JLabel("Enter Conveyer Belt Name: ");
        tx1 = new JTextField();
        
        pane1_1.setLayout(new GridLayout(1,2));
        pane1_1.add(cbLbl1);
        pane1_1.add(tx1);
        pane1.add(pane1_1);
        
        //Pane2.  
        JPanel pane2 = new JPanel();
        
        JPanel pane2_1 = new JPanel();
        cbLbl2 = new JLabel("Enter Conveyer Belt Name: ");
        tx2 = new JTextField();
        
        pane2_1.setLayout(new GridLayout(1,2));
        pane2_1.add(cbLbl2);
        pane2_1.add(tx2);
        pane2.add(pane2_1);
        
        //Pane3.  
        JPanel pane3 = new JPanel();
        PrcsBtn = new JButton("Process");
        PrcsBtn.addActionListener(new ProcessBtn());
        pane3.add(PrcsBtn);
        
        //container add.
        container.add(pane1);
        container.add(pane2);
        container.add(pane3);
        
        //Pane4.  
        JPanel pane4 = new JPanel();
        Area1 = new JTextArea(34,20);
        pane4.setBorder(new EmptyBorder(50,5,5,10));
        pane4.add(Area1);
        
        //Add and Layout of Frame.  
        this.setLayout(new BorderLayout());
        this.add(container,BorderLayout.NORTH);
        this.add(pane4,BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //Process Button ActionListener.  
    class ProcessBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(tx1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "PLease enter conveyor belt names! ","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                TinCounter tC1 = new TinCounter("FillConv");
                TinCounter tC2 = new TinCounter("SealConv");
            
                Thread tH1 = new Thread((Runnable) tC1);
                Thread tH2 = new Thread((Runnable) tC2);
            
                tH1.start();
                tH2.start();
            }
            tx1.setText(null);
        }
        
    }
    
}

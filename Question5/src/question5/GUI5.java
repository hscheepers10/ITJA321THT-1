/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/*
 * @author User
 */

public class GUI5 extends JFrame{
    //Attributes.  
    final JLabel l1,l2,l3;
    final JTextField tx1,tx2;
    final JButton btn0,btn1,btn2,btn3;
    LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
    
    //Constructor.  
    public GUI5(){
        super("TTechDevs App");
        this.setSize(450,350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Pane1.  
        JPanel pane1 = new JPanel();
        l1 = new JLabel("Welcome to the TTechDevs App");
        pane1.setBorder(new EmptyBorder(0,20,0,0));
        pane1.setLayout(new GridLayout(1,1));
        
        //Element Name label and textfield.  
        JPanel grid1 = new JPanel();
        l2 = new JLabel("Enter Element Name: ");
        tx1 = new JTextField();
        grid1.setLayout(new GridLayout(1,2));
        grid1.setBorder(new EmptyBorder(10,15,10,50));
        grid1.add(l2);
        grid1.add(tx1);
        
        //Element Number label and textfield.  
        JPanel grid2 = new JPanel();
        l3 = new JLabel("Enter Element Number: ");
        tx2 = new JTextField();
        grid2.setLayout(new GridLayout(1,2));
        grid2.setBorder(new EmptyBorder(10,15,10,50));
        grid2.add(l3);
        grid2.add(tx2);
        
        pane1.setLayout(new GridLayout(3,1));
        pane1.add(l1);
        pane1.add(grid1);
        pane1.add(grid2);
        
        //Pane2. 
        JPanel box1 = new JPanel();
        btn0 = new JButton("Add");
        btn0.addActionListener(new AddBtn());
        box1.setLayout(new GridLayout(1,1));
        box1.setBorder(new EmptyBorder(20,10,10,10));
        box1.add(btn0);
        
        JPanel box2 = new JPanel();
        btn1 = new JButton("Change");
        btn1.addActionListener(new ChnBtn());
        box2.setLayout(new GridLayout(1,1));
        box2.setBorder(new EmptyBorder(20,10,10,10));
        box2.add(btn1);
        
        JPanel box3 = new JPanel();
        btn2 = new JButton("Remove");
        btn2.addActionListener(new RemBtn());
        box3.setLayout(new GridLayout(1,1));
        box3.setBorder(new EmptyBorder(20,10,10,10));
        box3.add(btn2);
        
        JPanel box4 = new JPanel();
        btn3 = new JButton("Show All");
        btn3.addActionListener(new ShwBtn());
        box4.setLayout(new GridLayout(1,1));
        box4.setBorder(new EmptyBorder(20,10,10,10));
        box4.add(btn3);
        
        JPanel pane2 = new JPanel();
        pane2.setLayout(new GridLayout(2,2));
        pane2.setBorder(new EmptyBorder(5,5,5,5));
        
        pane2.add(box1);
        pane2.add(box2);
        pane2.add(box3);
        pane2.add(box4);
        
        //This add.  
        this.setLayout(new GridLayout(2,1));
        this.add(pane1);
        this.add(pane2);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //Classes that handle Buttons.
    //The AddBtn class that serves as an actionListener when the user adds an element to the LinkedHashMap.  
    class AddBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(tx1.getText().equals("")||tx2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "PLease enter an element number and name","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                lhm.put(tx2.getText(), tx1.getText());
                JOptionPane.showMessageDialog(null, "Element has been added to the LinkedHashMap","Message",JOptionPane.INFORMATION_MESSAGE);
        }
            tx1.setText(null);
            tx2.setText(null);
        }
    }
    
    //Change button to change existing elements.  
    class ChnBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(tx2==null){
                JOptionPane.showMessageDialog(null, "This element does not exist!","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                lhm.replace(tx2.getText(), tx1.getText());
                JOptionPane.showMessageDialog(null, "The element has been changed","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            tx1.setText(null);
            tx2.setText(null);
        }
    }
    
    //Remove element Button's Class.  
    class RemBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(tx2==null){
                JOptionPane.showMessageDialog(null, "This element does not exist!","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                lhm.remove(tx2.getText());
                JOptionPane.showMessageDialog(null, "The element has been removed","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            tx1.setText(null);
            tx2.setText(null);
        }
    }
    
    //Class impliments show all button, and the class shows all Elements in the LinkedHashMap.  
    class ShwBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String rName = "";
            for(String key:lhm.keySet()){
                rName += key+":"+lhm.get(key)+"\n";
            }
            JOptionPane.showMessageDialog(null, rName,"List of all Elements",JOptionPane.INFORMATION_MESSAGE);
            tx1.setText(null);
        }
    }
}

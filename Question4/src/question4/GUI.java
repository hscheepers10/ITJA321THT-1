/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

//Imports.  
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
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

public class GUI extends JFrame {
    //Attributes.  
    final JLabel l1, l2;
    final JButton btn1,btn2;
    final JTextField tx1;
    ArrayList<String> nList = new ArrayList<>();
    //Code. 
    
    //Constructor.  
    public GUI(){
        super("Luthando High School Registration App");
        this.setSize(450,400);
        this.setLayout(new GridLayout(4,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Layouts.  
        FlowLayout topFlow = new FlowLayout();
        GridLayout midGrid = new GridLayout(1,2);
        GridLayout botGrid = new GridLayout(2,1);
          
        //Top
        l1 = new JLabel("Welcome to Luthando High School Registration App");
        
        JPanel top = new JPanel();
        top.setLayout(topFlow);
        top.setBorder(new EmptyBorder(35,5,5,5));
        top.add(l1);
        
        //Mid
        l2 = new JLabel("Enter pupil name:");
        tx1 = new JTextField();
        
        JPanel mid = new JPanel();
        mid.setLayout(midGrid);
        mid.setAlignmentX(CENTER_ALIGNMENT);
        mid.setBorder(new EmptyBorder(30,50,30,50));
        mid.add(l2);
        mid.add(tx1);
        
        //Bot1
        btn1 = new JButton("Register Pupil");
        btn1.addActionListener(new RegBtn());
        
        JPanel bot = new JPanel();
        bot.setLayout(botGrid);
        bot.setBorder(new EmptyBorder(30,100,0,100));
        bot.add(btn1);
        
        //Bot2
        btn2 = new JButton("Show all Registrations");
        btn2.addActionListener(new ShwBtn());
        
        JPanel bot2 = new JPanel();
        bot2.setLayout(botGrid);
        bot2.setBorder(new EmptyBorder(0,100,30,100));
        bot2.add(btn2);
        
        //Add.  
        this.add(top);
        this.add(mid);
        this.add(bot);
        this.add(bot2);
        this.setVisible(true);   
    }
    
    //Register a student Button actionListener.  
    class RegBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(tx1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Enter a student name before registering !","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String pName = tx1.getText();
                nList.add(pName);
                JOptionPane.showMessageDialog(null, "The pupil has been registered successfully","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            tx1.setText(null);
        }
    }
    
    //Show students List Button ActionListener.  
    class ShwBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String rName = "";
            LinkedList<Object> list1 = new LinkedList(nList);
            ListIterator lItr = list1.listIterator();
            while(lItr.hasNext()){
                rName += lItr.next()+"\n";
                
            }
            JOptionPane.showMessageDialog(null, rName,"Pupil List: ",JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}
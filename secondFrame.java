
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
public class secondFrame extends GUI implements ActionListener
{
   public secondFrame(){
       
       
       
        setVisible(true);
        setSize(600,600);
        
        setLayout(null);
        
        lbltitle.setBounds(200,20,200,200);
        lblwarriors.setBounds(50,200,200,50);
        lblmagicians.setBounds(350,200,200,50);
        
        btnwarriors.setBounds(50,300,200,50);
        btnmagicians.setBounds(350,300,200,50);
        
        add(lbltitle);
        add(lblwarriors);
        add(lblmagicians);
        add(btnwarriors);
        add(btnmagicians);
        
        btnwarriors.addActionListener(this);
        btnmagicians.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a){
        Heroes h1 = new magicians();
        Heroes h = new warriors();
       
        ArrayList<Heroes> hero = new ArrayList<Heroes>();
        hero.add(0,h1);
        hero.add(1,h);
        
        if(a.getSource()==btnwarriors){
            setVisible(false);
            warriors warrior = new warriors();
            warrior.name = JOptionPane.showInputDialog("Please enter your name");
            new thirdFrame(warrior, hero);
            
        }
        if(a.getSource()==btnmagicians){
            setVisible(false);
            magicians magician = new magicians();
            magician.name = JOptionPane.showInputDialog("Please enter your name");
            new thirdFrame(magician, hero);
        }
        
        
    }
}

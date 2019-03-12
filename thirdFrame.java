
import java.awt.event.*;
import java.util.ArrayList;
public class thirdFrame extends GUI implements ActionListener
{
    private ArrayList<Heroes> hero;
    private boolean iswarrior;
    private warriors w;
    private magicians m;
  public thirdFrame(warriors w, ArrayList<Heroes> h){
      
        this.hero = h;
        setVisible(true);
        setSize(600,600);
        
        setLayout(null);
        this.w=w;
        
        lblcharacter.setBounds(200,20,200,200);
        lblcharacter.setText("<html><h2> Warriors <br> Strength:20 <br> Health:100 </h2></html>");
        btncont.setBounds(200,300,200,50);
        btnsave.setBounds(200,400,200,50);
        add(lblcharacter);
        add(btncont);
        add(btnsave);
        
        
        btncont.addActionListener(this);
        btnsave.addActionListener(this);
        iswarrior = true;
      
   }
   
  public thirdFrame(magicians m,ArrayList<Heroes> x){
        
        this.hero = x;
        setVisible(true);
        setSize(600,600);
        setLayout(null);
        this.m=m;
        lblcharacter.setBounds(200,20,200,200);
        lblcharacter.setText("<html><h2>Magicians <br> Strength:50 <br> Health:80 </h2></html>");
        btncont.setBounds(200,300,200,50);
        btnsave.setBounds(200,500,200,50);
        
        add(lblcharacter);
        add(btncont);
        add(btnsave);
        
        btncont.addActionListener(this);
        btnsave.addActionListener(this);
        iswarrior = false;
    }
  public void actionPerformed(ActionEvent a){
       if(a.getSource()==btncont){
         setVisible(false); 
         new fourthFrame(iswarrior, hero);
        }
       if(a.getSource()==btnsave){
           if(iswarrior){
               setVisible(false);
               save(hero,w,iswarrior);
            }
            else{
                setVisible(false);
                save(hero,m,iswarrior);
            }
       }
  }
    
}

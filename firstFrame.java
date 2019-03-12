import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class firstFrame extends GUI implements ActionListener
{
    ArrayList<Heroes> hero = new ArrayList<Heroes>();
    public firstFrame()
    {
        setVisible(true);
        setSize(600,600);

        setLayout(null);

        lblmain.setBounds(200,20,200,200);
        btnmain.setBounds(200,300,200,50);
        btnexit.setBounds(200,400,200,50);
        btnload.setBounds(200,500,200,50);

        add(lblmain);
        add(btnmain);
        add(btnexit);
        add(btnload);

        btnexit.addActionListener(this);
        btnmain.addActionListener(this);
        btnload.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a){

        if(a.getSource()==btnexit){
            setVisible(false);
        }
        if(a.getSource()==btnmain){
            setVisible(false);
            new secondFrame();
        }
        if(a.getSource()==btnload){
            
            try{ 
                String[] array = new String[4];
                e = new FileReader("saveGame.txt");
                v = new BufferedReader(e);
                for(int i=0; i<4; i++){
                    array[i] = v.readLine();
                }
                hero.add(0,new warriors());
                hero.add(1,new magicians());
                if(array[3].equals("true")){

                    hero.get(0).health= Integer.parseInt(array[0]);
                    hero.get(0).strength= Integer.parseInt(array[1]);
                    hero.get(0).name= array[2];
                    warriors w = new warriors();
                    w.health = Integer.parseInt(array[0]);
                    w.strength = Integer.parseInt(array[1]);
                    w.name = array[2];
                    System.out.println("done");
                    new thirdFrame(w,hero);
                }else{
                    hero.get(1).health= Integer.parseInt(array[0]);
                    hero.get(1).strength= Integer.parseInt(array[1]);
                    hero.get(1).name= array[2];
                    magicians m = new magicians();
                    m.health = Integer.parseInt(array[0]);
                    m.strength = Integer.parseInt(array[1]);
                    m.name = array[2];
                    System.out.println("done");
                    new thirdFrame(m,hero);
                }

            }
            catch(IOException e){}
            setVisible(false);

        }

    }

}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class GUI extends JFrame
{
    //1st Frame// 

    protected JLabel lblmain = new JLabel("<html> <h1> Black Castle </h1><h3>Version 1.0</h3>  </html>");
    protected Button btnmain = new Button("New Game");
    protected Button btnexit = new Button("Exit Game");
    protected Button btnload = new Button("load");

    //2nd Frame
    protected JLabel lbltitle = new JLabel("<html> <h1> Welcome to the first edition of Black Castle</h1> <br> < </html>");
    protected JLabel lblwarriors = new JLabel("<html><h3>Be a warrior and explore the mysterious castle</h3></html>");
    protected JLabel lblmagicians = new JLabel("<html><h3>Be a magician and explore the mysterious castle</h3></html>");
    protected Button btnwarriors = new Button("Warrior");
    protected Button btnmagicians = new Button("Magician");
    //protected boolean iswarrior = true;

    //3rd Frame
    protected JLabel lblcharacter = new JLabel();
    protected Button btncont = new Button("Continue");

    //4th frame
    BufferedReader v;
    PrintWriter r;
    FileWriter s;
    FileReader e;
    protected Button btnsave = new Button("Save");

    //fight
    protected JLabel lblmain1 = new JLabel("<html> <h1> Black Castle </h1><h3>Version 1.0</h3>  </html>");
    protected Button btnattack = new Button("Attack");
    protected Button btnspecialPower = new Button("Special Power");
    protected Button btnrun = new Button("Dodge");

    //end
    protected JLabel lblmain2 = new JLabel("<html> <h1> Congratulations! You won!!! </h1>  </html>");

    public void save(ArrayList<Heroes> i, magicians m,boolean iswarrior) 
    {
        try{
            s = new FileWriter("saveGame.txt");
            r = new PrintWriter(s);
            r.println(m.health);
            r.println(m.strength);
            //r.println(m.specialPower);
            r.println(m.name);
            r.println(iswarrior);
            r.close();
        }
        catch(IOException e){}

    }

    public void save(ArrayList<Heroes> l, warriors w,boolean iswarrior){

        try{
            s = new FileWriter("saveGame.txt");
            r = new PrintWriter(s);
            r.println(w.health);
            r.println(w.strength);
            //r.println(w.specialPower);
            r.println(w.name);
            r.println(iswarrior);
            r.close();
        }
        catch(IOException e){}

    }

    public void load(ArrayList<Heroes> k){
        try{ 
            String[] array = new String[4];
            e = new FileReader("saveGame.txt");
            v = new BufferedReader(e);
            for(int i=0; i<4; i++){
                array[i] = v.readLine();
            }
            
            if(array[4].equals(true)){
                k.get(0).health= Integer.parseInt(array[0]);
                k.get(0).strength= Integer.parseInt(array[1]);
                k.get(0).name= array[2];
                warriors w = new warriors();
                w.health = Integer.parseInt(array[0]);
                w.strength = Integer.parseInt(array[1]);
                w.name = array[2];
                System.out.println("done");
                new thirdFrame(w,k);
            }else{
                k.get(1).health= Integer.parseInt(array[0]);
                k.get(1).strength= Integer.parseInt(array[1]);
                k.get(1).name= array[2];
                magicians m = new magicians();
                m.health = Integer.parseInt(array[0]);
                m.strength = Integer.parseInt(array[1]);
                m.name = array[2];
                System.out.println("done");
                new thirdFrame(m,k);
            }


        }
        catch(IOException e){}
    }
}

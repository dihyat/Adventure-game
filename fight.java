import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;
import java.awt.Component;
public class fight extends GUI implements ActionListener
{
    private ArrayList<Heroes> h;
    private BufferedImage character;
    private BufferedImage badguy;
    private int x = 150;
    private int y = 200;
    protected Timer t = new Timer(5,this);
    private Villains v = new monsters1();
    private boolean check = true;
    public fight(ArrayList<Heroes> h, boolean iswarrior){
        this.h = h; 
        setVisible(true);
        setSize(800,600);
        check = iswarrior;
        setLayout(null);

        lblmain1.setBounds(200,20,200,200);
        btnattack.setBounds(200,300,200,50);
        btnrun.setBounds(400,300,200,50);
        //btnrun.setBounds(350,400,200,50);

        add(lblmain1);
        add(btnattack);
        //add(btnspecialPower);
        add(btnrun);

        try{

            if(iswarrior){
                character = ImageIO.read(this.getClass().getResource("newwarrior.png"));

            }else{
                character = ImageIO.read(this.getClass().getResource("magician.png"));
            }
            badguy = ImageIO.read(this.getClass().getResource("monster.png"));
        }
        catch(IOException e){}
        repaint();

        btnattack.addActionListener(this);
        btnrun.addActionListener(this);

    }

    public void paint(Graphics g){

        g.clearRect(x,150,3000,20);
        if(check)
        {
            System.out.println(check);
            g.drawImage(character,x,y,null);
            g.drawImage(badguy,500,y,null);
        }else{
            g.drawImage(character,150,150,null);
            g.drawImage(badguy,500,y,null);
        }
        //g.drawImage(character,x,y,null);
        //g.drawImage(badguy,500,y,null);
        g.fillRect(x,150,h.get(0).health,20);
        g.fillRect(500,150,v.health,20);
        if(v.health<=0){
            new end();

            setVisible(false);
        }
    }

    public void actionPerformed(ActionEvent a){
        repaint();
        //update();
        if(a.getSource()==btnattack){
            if(check = true){
                h.get(0).decreaseHealth(v);
                v.decreaseHealth(h.get(0));
            }else{
                h.get(1).decreaseHealth(v);
                v.decreaseHealth(h.get(1));
            }
        }
        if(a.getSource()==btnrun){
            if(check=true){ 
                h.get(0).increaseHealth();
            }
            else{
                h.get(1).increaseHealth();
            }
        }
    }

}

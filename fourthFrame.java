
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;

public class fourthFrame extends GUI implements ActionListener,KeyListener
{
    private int x = 150;
    private int y = 200;
    private int velx = 0;
    private int vely = 0;
    private ArrayList<Heroes> h;
    protected Timer t = new Timer(5,this);
    private BufferedImage character;
    private BufferedImage img;
    private BufferedImage badguy;
    private boolean iswarrior;
    public fourthFrame(boolean iswarrior, ArrayList<Heroes> i)
    {
        
        this.iswarrior = iswarrior;
        addKeyListener(this);
        setVisible(true);
        setSize(800,545);
        setLayout(null);
        h = i;
        t.start();
        try{

            if(iswarrior){
                character = ImageIO.read(this.getClass().getResource("newwarrior.png"));

            }else{
                character = ImageIO.read(this.getClass().getResource("magician.png"));
            }
            img = ImageIO.read(this.getClass().getResource("Gamebackground.jpg"));
            badguy = ImageIO.read(this.getClass().getResource("monster.png"));

        }
        catch(IOException ex){
        }
        
        repaint();
       // System.out.println(iswarrior);
    }

    public void paint(Graphics g){
        //System.out.println("paint:"+iswarrior);
        g.drawImage(img,0,0,null);
        g.drawImage(character,x,y,null);
        g.drawImage(badguy,500,y,null);

    }

    public void actionPerformed(ActionEvent a){
        repaint();
        update();
        //System.out.println("action:"+iswarrior);
    }
    public void keyPressed(KeyEvent a){
        //System.out.println("key:"+iswarrior);
        if(a.getKeyCode()==KeyEvent.VK_LEFT){
            velx = -1;
            if(x >= 660){
                setVisible(false);
                //System.out.println(iswarrior);
                new fight(h,iswarrior);
                x = 80;

            }
        }
        else if(a.getKeyCode()==KeyEvent.VK_RIGHT){
            velx = 1;
            if(x >= 400){
                setVisible(false);

                new fight(h,iswarrior);
                
                x = 80;

            }
        }
        else if(a.getKeyCode()==KeyEvent.VK_UP){
            vely = -1;
            if(x >= 400){
                setVisible(false);

                new fight(h,iswarrior);
                x = 80;

            }
        }
        else if(a.getKeyCode()==KeyEvent.VK_DOWN){
            vely = 1;
            if(x >= 400){
                setVisible(false);

                new fight(h,iswarrior);
                x = 80;

            }
        }

    }

    public void update(){
        x+=velx;
        y+=vely;
    }

    public void keyReleased(KeyEvent a){
        if(a.getKeyCode()==KeyEvent.VK_LEFT){
            velx = 0;
        }
        else if(a.getKeyCode()==KeyEvent.VK_RIGHT){
            velx=0;
        }
        else if(a.getKeyCode()==KeyEvent.VK_UP){
            vely =0;
        }
        else if(a.getKeyCode()==KeyEvent.VK_DOWN){
            vely=0;
        }
    }

    public void keyTyped(KeyEvent a){

    }

}

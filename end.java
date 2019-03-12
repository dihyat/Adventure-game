import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;
import java.awt.Component;
public class end extends GUI implements ActionListener
{
    private BufferedImage img;
    public end(){
        setVisible(true);

        setSize(600,600);

        setLayout(null);
        
        lblmain2.setBounds(200,20,200,200);
        add(lblmain2);
        try{

            
            img = ImageIO.read(this.getClass().getResource("bd.jpg"));
            

        }
        catch(IOException ex){
        }
    }

    public void actionPerformed(ActionEvent a){

    }
}

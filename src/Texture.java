import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Texture extends JFrame {
    int x = 0;
    int y = 0;
    BufferedImage image;
    public void paint(Graphics g)  {

        g.drawImage(image, x, y, null);
        if(x <= 800 && y <= 600){
            x += 50;
            if(x >= 800){
              x = 0;
              y += 50;
            }
            if(y >= 600){
               return;
            }
        }


    }
    Texture(){
        try{
        image = ImageIO.read(new File("src/20.png"));
        }catch (Exception e){}

        Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }
}

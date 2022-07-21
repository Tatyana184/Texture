import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       Texture texture = new Texture();
       texture.setSize(800,600);
       texture.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

       texture.setVisible(true);
    }
}
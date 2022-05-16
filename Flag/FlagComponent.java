import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class FlagComponent extends JComponent
{
   
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5, 10, 30, 60);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        
        box.translate(30, 0);
        
        g2.setColor(Color.WHITE);
        g2.fill(box);
        
        box.translate(30, 0);
        
        g2.setColor(Color.RED);
        g2.fill(box);
    }
}
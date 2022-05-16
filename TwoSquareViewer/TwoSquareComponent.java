
/**
 * Write a description of class TwoSquareComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent
{
   
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5, 10, 60, 60);
        g2.setColor(Color.PINK);
        g2.fill(box);
        
        box.translate(30, 50);
        
        g2.setColor(new Color(138,43,226));
        g2.fill(box);
    }
}

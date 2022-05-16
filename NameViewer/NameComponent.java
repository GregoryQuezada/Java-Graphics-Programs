
/**
 * Write a description of class NameComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5, 10, 80, 40);
        g2.setColor(Color.BLUE);
        g2.draw(box);
        
        //box.translate(15, 25);
        
        g2.setColor(Color.RED);
        g2.drawString("Gregory", 22, 33);
    }
}

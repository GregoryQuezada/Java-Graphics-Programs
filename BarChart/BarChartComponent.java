import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{
   
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle GG = new Rectangle(120, 20, 80, 20);
        Rectangle Br = new Rectangle(120, 50, 30, 20);
        Rectangle DM = new Rectangle(120, 80, 40, 20);
        Rectangle Mck = new Rectangle(120, 110, 75, 20);
        g2.setColor(Color.BLUE);
        g2.fill(GG);
        g2.drawString("Golden Gate", 10, 35);
        
        g2.setColor(Color.RED);
        g2.fill(Br);
        g2.drawString("Brooklyn", 10, 65);
        
        g2.setColor(Color.ORANGE);
        g2.fill(DM);
        g2.drawString("Delaware Memorial", 10, 95);
        
        g2.setColor(Color.GREEN);
        g2.fill(Mck);
        g2.drawString("Mackinack", 10, 125);
    }
}
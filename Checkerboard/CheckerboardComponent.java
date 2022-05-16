import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class CheckerboardComponent extends JComponent
{
   
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5, 10, 30, 30);
        g2.setColor(Color.BLACK);
        boolean help = false;
        
        for(int i = 0; i < 6; i++){
            for(int k = 0; k < 6; k++){
                if(help == true){
                   if(k == 5){
                        help = false;
                        break;
                    }
                    else{
                        g2.fill(box);
                        box.translate(60,0);
                    }
                }
                else{
                    g2.fill(box);
                    box.translate(60,0);
                    if(k == 5){
                        help = true;
                    }
                }
            }
            box.translate(-330,30); 
        }
    }
}


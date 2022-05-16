
/**
 * Write a description of class TwoSquareViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JFrame;

public class TwoSquareViewer
{
   
     public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("Two Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}

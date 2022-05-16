
/**
 * Write a description of class RectangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;

public class RectangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 500);
        frame.setTitle("Two Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}

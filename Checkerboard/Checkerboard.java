import javax.swing.JFrame;

public class Checkerboard
{
   
     public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("Checkerboard Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CheckerboardComponent component = new CheckerboardComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}

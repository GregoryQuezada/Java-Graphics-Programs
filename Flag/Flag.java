import javax.swing.JFrame;

public class Flag
{
   
     public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("French Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlagComponent component = new FlagComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
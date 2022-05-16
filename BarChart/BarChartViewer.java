import javax.swing.JFrame;

public class BarChartViewer
{
   
     public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("Bar Chart for Bridges");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BarChartComponent component = new BarChartComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
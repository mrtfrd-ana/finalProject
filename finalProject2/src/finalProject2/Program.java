package finalProject2;

//import finalProject2.gui.Circle;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Program {
    public static void main(String[] args) {
        AnimationPlayer player= new AnimationPlayer();
//        player.loadAnimationFromFile("test.txt");
        JFrame frame=new JFrame("Anim");
        Circle c=new Circle(frame);
        frame.setSize(1100, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

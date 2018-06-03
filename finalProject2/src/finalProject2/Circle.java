package finalProject2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Circle extends Shape {

    private Color color;
//    private Color ballBorderColor;

    private int r;
    private Color borderColor;
    private double border;
    private int X;
    private int Y;

    public boolean fillBall = false;

//    public Circle(int x, int y) {
//        super(x, y);
//        X = x;
//        Y = y;
//        ballBorderColor = Color.BLUE;
//        ballFillColor = Color.GREEN;
//    }

    class MyComponent extends JComponent {

        public void paint(Graphics g, JFrame F) {

            if (fillBall) //Fill first, and then draw outline.
            {
//                g.setColor(java.awt.Color.BLACK);
                g.fillOval(getX(), getY(), getR(), getR());
            }

            g.setColor(java.awt.Color.blue);
            g.drawOval(getX(), getY(), getR(), getR());

        }
    }

    public void drawBall(JFrame frame) {
        frame.getContentPane().add(new MyComponent());
        frame.revalidate();
        frame.repaint();
    }

    
    
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color ballFillColor) {
        this.color = ballFillColor;
    }

//    public Color getBallBorderColor() {
//        return color;
//    }
//
//    public void setBallBorderColor(Color ballBorderColor) {
//        this.color = ballBorderColor;
//    }

    
    public int getX() {
        return X;
    }

    
    public void setX(int X) {
        this.X = X;
    }

    
    public int getY() {
        return Y;
    }

    
    public void setY(int Y) {
        this.Y = Y;
    }
}

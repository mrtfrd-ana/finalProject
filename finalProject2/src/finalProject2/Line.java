package finalProject2;


import java.awt.Color;



public class Line extends Shape{
   private Position sar;
   private Position tah;
   private int border;   //bar hasbe tedade pixel ha
   private Color borderColor;

   
    public Position getSar() {
        return sar;
    }

    
    public void setSar(Position sar) {
        this.sar = sar;
    }

    
    public Position getTah() {
        return tah;
    }

    
    public void setTah(Position tah) {
        this.tah = tah;
    }

    
    public int getBorder() {
        return border;
    }

    
    public void setBorder(int border) {
        this.border = border;
    }

    
    public Color getBorderColor() {
        return borderColor;
    }

    
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}

package finalProject3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.awt.Color;


public class AnimationPlayer {
//    String animation=null;
    private int frames;
    private int speed;
    private int NoElements;
    ArrayList<Shape> elements=new ArrayList<>();
    
    public void readShape(BufferedReader br){
        try{
        String line=br.readLine();
//        sb.append(line);
//        sb.append(System.lineSeparator());
//        if(line.isEmpty()){
//            continue;
//        }
//        else{
            switch(line.trim()){
                case "Circle":
                case "circle":    
                    Circle c=new Circle();
                    elements.add(c);
                    try{
                        while (true) {
                        line=br.readLine();
//                        if(line!=null && line.startsWith("r: ")){
//                            String temp=line.substring(3);
                            String temp;
                            switch(line){
                                case "r: ":
                                    temp=line.substring(3);
                                    c.setR(Integer.parseInt(temp));
                                        break;
                                case "x: ":
                                    temp=line.substring(3);
                                    c.setX(Integer.parseInt(temp));
                                        break;
                                        
                                case "y: ":
                                    temp=line.substring(3);
                                    c.setY(Integer.parseInt(temp));
                                        break;
                                        
                                case "color: ":
                                    temp=line.substring(7);
                                    String[] rgb=temp.split(",");
                                    c.setColor(new Color(Integer.parseInt(rgb[0]),Integer.parseInt(rgb[1]),Integer.parseInt(rgb[2])));
                            }
    
                        }
//                        if(c.getR()==0)
//                            throw new EssentialFieldEmptyException();
                    }
                    catch(IOException e){}
                    catch (EssentialFieldEmptyException e){}
                    
                    break;
                    
                    
                    
                case "Rect":
                case "rect":    
                    Rect r=new Rect();
                    elements.add(r);
                    try{
                        while(true){
//                        for(int j=0;j<3;j++){
                        line=br.readLine();
//                        if(line!=null && line.startsWith("r: ")){
                            String temp;
                            switch(line.trim()){
                                case "length:":
                                    temp=line.substring(7);
                                    r.setLength(Integer.parseInt(temp));
                            break;
                                case "width:":
                                    temp=line.substring(6);                                   
                                    r.setWidth(Integer.parseInt(temp));
                                        break;
                                        
                                case "x:":
                                    temp=line.substring(2);
                                    r.setX(Integer.parseInt(temp));
                                        break;
                                        
                                case "y:":
                                    temp=line.substring(2);
                                    r.setY(Integer.parseInt(temp));
                                    break;
                            }
    
                        }
//                        if(c.getR()==0)
//                            throw new EssentialFieldEmptyException();
                    }
                    catch(IOException e){}
                    catch (EssentialFieldEmptyException e){}
                    break;
                case "Line":
                case "line":    
                     Line l=new Line();
                    elements.add(l);
                    try{
                        while(true){
//                        for(int j=0;j<3;j++){
                        line=br.readLine();
//                        if(line!=null && line.startsWith("r: ")){
                            String temp;
                            switch(line.trim()){
                                case "sar:":
                                    temp=line.substring(7);
                                    l.setSar(Integer.parseInt(temp));
                            break;
                                case "tah:":
                                    temp=line.substring(6);                                   
                                    l.setTah(Integer.parseInt(temp));
                                        break;
                                        
                                case "x:":
                                    temp=line.substring(2);
                                    r.setX(Integer.parseInt(temp));
                                        break;
                                        
                                case "y:":
                                    temp=line.substring(2);
                                    r.setY(Integer.parseInt(temp));
                                    break;
                            }
    
                        }
//                        if(c.getR()==0)
//                            throw new EssentialFieldEmptyException();
                    }
                    catch(IOException e){}
                    catch (EssentialFieldEmptyException e){}
                    break;
                case "Label":
                case "label":    
                    
                    break;
                case "Group":
                case "group":    
                    
                    break;
                default:
                    
                    break;
                        }
        
        }
    
        catch(IOException e){}
    }
    
public void loadAnimationFromFile (String fileAddress) throws FileNotFoundException{
    File file=new File(fileAddress);
    if(file.exists()){
        if(file.isFile()){
    BufferedReader br =null;
        try {
    br= new BufferedReader(new FileReader(fileAddress));
//    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    if(line!=null && line.startsWith("frames: ")){
        String temp=line.substring(8);
//        temp=temp.toString();
//        for(int i=0;i<temp.length;i++){
//            int digit=(int)temp[i];
//            for(int j=0;j<temp.length;j++){
//                digit*=10;
//            }
//            frames+=digit;
//        }  

        frames=Integer.parseInt(temp);
    }
    line=br.readLine();
    if(line!=null && line.startsWith("speed: ")){
        String temp=line.substring(7);
        speed=Integer.parseInt(temp);
    }
    
    line=br.readLine();
    if(line!=null){
    NoElements=Integer.parseInt(line);
    }
    for(int i=0;i<NoElements;i++){
        
    }
//    String everything = sb.toString();
//    this.animation=everything;
//            System.out.println(everything);
} 
catch(IOException e){}
finally {
            try{
    br.close();
            }
            catch(IOException e){}

        
    }
    }
        else throw new FileNotFoundException();
    }
    else throw new InputMismatchException();

}




private void run(String fileContext){
           
}
}

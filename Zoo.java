import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird>zooBirds;
    
    public Zoo(){
        zooBirds.add(new Bird("red,","blue jay",2));
        zooBirds.add(new Bird("red,","red cardnial",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("red,","red cardnial",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("red,","red cardnial",1));
        zooBirds.add(new Bird("red,","red cardnial",1));
    }
    int countBlueBirds(){
    int countBlueBirds=0;
    for(Bird b : zooBirds){
        if(b.getColor().equals("blue")){
            countBlueBirds++;
        }
    }
    return countBlueBirds;
    
    
    
    
    
    /**
     * 
     * for each bird
     * Arraylist<Bird>-Blluebirds
     * print # of Bluebirds
     * 
     * 
     * 
     */
}
}


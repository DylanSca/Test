
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    /**
     * 1)set year of birth
     * 2)currentYear - Birth year = age
     * 3)if age>==16
     * 4)print"user can drive"
     * 5)else print"16-age=" years left till eligible
     */
      
    private int currentYear = 2025;
    private int age;
    private int sum;
    public void getEligiability(int birthyear)
    {
        age=currentYear-birthyear;
     sum=16-age;
        if (age>=16)
        {System.out.println("eliglble to drive");}
        else{System.out.println(sum+"years left till eligiable");
    }
}
    
}

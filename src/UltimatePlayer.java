import java.util.*;
public class UltimatePlayer extends Person{
    private static int jerseyNumber;
    private String position;

    public UltimatePlayer(String firstName, String lastName, String p){
        super(firstName, lastName);
        int jerseyNumber = 1;
    String position = p;
    }
    public String getPosition(){
    return position;
    }
    public static int getJerseyNumber(){
        return jerseyNumber;
    }
    public String toString(){
    super.toString() + "\n\t" + "Jersey #:" + getJerseyNumber() + "\n\t" + "Position: " + getPosition();
    }
}
import java.util.*;
public class UltimatePlayer extends Person{
    private int jerseyNumber;
    private static int num;
    private String position = "";

    public UltimatePlayer(String firstName, String lastName, String p){
        super(firstName, lastName);
        if (position.equals("cutter")){
            this.position = "cutter"
        } else {
            this.position = "handler"
        }
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
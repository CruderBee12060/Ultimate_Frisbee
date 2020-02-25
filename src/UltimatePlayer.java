import java.util.*;
public class UltimatePlayer extends Person{
    private static int jerseyNumber;
    private String position = "";

    public UltimatePlayer(String firstName, String lastName, String p){
        super(firstName, lastName);
        this.position= p;
        if (p.equals("cutter")){
            this.position = "cutter";
            jerseyNumber++;
        } else {
            this.position = "handler";
            jerseyNumber++;
        }
    }
    public String getPosition(){
        return position;
    }
    public static int getJerseyNumber(){
        return jerseyNumber;
    }
    public String toString(){
        return super.toString() + "\n   Jersey #:" + getJerseyNumber() + "\n   Position: " + getPosition();
    }
}

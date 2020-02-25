import java.util.*;
public class Captain extends UltimatePlayer{
    private boolean type;

    public Captain(String firstName, String lastName, String position, boolean type){
    super (firstName, lastName, position);
    this.type = type;
    }
    public String toString(){
        String t;
        if(type){
            t = "offense";
        }else{
            t = "defense"
        }
        return super.toString() + "\n   Captain: " + t;
    }
}

package Capitulo_6;
import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCelss;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCelss = locs;
    }

    public void setName(String n){
        name = n;
    }
    
    public String checkYourself(String userIinput){
        String result = "miss";
        int index = locationCelss.indexOf(userIinput);

        if (index >= 0) {
            locationCelss.remove(index);
        }
        if (locationCelss.isEmpty()) {
            result = "kill";
            System.out.println("Ouch! You sunk " + name + "    : (");
        } else {
            result = "hit";
        }
        return result;
    }
}

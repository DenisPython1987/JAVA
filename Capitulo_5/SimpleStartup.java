package Capitulo_5;

public class SimpleStartup {
    private int[] locationCelss;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCelss = locs;
    }
    public String checkYourself(int guess){
        String result = "miss";

        for (int cell : locationCelss){
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }   
        }
        if (numOfHits == locationCelss.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

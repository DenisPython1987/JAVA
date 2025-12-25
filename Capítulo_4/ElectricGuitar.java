package Capítulo_4;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUseIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickUps(){
        return numOfPickups;
    }

    void setNumOfPickUps(int num){
        numOfPickups = num;
    }

    boolean getRockStarUseIt(){
        return rockStarUseIt;
    }

    void setRockStarUseIt(boolean yesOrNO){
        rockStarUseIt = yesOrNO;
    }
}

package exercicioscap2.streamingsong;

public class StreamingSong {
    String title;
    String artist;
    double duration;

    void play(){
        System.out.println("Playing song...");
    }

    void printDetails(){
        System.out.println("This is " + title + "by " + artist + ", duration: " + duration);
    }
}

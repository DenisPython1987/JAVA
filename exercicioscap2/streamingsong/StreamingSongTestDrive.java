package exercicioscap2.streamingsong;

public class StreamingSongTestDrive {
    public static void main(String[] args){
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come together";
        song.duration = 4.18;
        song.play();
        song.printDetails();

    }
}

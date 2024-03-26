package structuralpatterns.bridge.format;

public class MP3 implements  MusicFormat{
    @Override
    public void muzikCal(String musicName) {
        System.out.println("Music is playing with MP3 format " + musicName);
    }
}

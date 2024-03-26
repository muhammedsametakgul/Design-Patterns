package structuralpatterns.bridge.format;

public class Wav implements MusicFormat{
    @Override
    public void muzikCal(String musicName) {
        System.out.println("Music is playing  with Wav format " + musicName);
    }
}

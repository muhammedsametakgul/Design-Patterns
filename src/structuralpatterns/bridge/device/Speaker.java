package structuralpatterns.bridge.device;

public class Speaker implements MusicDevice {
    @Override
    public void playMusic(String musicName) {
        System.out.println("Speaker is playing the " + musicName);
    }
}

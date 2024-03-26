package structuralpatterns.bridge.device;

public class Headphone implements MusicDevice {
    @Override
    public void playMusic(String musicName) {
        System.out.println("Headphone is playing the " +musicName);
    }
}

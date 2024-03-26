package structuralpatterns.bridge;

import structuralpatterns.bridge.device.Headphone;
import structuralpatterns.bridge.device.Speaker;

public class Main {
    public static void main(String[] args) {

        MusicPlayer speaker = new MusicPlayer(new Speaker());
        speaker.playTheMusic("music.mp3");

        MusicPlayer headPhone = new MusicPlayer(new Headphone());
        headPhone.playTheMusic("music.wav");
    }
}

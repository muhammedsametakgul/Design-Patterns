package structuralpatterns.bridge;

import structuralpatterns.bridge.device.MusicDevice;

public class MusicPlayer {

    private MusicDevice musicDevice;

    public MusicPlayer(MusicDevice musicDevice){
        this.musicDevice=musicDevice;
    }

    public void playTheMusic(String musicName){
        musicDevice.playMusic(musicName);
    }

}

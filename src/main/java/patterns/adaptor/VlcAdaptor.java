package patterns.adaptor;

public class VlcAdaptor implements MediaPlayer {

    private VlcPlayer vlcPlayer;

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
            vlcPlayer.play(fileName);
        }
    }
}

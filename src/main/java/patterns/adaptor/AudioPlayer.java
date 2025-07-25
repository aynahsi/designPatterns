package patterns.adaptor;


//client
public class AudioPlayer {
    private MediaPlayer mediaPlayer =  new VlcAdaptor();

    public void play(String AudioType , String fileName) {
        mediaPlayer.play(AudioType, fileName);
    }
}

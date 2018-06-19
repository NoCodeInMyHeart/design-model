package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vcl", "far far away.vcl");
        audioPlayer.play("avi", "mind me.avi");
    }
}

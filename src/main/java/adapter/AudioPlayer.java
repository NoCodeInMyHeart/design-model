package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    public void play(String audioType, String filename) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase(AudioTypeEnum.mp3.getAudioType())){
            System.out.println("Playing mp3 file. Name: "+ filename);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(AudioTypeEnum.vcl.getAudioType().equalsIgnoreCase(audioType)
                || AudioTypeEnum.mp4.getAudioType().equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}

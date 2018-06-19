package adapter;

 /**
  * 适配器类
  * @author: meng.yang
  * @date: 2018-6-19 14:14
  */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(AudioTypeEnum.vcl.getAudioType().equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VclPlayer();
        } else if (AudioTypeEnum.mp4.getAudioType().equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String filename) {
        if(AudioTypeEnum.vcl.getAudioType().equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVcl(filename);
        }else if(AudioTypeEnum.mp4.getAudioType().equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}

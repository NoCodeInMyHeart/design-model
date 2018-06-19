package adapter;

 /** 
  * 
  * @author: meng.yang
  * @date: 2018-6-19 15:03
  */
public enum AudioTypeEnum {
    /**
     * 播放格式
     */
    mp3("mp3"),
    vcl("vcl"),
    mp4("mp4");

    private String audioType;
    AudioTypeEnum(String audioType){
        this.audioType = audioType;
    }
    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }
}

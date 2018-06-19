package adapter;

 /**
  * 播放器接口,只能播放map3格式的文件
  * @author: meng.yang
  * @date: 2018-6-19 14:02
  */
public interface MediaPlayer {
     /**
      * 播放接口
      * @param audioType
      * @param filename
      */
    void play(String audioType, String filename);
}

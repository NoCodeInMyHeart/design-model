package adapter;

 /**
  * 更高级的播放器，可以播放vcl和mp4格式的文件
  * @author: meng.yang
  * @date: 2018-6-19 14:04
  */
public interface AdvancedMediaPlayer {
     /**
      * 播放vcl格式文件接口
      * @param filename
      */
    void playVcl(String filename);

     /**
      * 播放mp4格式文件接口
      * @param filename
      */
    void playMp4(String filename);
}

package adapter;

 /** 
  * 
  * @author: meng.yang
  * @date: 2018-6-19 14:11
  */
public class Mp4Player implements AdvancedMediaPlayer{
    public void playVcl(String filename) {
        
    }

    public void playMp4(String filename) {
        System.out.println("播放mp4格式文件" + filename);
    }
}

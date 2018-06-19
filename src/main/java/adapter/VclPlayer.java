package adapter;

 /** 
  * 
  * @author: meng.yang
  * @date: 2018-6-19 14:08
  */
public class VclPlayer implements AdvancedMediaPlayer{
     public void playVcl(String filename) {
         System.out.println("播放vcl格式文件" + filename);
     }

     public void playMp4(String filename) {

     }
 }

package proxy;

import sun.misc.ProxyGenerator;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class TestGeneratorProxy {
    public static void main(String[] args) {
        byte[] classFile = ProxyGenerator.generateProxyClass("TestProxyGen", HouseHolder.class.getInterfaces());
        File file = new File("D:/TestProxyGen.class");
        try (FileOutputStream fos = new FileOutputStream(file)){
            fos.write(classFile);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package command;

/**
 * @author meng.yang
 */
public class Commander {
    Pm pm;

    Commander(Pm pm){
        this.pm = pm;
    }

    void action(){
        pm.exec();
    }
}

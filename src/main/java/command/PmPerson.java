package command;

/**
 * @author meng.yang
 * pass message person
 */
public class PmPerson implements Pm{

    Soldier soldier;
    PmPerson(Soldier soldier){
        this.soldier = soldier;
    }
    @Override
   public void exec(){
        soldier.action();
    }
}

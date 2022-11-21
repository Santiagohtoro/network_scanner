package ScanerRedes.Options;

import ScanerRedes.ConsoleMenu.MenuOption;
import ScanerRedes.Objects.Host;
import ScanerRedes.initialize.InitializeObjects;
import ScanerRedes.motor.CheckCommand;

import java.util.Objects;

public class OptionTestHost extends MenuOption {
    public void Objects(Object[] obj){
        for(Object object: obj){
            System.out.println(object);
        }
    }
    @Override
    public void execute() {
        CheckCommand checkCommand = new CheckCommand();
        Object[] list = InitializeObjects.getHost().toArray();
        Objects(list);

        int retry = checkCommand.Launch("127.0.0.1");
        switch (retry){
            case 0:
                System.out.println("estado: OK");
            break;
            case 1:
                System.out.println("estado: WARNING");
            break;
            case 2:
                System.out.println("estado: CRITICAL");
            break;
            case 3:
                System.out.println("estado: UNKNOWN");
            break;
        }
    }
    @Override
    public String toString(){
        return "Monitorear";
    }
}

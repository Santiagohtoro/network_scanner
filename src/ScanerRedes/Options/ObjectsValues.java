package ScanerRedes.Options;

import ScanerRedes.ConsoleMenu.MenuOption;
import ScanerRedes.Objects.Command;
import ScanerRedes.initialize.InitializeObjects;

public class ObjectsValues extends MenuOption {
    public void Objects(Object[] obj){
        for(Object object: obj){
            System.out.println(object);
        }
    }
    @Override
    public void execute() {
        Object[] list = InitializeObjects.getCommands().toArray();
        Objects(list);
    }

    @Override
    public String toString(){
        return "Ver objetos registrados";
    }
}

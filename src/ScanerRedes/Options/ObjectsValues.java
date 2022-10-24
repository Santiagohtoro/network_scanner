package ScanerRedes.Options;

import ScanerRedes.ConsoleMenu.ConsoleMenu;
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
        System.out.println("----------------------Objetos Registrados-----------------");
        Object[] list = InitializeObjects.getCommands().toArray();
        Objects(list);
        list = InitializeObjects.getContact().toArray();
        Objects(list);
        list = InitializeObjects.getService().toArray();
        Objects(list);
        list = InitializeObjects.getHost().toArray();
        Objects(list);

        list = InitializeObjects.getContactGroupList().toArray();
        Objects(list);
        list = InitializeObjects.getServiceGroupList().toArray();
        Objects(list);
        list = InitializeObjects.getHostGroupList().toArray();
        Objects(list);
        list = InitializeObjects.getTimePeriod().toArray();
        Objects(list);

    }

    @Override
    public String toString(){
        return "Ver objetos registrados";
    }
}

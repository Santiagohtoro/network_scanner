package ScanerRedes;

import ScanerRedes.ConsoleMenu.ConsoleMenu;
import ScanerRedes.Options.ObjectsValues;
import ScanerRedes.Options.Exit;
import ScanerRedes.initialize.InitializeObjects;

public class Main {
    public static void main(String[] args) {
        InitializeObjects.startInitializeObject();
        ConsoleMenu menu = new ConsoleMenu();

        menu.addOption(new ObjectsValues());
        menu.addOption(new Exit());
        menu.runMenu();

    }
}

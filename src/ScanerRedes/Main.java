package ScanerRedes;

import ScanerRedes.ConsoleMenu.ConsoleMenu;
import ScanerRedes.Options.AOption;
import ScanerRedes.Options.BOption;
import ScanerRedes.Options.Exit;

public class Main {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu();

        menu.addOption(new AOption());
        menu.addOption(new BOption());
        menu.addOption(new Exit());
        menu.runMenu();

    }
}

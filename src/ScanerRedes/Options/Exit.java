package ScanerRedes.Options;

import ScanerRedes.ConsoleMenu.MenuOption;

public class Exit extends MenuOption {
    @Override
    public void execute() {
        System.out.println("leaving...");
        System.exit(1);
    }

    @Override
    public String toString(){
        return "Exit";
    }
}

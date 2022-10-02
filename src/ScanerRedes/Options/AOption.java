package ScanerRedes.Options;

public class AOption extends MenuOption {

    @Override
    public void execute() {
        System.out.println("You are currently in option A");
    }

    @Override
    public String toString(){
        return "Option A";
    }
}

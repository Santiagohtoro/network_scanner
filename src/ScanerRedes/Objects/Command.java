package ScanerRedes.Objects;

/*Referencian a una utilidad externa (comando, archivo ejecutable) que debe
ejecutarse como comando de monitoreo de hosts, servicios o comando de notificación a
contactos. Los comandos deben definirse con la siguiente lista de atributos mínimos.
▪ Name
▪ Command line*/
public class Command{
    private String name;
    private String commandLine;

    public Command(String name, String commandLine) {
        this.name = name;
        this.commandLine = commandLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    @Override
    public String toString() {
        return "Type: Comando, Name: " + name + ", Command Line: "+ commandLine;
    }
}

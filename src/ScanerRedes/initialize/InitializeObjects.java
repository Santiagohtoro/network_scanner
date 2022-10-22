package ScanerRedes.initialize;

import ScanerRedes.Objects.Command;
import ScanerRedes.Objects.Contact;
import ScanerRedes.Objects.Group;

import java.util.ArrayList;

public class InitializeObjects {

    private static ArrayList <String> command=new ArrayList<>();
    private static ArrayList<String>Contact=new ArrayList<>();
    private static ArrayList<String>Group=new ArrayList<>();
    private static ArrayList<String>Host=new ArrayList<>();
    private static ArrayList<String>Monitor=new ArrayList<>();
    private static ArrayList<String>Service=new ArrayList<>();
    private static ArrayList<String>timePeriod=new ArrayList<>();

    public static void defectObjects(){
        Command notifyByEmail = new Command("notify-by-email", "C:\\NagiosClone\\Comandos\\sendemail.exe");
        Command checkHostAlive = new Command("check-host-alive", "C:\\NagiosClone\\Comandos\\checkping.exe");
        Group defaultContactsGroup = new Group("admins", "Grupo de administradores");
        Group defaultHostsGroup = new Group("default-hosts-group", "Grupo por defecto de hosts");
        Group defaultServicesGroup = new Group("default-services-group", "Grupo por defecto de servicios");

    }




}



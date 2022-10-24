package ScanerRedes.initialize;import ScanerRedes.Objects.*;import java.util.ArrayList;import java.util.HashMap;public class InitializeObjects {    //declaracion de las variables que almacenaran los datos por defecto segun su tipo de dato    private static Command notifyByEmail;    private static Command checkHostAlive;    private static Group contactGroup;    private static Group hostDefaultGroup;    private static Group serviceDefaultGroup;    private static Contact adminContact;    private static Host localHost;    private static TimePeriod timePeriod;//Definicion de arreglos que almacenaran los datos inicializados    private static ArrayList<Command> commands=new ArrayList();    private static ArrayList<Contact> contactList = new ArrayList();    private static ArrayList<Host> hostList = new ArrayList();    private static ArrayList<Service> serviceList = new ArrayList();    private static ArrayList<TimePeriod> timePeriods = new ArrayList();    private static ArrayList<Group> contactGroupList = new ArrayList();    private static ArrayList<Group> serviceGroupList = new ArrayList();    private static ArrayList<Group> hostGroupList = new ArrayList();//metodos de agregacion de elementos a los arreglos    private static void addCommand(Command command){        commands.add(command);    }    private static void addContact(Contact contact){        contactList.add(contact);    }    private static void addHost(Host host){        hostList.add(host);    }    private static void addService(Service service){        serviceList.add(service);    }    private static void addTimePeriod(TimePeriod timePeriod){ timePeriods.add(timePeriod);}    private static void addContactGroupList(Group contactGrouplist){        contactGroupList.add(contactGrouplist);    }    private static void addHostGroupList(Group hostGrouplist){        hostGroupList.add(hostGrouplist);    }    private static void addServiceGroupList(Group serviceGrouplist){        serviceGroupList.add(serviceGrouplist);    }//retornar los elementos almacenados en los arreglos    public static ArrayList<Command> getCommands(){        return commands;    }    public static ArrayList<Contact> getContact(){        return contactList;    }    public static ArrayList<Host> getHost(){        return hostList;    }    public static ArrayList<Service> getService(){        return serviceList;    }    public static ArrayList<TimePeriod> getTimePeriod(){        return timePeriods;    }    public static ArrayList<Group> getContactGroupList() {        return contactGroupList;    }    public static ArrayList<Group> getHostGroupList() {        return hostGroupList;    }    public static ArrayList<Group> getServiceGroupList() {        return serviceGroupList;    }    //implementando los metodos add para almacenar los datos segun el metodo correspondiete de cada variable    private static void addObject(){        addCommand(notifyByEmail);        addCommand(checkHostAlive);        addContact(adminContact);        addContactGroupList(contactGroup);        addHostGroupList(hostDefaultGroup);        addServiceGroupList(serviceDefaultGroup);        addTimePeriod(timePeriod);    }    //inicializacion de variables- asignacion de valores segun cada constructor    public static void startInitializeObject(){        notifyByEmail = new Command("notify-by-email","C:\\NagiosClone\\Comandos\\sendemail.exe");        checkHostAlive = new Command("check-host-alive","C:\\NagiosClone\\Comandos\\checkping.exe");        contactGroup= new Group("admins","Grupo por defecto de hosts");        hostDefaultGroup = new Group("default-hosts-group","Grupo por defecto de hosts");        serviceDefaultGroup = new Group("default-services-group", "Grupo por defecto de servicios");        adminContact=new Contact("admin",true,notifyByEmail,"admin@localhost",null);        contactGroup.addMember(adminContact);        HashMap<String,String[]> init= new HashMap();        String[] timeValue=new String[]{"00:00-23:59","00:00-23:59"};        init.put("Monday: ",timeValue);        init.put("Tuesday: ",timeValue);        init.put("Wednesday: ",timeValue);        init.put("Thursday: ", timeValue);        init.put("Friday: ",timeValue);        init.put("Saturday: ",timeValue);        init.put("Sunday: ",timeValue);        timePeriod = new TimePeriod("7x24", init);        addObject();    }}
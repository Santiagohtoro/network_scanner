package ScanerRedes.Objects;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/*Contactos: personas a las que el sistema de monitoreo notifica. Los contactos deben quedar
definidos por los siguientes atributos mínimos.
▪ Name
▪ Contact groups
▪ Notifications enabled
▪ Notification command
▪ Email
▪ Mobile number*/
public class Contact{
    private String name;
    private ArrayList<Group> contactGroup;
    private Boolean notificationsEnabled;
    private Command notificationsCommand;
    private String email;
    private String mobileNumber;

    public Contact(String name, Boolean notificationsEnabled, Command notificationsCommand, String email, String mobileNumber) {
        this.name = name;
        this.notificationsEnabled = notificationsEnabled;
        this.notificationsCommand = notificationsCommand;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.contactGroup = new ArrayList();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Group> getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(ArrayList<Group> contactGroup) {
        this.contactGroup = contactGroup;
    }

    public Boolean getNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public Command getNotificationsCommand() {
        return notificationsCommand;
    }

    public void setNotificationsCommand(Command notificationsCommand) {
        this.notificationsCommand = notificationsCommand;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGroup (Group group){
        this.contactGroup.add(group);
    }
    @Override
    public String toString() {
        String[] groups = new String[contactGroup.size()];

        int i = 0;

        for(Group group : contactGroup ){
            groups[i]= group.getName();
            i++;
        }
        return "Type: Contact, name: "+this.name+", notification enabled: "+this.notificationsEnabled+", notification command: "+this.notificationsCommand+", Email: "+ this.email+", mobile number: "+this.mobileNumber+", Contact groups: "+ Arrays.toString((Object[]) groups);
    }
}

package ScanerRedes.Objects;


import java.util.ArrayList;
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
    private Set<Group> contactGroup;
    private Boolean notificationsEnabled;
    private Command notificationsCommand;
    private String email;
    private String mobileNumber;

    public Contact(String name, Set<Group> contactGroup, Boolean notificationsEnabled, Command notificationsCommand, String email, String mobileNumber) {
        this.name = name;
        this.contactGroup = contactGroup;
        this.notificationsEnabled = notificationsEnabled;
        this.notificationsCommand = notificationsCommand;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Group> getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(Set<Group> contactGroup) {
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

    public void setGroup(Group group){
        contactGroup.add(group);
    }

    @Override
    public String toString() {

        return  "Contact{" +
                "name='" + name + '\'' +
                ", contactGroup=" + contactGroup +
                ", notificationsEnabled=" + notificationsEnabled +
                ", notificationsCommand=" + notificationsCommand +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}

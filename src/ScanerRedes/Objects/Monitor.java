package ScanerRedes.Objects;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Monitor {
    private String hostName;
    private String displayName;
    private Command checkCommand;
    private int maxCheckAttemps;
    private int checkInterval;
    private int retryInterval;
    private TimePeriod checkPeriod;
    private TimePeriod notificationPeriod;
    private String notificationOptions;
    private String parents;
    private ArrayList<Contact> contact;
    private ArrayList<Group> contactGroup;



    public Monitor(String hostName, Command checkCommand, int retryInterval, int checkInterval, int maxCheckAttemps, TimePeriod checkPeriod, TimePeriod notificationPeriod) {
        this.hostName = hostName;
        this.checkCommand = checkCommand;
        this.retryInterval = retryInterval;
        this.checkInterval = checkInterval;
        this.maxCheckAttemps = maxCheckAttemps;
        this.checkPeriod = checkPeriod;
        this.notificationPeriod = notificationPeriod;
        this.contact = new ArrayList();
        this.contactGroup = new ArrayList();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Command getCheckCommand() {
        return checkCommand;
    }

    public void setCheckCommand(Command checkCommand) {
        this.checkCommand = checkCommand;
    }

    public int getMaxCheckAttemps() {
        return maxCheckAttemps;
    }

    public void setMaxCheckAttemps(int maxCheckAttemps) {
        this.maxCheckAttemps = maxCheckAttemps;
    }

    public int getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(int checkInterval) {
        this.checkInterval = checkInterval;
    }

    public int getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public TimePeriod getCheckPeriod() {
        return checkPeriod;
    }

    public void setCheckPeriod(TimePeriod checkPeriod) {
        this.checkPeriod = checkPeriod;
    }

    public TimePeriod getNotificationPeriod() {
        return notificationPeriod;
    }

    public void setNotificationPeriod(TimePeriod notificationPeriod) {
        this.notificationPeriod = notificationPeriod;
    }

    public String getNotificationOptions() {
        return notificationOptions;
    }

    public void setNotificationOptions(String notificationOptions) {
        this.notificationOptions = notificationOptions;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public ArrayList<Group> getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(ArrayList<Group> contactGroup) {
        this.contactGroup = contactGroup;
    }

    @Override
    public String toString() {
        return  "Type: Monitor, host name: "+hostName +", diplay name: "+displayName+ ", check command: "+checkCommand.getName()+", max check attemps: "+maxCheckAttemps+", check interval"+checkInterval+", retry interval: "+retryInterval+", check period: "+checkPeriod.getName()+", notification period: "+notificationPeriod.getName()+ ", notification options"+notificationOptions+", contacts: "+contact+", Contacts Group "+contactGroup;

    }
}

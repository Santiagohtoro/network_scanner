package ScanerRedes.Objects;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Monitor extends Command {
    private String hostName;
    private String displayName;
    private Command checkCommand;
    private int maxCheckAttemps;
    private int checkInterval;
    private int retryInterval;
    private TimePeriod checkPeriod;
    private TimePeriod notificationPeriod;
    private Set<Object> notificationOptions;
    private Set<Object> parents;
    private Set<Contact> contact;
    private Set<Group> contactGroup;

    public Monitor(String name, String commandLine, String hostName, String displayName, Command checkCommand, int maxCheckAttemps, int checkInterval, int retryInterval, TimePeriod checkPeriod, TimePeriod notificationPeriod, Set<Object> notificationOptions, Set<Object> parents, Set<Contact> contact, Set<Group> contactGroup) {
        super(name, commandLine);
        this.hostName = hostName;
        this.displayName = displayName;
        this.checkCommand = checkCommand;
        this.maxCheckAttemps = maxCheckAttemps;
        this.checkInterval = checkInterval;
        this.retryInterval = retryInterval;
        this.checkPeriod = checkPeriod;
        this.notificationPeriod = notificationPeriod;
        this.notificationOptions = notificationOptions;
        this.parents = parents;
        this.contact = contact;
        this.contactGroup = contactGroup;
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

    public Set<Object> getNotificationOptions() {
        return notificationOptions;
    }

    public void setNotificationOptions(Set<Object> notificationOptions) {
        this.notificationOptions = notificationOptions;
    }

    public Set<Object> getParents() {
        return parents;
    }

    public void setParents(Set<Object> parents) {
        this.parents = parents;
    }

    public Set<Contact> getContact() {
        return contact;
    }

    public void setContact(Set<Contact> contact) {
        this.contact = contact;
    }

    public Set<Group> getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(Set<Group> contactGroup) {
        this.contactGroup = contactGroup;
    }
}

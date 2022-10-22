package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Set;

public class Host extends Monitor{
    private String address;
    private Set<Group> hostGroup;

    public Host(String name, String commandLine, String hostName, String displayName, Command checkCommand, int maxCheckAttemps, int checkInterval, int retryInterval, TimePeriod checkPeriod, TimePeriod notificationPeriod, Set<Object> notificationOptions, Set<Object> parents, Set<Contact> contact, Set<Group> contactGroup, String address, Set<Group> hostGroup) {
        super(name, commandLine, hostName, displayName, checkCommand, maxCheckAttemps, checkInterval, retryInterval, checkPeriod, notificationPeriod, notificationOptions, parents, contact, contactGroup);
        this.address = address;
        this.hostGroup = hostGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Group> getHostGroup() {
        return hostGroup;
    }

    public void setHostGroup(Set<Group> hostGroup) {
        this.hostGroup = hostGroup;
    }

    public void setGroup(Group group){
        hostGroup.add(group);
    }
}


package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Host extends Monitor{
    private String address;
    private ArrayList<Group> hostGroup;

    public Host(String name, String commandLine, String hostName, String displayName, Command checkCommand, int maxCheckAttemps, int checkInterval, int retryInterval, TimePeriod checkPeriod, TimePeriod notificationPeriod, ArrayList<Object> notificationOptions, ArrayList<Object> parents, ArrayList<Contact> contact, ArrayList<Group> contactGroup, String address, ArrayList<Group> hostGroup) {
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

    public ArrayList<Group> getHostGroup() {
        return hostGroup;
    }

    public void setHostGroup(ArrayList<Group> hostGroup) {
        this.hostGroup = hostGroup;
    }

    @Override
    public String toString() {
        int i = 0;
        String[] hostGroup = new String[this.hostGroup.size()];
        for (Group group: this.hostGroup) {
            hostGroup[i]=group.getName();
            System.out.println(hostGroup[i]);
            i++;
        }
        return super.toString()+", Host groups"+ Arrays.toString((Object[])hostGroup)+", Address "+ this.address;
    }

}


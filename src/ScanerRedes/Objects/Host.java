package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Host extends Monitor{
    private String address;
    private ArrayList<Group> hostGroup;

    public Host(String hostName, Command checkCommand, int retryInterval, int checkInterval, int maxCheckAttemps, TimePeriod checkPeriod, TimePeriod notificationPeriod, String address) {
        super(hostName, checkCommand, retryInterval, checkInterval, maxCheckAttemps, checkPeriod, notificationPeriod);
        this.address = address;
        this.hostGroup = new ArrayList<>();
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

    public void setGroup (Group group){
        this.hostGroup.add(group);
    }
    @Override
    public String toString() {
        int i = 0;
        String[] hostGroup = new String[this.hostGroup.size()];
        for (Group group: this.hostGroup) {
            hostGroup[i]=group.getName();

            i++;
        }
        return super.toString()+", Host groups"+ Arrays.toString((Object[])hostGroup)+", Address "+ address;
    }

}


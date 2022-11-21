package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Service extends Monitor{
    private ArrayList<Group> serviceGroups;
    private String serviceDescription;

    public Service(String hostName, Command checkCommand, int retryInterval, int checkInterval, int maxCheckAttemps, TimePeriod checkPeriod, TimePeriod notificationPeriod, ArrayList<Group> serviceGroups, String serviceDescription) {
        super(hostName, checkCommand, retryInterval, checkInterval, maxCheckAttemps, checkPeriod, notificationPeriod);
        this.serviceGroups = serviceGroups;
        this.serviceDescription = serviceDescription;
    }



    public ArrayList<Group> getServiceGroups() {
        return serviceGroups;
    }

    public void setServiceGroups(ArrayList<Group> serviceGroups) {
        this.serviceGroups = serviceGroups;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setGroup (Group group){
        this.serviceGroups.add(group);
    }
    @Override
    public String toString() {
        int i=0;
        String[] serviceGroup = new String[serviceGroups.size()];


        for (Group group:serviceGroups){
            serviceGroup[i]=group.getName();
            i++;
        }
        return "Descripcion: "+serviceDescription+", Service groups "+Arrays.toString((Object[])serviceGroup);



    }
}

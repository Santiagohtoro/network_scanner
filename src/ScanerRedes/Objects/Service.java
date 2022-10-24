package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Service extends Monitor{
    private Long id;
    private ArrayList<Group> serviceGroups;
    private String serviceDescription;

    public Service(String name, String commandLine, String hostName, String displayName, Command checkCommand, int maxCheckAttemps, int checkInterval, int retryInterval, TimePeriod checkPeriod, TimePeriod notificationPeriod, ArrayList<Object> notificationOptions, ArrayList<Object> parents, ArrayList<Contact> contact, ArrayList<Group> contactGroup, Long id, ArrayList<Group> serviceGroups, String serviceDescription) {
        super(name, commandLine, hostName, displayName, checkCommand, maxCheckAttemps, checkInterval, retryInterval, checkPeriod, notificationPeriod, notificationOptions, parents, contact, contactGroup);
        this.id = id;
        this.serviceGroups = serviceGroups;
        this.serviceDescription = serviceDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        int i=0;
        String[] serviceGroup = new String[serviceGroups.size()];
        System.out.println(serviceGroup);

        for (Group group:serviceGroups){
            serviceGroup[i]=group.getName();
            i++;
        }
        return "Descripcion: "+serviceDescription+", Service groups "+Arrays.toString((Object[])serviceGroup);


                /*"Service{" +
                "id=" + id +
                ", serviceGroups=" + serviceGroups +
                ", serviceDescription='" + serviceDescription + '\'' +
                '}';*/
    }
}

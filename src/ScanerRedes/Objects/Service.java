package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.Set;

public class Service extends Monitor{
    private Long id;
    private Set<Group> serviceGroups;
    private String serviceDescription;

    public Service(String name, String commandLine, String hostName, String displayName, Command checkCommand, int maxCheckAttemps, int checkInterval, int retryInterval, TimePeriod checkPeriod, TimePeriod notificationPeriod, Set<Object> notificationOptions, Set<Object> parents, Set<Contact> contact, Set<Group> contactGroup, Long id, Set<Group> serviceGroups, String serviceDescription) {
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

    public Set<Group> getServiceGroups() {
        return serviceGroups;
    }

    public void setServiceGroups(Set<Group> serviceGroups) {
        this.serviceGroups = serviceGroups;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setGroup(Group group){
        serviceGroups.add(group);
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceGroups=" + serviceGroups +
                ", serviceDescription='" + serviceDescription + '\'' +
                '}';
    }
}

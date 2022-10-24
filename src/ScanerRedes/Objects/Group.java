package ScanerRedes.Objects;


import java.util.*;

public class Group {
    private String name;
    private String displayName;
    private ArrayList<Object> members;

    public Group(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
        this.members = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

   /* public Object[] getMembers() {
        Object[] listMember = members.toArray();
        return listMember;
    }

    public void setMembers(ArrayList<Object> members) {
        this.members = members;
    }*/

    public void addMember(Object object){
        members.add(object) ;
        if(object instanceof Host){
            Host host =(Host)object ;
            host.setGroup(this);
        }
        if(object instanceof Service){
            Service service =(Service)object ;
            service.setGroup(this);
        }
        if(object instanceof Contact){
            Contact contact =(Contact)object ;
            contact.setGroup(this);
        }
    }
    @Override
    public String toString() {
        String[] Members= new String[members.size()];
        int i = 0;
        for (Object member: members) {
            if(member instanceof Contact){
                Contact contact = (Contact) member;
                Members[i]=contact.getName();
            }
            if(member instanceof Host){
                Host host = (Host) member;
                Members[i]=host.getHostName();
            }
            if(member instanceof Service){
                Service service = (Service) member;
                Members[i]=service.getDisplayName();
            }
        }
        return "Type: Groups, name: "+this.name+ ", members"+ Arrays.toString((Object[])Members);
    }
}

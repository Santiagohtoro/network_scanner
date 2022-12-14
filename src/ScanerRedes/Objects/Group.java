package ScanerRedes.Objects;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Group {
    private String name;
    private String displayName;
    private Set<Object> members;

    public Group(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
        this.members = members;
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

    public Set<Object> getMembers() {
        return members;
    }



    public void addMember(Set<Object> member){
        this.members.add(member);
        if (member instanceof Contact contact) {
            contact.setGroup(this);
        }

        if (member instanceof Host host) {
            host.setGroup(this);
        }

        if (member instanceof Service service) {
            service.setGroup(this);
        }
    }
}

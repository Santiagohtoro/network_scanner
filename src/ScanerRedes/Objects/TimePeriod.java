package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TimePeriod{
    private String name;
    private HashMap<String,Integer> definition;

    public TimePeriod(String name, HashMap<String, Integer> definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getDefinition() {
        return definition;
    }

    public void setDefinition(HashMap<String, Integer> definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "TimePeriod{" +
                "name='" + name + '\'' +
                ", definition=" + definition +
                '}';
    }
}

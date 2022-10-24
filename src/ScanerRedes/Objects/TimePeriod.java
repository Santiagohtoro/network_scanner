package ScanerRedes.Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TimePeriod{
    private String name;
    private HashMap<String,String[]> definition;

    public TimePeriod(String name, HashMap<String, String[]> definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String[]> getDefinition() {
        return definition;
    }

    public void setDefinition(HashMap<String, String[]> definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        String DefinitionValue = "";

        for(String Value: definition.keySet()){
            DefinitionValue += Value+ definition.get(Value)[0]+", "+ definition.get(Value)[1]+"\n";
        }
        return "Type: TimePeriod, name: "+ name +", definition : \n"+DefinitionValue;

    }
}

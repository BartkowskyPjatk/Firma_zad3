import java.util.ArrayList;

public class Developer extends Employee{

public ArrayList<Technology> knownTechnologies = new ArrayList<>();
    public Developer(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear) {
        super(fName, lName, adress, email, socialSecurityNr, firstWorkYear);

    }
    public void addTechnology(Technology tech) {
        this.knownTechnologies.add(tech);
    }
 }

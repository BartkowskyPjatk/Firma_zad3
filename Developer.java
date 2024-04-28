public class Developer extends Employee{

private ArrayList<Technology> knownTechnologies;

public Developer(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear,ArrayList<Technology> knownTechnologies) {
    this.fName = fName;
    this.lName = lName;
    this.adress = adress;
    this.email = email;
    this.socialSecurityNr = socialSecurityNr;
    this.firstWorkYear = firstWorkYear;
    this.knownTechnologies = knownTechnologies;
 }
 public static void addTechnology(Technology tech){
     knownTechnologies.add(tech);
 }
}

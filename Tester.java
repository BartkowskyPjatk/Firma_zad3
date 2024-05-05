import java.util.ArrayList;

public class Tester extends Employee{
    public ArrayList<String> knownTests = new ArrayList<>();

    public Tester(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear) {
        super(fName, lName, adress, email, socialSecurityNr, firstWorkYear);
    }
    public void addTestType(String test){
        this.knownTests.add(test);
    }
}

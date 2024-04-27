public class Tester extends Employee{
    private ArrayList<Test> knownTests;

    public Tester(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear,ArrayList<Test> knownTests) {
        this.fName = fName;
        this.lName = lName;
        this.adress = adress;
        this.email = email;
        this.socialSecurityNr = socialSecurityNr;
        this.firstWorkYear = firstWorkYear;
        this.knownTests = knownTests;
    }
}

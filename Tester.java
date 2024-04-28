public class Tester extends Employee{
    private ArrayList<String> knownTests;

    public Tester(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear,ArrayList<String> knownTests) {
        this.fName = fName;
        this.lName = lName;
        this.adress = adress;
        this.email = email;
        this.socialSecurityNr = socialSecurityNr;
        this.firstWorkYear = firstWorkYear;
        this.knownTests = knownTests;
    }
    public static void addTestType(String test){
        knownTests.add(test);
    }
}

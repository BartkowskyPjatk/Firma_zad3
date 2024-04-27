public class Manager extends Employee{
    private ArrayList<Goal> goalList;

    public Developer(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear,ArrayList<Goal> goalList) {
        this.fName = fName;
        this.lName = lName;
        this.adress = adress;
        this.email = email;
        this.socialSecurityNr = socialSecurityNr;
        this.firstWorkYear = firstWorkYear;
        this.goalList = goalList;
    }
}

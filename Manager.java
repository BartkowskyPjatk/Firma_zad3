import java.util.ArrayList;

public class Manager extends Employee{
    public ArrayList<Goal> goalList = new ArrayList<>();

    public Manager(String fName, String lName, String adress, String email, String socialSecurityNr, int firstWorkYear) {
        super(fName, lName, adress, email, socialSecurityNr, firstWorkYear);
    }

    public void addGoals(Goal goal){
        this.goalList.add(goal);
    }
}

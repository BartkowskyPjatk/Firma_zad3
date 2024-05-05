import java.time.Year;
import java.util.Calendar;

public class Employee {
    private String fName, lName, adress, email, socialSecurityNr;
    private int firstWorkYear;
    public int basicSalary = 3000;


    public Employee(String fName, String lName, String address, String email, String socialSecurityNr, int firstWorkYear) {
        this.fName = fName;
        this.lName = lName;
        this.adress = address;
        this.email = email;
        this.socialSecurityNr = socialSecurityNr;
        this.firstWorkYear = firstWorkYear;
    }
    public int calculateSalary(){
        int salary = basicSalary;
        int year = Calendar. getInstance(). get(Calendar. YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        System.out.println(year +" " + month+" " +day);
        int employedYears = year - firstWorkYear;

        for (int i = 0; i <employedYears; i++) {
            salary += i;
        }
        if(this instanceof Developer){
            Developer dev = (Developer) this;
            for (Technology tech : dev.knownTechnologies){
                salary =+ tech.technologyBonus;
            }
        } else if (this instanceof Tester) {
            Tester tes = (Tester) this;
            for (int i = 0 ; i <=tes.knownTests.size() ; i++) {
                salary =+ 300;
            }
        }
        else if (this instanceof Manager){
            Manager mana = (Manager) this;
            for (Goal g : mana.goalList){
                if (g.realizationYear <= year){
                if (g.realizationYear <= month){
                if (g.realizationYear <= day) {
                    salary += g.goalBonus;
                }}}
            }
        }
        return salary;
    }
}

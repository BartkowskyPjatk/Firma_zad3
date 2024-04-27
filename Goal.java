public class Goal {
    String nameOfGoal;
    int realizationDay, realizationMonth, realizationYear, goalBonus;

    public Goeal(int realizationYear, int realizationMonth, int realizationDay, String nameOfGoal, int goalBonus){
        this.realizationYear = realizationYear;
        this.realizationMonth = realizationMonth;
        this.realizationDay = realizationDay;
        this.nameOfGoal = nameOfGoal;
        this.goalBonus = goalBonus;
    }
}

package employee;

public class HR extends Employee {

    public int generalBonus;

    public int getGeneralBonus() {
        return generalBonus;
    }

    public void setGeneralBonus(int generalBonus) {
        this.generalBonus = generalBonus;
    }

    public int getSalary() {
        return getBaseSalary();
    }
}

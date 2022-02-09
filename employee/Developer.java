package employee;

public class Developer extends Employee {

        private int projectBonus;

	public Developer() {
            System.out.println("Default Emloyee Developer");
        }

        public void setprojectBonus(int projectBonus) {
            this.projectBonus = projectBonus;
        }

        public int getProjectBonus() {
            return this.projectBonus;
        }


        public int getSalary() {
            return getBaseSalary() + this.projectBonus;

        }
}

package practice7;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[0].setName("山田");
        employees[0].setSalary(20000);

        employees[1] = new Employee();
        employees[1].setName("海田");
        employees[1].setSalary(22000);

        employees[2] = new Employee();
        employees[2].setName("川田");
        employees[2].setSalary(24000);

        Material[] materials = new Material[4];
        materials[0] = new Material();
        materials[0].setName("金");
        materials[0].setCost(10000);

        materials[1] = new Material();
        materials[1].setName("銀");
        materials[1].setCost(5000);

        materials[2] = new Material();
        materials[2].setName("銅");
        materials[2].setCost(1000);

        materials[3] = new Material();
        materials[3].setName("木");
        materials[3].setCost(500);

        MedalFactory medalFactory = new MedalFactory();

        medalFactory.setEmployees(employees);
        
        for(int i = 0; i < materials.length; i++){
            Material material = materials[i];
            medalFactory.makeMedal(material);
        }

    }
}

package practice;

public class Main {
    public static void main(String[] args) {
        
        Manager[] managers = new Manager[3];
    
        managers[0] = new Manager();
        managers[0].setName("Taro Yamada");
        managers[0].setId(101);
        managers[0].setSalary(80000.0);
        managers[0].setDepartment("Sales");

        managers[1] = new Manager();
        managers[1].setName("Hanako Suzuki");
        managers[1].setId(102);
        managers[1].setSalary(90000.0);
        managers[1].setDepartment("Marketing");

        managers[2] = new Manager();
        managers[2].setName("Ichiro Tanaka");
        managers[2].setId(103);
        managers[2].setSalary(85000.0);
        managers[2].setDepartment("HR");

        for (Manager manager : managers) {
            System.out.println("Name: " + manager.getName());
            System.out.println("ID: " + manager.getId());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println("Department: " + manager.getDepartment());
            System.out.println();
        }
    }
}

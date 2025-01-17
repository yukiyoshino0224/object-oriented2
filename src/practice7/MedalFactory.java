package practice7;

public class MedalFactory {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String makeMedal(Material materials){ 

        Medal medal = new Medal();
        
        int totalSalary = 0;

        for(int i = 0; i < employees.length; i++){
            totalSalary += employees[i].getSalary();
        }
        
        if("金".equals(materials.getName())){
            medal.setName("金メダル");
            medal.setPrice(materials.getCost() + totalSalary);
        }else if("銀".equals(materials.getName())){
            medal.setName("銀メダル");
            medal.setPrice(materials.getCost());
        }else if("銅".equals(materials.getName())){
            medal.setName("銅メダル");
            medal.setPrice(materials.getCost());
        }else{
            medal.setName("不良品");
            medal.setPrice(0);
        }

        System.out.println("製品名：" + medal.getName() + " / 価格：" + medal.getPrice() + "円");
        return medal.getName(); 
    }
}

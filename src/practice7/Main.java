package practice7;

public class Main {
    public static void main(String[] args) {
		
		final int MATERIAL_COUNT = 4;

		/*
		 * 従業員作成
		 */
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("山田", 200000);
		employees[1] = new Employee("海田", 220000);
		employees[2] = new Employee("川田", 240000);

		/*
		 * 材料作成
		 */
		Material[] toyMaterial = new Material[MATERIAL_COUNT];
		toyMaterial[0] = new Material(MedalConstant.GOLD_NAME, MedalConstant.GOLD_COST);
		toyMaterial[1] = new Material(MedalConstant.SILVER_NAME, MedalConstant.SILVER_COST);
		toyMaterial[2] = new Material(MedalConstant.BRONZE_NAME, MedalConstant.BRONZE_COST);
		toyMaterial[3] = new Material(MedalConstant.WOOD_NAME, MedalConstant.WOOD_COST);
		

		/*
		 * 工場作成
		 */
		MedalFactory toyFactory = new MedalFactory(employees);

		/*
		 * 製品作成
		 */
		Medal[] medals = toyFactory.makeMedal(toyMaterial);

		/*
		 * 製品情報表示
		 */
		for (Medal medal : medals) {
			System.out.println("製品名 : " + medal.getName() + " / 価格 : " + medal.getPrice() + "円");
			
		}
	}
}

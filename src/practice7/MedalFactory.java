package practice7;

public class MedalFactory {
    private Employee[] employees;

	public MedalFactory(Employee[] employees) {
		this.employees = employees;
	}

	/**
	 * 材料からメダルを作成する.
	 * 
	 * @param materials 材料(Materialの配列)
	 * @return 出来上がったメダル(Medalの配列)
	 */
	public Medal[] makeMedal(Material[] materials) {

		// 材料の個数 = 精製されるメダルの個数
		int medalCount = materials.length;

		// 精製されたメダルを入れるための配列を材料の数分用意
		Medal[] medals = new Medal[medalCount];

		/*
		 * 材料からメダルを精製する
		 */
		for (int i = 0; i < medalCount; i++) {
			Medal medal = new Medal();

			Material material = materials[i];
			if (MedalConstant.GOLD_NAME.equals(material.getName())) {
				medal.setName(MedalConstant.GOLD_MEDAL_NAME);
				medal.setPrice(calcMedalPrice(material.getCost(), medalCount));
			} else if (MedalConstant.SILVER_NAME.equals(material.getName())) {
				medal.setName(MedalConstant.SILVER_MEDAL_NAME);
				medal.setPrice(calcMedalPrice(material.getCost(), medalCount));
			} else if (MedalConstant.BRONZE_NAME.equals(material.getName())) {
				medal.setName(MedalConstant.BRONZE_MEDAL_NAME);
				medal.setPrice(calcMedalPrice(material.getCost(), medalCount));
			} else {
				medal.setName(MedalConstant.DEFECTIVE_NAME);
				medal.setPrice(0);
			}

			medals[i] = medal;
		}
		return medals;
	}

	/*
	 * メダルの価格を求める.
	 * 
	 * メダルの価格 = 材料のコスト + (従業員の給料の合計 / 製品数) * 1.5(←利益上乗せ分、端数切り捨て)
	 */
	private int calcMedalPrice(int materialCost, int medalCount) {
		
		final double PROFIT = 1.2;
		
		// 従業員の給料の合計
		int totalSalary = getTotalSalary();

		// メダルの価格
		int medalPrice = (int)(materialCost + (totalSalary / medalCount) * PROFIT);
		
		return medalPrice;
	}

	/*
	 * 従業員の給料の合計を求める.
	 */
	private int getTotalSalary() {
		int totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

//	private int getTotalCost(Material[] toyMaterials) {
//		int totalCost = 0;
//		for (Material toyMaterial : toyMaterials) {
//			totalCost += toyMaterial.getCost();
//		}
//		return totalCost;
//	}
}

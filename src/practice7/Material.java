package practice7;

public class Material {
    private String name;
	/** コスト(原価) */
	private int cost;

	public Material() {
	}

	public Material(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", cost=" + cost + "]";
	}
}
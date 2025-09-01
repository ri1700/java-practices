package chapter03.ex04;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public int calcDiscountPrice(float percentage) {
		return price - (int)(price * percentage);
	}
	
	public void showInfo() {
		System.out.println(
			"상품이름:" + name +
			", 가격: " + price +
			", 재고량: " + countStock +
			", 판매량: " + countSold
		);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
}

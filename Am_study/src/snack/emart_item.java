package snack;

public abstract class emart_item {
	public String brand;
	public int price;
	
	public emart_item() {
		
	}
	public emart_item(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "브랜드 : " + brand +"		금액: " + price + "원"; 
	}
	
	public abstract void buy();
	
}

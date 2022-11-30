package snack;

import java.text.DecimalFormat;

public class snack extends emart_item {
	public int weight;
	
	public snack() {}
	public snack(String brand, int price, int weight) {
		super (brand, price);
		
		this.weight = weight;
	}
	
	DecimalFormat dc = new DecimalFormat("###,###,###,###");
	String ch = dc.format(price);
	
	@Override
	public void buy() {
		System.out.println(brand + " 과자를 " + ch + " 원에 구매가 완료되었습니다.");
	}
}

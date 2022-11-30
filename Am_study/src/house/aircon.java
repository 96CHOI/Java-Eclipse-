package house;

import java.text.DecimalFormat;

//extends : 확장하다 (상속시 사용)
public class aircon extends house_item{
	public int area;
	
	public aircon() {}
	public aircon(String brand, int price, int area) {
		super(brand, price);
		//super - super는 부모이다.
		this.area = area;
	}
	
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(price);
	
	public void buy() {
		System.out.println(brand + " 에어컨을 " + ch + "원에 구매가 완료되었습니다.");
	}
	
}

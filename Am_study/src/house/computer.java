package house;
//extends : 확장하다 (상속시 사용)
public class computer extends house_item{
	public String vga;
	
	public computer() {}
	
	public computer(String brand, int price, String vga) {
		super(brand, price);
		//super - super는 부모이다.
		this.vga = vga;
	}
	public void buy() {
		System.out.println("컴퓨터 - " +"["+ brand + " , " + price + "원]" + " 구매가 완료되었습니다.");
	}
	
}

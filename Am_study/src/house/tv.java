package house;

import java.text.DecimalFormat;

//extends : 확장하다 (상속시 사용)
public class tv extends house_item{
	public int inch;
	
	
	public tv() {}
	//자식 태그에서 부모를 호출할때 super(객체)를 사용
	public tv(String brand, int price, int inch) {
		super(brand, price);
		//super - super는 부모이다. super(b,p)는 부모클래스 생성자 호출
		//**무조건 super가 가장 위로!!
		//super는 자식 클래스생성자에서 가장먼저 실행될 수 있게 해야함.
		//객체 생성시 객체의 초기화 순서는 부모 -> 자식 순이기 때문에
		this.inch = inch;
		//**자식에 있는 생성자 메서드를 사용할때는 (super)가 가장 먼저 실행되는 형태로 들어가야함.
	}
	
	DecimalFormat dc = new DecimalFormat("###,###,###,###");
	String ch = dc.format(price);
	
	public void buy() {
		System.out.println(brand + " TV를 " + ch + "원에 구매가 완료되었습니다.");
	}
}

/*   클래스 변수 -> 변수 앞에 static 이 붙어있는 것.
	변수의 초기화
	변수초기화 방법
		1. 생성자메서드를 통해 초기화
			- 생성자 메서드 객체 생성시 실행
			
		2. 초기화블럭을 통한 초기화
			- 초기화 블럭은 프로그램 이 로드 된 뒤에 딱 한번 실행
		3. 명시적 초기화
	
	변수 초기화 순서
	인스턴스 변수 초기화 순서
		명시적초기화 -> 초기화 블럭 -> 생성자메서드

	클래스 변수 초기화 순서
		명시적 초기화 -> 초기화 블럭
 */



//public int ch=2; // 명시적 초기화, 직접 변수에 데이터 넣기
//public int sound;
//
//
//static{ //클래스 초기화 블럭 - 클래스 변수만 초기화
//	
//}
//
//{ // 인스턴스 초기화 블럭 - 인스턴스변수와 클래스 변수를 초기화
//	ch = 10;
//	sound = 8;
//	
//}







package house;

public class main_house {
	
	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 생성 방법
		// 클래스명 참조변수명 = new 클래스 명(); -> 클래스명()은 클래스 생정자메서드 호출이다.
		
		//다형성 - 다양한 여러 가지형태 성질을 가지는것
		//자바 다형성 - 하나의 클래스로 여러 클래스를 표현 할 수 잇는 방식
		house_item[] t = new tv[] {new tv("삼성", 1230000, 65),new tv("LG", 1505000, 65),
				new tv("삼성", 890000, 55),new tv("LG", 2240000, 75),
				new tv("삼성", 730000, 50)};
		
		house_item[] air = new aircon[] {new aircon("휘센", 1510510, 17),new aircon("캐리어", 1619800, 25),
				new aircon("휘센", 1587110, 30),new aircon("위니아", 189000, 17),
				new aircon("비스포크", 1878590, 19)};
		
		
		
		t[0].buy();
		air[1].buy();
		
		// tv 클래스 타입, tv 클래스 사용 가능
		tv t1 = new tv();
		t1.brand="";
		t1.price=11;
		t1.inch=20;
		
		// house_item에 있는 것만 사용가능, 부모는 자식이 가지고있는걸 사용하지 못함.
		house_item t2 = new tv();
		t2.brand="";
		t2.price=22;
//		t2.inch=20;
		
		// 타입을 변환시켜서 사용함.
		tv t3 = (tv) t2;
		t3.inch=20;
		
//		tv t4 = new house_item();
		
		// 클래스 구별 하는 연산자 ( 전체?아아아아아 지금
//		if ( t3 instanceof aircon) {
//			System.out.println("에어컨 객체 이다.");
//		}
//		if ( t3 instanceof tv ) {
//			System.out.println("tv 객체 이다.");
//		}
		
		// int = 정수 (0.14 뺌)
		int a = (int)3.14;
		// float = 실수 (온전한 수 사용)
		float f = 3.14f;
		
		
		
		// 상속 관계라도 자식의 클래스로는 부모쪽에 있더라도 실행이 안됨
//		tv t = new tv("삼성",1230000);
//		tv t2 = new tv("LG",985000);
//		
//		aircon air1 = new aircon("휘센",940000);
//		aircon air2 = new aircon("위니아",560000);
//		
//		computer com1 = new computer("정수PC",780000);
//		
//		System.out.println(air1.toString());
		
//		tv t = new tv();
//		aircon air = new aircon();
//		air.brand = "휘센";
//		air.price = 1200000;
//		System.out.println(air.brand);
//		System.out.println(t.onoff);
//		
//		t.power();
//		t.power();
//		air.power();
//		air.power();
//		air.power();
		
		
		
	}
	
}

/* 클래스 관계 - 상속관계, 포함관계
	상속관계 - 부모자식 관계 (부모클래스가 가진것을 자식에게 상속)
			 부모클래스 - 자식 1클래스
			 		 - 자식 2클래스
			 		 - 자식 3클래스
	<div> -> width: 300px;
		<div> -> font-size: 15px;
			<img>
			<input>
		</div>
	</div>
	
	상속관계 - 왜?(이유) 관리, 재활용성 ( 자바의 상속이란 기존 클래스를 재사용하여 새로운클래스를 작성하는 것)
	                 코드의 중복성 제거, 프로그램 생산성과 유지보수 up!
	       - 다형성 (자식 하나가 여러명의 부모를 가짐)
	       - 단일상속 ( 단 하나의 부모만 가짐 - Java에서는 단일만)
	       
	포함관계 - 코드를 재사용할 수 있는 방법, 상속과는 다른 관계
			포함은 다른클래스를 자신의 변수로 만들어 사용하는 방법
			
	class a{
		int aa;
	}
	class b{
		a temp = new a();
	}
	
	상속관계 : ~은 ~이다. ( is ~ a ) 장영주는 발 부상자이다. 에어컨은 가전제품이다. TV는 가전제품이다.
	포함관계 : ~은 ~을 가지고 있다. ( has ~ a ) 에어컨은 가전제품을 가지고 있다. 자동차는 타이어를 가지고 있다.
										  가전제품은 에어컨을 가지고 있다. 장영주는 발 부상자를 가지고 있다.
										  발 부상자는 장영주를 가지고 있다.
	
*/











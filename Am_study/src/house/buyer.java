package house;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class buyer {
	private int money = 10000000;
	private String name = "장영주";
	private String special_note = "발 부상";
	private List<house_item> buy_list = null; // 구매한 제품 목록으로 저장

	{// 인스턴스 초기화 블럭
		special_note = "목발 하나만 필요";
	}

	public buyer() {
		buy_list = new ArrayList<>();
		special_note = "두발로 걸어다님";
	};

	public void buy(house_item item) { // 매개변수 다형성
		if(money < item.price) {
			System.out.println("잔액이 부족합니다. 목발 팔아주세요 ㅠㅠ");
			return;
		}
		
		buy_list.add(item);
		money -= item.price;
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		
		System.out.println("현재 잔액 : " + dc.format(money) + "원");
	
		// 천원단위 콤마 DeciamlFormat, 정규식 사용
//		Integer.toString(money).replaceAll("\\B(?=(\\d{3})+(?!\\d))",",");	//Integer.toString - 정수열을 문자열로 변환, replayceAll - 문자열을 특정 문자열로 바꿔줄때
	}
	
	public void buylist() {
		for(house_item item : buy_list) {
			System.out.println(item.toString());
		}
	}
	
	

	// 다형성으로 클래스 구성을 만들지 않았다면
//	public void buy(tv t) {
//
//	}
//
//	public void buy(aircon air) {
//
//	}
//
//	public void buy(computer com) {
//
//	}
}

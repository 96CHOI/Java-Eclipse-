package 자바1115;

import java.util.ArrayList;
import java.util.List;

// 클래스란 유사한 특징을 묶어 놓은 집합체
// 클래스는 필드변수와 메소드로 구성
// 클래스는 객체를 생성하기 위한 틀

// 클래스가 객체지향언어에만 있는 용어
public class Emp {
	String ename; //사원이름
	int sal; // 급여
	String job; // 직업
	
	//필드변수를 초기화할 수 있는 생성자 만들기
	//쉽게 만드는법 Source -> 아래서 4번째 -> 제너레이트
	public Emp(String ename, int sal, String job) {
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	
	//오버로딩 - 메서드 이름은 같으나, 매개변수를 다르게 혹은 리턴타입 다르게
	//오버라이딩 - 부모클래스 메소드를 **재정의!!!
	void 볶음밥을먹다() {
		
	}
	
	//오버로딩으로 생성된 메소드
	void 볶음밥을먹다(String 재료) {
		
	}
	
	
}



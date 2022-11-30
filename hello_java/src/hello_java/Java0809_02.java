package hello_java;

public class Java0809_02 {

	public static void main(String[] args) {//중괄호 시작
		
		int x = 10;
		x = x + x;
		//x의 최종값;
		System.out.println("x의 최종 값은 ? " + x);
		//x += x; 이거는 x = x + x; 랑 같은 의미 (실무에서 많이 쓰임)
		++x; // +1 하겠다는 것을 의미함.
		System.out.println("x의 값은 : "+x);
        
		//if
		if(2 < 4) {
			//조건이 맞으면 실행!
			System.out.println("if 실행!");
		}
		
		int 숫자1 = 100;
		int 숫자2 = 200;
		int 숫자3 = 50;
		if(숫자1 == 숫자2) { // == 같다.
			System.out.println("숫자1하고 숫자2는 같습니다.");
		}
		if(숫자1 != 숫자2) { // != 다르다.
			System.out.println("숫자1하고 숫자2는 다르다.");
		   숫자3 = 100;
		}
		 System.out.println("숫자3의 값은 ? "+ 숫자3);

		}
		
		
	}//중괄호 끝

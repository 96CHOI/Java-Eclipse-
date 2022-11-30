package hello_java;

public class Java0808_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
		//** 프로그래밍은 항상 위에서 아래로 해석
		int a = 5; //5를 대입
		int b = a;
		System.out.println("최종 값은? "+b);//문제 5. b의 최종값은? 정답 5!
		a = 2; //5를 다시 대입함
        a = a * a; //a곱하기 a결과를 a에 대입함
        System.out.println("최종 값은? "+a);//정답 4
        
        b = a;
        System.out.println("최종 값은? "+b);//문제 6. b의 최종 값은? 정답 4
        
        int c = 10 / 2; //나누기 몫
        System.out.println("4번. "+c);
        int d = 10 % 2; //나누기 후 나머지
        System.out.println("5번. "+d);
        int f = 5 * 5;  //곱하기
        System.out.println("6번. "+f);
                
	}

}

import java.util.Scanner;

public class Calculator {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("첫번째 입력 값은 : ");
		 int first = sc.nextInt();
		 System.out.println(first);
		 
		 
		 int result= first;
		 while(true) {
			 System.out.println("연산 기호: ");
			 String symbol= sc.next();
			 System.out.println(symbol);
			 
			 if(symbol.equals("quit")) {
				 System.out.println("최종 결과 값 : " + result );
				 break;
			 }
			 
			 System.out.println("두번째 입력 값은: ");
			 int second = Integer.parseInt(sc.next());
			 System.out.println(second);
			
			 
			 if(symbol.equals("+")) {
				 result = result + second;
				 System.out.println("더하기 : " + result);
			 }else if(symbol.equals("-")){
				 result = result - second;
				 System.out.println("빼기 : " + result);
			 }else if(symbol.equals("*")){
				 result = result * second;
				 System.out.println("곱하기 : " + result);
			 }else if(symbol.equals("/")){
				 result = result / second;
				 System.out.println("나누기 : " + result);
				 
			 }else if(symbol.equals("%")){
				 result = result % second;
				 System.out.println("나머지 구하기: " + result);
			 }else {
				 System.out.println("잘못된 값을 입력하셨습니다");
			
			 }
		 }
		 
//		 
//			System.out.println("더하기 : " + (first + second));
//			System.out.println("빼기 : " + (first - second));
//			System.out.println("곱하기 : " + (first * second));
//			System.out.println("나누기 : " + (first / second));
//			System.out.println("나머지 구하기: " + (first % second));
	}
}

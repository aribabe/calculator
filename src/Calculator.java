import java.util.Scanner;

public class Calculator {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("첫번째 입력 값은 : ");
		 int first = sc.nextInt();
		 System.out.println(first);
		 
		 System.out.println("두번째 입력 값은: ");
		 int second = Integer.parseInt(sc.next());
		 System.out.println(second);
		 
			System.out.println("더하기 : " + (first + second));
			System.out.println("빼기 : " + (first - second));
			System.out.println("곱하기 : " + (first * second));
			System.out.println("나누기 : " + (first / second));
			System.out.println("나머지 구하기: " + (first % second));
	}
}

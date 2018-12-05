import java.util.Scanner;

public class Calculator {

	 static int calculate(String symbol, int first, int second) {
		 int result=0;
		 if(symbol.equals("+")) {
			 
			 result=first+second;
			 System.out.println("더하기="+result);
		 }else if(symbol.equals("-")) {
			 result=first-second;
			 System.out.println("빼기="+result);
		 }else if(symbol.equals("*")) {
			 result=first*second;
			 System.out.println("곱하기="+result);
		 }else if(symbol.equals("/")) {
			 result=first/second;
			 System.out.println("나누기="+result);
		 }else if(symbol.equals("%")) {
			 result=first%second;
			 System.out.println("나누기="+result);
		 }else {
			 System.out.println("심볼 값을 잘못 입력하셨습니다.");
		 }
		return result;
		 
	 }
	  
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = Input.getFirstValue(scanner);
		int result= first;
		while(true) {
			String symbol = Input.getSymbol(scanner);
			
			if(symbol.equals("quit")) {
				Output.print(result);
				break;
			}
			
			int second = Input.getSecondValue(scanner);
			result = calculate(symbol, result, second);
		}
	}
}

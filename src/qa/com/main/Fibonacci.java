package qa.com.main;

public class Fibonacci {
	public void runFib(int limit) {
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		for (int sum = 0; sum < limit; ) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
		}
	}
}
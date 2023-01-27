package q2;


public class Test {

	public static void main(String[] args) {
		MyCalculator c = new MyCalculator();
		int ans = c.divisor_sum(6);
		if(ans != -1)
			System.out.println("Answer = "+ans);
		else
			System.out.println("n should be less than or equal to 1000");
	}

}

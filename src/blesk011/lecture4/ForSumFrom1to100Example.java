package blesk011.lecture4;

public class ForSumFrom1to100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 100 합: " + sum);
	}
}

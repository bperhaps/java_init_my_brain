package blesk011.lecture3;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s; //컴파일 에러, 부호 연산자의 산출타입이 int 형이 되기 때문에 컴파일 에러가 발생함
		int result3 = -s;
		System.out.println("result3=" + result3);
	}
}

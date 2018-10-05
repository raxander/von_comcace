package _08_29;

public class Test {

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(300_000*300_000);
		System.out.println(300_000l*300_000);
		
		System.out.println(-1e200*1e200);
		
		
		int a = 1;
        short b = 1;
        long c = 1;
        long d = a + b + c;
	}

	static int x = -2147483648; // наименьшее возможное значение типа int
	static int y = -x;

}

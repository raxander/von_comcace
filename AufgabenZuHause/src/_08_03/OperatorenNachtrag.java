package _08_03;

public class OperatorenNachtrag {

	public static void main(String[] args) {
		int i = 5, j = 5;

		i++;
		j--;

		++i;
		--j;
		int v = ++i + j--;// 6+5-1

		System.out.println("v= " + v);
		System.out.println(i + " " + j);
		System.out.println("Ergebnis");
		System.out.println(i-- + j--);
		System.out.println(i + " " + j);

		System.out.println(i++ + j++);
		System.out.println(i + " " + j);

		System.out.println(--i + --j);
		System.out.println(i + " " + j);

		System.out.println(++i + ++j);
		System.out.println(i + " " + j);
	}
}

package _09_17_Hexa;

public class Hexa extends Number {
	private String value;
	private long lValue;

	public Hexa(int value) {
		this.value = /*"0x" +*/ Integer.toString(value);
		
	}

	public Hexa(long value) {
		this.value = /*"0x" + */Long.toString(value);
		//lValue=Long.valueOf("0x" + value);
	}

	public Hexa(String value) {
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);

			if (!((c >= '0' && c <= '9') | (c >= 'A' && c <= 'F') | (c >= 'a' && c <= 'f')))
				throw new RuntimeException();
			/*
			 * else { System.out.println("Super"); }
			 */
		}
		this.value = /*"0x" + */value.toLowerCase();
	}

	final static char[] z = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public String toString() {
		return "0x" + value;

	}
	
public Hexa plus(Hexa he1) {
	return new Hexa (Long.toHexString((this.longValue()+he1.longValue())));
	
}
	@Override
	public int intValue() {
		return Integer.parseInt(value,16);
	}

	@Override
	public long longValue() {
		
		return Long.parseLong(value, 16);
	}

	@Override
	public float floatValue() {
		//String s=(String)Long.toString(value);
		return Float.valueOf(intValue());
	}

	@Override
	public double doubleValue() {
		return Double.valueOf(longValue());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public static void main(String[] args) {
		try {
			Hexa he = new Hexa("11AF");
			Hexa he1 = new Hexa(101);
			Hexa he2 = new Hexa(101798664433l);
			System.out.println("he = " + he.toString());
			System.out.println("he1 = " + he1.toString() + " toInt " + he1.intValue()+" float: "+he1.floatValue());
			System.out.println("he2 = " + he2.toString()+ " toLng " + he2.longValue()+" double: "+he2.doubleValue());
			Hexa he3=new Hexa(205);
			System.out.println("+ " +he.plus(he3));
			System.out.println("+ " +Long.toHexString(5044));
			//System.out.println("Long: "+he2.lValue);
		} catch (RuntimeException e) {
			System.out.println("Sie müssen die Parameter prüfen");
			e.printStackTrace();
		}
		int i = 0x101;
		long l=0x101798664433l;
		System.out.println("i= " + i);
		System.out.println("l= " + l);
	}
}

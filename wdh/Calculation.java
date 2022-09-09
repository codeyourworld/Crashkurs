package wdh;

import java.io.IOException;

public class Calculation {

	public void change(int a) {
		System.out.println(a);
		a = 7;
		System.out.println(a);
	}

	public void change(Value value) {
		System.out.println(value.getValue());
		value.setValue(7);
		System.out.println(value.getValue());
	}

	
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		//call by value
//		int a = 3;
//		System.out.println("a = " + a);
//		calc.change(a);
//		System.out.println("a = " + a);

		//call by reference
		Value value = new Value(3);
		System.out.println("value = " + value.getValue());
		calc.change(value);
		System.out.println("value = " + value.getValue());
		
		
	}

	public int sub(int val1, int val2) throws IOException {
		if(val1 >= val2) {
			return val1 - val2;
		}
		throw new IOException("Der Parameter 2 (" + val2 + ") ist größer als Parameter 1 (" + val1 + ")");
	}
	

	
	private static void exceptionExample() {
		Calculation calc = new Calculation();
		try {
			System.out.println(calc.sub(4, 2));
			System.out.println(calc.sub(4, 6));		
		} catch (IOException e) {
			System.err.println("ohh jemineee");
			e.printStackTrace();
		}
		System.out.println("hallo ich lebe noch");
	}
	
}

package generics;

public class SimpleAddition {

	private int a, b;
	private float c, d;
	private char veryBigVariableName;
	private static int SOME_STUPID_CONTANT = 1000;

	public int sum(int a, int b) {
		int c = a + b;
		System.out.println("SUM IS" + c);
		return c;
	}

	public float sum(float a, float b) {
		float c = a + b;
		System.out.println("SUM IS" + c);
		return c;
	}
	// 16 stupid methods
}

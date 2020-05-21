package oo;

public class Operation {
	int a = 15;
	int b = 20;
	public Operation (String empName){
		System.out.println("此时" +a );
		System.out.println("a == b = " + (a == b) );
		System.out.println("a == b = " + (a == b) );
		System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("b >= a = " + (b >= a) );
		System.out.println("b <= a = " + (b <= a) );
	 }
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		int c = 25;
		int d = 25;
		System.out.println("此时1" +a );
		System.out.println("a + b = " + (a + b) );
		System.out.println("a - b = " + (a - b) );
		System.out.println("a * b = " + (a * b) );
		System.out.println("b / a = " + (b / a) );
		System.out.println("b % a = " + (b % a) );
		System.out.println("c % a = " + (c % a) );
		System.out.println("a++   = " +  (a++) );
		System.out.println("a--   = " +  (a--) );
		// 查看  d++ 与 ++d 的不同
		System.out.println("d++   = " +  (d++) );
		System.out.println("++d   = " +  (++d) );

		new Operation("a");
	 }

}
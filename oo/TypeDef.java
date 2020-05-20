package oo;

public class TypeDef {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String str;
	static String a = "\"This is in quotes\"";

	int dd, b, c; // 声明三个int型整数：a、 b、c
	int g = 3, e = 4, ff = 5; // 声明三个整数并赋予初值
	byte z = 22; // 声明并初始化 z
	String s = "runoob"; // 声明并初始化字符串 s
	double pi = 3.14159; // 声明了双精度浮点型变量 pi
	char x = 'x'; // 声明变量 x 的值是字符 'x'。


	static int allClicks=0;    // 类变量
 
    String str1="hello world";  // 实例变量
 
    public void method(){
 
        int i1 =0;  // 局部变量
 
	}
	

	public static void main(String[] args) {
		System.out.println("Bool :" + bool);
		System.out.println("Byte :" + by);
		System.out.println("Character:" + ch);
		System.out.println("Double :" + d);
		System.out.println("Float :" + f);
		System.out.println("Integer :" + i);
		System.out.println("Long :" + l);
		System.out.println("Short :" + sh);
		System.out.println("String :" + str);
		System.out.println("String :" + a);
	}
}
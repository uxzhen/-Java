package Java.Basics;

public class test {
	// 环境配置
	// CLASSPATH
	// .;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;

	// JAVA_HOME
	// C:\Program Files\Java\jdk1.8.0_201

	// Path添加
	// C:\Program Files\Java\jdk1.8.0_201\bin
	// C:\Program Files\Java\jdk1.8.0_201\jre\bin

	public static void main(String[] arge) {
		System.out.print("  *    *             *    *\n");
		System.out.print("*          i love java      *\n");
		System.out.print("  *                       *\n");
		System.out.print("    *                  *\n");
		System.out.print("       *             *\n");
		System.out.print("         *         *\n");
		System.out.print("            *    *\n");
		System.out.print("               *  \n");
		// int i;这样定义不对，不能没有默认值
		int i = 1;
		System.out.println(i + 1);
		// java 数据类型分为基本数据类型和引用数据类型，基本数据类型有八种，除了这八种之外的所有都是引用类型
		// baty short int long
		// float double
		// char boolean

		// 整数类型
		// byte 1字节 = 8bit -128~127之间
		// short 2字节 -2(15次方)~2(15次方)-1
		// int 4字节 -2(31次方)~2(31次方)-1
		// long 8字节 -2(63次方)~2(63次方)-1

		// bit是什么单位？
		// 0100110，这个就是7bit

		// long的声明比较特殊,需要在结尾跟上一个小写字母l
		byte b = 1;
		int ii = 1;
		short s = 1;
		long l = 3l;

		// 浮点类型
		// float 4字节 -2（128）~2（128） 7位有效数字
		// double 8字节 -2（1024）~2（1024） 16位有效数字

		// float 复制需要跟个小写f
		double d = 1.22;
		float f = 1.22f;

		// 字符类型
		char c1 = 'a';
		char c2 = '1';

		// 转义字符
		// 定义单引号
		char c3 = '\'';
		// /n 换行

		// boolean 类型只能是 true false,不能为空
		boolean b1 = true;
	}

}
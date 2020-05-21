package oo;

public class Zuo_yong_yu {

	// 静态变量会储存 ， 每次使用会继承上一次的值
	// 成员变量 每次在方法使用完成重置
	int age = 0;
	// 类变量 会增长
	private static int age1 = 0;
	

	public Zuo_yong_yu() {

		age = age + 7;
		age1 = age1 + 7;
		System.out.println("小狗的年龄是: " + age + "," + age1);
	}



	public static void main(String[] args) {
		// 可直接在static访问
		age1 = 10;
		new Zuo_yong_yu();
		new Zuo_yong_yu();
	}
}
package object;

public class Penguin_qz extends Animal {
	public Penguin_qz(String myName, int myid) {
		// super 传参给父类
		super(myName, myid);
		super.eat();
		a();
		// 静态方法中不存在当前对象，因而不能使用this，也不能使用super
		// this.a();
	}

	public static void a() {
		System.out.println("我自己");
	}

	
	public static void main(String[] args) {
		new Penguin_qz("10", 1);
	}
}
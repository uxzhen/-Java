package oo;

public class private_type {
	// 	> 1、public：public表明该数据成员、成员函数是对所有用户开放的，所有用户都可以直接进行调用

	// > 2、private：private表示私有，私有的意思就是除了class自己之外，任何人都不可以直接使用，私有财产神圣不可侵犯嘛，即便是子女，朋友，都不可以使用。
	// > 3、protected：protected对于子女、朋友来说，就是public的，可以自由使用，没有任何限制，而对于其他的外部class，protected就变成private。
	private String format;
	public String a = "10";
	// 常量 不可修改
	final int value = 10;

	public private_type() {

	}

	public void setValue(String format1) {
		// final 常量赋值报错
		// value = format1;
	}

	public String getFormat() {
		System.out.print(this.format);
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;

	}

	public static void main(String[] args) {
		private_type form = new private_type();
		form.setFormat("aa");
		form.getFormat();
		System.out.print(form.a);
	}
}
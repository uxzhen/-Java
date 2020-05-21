package oo;

import java.util.Date;

import java.text.*;

public class Data_time {
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}

	public static void main(String args[]) {
		// 初始化 Date 对象
		Date date = new Date();

		// 使用 toString() 函数显示日期时间

		System.out.println(date.toString());
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间为: " + ft.format(date));
		// c的使用
		System.out.printf("全部日期和时间信息：%tc%n", date);
		// f的使用
		System.out.printf("年-月-日格式：%tF%n", date);
		// d的使用
		System.out.printf("月/日/年格式：%tD%n", date);
		// r的使用
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
		// t的使用
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
		// R的使用
		System.out.printf("HH:MM格式（24时制）：%tR", date);

		// 方法调用
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println(i + " 和 " + j + " 比较，最大值是：" + k);
	}
}
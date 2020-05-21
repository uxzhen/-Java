package oo;

public class f_for {
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		int[] arrr;
		int arrrr[];

		while (x < 20) {
			System.out.println("value of x : " + x);
			x++;
			// System.out.print("\n");
		}

		do {
			System.out.print("value of y : " + y);
			y++;
			System.out.print("\n");
		} while (y < 20);

		for (int z = 10; z < 20; z = z + 1) {
			if (z == 15) {
				// 跳过15
				continue;
			}
			System.out.print("value of z : " + z);

			System.out.print("\n");
		}
	}
}
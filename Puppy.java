public class Puppy{
	int puppyAge;
	public Puppy(String name){
		System.out.println("小狗叫"+name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("小狗的年龄" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args){
		// 创建对象
		Puppy wang = new Puppy("汪汪汪");
		System.out.println("全部属性" + wang);
		// 通过方法设置age
		wang.setAge(2);
		// 鑾峰彇age
		wang.getAge();
		// 璁块棶鎴愬憳鍙橀噺
		System.out.println(""+ wang.puppyAge);
	}
}
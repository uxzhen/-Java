public class Puppy{
	int puppyAge;
	public Puppy(String name){
		System.out.println("С����"+name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("С��������" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args){
		// ��������
		Puppy wang = new Puppy("������");
		System.out.println("ȫ������" + wang);
		// ͨ����������age
		wang.setAge(2);
		// 获取age
		wang.getAge();
		// 访问成员变量
		System.out.println(""+ wang.puppyAge);
	}
}
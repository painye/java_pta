package pta11_3;

public class pta7_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person32[] p = new Person32[3];
		p[0] = new Person32("zhangsan", 18);
		p[1] = new Person32("lisi", 20);
		p[2] = new Person32("wangwu", 22);
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
	}	}

}

	class Person32 {
		String name;
		int age;

		public Person32(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public String toString()
		{
			return name+" "+age;
		}
	}
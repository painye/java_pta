package pta11_3;

class People{
	private String id;
	private String name;
	public People(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

class Student extends People{
	private String sid;
	private int score;
	public Student(String id, String name, String sid, int score) {
	
	/** 你提交的代码将被嵌在这里（替换此行） **/
		super(id, name);
		this.sid=sid;
		this.score=score;
	
	}
	public String toString(){
		return ("(Name:" + this.getName() 
				+ "; id:" + this.getId() 
				+ "; sid:" + this.sid
				+ "; score:" + this.score 
				+ ")");
	}

}

public class pta6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student zs = new Student("370202X", "Zhang San", "1052102", 96);
		System.out.println(zs);
	}

}

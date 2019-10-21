package pta11_3;


class People{
	
	protected String id;
	protected String name;
	
	/** 你提交的代码将被嵌在这里（替换此行） **/
	
	public People(String id2, String name2) {
		// TODO Auto-generated constructor stub
		id=id2;
		name=name2;
	}
	
	public People()
	{
		id=null;
		name=null;
	}
	
	public void setName(String string) {
		// TODO Auto-generated method stub
		name=string;
		
	}
	
	public void setId(String string) {
		// TODO Auto-generated method stub
		id=string;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Person! My name is "+name+".");
		
	}

	
}


class Studen extends People{
	protected String sid;
	protected int score;
	public Studen() {
		name = "Pintia Student";
	}
	public Studen(String id, String name, String sid, int score) {
		super(id, name);
		this.sid = sid;
		this.score = score;
	}
	public void say() {
		System.out.println("I'm a student. My name is " + this.name + ".");
	}
	
}


public class pta6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studen zs = new Studen();
		zs.setId("370211X");
		zs.setName("Zhang San");
		zs.say();
		System.out.println(zs.getId() + " , " + zs.getName());
		
		Studen ls = new Studen("330106","Li Si","20183001007",98);
		ls.say();
		System.out.println(ls.getId() + " : " + ls.getName());
		
		People ww = new Studen();
		ww.setName("Wang Wu");
		ww.say();
		
		People zl = new People("370202", "Zhao Liu");
		zl.say();
	}

}

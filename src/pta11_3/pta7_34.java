package pta11_3;

public class pta7_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(true);
	}

}


class Test {
    public Test(){
    	System.out.println("Constructor one invoked!");
    }
    public Test(int x){
    	//�˴���Ӵ���
    	this();
    	System.out.println("Constructor two invoked!");
    }
    public Test(boolean b){
    	//�˴���Ӵ���
    	this(1);
    	System.out.println("Constructor three invoked!");
    }


}
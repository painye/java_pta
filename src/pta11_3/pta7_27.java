package pta11_3;

public class pta7_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f=true;
		RR r=new RR(f);
	}
	
}

class RR{
    public RR(){
       System.out.print("8");
    }
    public RR(int x){
       this();
       System.out.print(".");
    }
    public RR(boolean b){
       this(1);
       System.out.print("00");
    }
}
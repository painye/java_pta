package pta11_3;

public class pta6_26 {

	public pta6_26(){
        System.out.println("���췽��һ��������");
    }
	
    public pta6_26(int x){
        this();
        System.out.println("���췽������������");
    }
    
    public pta6_26(boolean b){
        this(1);
        System.out.println("���췽������������");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		boolean f=true;
		
		pta6_26 p3=new pta6_26(f);
	}

}

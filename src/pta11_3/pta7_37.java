package pta11_3;

public class pta7_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company37 c=new Company37();
		System.out.println(c.getClassNmae());
	}

}


interface ClassName
{
	public String getClassNmae();
}

class Company37 implements ClassName
{

	@Override
	public String getClassNmae() {
		// TODO Auto-generated method stub
		return "Company";
	}
	
}
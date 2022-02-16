package day8;

final class TryToInherit {
	int a;
	void method5() {
		
	}
	
}

  //class inherit extends TryToInherit {    }    
                                  //cant inherit the class bcuz of final keyword in a class

class harp {
	final int key=10;    // final is used in variable bcuz u dont wanna change the value of it like a aadhaar no.
	final void method1() {
		
		System.out.println("this method0:\t"+key);
	}
}

public class FinalKeyword extends harp {
	
	/*void method1() {
		System.out.println("Trying to override final method");
	}*/       //u cant override the method1 bcuz of final used in method.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FinalKeyword K = new FinalKeyword();
		K.method1();  */    // can't override!
		
	}

}

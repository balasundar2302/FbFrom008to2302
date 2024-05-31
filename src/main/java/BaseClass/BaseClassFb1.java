package BaseClass;

public class BaseClassFb1 extends BaseClassFb {
	public static void main(String[] args) {
//		BaseClassFb b= new BaseClassFb();
//		b.subMethod1();
//		b.subMethod3();		//parent class property called by that particular class of object reference
//		b.subMethod4();
		
//		BaseClassFb1 b1= new BaseClassFb1();
//		b1.subMethod1();
//		b1.subMethod3();	//by using extends keyword to call the parent class
//		b1.subMethod4();
		
		BaseClassFb.subMethod1();
		BaseClassFb.subMethod3();
		BaseClassFb.subMethod4();
		
		subMethod1(); 
		subMethod3();
		subMethod4();
 	}

}

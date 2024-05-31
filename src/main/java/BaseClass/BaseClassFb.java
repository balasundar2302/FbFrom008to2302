package BaseClass;

public class BaseClassFb {
	
public static void subMethod1() {
System.out.println("public");
}
private static void subMethod2() {
System.out.println("private");

}
protected static void subMethod3() {
System.out.println("protected");
}
static void subMethod4() {
System.out.println("default");
}
public static void submethod(String value) {
System.out.println(value);	//using parameterized constructor we can call method multiple time
}
 public static void main(String[] args) {
//	BaseClassFb b= new BaseClassFb();
//	b.subMethod1();
//	b.subMethod2();		//without static, by object creation
//	b.subMethod3();
//	b.subMethod4();
	 subMethod1();
	 subMethod2();		//with static so need to craete object
	 subMethod3();
	 subMethod4();
	 
	 submethod("1");
	 submethod("2");
}
}

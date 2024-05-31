package POJO;

public class Pojo2 extends Pojo1 {
	public static void main(String[] args) {
		//Pojo1 p= new Pojo1();
		Pojo2 p= new Pojo2();
		System.out.println(p.getA());
		p.setA(77);
		System.out.println(p.getA());
	}

}

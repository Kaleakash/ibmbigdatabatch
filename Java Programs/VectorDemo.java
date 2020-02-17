import java.util.*;
class VectorDemo {

	public static void  main(String args[]) {
		Vector<Integer> vv = new Vector<Integer>();
		vv.addElement(10);
		vv.addElement(20);
		vv.addElement(30);
		vv.addElement(40);
		System.out.println(vv);

		Enumeration<Integer> e = vv.elements();
		while(e.hasMoreElements()) {
			int n = e.nextElement();
			System.out.println(n);
		}
	}
}
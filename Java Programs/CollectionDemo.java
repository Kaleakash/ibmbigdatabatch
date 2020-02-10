import java.util.*;
class CollectionDemo {
	public static void main(String args[]){
	/*List ll = new ArrayList();
	ll.add(10);		// auto-boxing : primitive to object 
	ll.add(10.10f);
	ll.add("Ravi");
	ll.add(20);

	Object obj = ll.get(0);
	Integer i = (Integer)obj;
	int n = i.intValue();	//primitive value 
	System.out.println(n);*/
	
	//List<Type> ll = new ArrayList<Type>();
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	System.out.println(ll);
	int n = ll.get(0);	//auto-unboxing object to primitive  
	System.out.println(n);
	}
}	


enum Color{
	
	RED(10),GREEN(5),BLUE(15);
	private int val;
	Color(int val){
		this.val = val;
	}
	public int getValue() {
		return val;
	}
}


class EnumDemo {
	public static void main(String args[]) {
	Color cc = Color.RED;
	System.out.println(cc);
	Color c[]= Color.values();
	for(Color c1:c) {
		System.out.println(c1+" "+c1.ordinal()+" "+c1.getValue());
	}
	}
}
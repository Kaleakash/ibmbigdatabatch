import java.io.*;
public class IODemo1 {
	public static void  main(String args[]) throws Exception {
	FileReader fr = new FileReader("emp.csv");
	BufferedReader br = new BufferedReader(fr);
	String str = null;
	String info[]={};
	while((str=br.readLine())!=null) {
		//System.out.println(str);
		info=str.split(",");
		//System.out.println(info.length);
System.out.println("id is "+info[0]+"Name is "+info[1]+"Salary is "+info[2]);
		}	
	}
}
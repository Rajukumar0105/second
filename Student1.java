package collection;

import java.util.ArrayList;

public class Student1 {
	public static void main(String[] args) {
		ArrayList <Integer> stdId=new ArrayList<>();
	//add()
		stdId.add(101);
		stdId.add(102);
		stdId.add(103);
		stdId.add(104);
		stdId.add(105);
		//set(index,value)
		stdId.set(2, 100);
		//remove(index);
		stdId.remove(2);
	
		for(int i=stdId.size()-1;i>=0;i--) {
			System.out.println(stdId.get(i));
		}
		

		for(int i=0;i<stdId.size();i++) {
			System.out.println(stdId.get(i));
		}
		
		for(Integer s: stdId) {
			System.out.println(s);
		}
	}
}

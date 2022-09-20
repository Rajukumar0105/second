package collection;
import java.util.ArrayList;
public class UseStudent {
private static final int ArrayList = 0;

public static void main(String[] args) {
	Student s1=new Student("Damon",12,true,6);
	Student s2=new Student("stefan",13,true,7);
	Student s3=new Student("katharine",12,false,3);
	Student s4=new Student("elena",13,false,4);
	ArrayList<Student> s=new ArrayList<>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
//for(int i=0;i<s.size();i++) {
//	System.out.println(s);
//}
//for(Student a:s) {
//	System.out.println(a);
//}
//s.forEach(x->System.out.println(x));
	
//	s.forEach(x->{
//		if(x.getAge()>12) {
//			System.out.println("6th std: "+x.getName());
//		}else {
//			System.out.println("7th Std: "+x.getName());
//		}
//	});
//	ArrayList<Student> sixth =new ArrayList<>();
//	for(int i=0;i<s.size();i++) {
//		if(s.get(i).getAge()>12) {
//			sixth.add(s.get(i));
//		}
//	}
//	sixth.forEach(x->System.out.println(x));
	
	ArrayList<Student> nameLength=new ArrayList<>();
	for(Student o:s) {
		if(o.getName().length()%2!=0) {
			nameLength.add(o);
		}
	}
	nameLength.forEach(x->System.out.println(x));
//	//Odd roll number
//	ArrayList<Student> Odd=new ArrayList<>();
//	ArrayList<Student> even=new ArrayList<>();
//	for(Student a:s) {
//		if(a.getRollNumber()%2==0) {
//			Odd.add(a);
//		}else {
//			even.add(a);
//		}
//	}
//	Odd.forEach(x->System.out.println(x));
//	even.forEach(x->System.out.println(x));
	//ArrayList 
//	ArrayList<Student> femaleStudents =new ArrayList<>();
//	ArrayList<Student> maleStudents =new ArrayList<>();
//	for(Student f:s) {
//		if(f.getIsMale()==false) {
//			femaleStudents.add(f);
//		}else {
//			maleStudents.add(f);
//		}
//	}
//	
//	maleStudents.forEach(x->System.out.println(x));
//	femaleStudents.forEach(x->System.out.println(x));
//	
	//reverse the longest name
//	int max=0;
//	String a="",b="";
//	for(int i=0;i<s.size();i++) {
//		if(s.get(i).getName().length()>max) {
//			max=s.get(i).getName().length();
//			a=s.get(i).getName();
//		}
//	}
//	for(int i=a.length()-1;i>=0;i--) {
//		b+=a.charAt(i);
//	}
//	System.out.println(b);
}
}

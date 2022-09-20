package collection;

import java.util.ArrayList;

public class Pencil {
	public static void main(String[] args) {
		ArrayList<String> pencilBrand= new ArrayList<>();
		pencilBrand.add("Nataraj");
		pencilBrand.add("Absara");
		pencilBrand.add("Camelin");
		pencilBrand.add("Color");
		pencilBrand.add("NatarajWithRuber");
		pencilBrand.add("AbsaraWithRuber");
		//for enhanced print brand
		for(String s:pencilBrand) {
			System.out.println(s);
		}
		//
//		for (int i=0;i<pencilBrand.size();i++) {
//			
//			System.out.println(pencilBrand.get(i));
//		}
//		for(int i=pencilBrand.size()-1;i>=0;i--) {
//			System.out.println(pencilBrand.get(i));
//		}
		pencilBrand.forEach(x->System.out.println(x));
//		
//		for(int i=0;i<pencilBrand.size();i++) {
//			System.out.println(pencilBrand.get(i).charAt(0));
//		}
//
//		
//		pencilBrand.forEach(x->System.out.println(x.charAt(x.length()-1)));
//		
//		int max =pencilBrand.get(0).length();
//		String a="";
//		for(int i=0;i<pencilBrand.size();i++) {
//			if(pencilBrand.get(i).length()>max) {
//		
//			max=pencilBrand.get(i).length();
//			a+=pencilBrand.get(i);
//			
//			
//		}
//		}
//	System.out.println(a);
//	;
		
//		for(int i=0;i<pencilBrand.size();i++) {
//			System.out.println(pencilBrand.get(i).charAt(pencilBrand.get(i).length()-1));
//		}
		String a="";
		for(int i=0;i<pencilBrand.size();i++) {
		a+=pencilBrand.get(i);
		}System.out.println(a);
		}
	}


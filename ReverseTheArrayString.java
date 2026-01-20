package com.tka.jan15;

public class ReverseTheArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names_db= {"James","Jadeja","Moshin","Shubman","Dhoni","Virat"};
		
		for(int i=0;i<names_db.length;i++) {
			String word=names_db[i];
			String rev="";
			
			for(int j=0;j<word.length();j++) {
				rev=word.charAt(j)+rev;
			}
			names_db[i]=rev;
		}
		for(int i=0;i<names_db.length;i++) {
			System.out.println(names_db[i]);
		}
	}

}

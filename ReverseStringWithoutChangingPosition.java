package com.tka.jan15;

public class ReverseStringWithoutChangingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello I'm Aishwarya.";
		String word="";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				word=ch+word;	
			}else {
				res=res+word+" ";
				word="";
			}
		}
		res=res+word;
		System.out.println(res);
	}
}

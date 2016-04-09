package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuke2 {

	
	public static String Nuke2(){
		char[] readchar;
		String str = new String();
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a word");
		try {
			str = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Input is larger than 1 line");
			e.printStackTrace();
		}
		readchar = new char[str.length()];
		//for(int i=0;i<str.length();i++){
		//	readchar[i]=str.charAt(i);//将String分割
		//	System.out.println("The"+i+"char is:"+readchar[i]);
		//}
		//下面这个也可以
		readchar = str.toCharArray();
		char[] newChar = new char[str.length()-1];
		newChar[0]=readchar[0];
		for(int i=1;i<str.length()-1;i++){
			newChar[i]=readchar[i+1];
		}
		String newStr = new String(newChar);//将char数组里的东西重新变回String
		//String newStr = String.valueOf(newChar); //这个也可以
		return newStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = Nuke2();
		System.out.println(str);
	}

}

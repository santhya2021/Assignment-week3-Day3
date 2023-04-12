package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords_SET {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";		
		String[] newText=text.split(" ");
		String newText1="";
		Set<String> value=new LinkedHashSet<String>();
		for (String string : newText) 
		{
			value.add(string);
		}	
		for (String s : value) 
		{
			newText1=newText1+s+" ";
		}
		
		System.out.println("The Given Text:\n"+text+"\nThe Given Text with Duplicates Removed:\n"+newText1);
	}


}

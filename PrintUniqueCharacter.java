package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) 
	{
		String name="babu";
		String newName="";
		char[] cs = name.toCharArray();
		Set<Character> value=new HashSet<Character>();
		for (Character c : cs) 
		{
			//value.add(c);
			if(!(value.add(c)))
			{
				value.remove(c);
			}
		}
		for (Character character : value) 
		{
			newName=newName+character;
		}
		System.out.println(newName);

	}

}

package regularExprection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contains_abc 
{
	public static void main(String[] args) 
	{
		
		Pattern p = Pattern.compile(".*abc.*");
		Matcher m=p.matcher("12Avbhbiabcviufcvkd");
		boolean ans = m.matches();
		System.out.println(ans);
		/*
		 * Starts With Alphabets
		 * 
		Pattern p = Pattern.compile("[a-z,^A-Z].*");
		Matcher m=p.matcher("avbhbiabcviu%fcvkd");
		boolean ans = m.matches();
		System.out.println(ans);
		*/
		/*
		 * Not Starts With special Character
		 * 
		Pattern p = Pattern.compile("[a-z,^A-Z,^0-9].*");
		Matcher m=p.matcher("avbhbiabcviu%fcvkd");
		boolean ans = m.matches();
		System.out.println(ans);
		*/
	}
}


























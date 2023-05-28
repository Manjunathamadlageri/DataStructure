package regularExprection;

import java.util.regex.*;

public class Starts_with_Atlst_4_char {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[a-z]{4}");
		Matcher m=p.matcher("nbbk");
		boolean ans = m.matches();
		System.out.println(ans);
		/*
		Pattern p = Pattern.compile("[a-z,A-Z]{4,6}[0-9]{3,7}");
		Matcher m=p.matcher("nbbkn145");
		boolean ans = m.matches();
		System.out.println(ans);
		 */
		/*
		 Patter Matching of Gmail
		 
		Pattern p = Pattern.compile("[a-z,A-Z]{4,6}_*[0-9]{3,7}@gmail[.]com");
		Matcher m=p.matcher("Mmanhy123@gmail.com");
		boolean ans = m.matches();
		System.out.println(ans);
		 */
	}

}

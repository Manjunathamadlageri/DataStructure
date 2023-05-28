package regularExprection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strat_with_a {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("a.*");
		Matcher m=p.matcher("avbhbiviu%fcvkd");
		boolean ans = m.matches();
		System.out.println(ans);
		/*   
		 * Ending with Z
		Pattern p = Pattern.compile(".*z");
        Matcher m=p.matcher("avbhbiviu%fcvkdz");
        boolean ans = m.matches();
                System.out.println(ans);
		 * 
		 */
	}

}

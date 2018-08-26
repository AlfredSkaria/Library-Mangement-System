package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
	
	private static String regex = "[0-9]+";
	private static String regex1 = "[a-zA-Z][a-zA-Z]*";
	static Pattern p = Pattern.compile(regex);
	static Pattern p1 = Pattern.compile(regex1);

	public static boolean validateId(String id)
	{
		int length = id.length();
		Matcher m = p.matcher(id);
		if(m.find() && m.group().equals(id))
			if(length>0)
			{
				return true;
			}
			else
			{
				return false;
			}
        else
            return false;
	}
	
	public static boolean validateTitle(String title)
	{
		int length = title.length();
		Matcher m = p1.matcher(title);
		if(m.find() && m.group().equals(title))
		{
			if(length>=3)
			{
				return true;
			}
			else
			{
				return false;
			}			
		}
		else
		{
			return false;
		}
	}
}

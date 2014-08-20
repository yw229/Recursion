import java.util.HashSet;


public class CheckValidWorld {
	public HashSet<String> Dic;
	
	public CheckValidWorld()
	{
		Dic = new HashSet<String>() ;
		Dic.add("cat") ;
		Dic.add("dog") ;
	}
	
	public boolean isValid(String s)
	{
		if(s==null)
			return false;
		if(Dic.contains(s)) // base case 
			return true ;
		for(int i = 0 ; i < s.length() ; i++)
		{
			String pref = s.substring(0,i) ;
			String suff = s.substring(i) ;
			if( Dic.contains(pref) && Dic.contains(suff))
				return isValid(pref) && isValid(suff) ;
		}
		return false ;
	}
	public static void main(String[] args)
	{
		CheckValidWorld c = new CheckValidWorld() ;
		System.out.println(c.isValid("catdogs"));
	}
}

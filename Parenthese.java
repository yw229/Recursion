package Project;

public class Parenthese
{
    public int l ;
    public int r ;
    public char[] str ;
    public int count ;
    public Parenthese (int l , int r , char[] str , int count)
    {
        this.l = l ;
        this.r = r ;
        this.str = str ;
        this.count = count ;
    }
    public void printP(int l, int r , char[] str ,int count)
    {
       /* if(l<0 || r<0) return ;
        if(l==0&& r==0)
        {
            System.out.println(str) ;
        }
        else
        if(l>0)
        {
            str[count] = '(' ;
            printP(l-1, r, str,count+1);
        }
        if(r>l)
        {
            str[count] = ')' ;
            printP(l,r-1,str,count+1) ;
        }*/
    	if(count<0) return ;
    	if(l == 0 && r == 0)
    		System.out.println(str) ;
    	if(l>0)
    	{
    		str[count] = '(' ;
    		printP(l-1, r, str, count +1) ;
    	}
    	if(r>l)
    	{
    		str[count] = ')' ;
    		printP(l, r-1, str, count +1) ;
    	}
        
    }
    public void printP()
    {
        printP(this.l,this.r,this.str,this.count );
    }
    public static void main(String[] args)
    {
        int l = 3 ; 
        int r = 3 ; 
        int count =3 ;
        char[] str = new char[count*2] ;
        Parenthese p = new Parenthese(l,r,str,0) ;
        p.printP() ;
    }
}
public class rot{
private static boolean isRotated(char[] c1, char[] c2){
int n=c1.length;
if(n==c2.length){
	char key;
	int j;
	for(int i=0;i<n;i++){
		key=c1[i];
		j=0;
		while(j<n && c1[(i+j+1) % n]==c2[j])	j++;
		if (j==n && key==c2[n-1]) return true;
	}
}
return false;
}

public static void main(String[] s){
  String c1=s[0];
  String c2=s[1];
  System.out.println(isRotated(c1.toCharArray(),c2.toCharArray()));
}

}

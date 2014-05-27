public class HelloWorld{
			
	public static boolean isItPalindrome(String str){
		boolean ret = true;
		str=str.toUpperCase();
		str=str.replace(" ", "");
		int lenght = str.length();
		int iterateTo = (str.length()%2==1) ? str.length()/2+1 : str.length()/2 ;
		for(int i=0; i<iterateTo; i++) {
			if(str.charAt(i)!=str.charAt(lenght-i-1)) {
				ret=false;
				break;
			}
				
		}	
		return ret;
	}
	public static  void main(String[] args){
		System.out.println(isItPalindrome("Indul a görög aludni"));
	}
	
}
package Sorting;

public class StringSplit {
	
	public static void main(String[] args) {
		String str = "Ethernet1/1";
		String s="permit ip host 1.1.1.6 host 2.2.2.5";
		String[] a=splitRule(s);
		
		for(String b:a) {
			System.out.println(b);
		}
		
		StringBuffer alpha = new StringBuffer(),  
		        num = new StringBuffer(); 
		          
		        for (int i=0; i<str.length(); i++) 
		        { 
		            if (Character.isDigit(str.charAt(i))) 
		                num.append(str.charAt(i)); 
		            else if(Character.isAlphabetic(str.charAt(i))) 
		                alpha.append(str.charAt(i)); 
		            else {
		            	if(str.charAt(i)=='-')
		            	alpha.append(str.charAt(i));
		            	else
		            		num.append(str.charAt(i));
		            }
		                 
		        } 
		       
		       System.out.println(alpha); 
		       System.out.println(num); 
	}
	
	public static String[] splitRule(String str) {
		String[] s=new String[10];
		if(Character.isDigit(str.charAt(0))) {
			s=str.split(" ", 3);
			return s;
		}
		else {
			s=str.split(" ", 2);
			String[] s1= {"",s[0],s[1]};
			return s1;
		}
	}

}

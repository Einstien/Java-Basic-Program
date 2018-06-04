package Basics;



public class CheckStringValue {

	public static void main(String[] args) {		
		CheckStringValue a = new CheckStringValue();
		a.chkStringValue("asuhdfjkhk2+645987984512@#%^%$^&%^&*^*&)*()&^&*%@@#~hgjhbdsbafkjog53465435135");	
}	
		private void chkStringValue (String value) {		
		int ln = value.length();		
		String inValu = "";
		String charValu = "";
		String scharValu = "";		
		if (ln !=  0) {		
	     for (int i=0; i< ln ; i++) {	    	 
	    	char b=  value.charAt(i); 		    	
	    	boolean isInt = Character.isDigit(b);
	    	boolean ischar = Character.isLetter(b);	    	
	    	if (isInt) {	    		
	    		inValu = inValu + b;	    		
	    	}
	    	else if (ischar) {	    		
	    		charValu = charValu +b;	    		
	    	}
	    	else {	    		
	    		scharValu = scharValu +b;	    		
	    	}
	     }	     
	     while (inValu.length() !=0 ) {System.out.println("The Integer Value in String is : " + inValu); break;}
	     while (charValu.length() !=0 ) {System.out.println("The Charachter Value in String is : " + charValu); break;}
	     while (scharValu.length() !=0 ) {System.out.println("The Special Charachter Value in String is : " + scharValu); break;}
		}	     
		else {System.out.println("Provide String Value");}
	}	
}
	


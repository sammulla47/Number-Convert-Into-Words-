package com.Convert;

public class NumberToWord {

	public static final String[] units = {
	         "",
	         " one",
	         " two",
	         " three",
	         " four",
	         " five",
	         " six",
	         " seven",
	         " eight",
	         " nine"
	    }; 
	    public static final String[] doubles = {
	         " ten",
	         " eleven",
	         " twelve",
	         " thirteen",
	         " fourteen",
	         " fifteen",
	         " sixteen",
	         " seventeen",
	         " eighteen",
	         " nineteen"
	    };
	    public static final String[] tens = {
	        "",
	        "",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	    };
	    public static final String[] hundreds = {
	        "",
	        " thousand",
	        " million",
	        " billion"
	    };
	 
	   public static String convertToWord(int number) {    
	        String word = "";    
	        int index = 0;
	        do {
	            // take 3 digits at a time
	            int num = number % 1000;
	            if (num != 0){
	                String str = convertThreeOrLessThanThreeDigitNum(num);
	                word = str + hundreds[index] + word;
	            }
	            index++;
	            // move left by 3 digits
	            number = number/1000;
	        } while (number > 0);
	        return word;
	    }
	   public static String convertThreeOrLessThanThreeDigitNum(int number) {
	         String word = "";    
	         int num = number % 100;
	         // Logic to take word from appropriate array
	         if(num < 10){
	             word = word + units[num];
	         }
	         else if(num < 20){
	             word = word + doubles[num%10];
	         }else{
	             word = tens[num/10] + units[num%10];
	         }
	         word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
	         return word;
	    }

	   
}

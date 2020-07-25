package Epam.Java8_Streams_and_Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App 
{
	public static List<String> filterList(List<String> list,Palindroms palin)
	{
		List<String> result=new ArrayList<>();
		for(String str:list) {
			if(palin.isPalindrome(str))
				result.add(str);
		}
		return result;
		
	}
	
    public static void main( String[] args )
    {
        
    	
    	//1.Average Of List of Integers
    	 List<Integer> numbers = Arrays.asList(5,10,4,8,12,44,15,7,17,88,99);
    	  OptionalDouble average = numbers.stream()
    	                                  .mapToInt((x) -> x)
    	                                  .average();
    	  
    	  if (average.isPresent()) { 
              System.out.println("The average of given numbers is "+ average.getAsDouble()); 
          } 
          else { 
              System.out.println("Give some numbers"); 
          } 
    	  
    	  
    	  
    	  
    	//2.Strings that starts with lower case 'a' and has length exactly '3'
    	 List<String> strings = Arrays.asList("ant", "apple", "bat", "ace","orange","air","Act","elephant","mongoose");

    	 Stream<String> result = strings
    						.stream()
    						.filter(str->str.startsWith("a") && str.length()==3 );
    	 System.out.println("The resultant strings are "+result.collect(Collectors.toList()));
    	 
    	
    	 
    	 
    	//3.Strings which are palindromes
    	 List<String> TotalStrings = Arrays.asList("ana","non","monkey", "mam", "bat", "ace","rat","pop","mom");
    	 
    	 Palindroms palin=new Palindroms();
    	 List<String> palindromes=App.filterList(TotalStrings,palin);
    	 
    	 System.out.print("The palindromes are "+palindromes);
    	
    }

	
}

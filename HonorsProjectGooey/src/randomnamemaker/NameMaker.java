package randomnamemaker;
import java.util.Random;
public class NameMaker {
	
	
	static Random spork = new Random();
	static String consonants = "bcdfghjklmnprstvwxz";
	static String vowels = "aeiou";
	
	public String[] names() {
		
                String[] holder = new String[3];
		for(int j = 0; j < 3; j ++){	
			String name = "";
			int length = spork.nextInt(7)+6;
			
			
			
			for(int i = 1; i <= length; i ++){
				if ( i == 1){
					
					name = name + Character.toUpperCase(consonantMaker()); 
					
				}
				
				//if i divided by two gives a remainder of 1, then odd
				else if ( i%2 == 1 ){ 
					name = name + consonantMaker();
	
					
					
				} //if i is divided by two and gives no remainder, then even
				else {
					name = name + vowelMaker();
					
					
				}  
			}
			
			holder[j]=name;
		} 
                return holder;
	}
	
	private static char consonantMaker() {
		return consonants.charAt(spork.nextInt(19));

		
		
	}
	
	private static char vowelMaker() {
		
		return vowels.charAt(spork.nextInt(5));
		

	}
	
}

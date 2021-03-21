import java.util.*;
public class UniqueString {

	/*
	 * Calculate the unique number of characters in given string
	 * 
	 * @param String to be operate upon , Map to store string and their unique character count
	 * 
	 * @return number of unique characters in given string
	 */
	public static int uniqueCharacterCount(String token,Map<String,Integer> uniqueCharacter){
		int i,numOfChar=0;
		if(uniqueCharacter.containsKey(token)){
			numOfChar = uniqueCharacter.get(token);
		} else {
			String temp = "";
	         for ( i = 0; i < token.length(); i++){
	            if (temp.indexOf(token.charAt(i)) == - 1){
	               temp = temp + token.charAt(i);
	            }
	         }
	         numOfChar = temp.length();
	         uniqueCharacter.put(token,numOfChar);
		}
		return numOfChar;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> uniqueCharacter=new HashMap<String,Integer>(); 
		System.out.println("Enter the string : ");
		String string = sc.nextLine();
		StringTokenizer stringTokens = new StringTokenizer(string , " ");
		while(stringTokens.hasMoreTokens()){
			String token = stringTokens.nextToken();
			int count = uniqueCharacterCount(token ,uniqueCharacter);
			System.out.println("\n Number of unique characters in \" " + token + " \" are : " + count);
		}
		System.out.println("\n==============================================================================================================================================");
		System.out.println("\n\nInitial Mappings are: " + uniqueCharacter);
	}
}

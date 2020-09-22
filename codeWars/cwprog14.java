//Question: https://www.codewars.com/kata/51c8e37cee245da6b40000bd/

public class cwprog14 {

   public static String stripComments2(String text, String[] commentSymbols) {
    
      //Run through the commentSymbols
      for(String i : commentSymbols) {

      //Equivalent to (i|\i).*?(?=\\n|$)
      //Check and remove the commentSymbol followed by any content till '\n' or
      //until '$' which represents the end of line
      String regExp1 = "("+i+"|\\"+i+").*?(?=\\n|$)";
      text = text.replaceAll(regExp1, "");
    }
    
    //Equivalent to \s*?(?=\n|$)
    //This removes any whitespace until the end of the line
    //or until it finds a '\n' character
    //For more info on the .*?(?=) visit : https://stackoverflow.com/questions/7124778/how-to-match-anything-up-until-this-sequence-of-characters-in-a-regular-expres 
    String regExp2 = "\\s*?(?=\\n|$)";
    text = text.replaceAll(regExp2, "");
		return text;
	}	

   public static String stripComments(String text, String[] commentSymbols) {
    //Splits the input string into a String array
    String[] arr = text.split("\n"); 
    
    //Run through the commentSymbols
    for(String i : commentSymbols) {
      
      //Check against each array element
      for(int j =0; j<arr.length; j++) {
        
        //Equivalent to (\s*$)|(\s*(\i|i).*)
        //Replaces all the whitespace at the end of the string element
        //Or
        //Replace the comment character along with the whitespace behind it and any content ahead of it
        //Included (\i | i) instead of just '(i)' because the test case with '$' conflicted with the '$' in regex
        //So '\i' changes '$' to '\$'
	//For more info on the .*?(?=) visit : https://stackoverflow.com/questions/7124778/how-to-match-anything-up-until-this-sequence-of-characters-in-a-regular-expres 
        String regExp = "(\\s*$)|(\\s*(\\"+i+"|"+i+").*)"; 
        
        //Replaces the regEx with empty string, effectively removing it
        arr[j] = arr[j].replaceAll(regExp, ""); 
      }
    }
    
    //Joins the array elements back with '\n' as expected
    text = String.join("\n", arr);
    
    //Returns the final text
    return text;
  } 
}

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\nHello! This program sorts words by length from longest to shortest! \nEnter the number of words you will be inputting:");

    int numberWords = scan.nextInt() + 1;
    System.out.println("\nEnter the words you would like to sort:");
    String[] wordArray = new String[numberWords];
    for(int i = 0; i < numberWords; i++){
      wordArray[i] = scan.nextLine();
    }
   
    int longest = 0;
    for(int j = 0; j < wordArray.length; j++){
      if(wordArray[j].length() > longest){
        longest = wordArray[j].length();
      }
    }
    
    System.out.println("\nHere are your words sorted by length from longest to shortest: \n\n");
    for (int k = longest; k >= 0; k--){
      for(int j = 0; j < wordArray.length; j++){
        if(wordArray[j].length()==k){
          System.out.println(wordArray[j]);
        }
      }
    }

  }
}

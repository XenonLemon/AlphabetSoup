//Name: Peter Daniel
//9/24/25
//This program will produce a "soup" that will contain specific letters to spell out specific words.

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

//precondition: word cannot be null
//postcondition: adds the letters specified in "word" into "letters"
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

//precondition: letters must have a word inside of it
//postcondition: using indexing, a random letter will be pulled from letters.
    //Use Math.random() to get a random character from the letters string and return it.
    public String randomLetter(){
        int randomIndex = (int)(Math.random() * letters.length());
        String randomLetter = letters.substring(randomIndex, randomIndex+1);
        return randomLetter;
    }

//precondition: there should be a company name stored in a string titled company
//postcondition: using indexing and substring, the word will have the company name placed in the middle of the word. 
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        
        int centerIndex = (int)(letters.length() / 2);
        
        String companyCentered = letters.substring(0, centerIndex) +  company; 
        String latterHalf = letters.substring(centerIndex);
        return companyCentered + latterHalf;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int randomSub = (int)(Math.random() * (letters.length()-num));
        letters = letters.substring(0, randomSub) + letters.substring(randomSub + num);
        return;
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        
    }
}

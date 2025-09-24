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
    public char randomLetter(){
        int randomIndex = (int)(Math.random() * letters.length());
        randomLetter = letters.substring(randomIndex, randomIndex+1);
        return randomLetter;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        return "";
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        
    }
}

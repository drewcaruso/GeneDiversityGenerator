import java.util.*;

public class GeneDiversityGenerator {
  
  static Random random = new Random();
  
  static List<String> populationList = new ArrayList<String>();
  
  // MSF domain located at index 129-470
  
    static Character [] vmat2Array = {
    
      'm', 'a', 'l', 's', 'e', 'l', 'a', 'l', 'v', 'r', 'w', 'l', 'q', 'e', 's', 'r', 'r', 's', 
      'r', 'k', 'l', 'i', 'l', 'f', 'i', 'v', 'f', 'l', 'a', 'l', 'l', 'l', 'd', 'n', 'm', 'l',
      'l', 't', 'v', 'v', 'v', 'p', 'i', 'i', 'p', 's', 'y', 'l', 'y', 's', 'i', 'k', 'h', 'e',
      'k', 'n', 'a', 't', 'e', 'i', 'q', 't', 'a', 'r', 'p', 'v', 'h', 't', 'a', 's', 'i', 's', 
      'd', 's', 'f', 'q', 's', 'i', 'f', 's', 'y', 'y', 'd', 'n', 's', 't', 'm', 'v', 't', 'g', 
      'n', 'a', 't', 'r', 'd', 'l', 't', 'l', 'h', 'q', 't', 'a', 't', 'q', 'h', 'm', 'v', 't',
      'n', 'a', 's', 'a', 'v', 'p', 's', 'd', 'c', 'p', 's', 'e', 'd', 'k', 'd', 'l', 'l', 'n', 
      'e', 'n', 'v', 'q', 'v', 'g', 'l', 'l', 'f', 'a', 's', 'k', 'a', 't', 'v', 'q', 'l', 'i', 
      't', 'n', 'p', 'f', 'i', 'g', 'l', 'l', 't', 'n', 'r', 'i', 'g', 'y', 'p', 'i', 'p', 'i', 
      'f', 'a', 'g', 'f', 'c', 'i', 'm', 'f', 'v', 's', 't', 'i', 'm', 'f', 'a', 'f', 's', 's', 
      's', 'y', 'a', 'f', 'l', 'l', 'i', 'a', 'r', 's', 'l', 'q', 'g', 'i', 'g', 's', 's', 'c',
      's', 's', 'v', 'a', 'g', 'm', 'g', 'm', 'l', 'a', 's', 'v', 'y', 't', 'd', 'd', 'e', 'e', 
      'r', 'g', 'n', 'v', 'm', 'g', 'i', 'a', 'l', 'g', 'g', 'l', 'a', 'm', 'g', 'v', 'l', 'v',
      'g', 'p', 'p', 'f', 'g', 's', 'v', 'l', 'y', 'e', 'f', 'v', 'g', 'k', 't', 'a', 'p', 'f',
      'l', 'v', 'l', 'a', 'a', 'l', 'v', 'l', 'l', 'd', 'g', 'a', 'i', 'q', 'l', 'f', 'v', 'l', 
      'q', 'p', 's', 'r', 'v', 'q', 'p', 'e', 's', 'q', 'k', 'g', 't', 'p', 'l', 't', 't', 'l',
      'l', 'k', 'd', 'p', 'y', 'i', 'l', 'i', 'a', 'a', 'g', 's', 'i', 'c', 'f', 'a', 'n', 'm', 
      'g', 'i', 'a', 'm', 'l', 'e', 'p', 'a', 'l', 'p', 'i', 'w', 'm', 'm', 'e', 't', 'm', 'c', 
      's', 'r', 'k', 'w', 'q', 'l', 'g', 'v', 'a', 'f', 'l', 'p', 'a', 'i', 's', 'y', 'l', 'i',
      'g', 't', 'n', 'i', 'f', 'g', 'i', 'l', 'a', 'h', 'k', 'm', 'g', 'r', 'w', 'l', 'c', 'a', 
      'l', 'l', 'g', 'm', 'i', 'i', 'v', 'g', 'v', 's', 'i', 'l', 'c', 'i', 'p', 'f', 'a', 'k',
      'n', 'i', 'y', 'g', 'l', 'i', 'a', 'p', 'n', 'f', 'g', 'v', 'g', 'f', 'a', 'i', 'g', 'm',
      'v', 'd', 's', 's', 'm', 'm', 'p', 'i', 'm', 'g', 'y', 'l', 'v', 'd', 'l', 'r', 'h', 'v',
      's', 'v', 'y', 'g', 's', 'v', 'y', 'a', 'i', 'a', 'd', 'v', 'a', 'f', 'c', 'm', 'g', 'y', 
      'a', 'i', 'g', 'p', 's', 'a', 'g', 'g', 'a', 'i', 'a', 'k', 'a', 'i', 'g', 'f', 'p', 'w', 
      'l', 'm', 't', 'i', 'i', 'g', 'i', 'i', 'd', 'i', 'l', 'f', 'a', 'p', 'l', 'c', 'f', 'f',
      'l', 'r', 's', 'p', 'p', 'a', 'k', 'e', 'e', 'k', 'm', 'a', 'i', 'l', 'm', 'd', 'h', 'n',
      'c', 'p', 'i', 'k', 't', 'k', 'm', 'y', 't', 'q', 'n', 'n', 'i', 'q', 's', 'y', 'p', 'i',
      'g', 'e', 'd', 'e', 'e', 's', 'e', 's', 'd'
    
    };
  
  public static void main (String[] args) {
    
    mutate();

    // this will be at the end, when print out all the mutated sequences
    for (int i = 0; i < populationList.size(); i++) {
      System.out.println(populationList.get(i) + "\n");
    }
    
    System.out.println(populationList.size());
  }

    public static void changeAminoAcid() {
    
    //Random random = new Random();
    
    // find index to alter
    int low, high, aminoIndex; // low and high are used to find aminoIndex to change
    low = 0;                   
    high = 513;
    aminoIndex = random.nextInt(high - low) + low;
    
    // find new amino acid
    String possibleAA = "arndbcqezghilkmfpstwyv";
    char newAA = possibleAA.charAt(random.nextInt(possibleAA.length()));
    
    // convert array to ArrayList
    ArrayList<Character> vmat2List = new ArrayList<Character>(Arrays.asList(vmat2Array));
    
    // convert to string
    String temp = vmat2List.toString().replaceAll(", |\\[|\\]", "");
    
    // add sequence to list
    populationList.add(temp);
    
    }
    
  
  public static void deleteAminoAcid() {
    
    // find index to delete
    int low, high, aminoIndex;
    low = 0;
    high = 513;
    aminoIndex = random.nextInt(high - low) + low;
    
    // convert to ArrayList to delete index
    ArrayList<Character> vmat2List = new ArrayList<Character>(Arrays.asList(vmat2Array));
    vmat2List.remove(aminoIndex);
    
    // convert to string
    String temp = vmat2List.toString().replaceAll(", |\\[|\\]", "");
    
    // add sequence to list
    populationList.add(temp);
    
  }
  
  public static void addAminoAcid() {

    // find place to add element
    int low, high, aminoIndex;
    low = 0;
    high = 513;
    aminoIndex = random.nextInt(high - low) + low;
    
    // picking new amino acid to insert into sequence 
    String possibleAA = "arndbcqezghilkmfpstwyv";
    char newAA = possibleAA.charAt(random.nextInt(possibleAA.length()));
    
    // convert array to ArrayList
    ArrayList<Character> vmat2List = new ArrayList<Character>(Arrays.asList(vmat2Array));
    
    // add the new amino acid
    vmat2List.add(aminoIndex, newAA);
    
    // convert to string
    String temp = vmat2List.toString().replaceAll(", |\\[|\\]", "");
    
    populationList.add(temp);
    
  }
  
  public static void doNothing() {
    
    // convert to ArrayList
    ArrayList<Character> vmat2List = new ArrayList<Character>(Arrays.asList(vmat2Array));
    
    // convert to string
    String temp = vmat2List.toString().replaceAll(", |\\[|\\]", "");
    
    // add to list
    populationList.add(temp);
 
  }
  
  public static void mutate() {
    
    
    // mutate algorithm values are open to change based on biological date
    // current numbers are mainly to note code is behaving correctly with outputted sequences
    int min = 0;
    int max = 10;
    
    for (int i = 0; i < 100; i++) {
      if ((random.nextInt(max - min + 1) + min) <= 8) {
      changeAminoAcid();
    }
      if ((random.nextInt(max - min + 1) + min) <= 7) {
      deleteAminoAcid();
    }
      if ((random.nextInt(max - min + 1) + min) <= 7) {
      addAminoAcid();
    }
      if ((random.nextInt(max - min + 1) + min) <= 8) {
      doNothing();
     }
      
    }
    
  }
  
}

// DNA Sequencing
public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    //DNA strands to test program
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    System.out.println(dna.length()); // length of strand
    int start = dna.indexOf("ATG"); //begins
    int stop = dna.indexOf("TGA"); //ends
    //indexOf() string method will return -1 if the substring doesn’t exist within a String.
    //third condition that checks whether or not that the number of nucleotides in between the start codon and the stop condon is a multiple of 3.
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      System.out.println("Condition 1 and 2 and 3 are satisfied.");
      String protein = dna.substring(start, stop+3); //to find protein in dna
      System.out.println("Protein: " + protein);
      }
      //No protein
    else {
      System.out.println("No protein.");
    }
  }
 
}

/* The genome of an organism stores all the genetic information necessary to build and maintain that organism. It is an organism’s complete set of DNA.

DNA is composed of a series of nucleotides abbreviated as:

A: Adenine
C: Cytosine
G: Guanine
T: Thymine
DNA

So a strand of DNA could look something like ACGAATTCCG.

Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:

ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.*/


public class DNA {

  public void hasProtein(String dna) {
    int startCodon = dna.indexOf("ATG");
    int stopCodon = dna.indexOf("TGA");
    int difference = stopCodon - startCodon + 3;
    if (startCodon != -1 && stopCodon != -1 && difference % 3 == 0) {
      String protein = dna.substring(startCodon, stopCodon + 3);
      System.out.println(protein);
    } else {
      System.out.println("No protein.");
    }
  }

  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    DNA dna = new DNA();
    dna.hasProtein(dna1);
    dna.hasProtein(dna2);
    dna.hasProtein(dna3);
  }

}
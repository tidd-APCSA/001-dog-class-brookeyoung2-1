public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog piper = new Dog("Piper", "Labrodoodle",32, "White and brown", true);
    System.out.println(piper.getName());
    System.out.println(piper.getBreed());
    System.out.println(piper.toString());
    
    Dog finley = new Dog("Finley", "Labrodoodle", 16, "Brown", true);
    System.out.println(finley.getName());
    System.out.println(finley.getColor());

    Dog sambuca = new Dog("Sambuca", "Doberman",75, "Black", true);
    System.out.println(sambuca.getName());
    System.out.println(sambuca.getBreed());
  }
}
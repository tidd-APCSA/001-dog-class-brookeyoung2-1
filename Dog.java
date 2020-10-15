public class Dog {
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean housetrained;


public Dog(String theName, String theBreed, double theWeight, String theColor, boolean theHousetrained)
{
  name = theName;
  breed = theBreed;
  weight = theWeight;
  color = theColor;
  housetrained = theHousetrained;
}

// getter methods
public String getName(){
  return name;
}

public String getBreed(){
  return breed;
}

public String getColor(){
  return color;
}

public boolean getHousetrained(){
  return housetrained;
}

public double getWeight(){
  return weight;
}

public String toString(){
  return (name + " 🐶");
}












}
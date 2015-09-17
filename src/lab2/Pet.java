package lab2;

public class Pet extends Animal
{
 private String name;
 private int age;
 private double weight;

 public String toString()
 {
  return ("Name: " + name + "Age: " + age +" years" + "\nWeight: " + weight + " pounds");
 }

 public Pet(String initialName, int initialAge, double initialWeight, String initialGender)
 {
  super(initialGender);

  name = initialName;
  

  if(initialWeight < 0)
  {
   System.out.println("Error: Negative weight.");
   System.exit(0);
  }
  else
   weight = initialWeight;

  if(initialAge < 0)
  {
   System.out.println("Error: Negative age.");
   System.exit(0);
  }
  else
   age = initialAge;
 }

 public Pet(String initialName)
 {
  name = initialName;
  age = 0;
  weight = 0;
 }

 public Pet(int initialAge)
 {
  name = "No name yet.";
  weight = 0;
  if(initialAge < 0)
  {
   System.out.println("Error: Negative age.");
   System.exit(0);
  }
  else
   age = initialAge;
 }

 public void set(String newName, int newAge, double newWeight)
 {
  name = newName;
  weight = newWeight;

  if(newAge < 0)
  {
   System.out.println("Error: Negative age.");
   System.exit(0);
  }
  else
   age = newAge;

  if(newWeight < 0)
  {
   System.out.println("Error: Negative weight.");
   System.exit(0);
  }
  else
   weight = newWeight;
 }

 public void setAge(int newAge)
 {
  if(newAge < 0)
  {
   System.out.println("Error: Negative age.");
   System.exit(0);
  }
  else
   age = newAge;
 }

 public void setWeight(double newWeight)
 {
  if(newWeight < 0)
  {
   System.out.println("Error: Negative weight.");
   System.exit(0);
  }
  else
   weight = newWeight;
 }

 public String getName()
 {
  return name;
 }

 public int getAge()
 {
  return age;
 }

 public double getWeight()
 {
  return weight;
 }
}
class Dog {
     String name;
     int age;
 }
 
 public class j17 {
     public static void main(String[] args) {
         Dog myDog = new Dog(); // creates an instance of the Dog class and assigns the reference to the variable "myDog"
         myDog.name = "Fido";
         myDog.age = 3;
 
         Dog anotherDog = myDog; // assigns the reference stored in "myDog" to the variable "anotherDog"
         anotherDog.name = "Buddy"; // changing the name of the object via "anotherDog" reference
         
         System.out.println(myDog.name); // prints "Buddy"
     }
 }
 
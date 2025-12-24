package genericlinkedlist;

public class Person {
 private String firstName;
 private String lastName;
 private int age;
 
 public Person()
 {
     // Default constructor
 }
 
 public Person(String firstName, String lastName, int age)
 {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
 }
 
 public void setFirstName(String firstName)
 {
     this.firstName = firstName;
 }
 
 public String getFirstNanme()
 {
     return this.firstName;
 }
 
 public void setLastName(String lastName)
 {
     this.lastName = lastName;
 }
 
 public String getLastName()
 {
     return this.lastName;
 }
 
 public void setAge(int age)
 {
     this.age = age;
 }
 
 public int getAge()
 {
     return this.age;
 }
 
 @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}

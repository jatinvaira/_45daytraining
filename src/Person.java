public class Person {
      private String name;
  private int age;

  public void Person(String name) {
    this.name = name;
    this.age = 0;
  }

  public void Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
public static void main(String[] args) {
    // creating object of the first overloaded method with only one parameter (Name).
    Person p1=new Person("John");
    System.out.println("Person Name: "+p1.getName());
    System.out.println("Person Age :"+p1.getAge());
    //creating object of second overloaded method which takes two parameters i.e., Name and Age
    Person p2= new Person("Jane",35);
    System.out.println("\n\nSecond Overload Method:");
    System.out.println("Person Name:"+p2.getName()+"and Age is:" +p2.getage());
    
}

}

/**
 * Created by alexanderhughes on 2/1/16.
 */
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
   // public static StreetAddress address;


    public Person() {}       // would allow the option to create a blank empty object

   /* public Person(String name, int age) {
        this(name, age, true);   calling next constructor to fill name and age and explicitly setting isAlive to true
    }*/

    public Person(String name, int age) {           //, boolean isAlive,StreetAddress address)
        this.name = name;           //this could also be setName(name);
        this.age = age;
        //this.isAlive = isAlive;
        //this.address = address;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


    public static boolean isValidName(String name) {
        return name.contains(" ");
    }
}

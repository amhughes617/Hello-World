/**
 * Created by alexanderhughes on 2/1/16.
 */
public class Cat {              // Class for a schrodinger's cat.
    public String name;
    public int age;
    public double weight;
    public boolean isAlive;

    public Cat(String name, int age, double weight, boolean isAlive) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if(weight >= 0) {
            this.weight = weight;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}

/**
 * Created by alexanderhughes on 2/1/16.
 */
public class Soda {
    public String brand;       //brand of soda
    public int calorieCount;       //how many calories in this soda
    public boolean isDiet;      //diet soda

    public Soda(String brand, int calorieCount, boolean isDiet) {
        setBrand(brand);
        setIsDiet(isDiet);      //has to set this variable first so the boolean in the if statement of setCalorieCount can be evaluated
        setCalorieCount(calorieCount);

    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCalorieCount() {
        return calorieCount;
    }
    public void setCalorieCount(int calorieCount) {
        if(isDiet()) {                  //this if else statement will automatically set calorieCount to 0 if the soda is diet,
            this.calorieCount = 0;      // and will allow amounts greater than 0 to be input if it is not a diet soda
        }
        else {
            this.calorieCount = calorieCount;
        }
    }

    public boolean isDiet() {
        return isDiet;
    }
    public void setIsDiet(boolean isDiet) {
        this.isDiet = isDiet;
    }
}

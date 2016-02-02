/**
 * Created by alexanderhughes on 2/1/16.
 */
public class Car {
    public String make;     //gives manufacturer name
    public String model;       //gives model of car
    public int modelYear;       // give year car was made
    public double engineSizeLiters;
    public boolean isImport = true;     //whether or not car is an import
    public boolean isGasGuzzler;

    public Car(String make, String model, int modelYear, double engineSizeLiters, boolean isImport, boolean isGasGuzzler) {
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
        setIsImport(isImport);
        setIsGasGuzzler(isGasGuzzler);
        setEngineSizeLiters(engineSizeLiters);
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getEngineSizeLiters() {
        return engineSizeLiters;
    }
    public void setEngineSizeLiters(double engineSizeLiters) {
        this.engineSizeLiters = engineSizeLiters;
        if(engineSizeLiters >= 4.0) {       //will change isGasGuzzler value to true if engine size is greater that 4.0 else is will be set to false
            this.isGasGuzzler = true;
        }
        else {
            this.isGasGuzzler = false;
        }
    }

    public boolean isImport() {
        return isImport;
    }
    public void setIsImport(boolean isImport) {
        this.isImport = isImport;
    }
    public boolean isGasGuzzler() {
        return isGasGuzzler = isGasGuzzler;
    }
    public void setIsGasGuzzler(boolean isGasGuzzler) {
        this.isGasGuzzler = isGasGuzzler;
    }
}

/**
 * Created by alexanderhughes on 2/1/16.
 */
public class LightBulb {
    public double wattage;
    public String baseType;
    public String bulbType;

    public LightBulb(double wattage, String baseType, String bulbType) {
        setWattage(wattage);
        setBaseType(baseType);
        setBulbType(bulbType);
    }

    public double getWattage() {
        return wattage;
    }
    public void setWattage(double wattage) {
        if(wattage >= 0) {
            this.wattage = wattage;
        }
    }

    public String getBaseType() {
        return baseType;
    }
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }
}

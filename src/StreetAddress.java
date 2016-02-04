/**
 * Created by alexanderhughes on 2/1/16.
 */
public class StreetAddress {        //Stores full street address

    public int number;
    public String streetName;
    public String city;
    public String state = "SC";
    public int zipcode;
    public boolean isCommercial;    // indicates whether this is a commercial property

    public StreetAddress(int number, String streetName, String city, String state, int zipcode, boolean isCommercial) {
        setNumber(number);
        setStreetName(streetName);
        setCity(city);
        setState(state);
        setZipcode(zipcode);
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        if(isSCResident(state) == false) {           // makes SC the only state that is excluded
            this.state = state;
        }
    }

    public int getZipcode() {
        return zipcode;
    }
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    public boolean isSCResident(String state) {
        return state.contains("SC");
    }


}

package OMS;

/* 
 * File: AddressInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class AddressInfo {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    /**
     * Pushing address info into CSV format for customer to export
     * @return 
     */
    public String toCSV(){
        String output = "";
        
        return output;
    }
    
    /**
     * Pushing address info into XML format for customer to export
     * @return 
     */
    public String toXML(){
        String output = "";
        
        return output;
    }
    
    /**
     * Reading CSV formatted string to return address object to customer
     * @param input 
     */
    public void fromCSV( String input ){
        
    }
    
    /**
     * Reading XML formatted string to return address object to customer
     * @param input 
     */
    public void fromXML( String input ){
        
    }
    
    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
    
}

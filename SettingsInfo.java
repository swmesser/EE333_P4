package OMS;

/* 
 * File: SettingsInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 30, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class SettingsInfo {
    private String userRepo; //user file
    private String customerRepo;    // customer file
    private String employeeRepo;    //employee file
    private String productsRepo; // products file
    private String format;
    
    /**
     * Pushing Settings to CSV format for exporting
     * @return 
     */
    public String toCSV(){
        String output = "";
        
        return(output);
    }
    
    /**
     * Pushing Settings to XML format for exporting
     * @return 
     */
    public String toXML(){
        String output = "";
        
        return(output);
    }

    /**
     * Pulling information from a singular line in to create setting object
     * @param input 
     */
    public void fromCSV( String input ){
        
    }
    
    /**
     * Pulling information from a string input using regex to create setting object
     * @param input 
     */
    public void fromXML( String input ){
        
    }
    
    /**
     * @return the userRepo
     */
    public String getUserRepo() {
        return userRepo;
    }

    /**
     * @param userRepo the userRepo to set
     */
    public void setUserRepo(String userRepo) {
        this.userRepo = userRepo;
    }

    /**
     * @return the customerRepo
     */
    public String getCustomerRepo() {
        return customerRepo;
    }

    /**
     * @param customerRepo the customerRepo to set
     */
    public void setCustomerRepo(String customerRepo) {
        this.customerRepo = customerRepo;
    }

    /**
     * @return the employeeRepo
     */
    public String getEmployeeRepo() {
        return employeeRepo;
    }

    /**
     * @param employeeRepo the employeeRepo to set
     */
    public void setEmployeeRepo(String employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /**
     * @return the productsRepo
     */
    public String getProductsRepo() {
        return productsRepo;
    }

    /**
     * @param productsRepo the productsRepo to set
     */
    public void setProductsRepo(String productsRepo) {
        this.productsRepo = productsRepo;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
}

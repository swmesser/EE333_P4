package OMS;

/* 
 * File: EmployeeInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 30, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public final class EmployeeInfo extends UserInfo {
    private String firstname;
    private String lastname;
    private EmployeeRole role;  
    
    //Enum for Roles
    private enum EmployeeRole{
        Administrator,
        Assiociate,
        Unknown
    }
    
    /**
     * Pushing information to CSV format for export
     * @return 
     */
    @Override
    public String toCSV(){
        String output = "";
        
        return output;
    }
    
    /**
     * Pushing information to XML format for export
     * @return 
     */
    @Override
    public String toXML(){
        String output = "";
        
        return output;
    }
    
    /**
     * Pulling information from singular line in CSV format for import
     * @param input 
     */
    public void fromCSV( String input ){
        
    }
    
    /**
     * Pulling information from XML formatted string for import
     * @param input 
     */
    public void fromXML( String input ){
        
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the role
     */
    public EmployeeRole getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(EmployeeRole role) {
        this.role = role;
    }
    
}



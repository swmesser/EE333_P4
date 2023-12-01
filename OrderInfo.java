package OMS;

/* 
 * File: OrderInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public class OrderInfo implements Exportable{
    private String id;
    private String name;
    private double subTotal;
    private double total;
    //Status of order is handledd through location of orderId.txt
    //Split files between a folder "Shipped" and "Not Shipped"
    //Import pulls data from the "Not Shipped" folder and archives them by moving to "Shipped"

    /**
     * Pushing information to CSV format for export
     * @return 
     */
    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Pushing information to XML format for export
     * @return 
     */
    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Pulling information from singular line from file to create order object
     * @param input 
     */
    public void fromCSV( String input ){
        
    }
    
    /**
     * Pulling information from singular line from file to read using regex to create order object
     * @param input 
     */
    public void fromXML( String input ){
        
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

}

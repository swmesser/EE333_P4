package OMS;

/* 
 * File: ProductInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

//Interfaces for ProductInfo
interface Exportable {
    String toCSV();
    String toXML();
}


public abstract class ProductInfo implements Exportable{
    private String itemId;
    private String name;
    private String description;
    private String series;
    private String manufacturer;
    private String mfgPartNumber;
    private int qtyAvailable;
    private double price;
    private StockOption availability;
    private EnvironmentalOption hazards;
    private MediaOption media;
    private ProductStatus status;
    private PackageOption shippingPackage;

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series the series to set
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the mfgPartNumber
     */
    public String getMfgPartNumber() {
        return mfgPartNumber;
    }

    /**
     * @param mfgPartNumber the mfgPartNumber to set
     */
    public void setMfgPartNumber(String mfgPartNumber) {
        this.mfgPartNumber = mfgPartNumber;
    }

    /**
     * @return the qtyAvailable
     */
    public int getQtyAvailable() {
        return qtyAvailable;
    }

    /**
     * @param qtyAvailable the qtyAvailable to set
     */
    public void setQtyAvailable(int qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the availability
     */
    public StockOption getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(StockOption availability) {
        this.availability = availability;
    }

    /**
     * @return the hazards
     */
    public EnvironmentalOption getHazards() {
        return hazards;
    }

    /**
     * @param hazards the hazards to set
     */
    public void setHazards(EnvironmentalOption hazards) {
        this.hazards = hazards;
    }

    /**
     * @return the media
     */
    public MediaOption getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(MediaOption media) {
        this.media = media;
    }

    /**
     * @return the status
     */
    public ProductStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    /**
     * @return the shippingPackage
     */
    public PackageOption getShippingPackage() {
        return shippingPackage;
    }

    /**
     * @param shippingPackage the shippingPackage to set
     */
    public void setShippingPackage(PackageOption shippingPackage) {
        this.shippingPackage = shippingPackage;
    }
    
    /**
     * Push information to CSV format for export
     * @return 
     */
    public String toCSV(){
        String output = "";
        
        return ( output );
    }
    
    /**
     * Push information to XML format for export
     * @return 
     */
    public String toXML(){
        String output = "";
        
        return( output );
    }
}


//Generic Product Enums --> 
//  Used for variables that each type of product will contain
enum StockOption{
    inStock,
    normallyStocking,
    newProduct,
    outOfStock,
    unknown
}

enum EnvironmentalOption{
    RoHSCompliant,
    NonRoHSCompliant,
    unknown
}

enum MediaOption{
    datasheet,
    photo,
    eda_cadModels,
    unknown
}

enum PackageOption{
    Bag,
    Box,
    Bulk,
    CutTape,
    DigiReel,
    Strip,
    TapeAndBox,
    TapeAndReel,
    Tray,
    unknown
}

enum ProductStatus{
    active,
    discontinued,
    lastTimeBuy,
    notForNewDesigns,
    obsolete,
    unknown
}

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
    String toCustom();
    String toCSV();
    String toXML();
}


public abstract class ProductInfo {
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

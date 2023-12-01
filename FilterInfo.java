package OMS;

/* 
 * File: FilterInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 30, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class FilterInfo extends ProductInfo {
    private int resonantFreq;
    private int bandwidth;
    private double size;
    private double height;
    private FilterType filterType;
    private MountingTypeEnum mountingType;
    
    //Filter Enum
    private enum FilterType {
        AM,
        FM,
        BandPass,
        HighPass,
        LowPass,
        Discriminator,
        Unknown
    }

    private enum MountingTypeEnum{
        FreeHanging,
        SurfaceMount,
        ThroughHole,
        Chassis,
        Inline,
        Wall,
        Bolt,
        DinRail,
        WireLead,
        Unknown
    }
}

final class SAWFilterInfo extends FilterInfo {
    private double frequencyCenter;
    private double insertionLoss;
    private Application application;
            
    private enum Application{
        Automotive,
        BaseStation,
        Bluetooth,
        CDMA,
        CableConverters,
        Cellphone,
        Cellular,
        DAB,
        DCS,
        GPS,
        HDTV,
        IF,
        ISM,
        LTE,
        Medical,
        LabUse,
        WLAN,
        TETRA,
        WirelessMethods,
        Unknown
    }
}

final class RFFilterInfo extends FilterInfo {
    private double ripple;
    
}

final class DSLFilterInfo extends FilterInfo {
    private InputType input;
    private OutputType output;
            
    private enum InputType {
        DualLine,
        SingleLine,
        Unknown,
        
    }
    
    private enum OutputType{
        OneJack,
        OneFilteredJack,
        FourPhoneOneDSL,
        Unknown
    }
}

final class CeramicFilterInfo extends FilterInfo {
    private double impedanceValue;
    
}

final class EMIFilterInfo extends FilterInfo {
    private int channelCount;
    private int channelResistance;
    private int current;
    private int attenuationValue;
    private double frequencyCenter;
    private double ratedVoltage;
    private double capacitance;
    private FilterOrder filterOrder;
    private Technology technology;
    private ESDProtection esdProtection;
    private Application application;
    
    
    private enum FilterOrder {
        First,
        Second,
        Third,
        Fourth,
        Fifth,
        Sixth,
        Unknown
    }
    
    private enum Technology {
        LC,
        RC,
        RLC,
        ThinFilm,
        Unknown
    }
    
    private enum ESDProtection {
        Yes,
        No,
        Unknown
    }
    
    private enum Application {
        Audio,
        Automotive,
        Bluetooth,
        DataLines,
        GSM,
        LAN,
        USB,
        Telecommunications,
        Unknown
    }
}



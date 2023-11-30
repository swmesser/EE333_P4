package OMS;

/* 
 * File: InductorCoilAndChokesInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */


public abstract class InductorCoilAndChokesInfo extends ProductInfo{
    private String tolerance;
    private InductorMountingType mount;
    private String packageCase;
}

final class AdjustableInductorsInfo extends InductorCoilAndChokesInfo{
    private String inductance;
    private String qAtFreq;
    private String height;
    private String size;
}


final class FixedInductorInfo extends InductorCoilAndChokesInfo{
    private int coilNumber;
    //String b/c you need to have the unit for each parameter
    private String parallelInductance;
    private String seriesInductance;
    private String parallelCurrentRating;
    private String seriesCurrentRating;
    private String parallelCurrentSaturation;
    private String seriesCurrentSaturation;
    private String parallelDCResistance;
    private String seriesDCResistance;
    private String operatingTemp;
    private ArrayInductorShielding shielding;
    private InductorRating rating;
    private String height;
    private String size;
}

final class ArraysAndSignalTransformerInfo extends InductorCoilAndChokesInfo{
    private String coreMaterial;
    private String inductance;
    private String currentRating;
    private String currentSaturation;
    private String inductorType;
    private FixedInductorShielding shielding;
    private String dcResistance;
    private String qAtFreq;
    private String selfResonantFreq;
    private InductorRating rating;
    private String operatingTemp;
    private String inductanceFreqTest;
    private String features;
    private String supplierDevicePackage;
    private String size;
    private String seatedHeight;
}

final class WirelessChargingCoilInfo extends InductorCoilAndChokesInfo{
    private String inductance;
    private WirelessCoilFunction function;
    private String type;
    private String qAtFreq;
    private String currentRating;
    private String selfResonantFreq;
    private String operatingTemp;
    private String size;
}


//Inductor Enums 
enum ArrayInductorShielding{
    Shielded,
    Unshielded,
    Unknown
}

enum FixedInductorShielding{
    Shielded,
    Semi_Shielding,
    Unshielded,
    Unknown
}

enum WirelessCoilFunction{
    Receiver,
    ReceiverTransmitter,
    Transmitter,
    Unknown
}

enum InductorMountingType{
    ChassisMount,
    FreeHanging,
    SurfaceMount,
    ThroughHole,
    UserDefined,
    Unknown
}

enum InductorRating{
    AEC_Q200,
    Unknown
}

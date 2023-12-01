package OMS;

/* 
 * File: IsolatorInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 30, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class IsolatorInfo extends ProductInfo{
    private int channelCount;
    private int voltageIsolation;
    private double commonModeTransientImmunity;
    private double propagationDelay;
    private double riseFallTime;
    private double voltageSupply;
    private double operatingTemp;
    private MountingType mountType;
    private String approvalAgency;
    private String supplierDevicePackage;
    
    private enum MountingType {
        Surface,
        Hole,
        DinRail,
        Connector,
        FreeHanging,
        Unknown
    }
}

final class DigitalIsolatorInfo extends IsolatorInfo {
    private double dataRate;
    private double pulseWidthDistortion;
    private String type;
    private String inputsSide1Side2;
    private String qualification;
    
    private enum Technology {
        CapacitiveCoupling,
        GMR,
        MagneticCoupling,
        Unknown
    }
    
    private enum IsolatedPower {
        Yes,
        No,
        Unknown
    }
    
    private enum ChannelType {
        Bidirectional,
        Unidirectional,
        Unknown
    }
    
    private enum GradeType {
        Automotive,
        Unknown
    }
}

final class GateDriverInfo extends IsolatorInfo {
    private int forwardDCCureent;
    private double pulseWidthDistortion;
    private double peakOutputCurrent;
    private double forwardVoltage;
    private String qualification;
    
    private enum Technology{
        CapacitiveCoupling,
        OpticalCoupling,
        MagneticCoupling,
        RFCoupling,
        Unknown
    }
    
    private enum GradeType{
        Automotive,
        Unknown
    }
    
}

final class SCROutputOptoisolatorInfo extends IsolatorInfo{
    private int turnOnTime;
    private int forwardCurrent;
    private double voltageOffState;
    private double maximumLEDTriggerCurrent;
    private double currentOnState;
    private double holdCurrent;
    private double forwardVoltage;
    private double staticDvDt;
    
    
    private enum OutputType {
        SCR,
        Triac,
        PowerTriac,
        Unknown
    }
    
    private enum ZeroCrossingCircuit {
        Yes,
        No,
        Unknown
    }
    
}

final class SpecialIsolatorInfo extends IsolatorInfo {
    private int outputCurrent;
    private int forwardCurrent;
    private double forwardVoltage;
    private InputType inputType;
    
    private enum InputType{
        AC,
        DC,
        I2C,
        Logic,
        Unknown
    }
}
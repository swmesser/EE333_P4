package OMS;

/* 
 * File: RelayInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class RelayInfo extends ProductInfo{
    private String contactCurrentRating;
    private String mustOperateVolt;
    private String mustReleaseVolt;
    private String operateTime;
    private String releaseTime;
    private String features;
    private String terminationStyle;
    private String operationTemp;
    private String coilVoltage;
    private RelayMountingType mount;
}

final class PowerRelayInfo extends RelayInfo{
    private String contactForm;
    private String coilCurrent;
    private RelayCoilType coil;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;
}

final class SignalRelayInfo extends RelayInfo{
    private String contactForm;
    private String sealRating;
    private String coilInsulation;
    private String contactMaterial;
    private String relayType;
}

final class AutomotiveRelayInfo extends RelayInfo{
    private String coilCurrent;
    private RelayCoilType coil;
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private RelayCoilType coil;
}

//Relay Enum
enum RelayCoilType{
        LatchingDualCoil,
        LatchingSingleCoil,
        NonLatching,
        Unknown
    }

enum RelayMountingType {
        ChassisMount,
        SurfaceMount,
        PanelMount,
        ThroughHole,
        ThroughHoleRightAngle,
        FreeHanging,
        Socketable,
        SocketableThroughHole,
        DINRail,
        Unknown
    }
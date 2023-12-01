package OMS;

/* 
 * File: RelayInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class RelayInfo extends ProductInfo{
    private double contactCurrentRating;
    private double mustOperateVolt;
    private double mustReleaseVolt;
    private double operateTime;
    private double releaseTime;
    private double operationTemp;
    private double coilVoltage;
    private String features;
    private String terminationStyle;
    private RelayMountingType mount;

    /**
     * @return the contactCurrentRating
     */
    public double getContactCurrentRating() {
        return contactCurrentRating;
    }

    /**
     * @param contactCurrentRating the contactCurrentRating to set
     */
    public void setContactCurrentRating(double contactCurrentRating) {
        this.contactCurrentRating = contactCurrentRating;
    }

    /**
     * @return the mustOperateVolt
     */
    public double getMustOperateVolt() {
        return mustOperateVolt;
    }

    /**
     * @param mustOperateVolt the mustOperateVolt to set
     */
    public void setMustOperateVolt(double mustOperateVolt) {
        this.mustOperateVolt = mustOperateVolt;
    }

    /**
     * @return the mustReleaseVolt
     */
    public double getMustReleaseVolt() {
        return mustReleaseVolt;
    }

    /**
     * @param mustReleaseVolt the mustReleaseVolt to set
     */
    public void setMustReleaseVolt(double mustReleaseVolt) {
        this.mustReleaseVolt = mustReleaseVolt;
    }

    /**
     * @return the operateTime
     */
    public double getOperateTime() {
        return operateTime;
    }

    /**
     * @param operateTime the operateTime to set
     */
    public void setOperateTime(double operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the releaseTime
     */
    public double getReleaseTime() {
        return releaseTime;
    }

    /**
     * @param releaseTime the releaseTime to set
     */
    public void setReleaseTime(double releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return the terminationStyle
     */
    public String getTerminationStyle() {
        return terminationStyle;
    }

    /**
     * @param terminationStyle the terminationStyle to set
     */
    public void setTerminationStyle(String terminationStyle) {
        this.terminationStyle = terminationStyle;
    }

    /**
     * @return the operationTemp
     */
    public double getOperationTemp() {
        return operationTemp;
    }

    /**
     * @param operationTemp the operationTemp to set
     */
    public void setOperationTemp(double operationTemp) {
        this.operationTemp = operationTemp;
    }

    /**
     * @return the coilVoltage
     */
    public double getCoilVoltage() {
        return coilVoltage;
    }

    /**
     * @param coilVoltage the coilVoltage to set
     */
    public void setCoilVoltage(double coilVoltage) {
        this.coilVoltage = coilVoltage;
    }

    /**
     * @return the mount
     */
    public RelayMountingType getMount() {
        return mount;
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(RelayMountingType mount) {
        this.mount = mount;
    }
}

final class PowerRelayInfo extends RelayInfo{
    private double coilCurrent;
    private double coilInsulation;
    private String contactForm;
    private RelayCoilType coil;
    private String sealRating;
    private String contactMaterial;
    private String relayType;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return contactForm;
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coilCurrent
     */
    public double getCoilCurrent() {
        return coilCurrent;
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(double coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return coil;
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return sealRating;
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public double getCoilInsulation() {
        return coilInsulation;
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(double coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return contactMaterial;
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return relayType;
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
    }
}

final class SignalRelayInfo extends RelayInfo{
    private double coilInsulation;
    private String contactForm;
    private String sealRating;
    private String contactMaterial;
    private String relayType;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return contactForm;
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the sealRating
     */
    public String getSealRating() {
        return sealRating;
    }

    /**
     * @param sealRating the sealRating to set
     */
    public void setSealRating(String sealRating) {
        this.sealRating = sealRating;
    }

    /**
     * @return the coilInsulation
     */
    public double getCoilInsulation() {
        return coilInsulation;
    }

    /**
     * @param coilInsulation the coilInsulation to set
     */
    public void setCoilInsulation(double coilInsulation) {
        this.coilInsulation = coilInsulation;
    }

    /**
     * @return the contactMaterial
     */
    public String getContactMaterial() {
        return contactMaterial;
    }

    /**
     * @param contactMaterial the contactMaterial to set
     */
    public void setContactMaterial(String contactMaterial) {
        this.contactMaterial = contactMaterial;
    }

    /**
     * @return the relayType
     */
    public String getRelayType() {
        return relayType;
    }

    /**
     * @param relayType the relayType to set
     */
    public void setRelayType(String relayType) {
        this.relayType = relayType;
    }
}

final class AutomotiveRelayInfo extends RelayInfo{
    private double coilCurrent;
    private RelayCoilType coil;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the coilCurrent
     */
    public double getCoilCurrent() {
        return coilCurrent;
    }

    /**
     * @param coilCurrent the coilCurrent to set
     */
    public void setCoilCurrent(double coilCurrent) {
        this.coilCurrent = coilCurrent;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return coil;
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }
}

final class HighFrequencyRelayInfo extends RelayInfo{
    private String contactForm;
    private RelayCoilType coil;
    
    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the contactForm
     */
    public String getContactForm() {
        return contactForm;
    }

    /**
     * @param contactForm the contactForm to set
     */
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    /**
     * @return the coil
     */
    public RelayCoilType getCoil() {
        return coil;
    }

    /**
     * @param coil the coil to set
     */
    public void setCoil(RelayCoilType coil) {
        this.coil = coil;
    }
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
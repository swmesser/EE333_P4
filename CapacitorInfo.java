package OMS;

/* 
 * File: CapacitorInfo
 * Copy: Copyright (c) 2023 Samuel W. Messer
 * BlazerID: swmesser
 * Vers: 1.0.0 Nov 29, 2023 SWM - Original Coding
 * Desc: Driver for testing concepts
 */

public abstract class CapacitorInfo extends ProductInfo{
    private double capacitance;
    private double tolerance;
    private double voltageRating;
    private double operationTemp;
    private String size;
    private String dielectricMat;
    private CapacitorMountingType mount;
    private String packageCase;
    private String seatedHeight;

    /**
     * @return the capacitance
     */
    public double getCapacitance() {
        return capacitance;
    }

    /**
     * @param capacitance the capacitance to set
     */
    public void setCapacitance(double capacitance) {
        this.capacitance = capacitance;
    }

    /**
     * @return the tolerance
     */
    public double getTolerance() {
        return tolerance;
    }

    /**
     * @param tolerance the tolerance to set
     */
    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    /**
     * @return the voltageRating
     */
    public double getVoltageRating() {
        return voltageRating;
    }

    /**
     * @param voltageRating the voltageRating to set
     */
    public void setVoltageRating(double voltageRating) {
        this.voltageRating = voltageRating;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the dielectricMat
     */
    public String getDielectricMat() {
        return dielectricMat;
    }

    /**
     * @param dielectricMat the dielectricMat to set
     */
    public void setDielectricMat(String dielectricMat) {
        this.dielectricMat = dielectricMat;
    }

    /**
     * @return the mount
     */
    public CapacitorMountingType getMount() {
        return mount;
    }

    /**
     * @param mount the mount to set
     */
    public void setMount(CapacitorMountingType mount) {
        this.mount = mount;
    }

    /**
     * @return the packageCase
     */
    public String getPackageCase() {
        return packageCase;
    }

    /**
     * @param packageCase the packageCase to set
     */
    public void setPackageCase(String packageCase) {
        this.packageCase = packageCase;
    }

    /**
     * @return the seatedHeight
     */
    public String getSeatedHeight() {
        return seatedHeight;
    }

    /**
     * @param seatedHeight the seatedHeight to set
     */
    public void setSeatedHeight(String seatedHeight) {
        this.seatedHeight = seatedHeight;
    }
}

final class TrimmerAndVariableInfo extends CapacitorInfo{
    private String capacitanceRange;
    private String adjustmentType;
    private String qAtFreq;
    private String features;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the capacitanceRange
     */
    public String getCapacitanceRange() {
        return capacitanceRange;
    }

    /**
     * @param capacitanceRange the capacitanceRange to set
     */
    public void setCapacitanceRange(String capacitanceRange) {
        this.capacitanceRange = capacitanceRange;
    }

    /**
     * @return the adjustmentType
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * @param adjustmentType the adjustmentType to set
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * @return the qAtFreq
     */
    public String getqAtFreq() {
        return qAtFreq;
    }

    /**
     * @param qAtFreq the qAtFreq to set
     */
    public void setqAtFreq(String qAtFreq) {
        this.qAtFreq = qAtFreq;
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
}

final class NetworksAndArraysInfo extends CapacitorInfo{
    private int capacitorCount;
    private String tempCoefficient;
    private String supplierDevicePackage;
    private CapacitorRatings rating;
    private CapacitorCircuitType circuit;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the capacitorCount
     */
    public int getCapacitorCount() {
        return capacitorCount;
    }

    /**
     * @param capacitorCount the capacitorCount to set
     */
    public void setCapacitorCount(int capacitorCount) {
        this.capacitorCount = capacitorCount;
    }

    /**
     * @return the tempCoefficient
     */
    public String getTempCoefficient() {
        return tempCoefficient;
    }

    /**
     * @param tempCoefficient the tempCoefficient to set
     */
    public void setTempCoefficient(String tempCoefficient) {
        this.tempCoefficient = tempCoefficient;
    }

    /**
     * @return the supplierDevicePackage
     */
    public String getSupplierDevicePackage() {
        return supplierDevicePackage;
    }

    /**
     * @param supplierDevicePackage the supplierDevicePackage to set
     */
    public void setSupplierDevicePackage(String supplierDevicePackage) {
        this.supplierDevicePackage = supplierDevicePackage;
    }

    /**
     * @return the rating
     */
    public CapacitorRatings getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(CapacitorRatings rating) {
        this.rating = rating;
    }

    /**
     * @return the circuit
     */
    public CapacitorCircuitType getCircuit() {
        return circuit;
    }

    /**
     * @param circuit the circuit to set
     */
    public void setCircuit(CapacitorCircuitType circuit) {
        this.circuit = circuit;
    }
}

final class MicaAndPTFEInfo extends CapacitorInfo{
    private String leadSpacing;
    private String features;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the leadSpacing
     */
    public String getLeadSpacing() {
        return leadSpacing;
    }

    /**
     * @param leadSpacing the leadSpacing to set
     */
    public void setLeadSpacing(String leadSpacing) {
        this.leadSpacing = leadSpacing;
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
}

final class EDLCAndSupercapacitorInfo extends CapacitorInfo{
    private double equivalentSeriesResistance;
    private String lifetimeAtTemp;
    private String termination;
    private String leadSpacing;

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the equivalentSeriesResistance
     */
    public double getEquivalentSeriesResistance() {
        return equivalentSeriesResistance;
    }

    /**
     * @param equivalentSeriesResistance the equivalentSeriesResistance to set
     */
    public void setEquivalentSeriesResistance(double equivalentSeriesResistance) {
        this.equivalentSeriesResistance = equivalentSeriesResistance;
    }

    /**
     * @return the lifetimeAtTemp
     */
    public String getLifetimeAtTemp() {
        return lifetimeAtTemp;
    }

    /**
     * @param lifetimeAtTemp the lifetimeAtTemp to set
     */
    public void setLifetimeAtTemp(String lifetimeAtTemp) {
        this.lifetimeAtTemp = lifetimeAtTemp;
    }

    /**
     * @return the termination
     */
    public String getTermination() {
        return termination;
    }

    /**
     * @param termination the termination to set
     */
    public void setTermination(String termination) {
        this.termination = termination;
    }

    /**
     * @return the leadSpacing
     */
    public String getLeadSpacing() {
        return leadSpacing;
    }

    /**
     * @param leadSpacing the leadSpacing to set
     */
    public void setLeadSpacing(String leadSpacing) {
        this.leadSpacing = leadSpacing;
    }
}


// ENUM for Capacitors
enum CapacitorMountingType{
    ChassisMount,
    PanelMount,
    BracketMount,
    UserDefined,
    ChassisMountRequiresHolder,
    ChassisStudMount,
    SurfaceMount,
    ThroughHole,
    Unknown
}

enum CapacitorRatings{
    AEC_Q200,
    Unknown
}

enum CapacitorCircuitType{
    Bussed,
    Isolated,
    Unknown
}
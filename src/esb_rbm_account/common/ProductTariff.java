/**
 * ProductTariff.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductTariff  implements java.io.Serializable {
    private int tariffID;

    private java.lang.String tariffName;

    private java.lang.String tariffNameThai;

    private java.lang.String tariffDesc;

    private java.lang.String startDat;

    private java.lang.String endDat;

    private double tariffPrice;

    private int modifierTypeId;

    private int productQuantityThreshold;

    private long productQuantity;

    private int additionsQuantity;

    private java.lang.Integer terminationsQuantity;

    public ProductTariff() {
    }

    public ProductTariff(
           int tariffID,
           java.lang.String tariffName,
           java.lang.String tariffNameThai,
           java.lang.String tariffDesc,
           java.lang.String startDat,
           java.lang.String endDat,
           double tariffPrice,
           int modifierTypeId,
           int productQuantityThreshold,
           long productQuantity,
           int additionsQuantity,
           java.lang.Integer terminationsQuantity) {
           this.tariffID = tariffID;
           this.tariffName = tariffName;
           this.tariffNameThai = tariffNameThai;
           this.tariffDesc = tariffDesc;
           this.startDat = startDat;
           this.endDat = endDat;
           this.tariffPrice = tariffPrice;
           this.modifierTypeId = modifierTypeId;
           this.productQuantityThreshold = productQuantityThreshold;
           this.productQuantity = productQuantity;
           this.additionsQuantity = additionsQuantity;
           this.terminationsQuantity = terminationsQuantity;
    }


    /**
     * Gets the tariffID value for this ProductTariff.
     * 
     * @return tariffID
     */
    public int getTariffID() {
        return tariffID;
    }


    /**
     * Sets the tariffID value for this ProductTariff.
     * 
     * @param tariffID
     */
    public void setTariffID(int tariffID) {
        this.tariffID = tariffID;
    }


    /**
     * Gets the tariffName value for this ProductTariff.
     * 
     * @return tariffName
     */
    public java.lang.String getTariffName() {
        return tariffName;
    }


    /**
     * Sets the tariffName value for this ProductTariff.
     * 
     * @param tariffName
     */
    public void setTariffName(java.lang.String tariffName) {
        this.tariffName = tariffName;
    }


    /**
     * Gets the tariffNameThai value for this ProductTariff.
     * 
     * @return tariffNameThai
     */
    public java.lang.String getTariffNameThai() {
        return tariffNameThai;
    }


    /**
     * Sets the tariffNameThai value for this ProductTariff.
     * 
     * @param tariffNameThai
     */
    public void setTariffNameThai(java.lang.String tariffNameThai) {
        this.tariffNameThai = tariffNameThai;
    }


    /**
     * Gets the tariffDesc value for this ProductTariff.
     * 
     * @return tariffDesc
     */
    public java.lang.String getTariffDesc() {
        return tariffDesc;
    }


    /**
     * Sets the tariffDesc value for this ProductTariff.
     * 
     * @param tariffDesc
     */
    public void setTariffDesc(java.lang.String tariffDesc) {
        this.tariffDesc = tariffDesc;
    }


    /**
     * Gets the startDat value for this ProductTariff.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this ProductTariff.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the endDat value for this ProductTariff.
     * 
     * @return endDat
     */
    public java.lang.String getEndDat() {
        return endDat;
    }


    /**
     * Sets the endDat value for this ProductTariff.
     * 
     * @param endDat
     */
    public void setEndDat(java.lang.String endDat) {
        this.endDat = endDat;
    }


    /**
     * Gets the tariffPrice value for this ProductTariff.
     * 
     * @return tariffPrice
     */
    public double getTariffPrice() {
        return tariffPrice;
    }


    /**
     * Sets the tariffPrice value for this ProductTariff.
     * 
     * @param tariffPrice
     */
    public void setTariffPrice(double tariffPrice) {
        this.tariffPrice = tariffPrice;
    }


    /**
     * Gets the modifierTypeId value for this ProductTariff.
     * 
     * @return modifierTypeId
     */
    public int getModifierTypeId() {
        return modifierTypeId;
    }


    /**
     * Sets the modifierTypeId value for this ProductTariff.
     * 
     * @param modifierTypeId
     */
    public void setModifierTypeId(int modifierTypeId) {
        this.modifierTypeId = modifierTypeId;
    }


    /**
     * Gets the productQuantityThreshold value for this ProductTariff.
     * 
     * @return productQuantityThreshold
     */
    public int getProductQuantityThreshold() {
        return productQuantityThreshold;
    }


    /**
     * Sets the productQuantityThreshold value for this ProductTariff.
     * 
     * @param productQuantityThreshold
     */
    public void setProductQuantityThreshold(int productQuantityThreshold) {
        this.productQuantityThreshold = productQuantityThreshold;
    }


    /**
     * Gets the productQuantity value for this ProductTariff.
     * 
     * @return productQuantity
     */
    public long getProductQuantity() {
        return productQuantity;
    }


    /**
     * Sets the productQuantity value for this ProductTariff.
     * 
     * @param productQuantity
     */
    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }


    /**
     * Gets the additionsQuantity value for this ProductTariff.
     * 
     * @return additionsQuantity
     */
    public int getAdditionsQuantity() {
        return additionsQuantity;
    }


    /**
     * Sets the additionsQuantity value for this ProductTariff.
     * 
     * @param additionsQuantity
     */
    public void setAdditionsQuantity(int additionsQuantity) {
        this.additionsQuantity = additionsQuantity;
    }


    /**
     * Gets the terminationsQuantity value for this ProductTariff.
     * 
     * @return terminationsQuantity
     */
    public java.lang.Integer getTerminationsQuantity() {
        return terminationsQuantity;
    }


    /**
     * Sets the terminationsQuantity value for this ProductTariff.
     * 
     * @param terminationsQuantity
     */
    public void setTerminationsQuantity(java.lang.Integer terminationsQuantity) {
        this.terminationsQuantity = terminationsQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTariff)) return false;
        ProductTariff other = (ProductTariff) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tariffID == other.getTariffID() &&
            ((this.tariffName==null && other.getTariffName()==null) || 
             (this.tariffName!=null &&
              this.tariffName.equals(other.getTariffName()))) &&
            ((this.tariffNameThai==null && other.getTariffNameThai()==null) || 
             (this.tariffNameThai!=null &&
              this.tariffNameThai.equals(other.getTariffNameThai()))) &&
            ((this.tariffDesc==null && other.getTariffDesc()==null) || 
             (this.tariffDesc!=null &&
              this.tariffDesc.equals(other.getTariffDesc()))) &&
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.endDat==null && other.getEndDat()==null) || 
             (this.endDat!=null &&
              this.endDat.equals(other.getEndDat()))) &&
            this.tariffPrice == other.getTariffPrice() &&
            this.modifierTypeId == other.getModifierTypeId() &&
            this.productQuantityThreshold == other.getProductQuantityThreshold() &&
            this.productQuantity == other.getProductQuantity() &&
            this.additionsQuantity == other.getAdditionsQuantity() &&
            ((this.terminationsQuantity==null && other.getTerminationsQuantity()==null) || 
             (this.terminationsQuantity!=null &&
              this.terminationsQuantity.equals(other.getTerminationsQuantity())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTariffID();
        if (getTariffName() != null) {
            _hashCode += getTariffName().hashCode();
        }
        if (getTariffNameThai() != null) {
            _hashCode += getTariffNameThai().hashCode();
        }
        if (getTariffDesc() != null) {
            _hashCode += getTariffDesc().hashCode();
        }
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getEndDat() != null) {
            _hashCode += getEndDat().hashCode();
        }
        _hashCode += new Double(getTariffPrice()).hashCode();
        _hashCode += getModifierTypeId();
        _hashCode += getProductQuantityThreshold();
        _hashCode += new Long(getProductQuantity()).hashCode();
        _hashCode += getAdditionsQuantity();
        if (getTerminationsQuantity() != null) {
            _hashCode += getTerminationsQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * HistoriedProductInstanceTariffData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class HistoriedProductInstanceTariffData  implements java.io.Serializable {
    private java.lang.String startDat;

    private java.lang.String endDat;

    private long productQuantity;

    private java.lang.Integer additionsQuantity;

    private java.lang.Integer terminationsQuantity;

    private int billingTariffId;

    public HistoriedProductInstanceTariffData() {
    }

    public HistoriedProductInstanceTariffData(
           java.lang.String startDat,
           java.lang.String endDat,
           long productQuantity,
           java.lang.Integer additionsQuantity,
           java.lang.Integer terminationsQuantity,
           int billingTariffId) {
           this.startDat = startDat;
           this.endDat = endDat;
           this.productQuantity = productQuantity;
           this.additionsQuantity = additionsQuantity;
           this.terminationsQuantity = terminationsQuantity;
           this.billingTariffId = billingTariffId;
    }


    /**
     * Gets the startDat value for this HistoriedProductInstanceTariffData.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this HistoriedProductInstanceTariffData.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the endDat value for this HistoriedProductInstanceTariffData.
     * 
     * @return endDat
     */
    public java.lang.String getEndDat() {
        return endDat;
    }


    /**
     * Sets the endDat value for this HistoriedProductInstanceTariffData.
     * 
     * @param endDat
     */
    public void setEndDat(java.lang.String endDat) {
        this.endDat = endDat;
    }


    /**
     * Gets the productQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @return productQuantity
     */
    public long getProductQuantity() {
        return productQuantity;
    }


    /**
     * Sets the productQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @param productQuantity
     */
    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }


    /**
     * Gets the additionsQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @return additionsQuantity
     */
    public java.lang.Integer getAdditionsQuantity() {
        return additionsQuantity;
    }


    /**
     * Sets the additionsQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @param additionsQuantity
     */
    public void setAdditionsQuantity(java.lang.Integer additionsQuantity) {
        this.additionsQuantity = additionsQuantity;
    }


    /**
     * Gets the terminationsQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @return terminationsQuantity
     */
    public java.lang.Integer getTerminationsQuantity() {
        return terminationsQuantity;
    }


    /**
     * Sets the terminationsQuantity value for this HistoriedProductInstanceTariffData.
     * 
     * @param terminationsQuantity
     */
    public void setTerminationsQuantity(java.lang.Integer terminationsQuantity) {
        this.terminationsQuantity = terminationsQuantity;
    }


    /**
     * Gets the billingTariffId value for this HistoriedProductInstanceTariffData.
     * 
     * @return billingTariffId
     */
    public int getBillingTariffId() {
        return billingTariffId;
    }


    /**
     * Sets the billingTariffId value for this HistoriedProductInstanceTariffData.
     * 
     * @param billingTariffId
     */
    public void setBillingTariffId(int billingTariffId) {
        this.billingTariffId = billingTariffId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoriedProductInstanceTariffData)) return false;
        HistoriedProductInstanceTariffData other = (HistoriedProductInstanceTariffData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.endDat==null && other.getEndDat()==null) || 
             (this.endDat!=null &&
              this.endDat.equals(other.getEndDat()))) &&
            this.productQuantity == other.getProductQuantity() &&
            ((this.additionsQuantity==null && other.getAdditionsQuantity()==null) || 
             (this.additionsQuantity!=null &&
              this.additionsQuantity.equals(other.getAdditionsQuantity()))) &&
            ((this.terminationsQuantity==null && other.getTerminationsQuantity()==null) || 
             (this.terminationsQuantity!=null &&
              this.terminationsQuantity.equals(other.getTerminationsQuantity()))) &&
            this.billingTariffId == other.getBillingTariffId();
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
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getEndDat() != null) {
            _hashCode += getEndDat().hashCode();
        }
        _hashCode += new Long(getProductQuantity()).hashCode();
        if (getAdditionsQuantity() != null) {
            _hashCode += getAdditionsQuantity().hashCode();
        }
        if (getTerminationsQuantity() != null) {
            _hashCode += getTerminationsQuantity().hashCode();
        }
        _hashCode += getBillingTariffId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

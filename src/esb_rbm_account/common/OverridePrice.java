/**
 * OverridePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class OverridePrice  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int productSeq;

    private java.lang.String startDat;

    private java.lang.String endDat;

    private double custTariffPrice;

    private int modifierTypeId;

    public OverridePrice() {
    }

    public OverridePrice(
           java.lang.String customerRef,
           int productSeq,
           java.lang.String startDat,
           java.lang.String endDat,
           double custTariffPrice,
           int modifierTypeId) {
           this.customerRef = customerRef;
           this.productSeq = productSeq;
           this.startDat = startDat;
           this.endDat = endDat;
           this.custTariffPrice = custTariffPrice;
           this.modifierTypeId = modifierTypeId;
    }


    /**
     * Gets the customerRef value for this OverridePrice.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this OverridePrice.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the productSeq value for this OverridePrice.
     * 
     * @return productSeq
     */
    public int getProductSeq() {
        return productSeq;
    }


    /**
     * Sets the productSeq value for this OverridePrice.
     * 
     * @param productSeq
     */
    public void setProductSeq(int productSeq) {
        this.productSeq = productSeq;
    }


    /**
     * Gets the startDat value for this OverridePrice.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this OverridePrice.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the endDat value for this OverridePrice.
     * 
     * @return endDat
     */
    public java.lang.String getEndDat() {
        return endDat;
    }


    /**
     * Sets the endDat value for this OverridePrice.
     * 
     * @param endDat
     */
    public void setEndDat(java.lang.String endDat) {
        this.endDat = endDat;
    }


    /**
     * Gets the custTariffPrice value for this OverridePrice.
     * 
     * @return custTariffPrice
     */
    public double getCustTariffPrice() {
        return custTariffPrice;
    }


    /**
     * Sets the custTariffPrice value for this OverridePrice.
     * 
     * @param custTariffPrice
     */
    public void setCustTariffPrice(double custTariffPrice) {
        this.custTariffPrice = custTariffPrice;
    }


    /**
     * Gets the modifierTypeId value for this OverridePrice.
     * 
     * @return modifierTypeId
     */
    public int getModifierTypeId() {
        return modifierTypeId;
    }


    /**
     * Sets the modifierTypeId value for this OverridePrice.
     * 
     * @param modifierTypeId
     */
    public void setModifierTypeId(int modifierTypeId) {
        this.modifierTypeId = modifierTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverridePrice)) return false;
        OverridePrice other = (OverridePrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            this.productSeq == other.getProductSeq() &&
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.endDat==null && other.getEndDat()==null) || 
             (this.endDat!=null &&
              this.endDat.equals(other.getEndDat()))) &&
            this.custTariffPrice == other.getCustTariffPrice() &&
            this.modifierTypeId == other.getModifierTypeId();
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
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        _hashCode += getProductSeq();
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getEndDat() != null) {
            _hashCode += getEndDat().hashCode();
        }
        _hashCode += new Double(getCustTariffPrice()).hashCode();
        _hashCode += getModifierTypeId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

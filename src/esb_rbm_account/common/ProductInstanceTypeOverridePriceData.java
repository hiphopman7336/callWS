/**
 * ProductInstanceTypeOverridePriceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceTypeOverridePriceData  implements java.io.Serializable {
    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    private int modifierType;

    private long amountOverride;

    private java.lang.String notes;

    public ProductInstanceTypeOverridePriceData() {
    }

    public ProductInstanceTypeOverridePriceData(
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           int modifierType,
           long amountOverride,
           java.lang.String notes) {
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.modifierType = modifierType;
           this.amountOverride = amountOverride;
           this.notes = notes;
    }


    /**
     * Gets the startDateTime value for this ProductInstanceTypeOverridePriceData.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProductInstanceTypeOverridePriceData.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProductInstanceTypeOverridePriceData.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProductInstanceTypeOverridePriceData.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the modifierType value for this ProductInstanceTypeOverridePriceData.
     * 
     * @return modifierType
     */
    public int getModifierType() {
        return modifierType;
    }


    /**
     * Sets the modifierType value for this ProductInstanceTypeOverridePriceData.
     * 
     * @param modifierType
     */
    public void setModifierType(int modifierType) {
        this.modifierType = modifierType;
    }


    /**
     * Gets the amountOverride value for this ProductInstanceTypeOverridePriceData.
     * 
     * @return amountOverride
     */
    public long getAmountOverride() {
        return amountOverride;
    }


    /**
     * Sets the amountOverride value for this ProductInstanceTypeOverridePriceData.
     * 
     * @param amountOverride
     */
    public void setAmountOverride(long amountOverride) {
        this.amountOverride = amountOverride;
    }


    /**
     * Gets the notes value for this ProductInstanceTypeOverridePriceData.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ProductInstanceTypeOverridePriceData.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceTypeOverridePriceData)) return false;
        ProductInstanceTypeOverridePriceData other = (ProductInstanceTypeOverridePriceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            this.modifierType == other.getModifierType() &&
            this.amountOverride == other.getAmountOverride() &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        _hashCode += getModifierType();
        _hashCode += new Long(getAmountOverride()).hashCode();
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

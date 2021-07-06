/**
 * RBMAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class RBMAddressType  implements java.io.Serializable {
    private int countryID;

    private java.lang.String zipCode;

    private java.lang.String[] addressLine;

    private esb_rbm_account.common.AddressPKType addressPK;

    private java.lang.String startDate;

    private java.lang.String endDate;

    public RBMAddressType() {
    }

    public RBMAddressType(
           int countryID,
           java.lang.String zipCode,
           java.lang.String[] addressLine,
           esb_rbm_account.common.AddressPKType addressPK,
           java.lang.String startDate,
           java.lang.String endDate) {
           this.countryID = countryID;
           this.zipCode = zipCode;
           this.addressLine = addressLine;
           this.addressPK = addressPK;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the countryID value for this RBMAddressType.
     * 
     * @return countryID
     */
    public int getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this RBMAddressType.
     * 
     * @param countryID
     */
    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the zipCode value for this RBMAddressType.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this RBMAddressType.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the addressLine value for this RBMAddressType.
     * 
     * @return addressLine
     */
    public java.lang.String[] getAddressLine() {
        return addressLine;
    }


    /**
     * Sets the addressLine value for this RBMAddressType.
     * 
     * @param addressLine
     */
    public void setAddressLine(java.lang.String[] addressLine) {
        this.addressLine = addressLine;
    }

    public java.lang.String getAddressLine(int i) {
        return this.addressLine[i];
    }

    public void setAddressLine(int i, java.lang.String _value) {
        this.addressLine[i] = _value;
    }


    /**
     * Gets the addressPK value for this RBMAddressType.
     * 
     * @return addressPK
     */
    public esb_rbm_account.common.AddressPKType getAddressPK() {
        return addressPK;
    }


    /**
     * Sets the addressPK value for this RBMAddressType.
     * 
     * @param addressPK
     */
    public void setAddressPK(esb_rbm_account.common.AddressPKType addressPK) {
        this.addressPK = addressPK;
    }


    /**
     * Gets the startDate value for this RBMAddressType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RBMAddressType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this RBMAddressType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this RBMAddressType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RBMAddressType)) return false;
        RBMAddressType other = (RBMAddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.countryID == other.getCountryID() &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.addressLine==null && other.getAddressLine()==null) || 
             (this.addressLine!=null &&
              java.util.Arrays.equals(this.addressLine, other.getAddressLine()))) &&
            ((this.addressPK==null && other.getAddressPK()==null) || 
             (this.addressPK!=null &&
              this.addressPK.equals(other.getAddressPK()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        _hashCode += getCountryID();
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressPK() != null) {
            _hashCode += getAddressPK().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

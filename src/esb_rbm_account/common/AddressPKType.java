/**
 * AddressPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class AddressPKType  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int addressSeq;

    public AddressPKType() {
    }

    public AddressPKType(
           java.lang.String customerRef,
           int addressSeq) {
           this.customerRef = customerRef;
           this.addressSeq = addressSeq;
    }


    /**
     * Gets the customerRef value for this AddressPKType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this AddressPKType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the addressSeq value for this AddressPKType.
     * 
     * @return addressSeq
     */
    public int getAddressSeq() {
        return addressSeq;
    }


    /**
     * Sets the addressSeq value for this AddressPKType.
     * 
     * @param addressSeq
     */
    public void setAddressSeq(int addressSeq) {
        this.addressSeq = addressSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressPKType)) return false;
        AddressPKType other = (AddressPKType) obj;
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
            this.addressSeq == other.getAddressSeq();
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
        _hashCode += getAddressSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

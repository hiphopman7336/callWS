/**
 * ContactPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ContactPKType  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int contactSeq;

    public ContactPKType() {
    }

    public ContactPKType(
           java.lang.String customerRef,
           int contactSeq) {
           this.customerRef = customerRef;
           this.contactSeq = contactSeq;
    }


    /**
     * Gets the customerRef value for this ContactPKType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this ContactPKType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the contactSeq value for this ContactPKType.
     * 
     * @return contactSeq
     */
    public int getContactSeq() {
        return contactSeq;
    }


    /**
     * Sets the contactSeq value for this ContactPKType.
     * 
     * @param contactSeq
     */
    public void setContactSeq(int contactSeq) {
        this.contactSeq = contactSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactPKType)) return false;
        ContactPKType other = (ContactPKType) obj;
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
            this.contactSeq == other.getContactSeq();
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
        _hashCode += getContactSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

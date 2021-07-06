/**
 * ModifyAddressRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.address;

public class ModifyAddressRequestBody  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int addressSeq;

    private esb_rbm_account.common.AddressType address;

    public ModifyAddressRequestBody() {
    }

    public ModifyAddressRequestBody(
           java.lang.String customerRef,
           int addressSeq,
           esb_rbm_account.common.AddressType address) {
           this.customerRef = customerRef;
           this.addressSeq = addressSeq;
           this.address = address;
    }


    /**
     * Gets the customerRef value for this ModifyAddressRequestBody.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this ModifyAddressRequestBody.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the addressSeq value for this ModifyAddressRequestBody.
     * 
     * @return addressSeq
     */
    public int getAddressSeq() {
        return addressSeq;
    }


    /**
     * Sets the addressSeq value for this ModifyAddressRequestBody.
     * 
     * @param addressSeq
     */
    public void setAddressSeq(int addressSeq) {
        this.addressSeq = addressSeq;
    }


    /**
     * Gets the address value for this ModifyAddressRequestBody.
     * 
     * @return address
     */
    public esb_rbm_account.common.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ModifyAddressRequestBody.
     * 
     * @param address
     */
    public void setAddress(esb_rbm_account.common.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAddressRequestBody)) return false;
        ModifyAddressRequestBody other = (ModifyAddressRequestBody) obj;
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
            this.addressSeq == other.getAddressSeq() &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

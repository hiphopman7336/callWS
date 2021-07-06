/**
 * CreateAddressRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.address;

public class CreateAddressRequestBody  implements java.io.Serializable {
    private java.lang.String customerRef;

    private esb_rbm_account.common.AddressType address;

    public CreateAddressRequestBody() {
    }

    public CreateAddressRequestBody(
           java.lang.String customerRef,
           esb_rbm_account.common.AddressType address) {
           this.customerRef = customerRef;
           this.address = address;
    }


    /**
     * Gets the customerRef value for this CreateAddressRequestBody.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this CreateAddressRequestBody.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the address value for this CreateAddressRequestBody.
     * 
     * @return address
     */
    public esb_rbm_account.common.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CreateAddressRequestBody.
     * 
     * @param address
     */
    public void setAddress(esb_rbm_account.common.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAddressRequestBody)) return false;
        CreateAddressRequestBody other = (CreateAddressRequestBody) obj;
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

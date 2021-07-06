/**
 * ModifyBillingAddressRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyBillingAddressRequestBody  implements java.io.Serializable {
    private java.lang.String customerRef;

    private java.lang.String accountRef;

    private esb_rbm_account.common.AddressType address;

    public ModifyBillingAddressRequestBody() {
    }

    public ModifyBillingAddressRequestBody(
           java.lang.String customerRef,
           java.lang.String accountRef,
           esb_rbm_account.common.AddressType address) {
           this.customerRef = customerRef;
           this.accountRef = accountRef;
           this.address = address;
    }


    /**
     * Gets the customerRef value for this ModifyBillingAddressRequestBody.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this ModifyBillingAddressRequestBody.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the accountRef value for this ModifyBillingAddressRequestBody.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this ModifyBillingAddressRequestBody.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the address value for this ModifyBillingAddressRequestBody.
     * 
     * @return address
     */
    public esb_rbm_account.common.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ModifyBillingAddressRequestBody.
     * 
     * @param address
     */
    public void setAddress(esb_rbm_account.common.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyBillingAddressRequestBody)) return false;
        ModifyBillingAddressRequestBody other = (ModifyBillingAddressRequestBody) obj;
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
            ((this.accountRef==null && other.getAccountRef()==null) || 
             (this.accountRef!=null &&
              this.accountRef.equals(other.getAccountRef()))) &&
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
        if (getAccountRef() != null) {
            _hashCode += getAccountRef().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

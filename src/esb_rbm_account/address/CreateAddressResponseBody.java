/**
 * CreateAddressResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.address;

public class CreateAddressResponseBody  implements java.io.Serializable {
    private esb_rbm_account.common.AddressPKType addressPK;

    public CreateAddressResponseBody() {
    }

    public CreateAddressResponseBody(
           esb_rbm_account.common.AddressPKType addressPK) {
           this.addressPK = addressPK;
    }


    /**
     * Gets the addressPK value for this CreateAddressResponseBody.
     * 
     * @return addressPK
     */
    public esb_rbm_account.common.AddressPKType getAddressPK() {
        return addressPK;
    }


    /**
     * Sets the addressPK value for this CreateAddressResponseBody.
     * 
     * @param addressPK
     */
    public void setAddressPK(esb_rbm_account.common.AddressPKType addressPK) {
        this.addressPK = addressPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAddressResponseBody)) return false;
        CreateAddressResponseBody other = (CreateAddressResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressPK==null && other.getAddressPK()==null) || 
             (this.addressPK!=null &&
              this.addressPK.equals(other.getAddressPK())));
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
        if (getAddressPK() != null) {
            _hashCode += getAddressPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

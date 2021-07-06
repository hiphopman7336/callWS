/**
 * ProductInstanceTypeAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceTypeAddress  implements java.io.Serializable {
    private esb_rbm_account.common.AddressPKType addressPK;

    private esb_rbm_account.common.AddressType address;

    private esb_rbm_account.common.RBMAddressType RBMAddress;

    public ProductInstanceTypeAddress() {
    }

    public ProductInstanceTypeAddress(
           esb_rbm_account.common.AddressPKType addressPK,
           esb_rbm_account.common.AddressType address,
           esb_rbm_account.common.RBMAddressType RBMAddress) {
           this.addressPK = addressPK;
           this.address = address;
           this.RBMAddress = RBMAddress;
    }


    /**
     * Gets the addressPK value for this ProductInstanceTypeAddress.
     * 
     * @return addressPK
     */
    public esb_rbm_account.common.AddressPKType getAddressPK() {
        return addressPK;
    }


    /**
     * Sets the addressPK value for this ProductInstanceTypeAddress.
     * 
     * @param addressPK
     */
    public void setAddressPK(esb_rbm_account.common.AddressPKType addressPK) {
        this.addressPK = addressPK;
    }


    /**
     * Gets the address value for this ProductInstanceTypeAddress.
     * 
     * @return address
     */
    public esb_rbm_account.common.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ProductInstanceTypeAddress.
     * 
     * @param address
     */
    public void setAddress(esb_rbm_account.common.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the RBMAddress value for this ProductInstanceTypeAddress.
     * 
     * @return RBMAddress
     */
    public esb_rbm_account.common.RBMAddressType getRBMAddress() {
        return RBMAddress;
    }


    /**
     * Sets the RBMAddress value for this ProductInstanceTypeAddress.
     * 
     * @param RBMAddress
     */
    public void setRBMAddress(esb_rbm_account.common.RBMAddressType RBMAddress) {
        this.RBMAddress = RBMAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceTypeAddress)) return false;
        ProductInstanceTypeAddress other = (ProductInstanceTypeAddress) obj;
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
              this.addressPK.equals(other.getAddressPK()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.RBMAddress==null && other.getRBMAddress()==null) || 
             (this.RBMAddress!=null &&
              this.RBMAddress.equals(other.getRBMAddress())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getRBMAddress() != null) {
            _hashCode += getRBMAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

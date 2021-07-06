/**
 * CreateBAResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class CreateBAResponseBody  implements java.io.Serializable {
    private java.lang.String accountRef;

    private long accountLockVersion;

    private esb_rbm_account.common.ContactPKType contactPK;

    private esb_rbm_account.common.AddressPKType addressPK;

    public CreateBAResponseBody() {
    }

    public CreateBAResponseBody(
           java.lang.String accountRef,
           long accountLockVersion,
           esb_rbm_account.common.ContactPKType contactPK,
           esb_rbm_account.common.AddressPKType addressPK) {
           this.accountRef = accountRef;
           this.accountLockVersion = accountLockVersion;
           this.contactPK = contactPK;
           this.addressPK = addressPK;
    }


    /**
     * Gets the accountRef value for this CreateBAResponseBody.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this CreateBAResponseBody.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the accountLockVersion value for this CreateBAResponseBody.
     * 
     * @return accountLockVersion
     */
    public long getAccountLockVersion() {
        return accountLockVersion;
    }


    /**
     * Sets the accountLockVersion value for this CreateBAResponseBody.
     * 
     * @param accountLockVersion
     */
    public void setAccountLockVersion(long accountLockVersion) {
        this.accountLockVersion = accountLockVersion;
    }


    /**
     * Gets the contactPK value for this CreateBAResponseBody.
     * 
     * @return contactPK
     */
    public esb_rbm_account.common.ContactPKType getContactPK() {
        return contactPK;
    }


    /**
     * Sets the contactPK value for this CreateBAResponseBody.
     * 
     * @param contactPK
     */
    public void setContactPK(esb_rbm_account.common.ContactPKType contactPK) {
        this.contactPK = contactPK;
    }


    /**
     * Gets the addressPK value for this CreateBAResponseBody.
     * 
     * @return addressPK
     */
    public esb_rbm_account.common.AddressPKType getAddressPK() {
        return addressPK;
    }


    /**
     * Sets the addressPK value for this CreateBAResponseBody.
     * 
     * @param addressPK
     */
    public void setAddressPK(esb_rbm_account.common.AddressPKType addressPK) {
        this.addressPK = addressPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBAResponseBody)) return false;
        CreateBAResponseBody other = (CreateBAResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountRef==null && other.getAccountRef()==null) || 
             (this.accountRef!=null &&
              this.accountRef.equals(other.getAccountRef()))) &&
            this.accountLockVersion == other.getAccountLockVersion() &&
            ((this.contactPK==null && other.getContactPK()==null) || 
             (this.contactPK!=null &&
              this.contactPK.equals(other.getContactPK()))) &&
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
        if (getAccountRef() != null) {
            _hashCode += getAccountRef().hashCode();
        }
        _hashCode += new Long(getAccountLockVersion()).hashCode();
        if (getContactPK() != null) {
            _hashCode += getContactPK().hashCode();
        }
        if (getAddressPK() != null) {
            _hashCode += getAddressPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

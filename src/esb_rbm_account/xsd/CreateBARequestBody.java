/**
 * CreateBARequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class CreateBARequestBody  implements java.io.Serializable {
    private esb_rbm_account.common.AccountInfoType accountInfo;

    private esb_rbm_account.common.ContactType contact;

    public CreateBARequestBody() {
    }

    public CreateBARequestBody(
           esb_rbm_account.common.AccountInfoType accountInfo,
           esb_rbm_account.common.ContactType contact) {
           this.accountInfo = accountInfo;
           this.contact = contact;
    }


    /**
     * Gets the accountInfo value for this CreateBARequestBody.
     * 
     * @return accountInfo
     */
    public esb_rbm_account.common.AccountInfoType getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this CreateBARequestBody.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(esb_rbm_account.common.AccountInfoType accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the contact value for this CreateBARequestBody.
     * 
     * @return contact
     */
    public esb_rbm_account.common.ContactType getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CreateBARequestBody.
     * 
     * @param contact
     */
    public void setContact(esb_rbm_account.common.ContactType contact) {
        this.contact = contact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBARequestBody)) return false;
        CreateBARequestBody other = (CreateBARequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact())));
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
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

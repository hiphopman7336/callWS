/**
 * UpdateAccountAttributesRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class UpdateAccountAttributesRequestBody  implements java.io.Serializable {
    private java.lang.String accountRef;

    private esb_rbm_account.xsd.UpdateAccountAttributesRequestBodyAccountAttributes accountAttributes;

    public UpdateAccountAttributesRequestBody() {
    }

    public UpdateAccountAttributesRequestBody(
           java.lang.String accountRef,
           esb_rbm_account.xsd.UpdateAccountAttributesRequestBodyAccountAttributes accountAttributes) {
           this.accountRef = accountRef;
           this.accountAttributes = accountAttributes;
    }


    /**
     * Gets the accountRef value for this UpdateAccountAttributesRequestBody.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this UpdateAccountAttributesRequestBody.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the accountAttributes value for this UpdateAccountAttributesRequestBody.
     * 
     * @return accountAttributes
     */
    public esb_rbm_account.xsd.UpdateAccountAttributesRequestBodyAccountAttributes getAccountAttributes() {
        return accountAttributes;
    }


    /**
     * Sets the accountAttributes value for this UpdateAccountAttributesRequestBody.
     * 
     * @param accountAttributes
     */
    public void setAccountAttributes(esb_rbm_account.xsd.UpdateAccountAttributesRequestBodyAccountAttributes accountAttributes) {
        this.accountAttributes = accountAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAccountAttributesRequestBody)) return false;
        UpdateAccountAttributesRequestBody other = (UpdateAccountAttributesRequestBody) obj;
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
            ((this.accountAttributes==null && other.getAccountAttributes()==null) || 
             (this.accountAttributes!=null &&
              this.accountAttributes.equals(other.getAccountAttributes())));
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
        if (getAccountAttributes() != null) {
            _hashCode += getAccountAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

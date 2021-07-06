/**
 * QueryBARequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class QueryBARequestBody  implements java.io.Serializable {
    private java.lang.String billingAccountId;

    public QueryBARequestBody() {
    }

    public QueryBARequestBody(
           java.lang.String billingAccountId) {
           this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the billingAccountId value for this QueryBARequestBody.
     * 
     * @return billingAccountId
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this QueryBARequestBody.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBARequestBody)) return false;
        QueryBARequestBody other = (QueryBARequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccountId==null && other.getBillingAccountId()==null) || 
             (this.billingAccountId!=null &&
              this.billingAccountId.equals(other.getBillingAccountId())));
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
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

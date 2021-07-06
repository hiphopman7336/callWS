/**
 * IntegrationContextHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common_integrated;

public class IntegrationContextHeader  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String integrationKeyRef;

    public IntegrationContextHeader() {
    }

    public IntegrationContextHeader(
           java.lang.String transactionId,
           java.lang.String integrationKeyRef) {
           this.transactionId = transactionId;
           this.integrationKeyRef = integrationKeyRef;
    }


    /**
     * Gets the transactionId value for this IntegrationContextHeader.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this IntegrationContextHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the integrationKeyRef value for this IntegrationContextHeader.
     * 
     * @return integrationKeyRef
     */
    public java.lang.String getIntegrationKeyRef() {
        return integrationKeyRef;
    }


    /**
     * Sets the integrationKeyRef value for this IntegrationContextHeader.
     * 
     * @param integrationKeyRef
     */
    public void setIntegrationKeyRef(java.lang.String integrationKeyRef) {
        this.integrationKeyRef = integrationKeyRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationContextHeader)) return false;
        IntegrationContextHeader other = (IntegrationContextHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.integrationKeyRef==null && other.getIntegrationKeyRef()==null) || 
             (this.integrationKeyRef!=null &&
              this.integrationKeyRef.equals(other.getIntegrationKeyRef())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getIntegrationKeyRef() != null) {
            _hashCode += getIntegrationKeyRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

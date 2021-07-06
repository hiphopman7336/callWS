/**
 * IntegrationContextMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common_integrated;

public class IntegrationContextMessage  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.Result integrationResult;

    public IntegrationContextMessage() {
    }

    public IntegrationContextMessage(
           esb_rbm_account.common_integrated.Result integrationResult) {
           this.integrationResult = integrationResult;
    }


    /**
     * Gets the integrationResult value for this IntegrationContextMessage.
     * 
     * @return integrationResult
     */
    public esb_rbm_account.common_integrated.Result getIntegrationResult() {
        return integrationResult;
    }


    /**
     * Sets the integrationResult value for this IntegrationContextMessage.
     * 
     * @param integrationResult
     */
    public void setIntegrationResult(esb_rbm_account.common_integrated.Result integrationResult) {
        this.integrationResult = integrationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrationContextMessage)) return false;
        IntegrationContextMessage other = (IntegrationContextMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integrationResult==null && other.getIntegrationResult()==null) || 
             (this.integrationResult!=null &&
              this.integrationResult.equals(other.getIntegrationResult())));
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
        if (getIntegrationResult() != null) {
            _hashCode += getIntegrationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

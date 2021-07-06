/**
 * TerminateAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class TerminateAccountResponse  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator;

    private esb_rbm_account.xsd.TerminateAccountResponseBody body;

    public TerminateAccountResponse() {
    }

    public TerminateAccountResponse(
           esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator,
           esb_rbm_account.xsd.TerminateAccountResponseBody body) {
           this.contextIntegrator = contextIntegrator;
           this.body = body;
    }


    /**
     * Gets the contextIntegrator value for this TerminateAccountResponse.
     * 
     * @return contextIntegrator
     */
    public esb_rbm_account.common_integrated.ContextIntegrator getContextIntegrator() {
        return contextIntegrator;
    }


    /**
     * Sets the contextIntegrator value for this TerminateAccountResponse.
     * 
     * @param contextIntegrator
     */
    public void setContextIntegrator(esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator) {
        this.contextIntegrator = contextIntegrator;
    }


    /**
     * Gets the body value for this TerminateAccountResponse.
     * 
     * @return body
     */
    public esb_rbm_account.xsd.TerminateAccountResponseBody getBody() {
        return body;
    }


    /**
     * Sets the body value for this TerminateAccountResponse.
     * 
     * @param body
     */
    public void setBody(esb_rbm_account.xsd.TerminateAccountResponseBody body) {
        this.body = body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminateAccountResponse)) return false;
        TerminateAccountResponse other = (TerminateAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextIntegrator==null && other.getContextIntegrator()==null) || 
             (this.contextIntegrator!=null &&
              this.contextIntegrator.equals(other.getContextIntegrator()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody())));
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
        if (getContextIntegrator() != null) {
            _hashCode += getContextIntegrator().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

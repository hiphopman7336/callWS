/**
 * ContextIntegrator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common_integrated;

public class ContextIntegrator  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.IntegrationContextHeader header;

    private esb_rbm_account.common_integrated.IntegrationContextMessage message;

    public ContextIntegrator() {
    }

    public ContextIntegrator(
           esb_rbm_account.common_integrated.IntegrationContextHeader header,
           esb_rbm_account.common_integrated.IntegrationContextMessage message) {
           this.header = header;
           this.message = message;
    }


    /**
     * Gets the header value for this ContextIntegrator.
     * 
     * @return header
     */
    public esb_rbm_account.common_integrated.IntegrationContextHeader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this ContextIntegrator.
     * 
     * @param header
     */
    public void setHeader(esb_rbm_account.common_integrated.IntegrationContextHeader header) {
        this.header = header;
    }


    /**
     * Gets the message value for this ContextIntegrator.
     * 
     * @return message
     */
    public esb_rbm_account.common_integrated.IntegrationContextMessage getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ContextIntegrator.
     * 
     * @param message
     */
    public void setMessage(esb_rbm_account.common_integrated.IntegrationContextMessage message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContextIntegrator)) return false;
        ContextIntegrator other = (ContextIntegrator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

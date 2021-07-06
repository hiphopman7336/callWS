/**
 * QueryAccount_15Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class QueryAccount_15Request  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator;

    private java.lang.String billingAccountId;

    public QueryAccount_15Request() {
    }

    public QueryAccount_15Request(
           esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator,
           java.lang.String billingAccountId) {
           this.contextIntegrator = contextIntegrator;
           this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the contextIntegrator value for this QueryAccount_15Request.
     * 
     * @return contextIntegrator
     */
    public esb_rbm_account.common_integrated.ContextIntegrator getContextIntegrator() {
        return contextIntegrator;
    }


    /**
     * Sets the contextIntegrator value for this QueryAccount_15Request.
     * 
     * @param contextIntegrator
     */
    public void setContextIntegrator(esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator) {
        this.contextIntegrator = contextIntegrator;
    }


    /**
     * Gets the billingAccountId value for this QueryAccount_15Request.
     * 
     * @return billingAccountId
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this QueryAccount_15Request.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAccount_15Request)) return false;
        QueryAccount_15Request other = (QueryAccount_15Request) obj;
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
        if (getContextIntegrator() != null) {
            _hashCode += getContextIntegrator().hashCode();
        }
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

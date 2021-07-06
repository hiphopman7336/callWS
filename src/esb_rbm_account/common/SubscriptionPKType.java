/**
 * SubscriptionPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class SubscriptionPKType  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int subscriptionSeq;

    public SubscriptionPKType() {
    }

    public SubscriptionPKType(
           java.lang.String customerRef,
           int subscriptionSeq) {
           this.customerRef = customerRef;
           this.subscriptionSeq = subscriptionSeq;
    }


    /**
     * Gets the customerRef value for this SubscriptionPKType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this SubscriptionPKType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the subscriptionSeq value for this SubscriptionPKType.
     * 
     * @return subscriptionSeq
     */
    public int getSubscriptionSeq() {
        return subscriptionSeq;
    }


    /**
     * Sets the subscriptionSeq value for this SubscriptionPKType.
     * 
     * @param subscriptionSeq
     */
    public void setSubscriptionSeq(int subscriptionSeq) {
        this.subscriptionSeq = subscriptionSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionPKType)) return false;
        SubscriptionPKType other = (SubscriptionPKType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            this.subscriptionSeq == other.getSubscriptionSeq();
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
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        _hashCode += getSubscriptionSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

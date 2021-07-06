/**
 * HistorySubscriptionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class HistorySubscriptionStatus  implements java.io.Serializable {
    private java.lang.String effectiveDateTime;

    private int subscriptionStatus;

    public HistorySubscriptionStatus() {
    }

    public HistorySubscriptionStatus(
           java.lang.String effectiveDateTime,
           int subscriptionStatus) {
           this.effectiveDateTime = effectiveDateTime;
           this.subscriptionStatus = subscriptionStatus;
    }


    /**
     * Gets the effectiveDateTime value for this HistorySubscriptionStatus.
     * 
     * @return effectiveDateTime
     */
    public java.lang.String getEffectiveDateTime() {
        return effectiveDateTime;
    }


    /**
     * Sets the effectiveDateTime value for this HistorySubscriptionStatus.
     * 
     * @param effectiveDateTime
     */
    public void setEffectiveDateTime(java.lang.String effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }


    /**
     * Gets the subscriptionStatus value for this HistorySubscriptionStatus.
     * 
     * @return subscriptionStatus
     */
    public int getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this HistorySubscriptionStatus.
     * 
     * @param subscriptionStatus
     */
    public void setSubscriptionStatus(int subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistorySubscriptionStatus)) return false;
        HistorySubscriptionStatus other = (HistorySubscriptionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.effectiveDateTime==null && other.getEffectiveDateTime()==null) || 
             (this.effectiveDateTime!=null &&
              this.effectiveDateTime.equals(other.getEffectiveDateTime()))) &&
            this.subscriptionStatus == other.getSubscriptionStatus();
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
        if (getEffectiveDateTime() != null) {
            _hashCode += getEffectiveDateTime().hashCode();
        }
        _hashCode += getSubscriptionStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

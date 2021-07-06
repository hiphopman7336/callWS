/**
 * UpdateBillCycleForBARequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class UpdateBillCycleForBARequestBody  implements java.io.Serializable {
    private java.lang.String billingAccountId;

    private java.lang.String billCycle;

    private java.lang.String nextBillDate;

    public UpdateBillCycleForBARequestBody() {
    }

    public UpdateBillCycleForBARequestBody(
           java.lang.String billingAccountId,
           java.lang.String billCycle,
           java.lang.String nextBillDate) {
           this.billingAccountId = billingAccountId;
           this.billCycle = billCycle;
           this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the billingAccountId value for this UpdateBillCycleForBARequestBody.
     * 
     * @return billingAccountId
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this UpdateBillCycleForBARequestBody.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the billCycle value for this UpdateBillCycleForBARequestBody.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this UpdateBillCycleForBARequestBody.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the nextBillDate value for this UpdateBillCycleForBARequestBody.
     * 
     * @return nextBillDate
     */
    public java.lang.String getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this UpdateBillCycleForBARequestBody.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(java.lang.String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBillCycleForBARequestBody)) return false;
        UpdateBillCycleForBARequestBody other = (UpdateBillCycleForBARequestBody) obj;
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
              this.billingAccountId.equals(other.getBillingAccountId()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate())));
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
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

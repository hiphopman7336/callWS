/**
 * ModifyBillCycleResponseBodyReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyBillCycleResponseBodyReturn  implements java.io.Serializable {
    private int result;

    private java.lang.String nextBillDate;

    private int SQLErrorCode;

    private java.lang.String SQLErrorMessage;

    private java.lang.String lastBillDate;

    private java.lang.String billingStatus;

    public ModifyBillCycleResponseBodyReturn() {
    }

    public ModifyBillCycleResponseBodyReturn(
           int result,
           java.lang.String nextBillDate,
           int SQLErrorCode,
           java.lang.String SQLErrorMessage,
           java.lang.String lastBillDate,
           java.lang.String billingStatus) {
           this.result = result;
           this.nextBillDate = nextBillDate;
           this.SQLErrorCode = SQLErrorCode;
           this.SQLErrorMessage = SQLErrorMessage;
           this.lastBillDate = lastBillDate;
           this.billingStatus = billingStatus;
    }


    /**
     * Gets the result value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the nextBillDate value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return nextBillDate
     */
    public java.lang.String getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(java.lang.String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the SQLErrorCode value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return SQLErrorCode
     */
    public int getSQLErrorCode() {
        return SQLErrorCode;
    }


    /**
     * Sets the SQLErrorCode value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param SQLErrorCode
     */
    public void setSQLErrorCode(int SQLErrorCode) {
        this.SQLErrorCode = SQLErrorCode;
    }


    /**
     * Gets the SQLErrorMessage value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return SQLErrorMessage
     */
    public java.lang.String getSQLErrorMessage() {
        return SQLErrorMessage;
    }


    /**
     * Sets the SQLErrorMessage value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param SQLErrorMessage
     */
    public void setSQLErrorMessage(java.lang.String SQLErrorMessage) {
        this.SQLErrorMessage = SQLErrorMessage;
    }


    /**
     * Gets the lastBillDate value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return lastBillDate
     */
    public java.lang.String getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(java.lang.String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the billingStatus value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @return billingStatus
     */
    public java.lang.String getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this ModifyBillCycleResponseBodyReturn.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(java.lang.String billingStatus) {
        this.billingStatus = billingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyBillCycleResponseBodyReturn)) return false;
        ModifyBillCycleResponseBodyReturn other = (ModifyBillCycleResponseBodyReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.getResult() &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            this.SQLErrorCode == other.getSQLErrorCode() &&
            ((this.SQLErrorMessage==null && other.getSQLErrorMessage()==null) || 
             (this.SQLErrorMessage!=null &&
              this.SQLErrorMessage.equals(other.getSQLErrorMessage()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus())));
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
        _hashCode += getResult();
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        _hashCode += getSQLErrorCode();
        if (getSQLErrorMessage() != null) {
            _hashCode += getSQLErrorMessage().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

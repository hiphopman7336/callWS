/**
 * CheckDebtWithDetailResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class CheckDebtWithDetailResponseBody  implements java.io.Serializable {
    private double outstandingBal;

    private java.lang.Integer outstandingInvoiceNum;

    private java.lang.String firstDueDate;

    private java.lang.String lastDueDate;

    public CheckDebtWithDetailResponseBody() {
    }

    public CheckDebtWithDetailResponseBody(
           double outstandingBal,
           java.lang.Integer outstandingInvoiceNum,
           java.lang.String firstDueDate,
           java.lang.String lastDueDate) {
           this.outstandingBal = outstandingBal;
           this.outstandingInvoiceNum = outstandingInvoiceNum;
           this.firstDueDate = firstDueDate;
           this.lastDueDate = lastDueDate;
    }


    /**
     * Gets the outstandingBal value for this CheckDebtWithDetailResponseBody.
     * 
     * @return outstandingBal
     */
    public double getOutstandingBal() {
        return outstandingBal;
    }


    /**
     * Sets the outstandingBal value for this CheckDebtWithDetailResponseBody.
     * 
     * @param outstandingBal
     */
    public void setOutstandingBal(double outstandingBal) {
        this.outstandingBal = outstandingBal;
    }


    /**
     * Gets the outstandingInvoiceNum value for this CheckDebtWithDetailResponseBody.
     * 
     * @return outstandingInvoiceNum
     */
    public java.lang.Integer getOutstandingInvoiceNum() {
        return outstandingInvoiceNum;
    }


    /**
     * Sets the outstandingInvoiceNum value for this CheckDebtWithDetailResponseBody.
     * 
     * @param outstandingInvoiceNum
     */
    public void setOutstandingInvoiceNum(java.lang.Integer outstandingInvoiceNum) {
        this.outstandingInvoiceNum = outstandingInvoiceNum;
    }


    /**
     * Gets the firstDueDate value for this CheckDebtWithDetailResponseBody.
     * 
     * @return firstDueDate
     */
    public java.lang.String getFirstDueDate() {
        return firstDueDate;
    }


    /**
     * Sets the firstDueDate value for this CheckDebtWithDetailResponseBody.
     * 
     * @param firstDueDate
     */
    public void setFirstDueDate(java.lang.String firstDueDate) {
        this.firstDueDate = firstDueDate;
    }


    /**
     * Gets the lastDueDate value for this CheckDebtWithDetailResponseBody.
     * 
     * @return lastDueDate
     */
    public java.lang.String getLastDueDate() {
        return lastDueDate;
    }


    /**
     * Sets the lastDueDate value for this CheckDebtWithDetailResponseBody.
     * 
     * @param lastDueDate
     */
    public void setLastDueDate(java.lang.String lastDueDate) {
        this.lastDueDate = lastDueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckDebtWithDetailResponseBody)) return false;
        CheckDebtWithDetailResponseBody other = (CheckDebtWithDetailResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.outstandingBal == other.getOutstandingBal() &&
            ((this.outstandingInvoiceNum==null && other.getOutstandingInvoiceNum()==null) || 
             (this.outstandingInvoiceNum!=null &&
              this.outstandingInvoiceNum.equals(other.getOutstandingInvoiceNum()))) &&
            ((this.firstDueDate==null && other.getFirstDueDate()==null) || 
             (this.firstDueDate!=null &&
              this.firstDueDate.equals(other.getFirstDueDate()))) &&
            ((this.lastDueDate==null && other.getLastDueDate()==null) || 
             (this.lastDueDate!=null &&
              this.lastDueDate.equals(other.getLastDueDate())));
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
        _hashCode += new Double(getOutstandingBal()).hashCode();
        if (getOutstandingInvoiceNum() != null) {
            _hashCode += getOutstandingInvoiceNum().hashCode();
        }
        if (getFirstDueDate() != null) {
            _hashCode += getFirstDueDate().hashCode();
        }
        if (getLastDueDate() != null) {
            _hashCode += getLastDueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

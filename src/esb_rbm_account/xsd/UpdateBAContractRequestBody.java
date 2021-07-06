/**
 * UpdateBAContractRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class UpdateBAContractRequestBody  implements java.io.Serializable {
    private java.lang.String accountNum;

    private int billStyleId;

    public UpdateBAContractRequestBody() {
    }

    public UpdateBAContractRequestBody(
           java.lang.String accountNum,
           int billStyleId) {
           this.accountNum = accountNum;
           this.billStyleId = billStyleId;
    }


    /**
     * Gets the accountNum value for this UpdateBAContractRequestBody.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this UpdateBAContractRequestBody.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the billStyleId value for this UpdateBAContractRequestBody.
     * 
     * @return billStyleId
     */
    public int getBillStyleId() {
        return billStyleId;
    }


    /**
     * Sets the billStyleId value for this UpdateBAContractRequestBody.
     * 
     * @param billStyleId
     */
    public void setBillStyleId(int billStyleId) {
        this.billStyleId = billStyleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBAContractRequestBody)) return false;
        UpdateBAContractRequestBody other = (UpdateBAContractRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            this.billStyleId == other.getBillStyleId();
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
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        _hashCode += getBillStyleId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

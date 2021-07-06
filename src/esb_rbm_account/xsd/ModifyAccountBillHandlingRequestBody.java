/**
 * ModifyAccountBillHandlingRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccountBillHandlingRequestBody  implements java.io.Serializable {
    private java.lang.String accountNum;

    private java.lang.String billHandlingCode;

    private java.lang.String emailAddress;

    private java.lang.String mobileNumber;

    public ModifyAccountBillHandlingRequestBody() {
    }

    public ModifyAccountBillHandlingRequestBody(
           java.lang.String accountNum,
           java.lang.String billHandlingCode,
           java.lang.String emailAddress,
           java.lang.String mobileNumber) {
           this.accountNum = accountNum;
           this.billHandlingCode = billHandlingCode;
           this.emailAddress = emailAddress;
           this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the accountNum value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the billHandlingCode value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @return billHandlingCode
     */
    public java.lang.String getBillHandlingCode() {
        return billHandlingCode;
    }


    /**
     * Sets the billHandlingCode value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @param billHandlingCode
     */
    public void setBillHandlingCode(java.lang.String billHandlingCode) {
        this.billHandlingCode = billHandlingCode;
    }


    /**
     * Gets the emailAddress value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the mobileNumber value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ModifyAccountBillHandlingRequestBody.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccountBillHandlingRequestBody)) return false;
        ModifyAccountBillHandlingRequestBody other = (ModifyAccountBillHandlingRequestBody) obj;
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
            ((this.billHandlingCode==null && other.getBillHandlingCode()==null) || 
             (this.billHandlingCode!=null &&
              this.billHandlingCode.equals(other.getBillHandlingCode()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber())));
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
        if (getBillHandlingCode() != null) {
            _hashCode += getBillHandlingCode().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

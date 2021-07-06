/**
 * ModifyAccountCPSRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccountCPSRequestBody  implements java.io.Serializable {
    private java.lang.String accountNum;

    private java.lang.String effectiveDate;

    private int cpsId;

    public ModifyAccountCPSRequestBody() {
    }

    public ModifyAccountCPSRequestBody(
           java.lang.String accountNum,
           java.lang.String effectiveDate,
           int cpsId) {
           this.accountNum = accountNum;
           this.effectiveDate = effectiveDate;
           this.cpsId = cpsId;
    }


    /**
     * Gets the accountNum value for this ModifyAccountCPSRequestBody.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this ModifyAccountCPSRequestBody.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the effectiveDate value for this ModifyAccountCPSRequestBody.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ModifyAccountCPSRequestBody.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the cpsId value for this ModifyAccountCPSRequestBody.
     * 
     * @return cpsId
     */
    public int getCpsId() {
        return cpsId;
    }


    /**
     * Sets the cpsId value for this ModifyAccountCPSRequestBody.
     * 
     * @param cpsId
     */
    public void setCpsId(int cpsId) {
        this.cpsId = cpsId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccountCPSRequestBody)) return false;
        ModifyAccountCPSRequestBody other = (ModifyAccountCPSRequestBody) obj;
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
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            this.cpsId == other.getCpsId();
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        _hashCode += getCpsId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

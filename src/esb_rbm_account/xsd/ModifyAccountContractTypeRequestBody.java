/**
 * ModifyAccountContractTypeRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccountContractTypeRequestBody  implements java.io.Serializable {
    private java.lang.String accountNum;

    private java.lang.String contractType;

    private java.lang.String contractRefNo;

    public ModifyAccountContractTypeRequestBody() {
    }

    public ModifyAccountContractTypeRequestBody(
           java.lang.String accountNum,
           java.lang.String contractType,
           java.lang.String contractRefNo) {
           this.accountNum = accountNum;
           this.contractType = contractType;
           this.contractRefNo = contractRefNo;
    }


    /**
     * Gets the accountNum value for this ModifyAccountContractTypeRequestBody.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this ModifyAccountContractTypeRequestBody.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the contractType value for this ModifyAccountContractTypeRequestBody.
     * 
     * @return contractType
     */
    public java.lang.String getContractType() {
        return contractType;
    }


    /**
     * Sets the contractType value for this ModifyAccountContractTypeRequestBody.
     * 
     * @param contractType
     */
    public void setContractType(java.lang.String contractType) {
        this.contractType = contractType;
    }


    /**
     * Gets the contractRefNo value for this ModifyAccountContractTypeRequestBody.
     * 
     * @return contractRefNo
     */
    public java.lang.String getContractRefNo() {
        return contractRefNo;
    }


    /**
     * Sets the contractRefNo value for this ModifyAccountContractTypeRequestBody.
     * 
     * @param contractRefNo
     */
    public void setContractRefNo(java.lang.String contractRefNo) {
        this.contractRefNo = contractRefNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccountContractTypeRequestBody)) return false;
        ModifyAccountContractTypeRequestBody other = (ModifyAccountContractTypeRequestBody) obj;
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
            ((this.contractType==null && other.getContractType()==null) || 
             (this.contractType!=null &&
              this.contractType.equals(other.getContractType()))) &&
            ((this.contractRefNo==null && other.getContractRefNo()==null) || 
             (this.contractRefNo!=null &&
              this.contractRefNo.equals(other.getContractRefNo())));
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
        if (getContractType() != null) {
            _hashCode += getContractType().hashCode();
        }
        if (getContractRefNo() != null) {
            _hashCode += getContractRefNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

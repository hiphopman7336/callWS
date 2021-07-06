/**
 * ModifyBillCycleRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyBillCycleRequestBody  implements java.io.Serializable {
    private java.lang.String customerRef;

    private java.lang.String accountNum;

    private java.lang.String billCycle;

    public ModifyBillCycleRequestBody() {
    }

    public ModifyBillCycleRequestBody(
           java.lang.String customerRef,
           java.lang.String accountNum,
           java.lang.String billCycle) {
           this.customerRef = customerRef;
           this.accountNum = accountNum;
           this.billCycle = billCycle;
    }


    /**
     * Gets the customerRef value for this ModifyBillCycleRequestBody.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this ModifyBillCycleRequestBody.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the accountNum value for this ModifyBillCycleRequestBody.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this ModifyBillCycleRequestBody.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the billCycle value for this ModifyBillCycleRequestBody.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this ModifyBillCycleRequestBody.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyBillCycleRequestBody)) return false;
        ModifyBillCycleRequestBody other = (ModifyBillCycleRequestBody) obj;
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
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle())));
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
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

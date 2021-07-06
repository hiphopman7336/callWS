/**
 * QueryAccountDetailsResponseBodyAccountDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class QueryAccountDetailsResponseBodyAccountDetail  implements java.io.Serializable {
    private java.lang.String customerRef;

    private java.lang.String accountNum;

    private int customerTypeID;

    private int vatCode;

    private java.lang.String homeLocationCode;

    private int summaryStyleID;

    private int terminationReasonID;

    private java.lang.String accountStatus;

    private java.lang.String billCycle;

    private java.lang.String accountStatusStartDate;

    private java.lang.String billingName;

    private int invoicingCoId;

    public QueryAccountDetailsResponseBodyAccountDetail() {
    }

    public QueryAccountDetailsResponseBodyAccountDetail(
           java.lang.String customerRef,
           java.lang.String accountNum,
           int customerTypeID,
           int vatCode,
           java.lang.String homeLocationCode,
           int summaryStyleID,
           int terminationReasonID,
           java.lang.String accountStatus,
           java.lang.String billCycle,
           java.lang.String accountStatusStartDate,
           java.lang.String billingName,
           int invoicingCoId) {
           this.customerRef = customerRef;
           this.accountNum = accountNum;
           this.customerTypeID = customerTypeID;
           this.vatCode = vatCode;
           this.homeLocationCode = homeLocationCode;
           this.summaryStyleID = summaryStyleID;
           this.terminationReasonID = terminationReasonID;
           this.accountStatus = accountStatus;
           this.billCycle = billCycle;
           this.accountStatusStartDate = accountStatusStartDate;
           this.billingName = billingName;
           this.invoicingCoId = invoicingCoId;
    }


    /**
     * Gets the customerRef value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the accountNum value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the customerTypeID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return customerTypeID
     */
    public int getCustomerTypeID() {
        return customerTypeID;
    }


    /**
     * Sets the customerTypeID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param customerTypeID
     */
    public void setCustomerTypeID(int customerTypeID) {
        this.customerTypeID = customerTypeID;
    }


    /**
     * Gets the vatCode value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return vatCode
     */
    public int getVatCode() {
        return vatCode;
    }


    /**
     * Sets the vatCode value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param vatCode
     */
    public void setVatCode(int vatCode) {
        this.vatCode = vatCode;
    }


    /**
     * Gets the homeLocationCode value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return homeLocationCode
     */
    public java.lang.String getHomeLocationCode() {
        return homeLocationCode;
    }


    /**
     * Sets the homeLocationCode value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param homeLocationCode
     */
    public void setHomeLocationCode(java.lang.String homeLocationCode) {
        this.homeLocationCode = homeLocationCode;
    }


    /**
     * Gets the summaryStyleID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return summaryStyleID
     */
    public int getSummaryStyleID() {
        return summaryStyleID;
    }


    /**
     * Sets the summaryStyleID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param summaryStyleID
     */
    public void setSummaryStyleID(int summaryStyleID) {
        this.summaryStyleID = summaryStyleID;
    }


    /**
     * Gets the terminationReasonID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return terminationReasonID
     */
    public int getTerminationReasonID() {
        return terminationReasonID;
    }


    /**
     * Sets the terminationReasonID value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param terminationReasonID
     */
    public void setTerminationReasonID(int terminationReasonID) {
        this.terminationReasonID = terminationReasonID;
    }


    /**
     * Gets the accountStatus value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the billCycle value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the accountStatusStartDate value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return accountStatusStartDate
     */
    public java.lang.String getAccountStatusStartDate() {
        return accountStatusStartDate;
    }


    /**
     * Sets the accountStatusStartDate value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param accountStatusStartDate
     */
    public void setAccountStatusStartDate(java.lang.String accountStatusStartDate) {
        this.accountStatusStartDate = accountStatusStartDate;
    }


    /**
     * Gets the billingName value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return billingName
     */
    public java.lang.String getBillingName() {
        return billingName;
    }


    /**
     * Sets the billingName value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param billingName
     */
    public void setBillingName(java.lang.String billingName) {
        this.billingName = billingName;
    }


    /**
     * Gets the invoicingCoId value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @return invoicingCoId
     */
    public int getInvoicingCoId() {
        return invoicingCoId;
    }


    /**
     * Sets the invoicingCoId value for this QueryAccountDetailsResponseBodyAccountDetail.
     * 
     * @param invoicingCoId
     */
    public void setInvoicingCoId(int invoicingCoId) {
        this.invoicingCoId = invoicingCoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAccountDetailsResponseBodyAccountDetail)) return false;
        QueryAccountDetailsResponseBodyAccountDetail other = (QueryAccountDetailsResponseBodyAccountDetail) obj;
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
            this.customerTypeID == other.getCustomerTypeID() &&
            this.vatCode == other.getVatCode() &&
            ((this.homeLocationCode==null && other.getHomeLocationCode()==null) || 
             (this.homeLocationCode!=null &&
              this.homeLocationCode.equals(other.getHomeLocationCode()))) &&
            this.summaryStyleID == other.getSummaryStyleID() &&
            this.terminationReasonID == other.getTerminationReasonID() &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.accountStatusStartDate==null && other.getAccountStatusStartDate()==null) || 
             (this.accountStatusStartDate!=null &&
              this.accountStatusStartDate.equals(other.getAccountStatusStartDate()))) &&
            ((this.billingName==null && other.getBillingName()==null) || 
             (this.billingName!=null &&
              this.billingName.equals(other.getBillingName()))) &&
            this.invoicingCoId == other.getInvoicingCoId();
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
        _hashCode += getCustomerTypeID();
        _hashCode += getVatCode();
        if (getHomeLocationCode() != null) {
            _hashCode += getHomeLocationCode().hashCode();
        }
        _hashCode += getSummaryStyleID();
        _hashCode += getTerminationReasonID();
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getAccountStatusStartDate() != null) {
            _hashCode += getAccountStatusStartDate().hashCode();
        }
        if (getBillingName() != null) {
            _hashCode += getBillingName().hashCode();
        }
        _hashCode += getInvoicingCoId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

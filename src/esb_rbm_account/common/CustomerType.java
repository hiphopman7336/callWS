/**
 * CustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class CustomerType  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int customerType;

    private java.lang.String parentCARef;

    private java.lang.String nextBillDateTime;

    private java.lang.Integer summaryStyleIdNbl;

    private java.lang.String summaryBillHandlingCode;

    private java.lang.Boolean taxInclusive;

    private java.lang.String govCode;

    private java.lang.String salesPersonName;

    private java.lang.String salesContactNumber;

    private java.lang.String companyName;

    private java.lang.String salesPersonId;

    private java.lang.Integer billPeriod;

    private java.lang.Integer billPeriodUnits;

    private java.lang.Integer billPerStatement;

    private java.lang.String companyClass;

    private java.lang.String custCreditLimit;

    private java.lang.String custCreditLimitOverride;

    private java.lang.Integer domainId;

    public CustomerType() {
    }

    public CustomerType(
           java.lang.String customerRef,
           int customerType,
           java.lang.String parentCARef,
           java.lang.String nextBillDateTime,
           java.lang.Integer summaryStyleIdNbl,
           java.lang.String summaryBillHandlingCode,
           java.lang.Boolean taxInclusive,
           java.lang.String govCode,
           java.lang.String salesPersonName,
           java.lang.String salesContactNumber,
           java.lang.String companyName,
           java.lang.String salesPersonId,
           java.lang.Integer billPeriod,
           java.lang.Integer billPeriodUnits,
           java.lang.Integer billPerStatement,
           java.lang.String companyClass,
           java.lang.String custCreditLimit,
           java.lang.String custCreditLimitOverride,
           java.lang.Integer domainId) {
           this.customerRef = customerRef;
           this.customerType = customerType;
           this.parentCARef = parentCARef;
           this.nextBillDateTime = nextBillDateTime;
           this.summaryStyleIdNbl = summaryStyleIdNbl;
           this.summaryBillHandlingCode = summaryBillHandlingCode;
           this.taxInclusive = taxInclusive;
           this.govCode = govCode;
           this.salesPersonName = salesPersonName;
           this.salesContactNumber = salesContactNumber;
           this.companyName = companyName;
           this.salesPersonId = salesPersonId;
           this.billPeriod = billPeriod;
           this.billPeriodUnits = billPeriodUnits;
           this.billPerStatement = billPerStatement;
           this.companyClass = companyClass;
           this.custCreditLimit = custCreditLimit;
           this.custCreditLimitOverride = custCreditLimitOverride;
           this.domainId = domainId;
    }


    /**
     * Gets the customerRef value for this CustomerType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this CustomerType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the customerType value for this CustomerType.
     * 
     * @return customerType
     */
    public int getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this CustomerType.
     * 
     * @param customerType
     */
    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the parentCARef value for this CustomerType.
     * 
     * @return parentCARef
     */
    public java.lang.String getParentCARef() {
        return parentCARef;
    }


    /**
     * Sets the parentCARef value for this CustomerType.
     * 
     * @param parentCARef
     */
    public void setParentCARef(java.lang.String parentCARef) {
        this.parentCARef = parentCARef;
    }


    /**
     * Gets the nextBillDateTime value for this CustomerType.
     * 
     * @return nextBillDateTime
     */
    public java.lang.String getNextBillDateTime() {
        return nextBillDateTime;
    }


    /**
     * Sets the nextBillDateTime value for this CustomerType.
     * 
     * @param nextBillDateTime
     */
    public void setNextBillDateTime(java.lang.String nextBillDateTime) {
        this.nextBillDateTime = nextBillDateTime;
    }


    /**
     * Gets the summaryStyleIdNbl value for this CustomerType.
     * 
     * @return summaryStyleIdNbl
     */
    public java.lang.Integer getSummaryStyleIdNbl() {
        return summaryStyleIdNbl;
    }


    /**
     * Sets the summaryStyleIdNbl value for this CustomerType.
     * 
     * @param summaryStyleIdNbl
     */
    public void setSummaryStyleIdNbl(java.lang.Integer summaryStyleIdNbl) {
        this.summaryStyleIdNbl = summaryStyleIdNbl;
    }


    /**
     * Gets the summaryBillHandlingCode value for this CustomerType.
     * 
     * @return summaryBillHandlingCode
     */
    public java.lang.String getSummaryBillHandlingCode() {
        return summaryBillHandlingCode;
    }


    /**
     * Sets the summaryBillHandlingCode value for this CustomerType.
     * 
     * @param summaryBillHandlingCode
     */
    public void setSummaryBillHandlingCode(java.lang.String summaryBillHandlingCode) {
        this.summaryBillHandlingCode = summaryBillHandlingCode;
    }


    /**
     * Gets the taxInclusive value for this CustomerType.
     * 
     * @return taxInclusive
     */
    public java.lang.Boolean getTaxInclusive() {
        return taxInclusive;
    }


    /**
     * Sets the taxInclusive value for this CustomerType.
     * 
     * @param taxInclusive
     */
    public void setTaxInclusive(java.lang.Boolean taxInclusive) {
        this.taxInclusive = taxInclusive;
    }


    /**
     * Gets the govCode value for this CustomerType.
     * 
     * @return govCode
     */
    public java.lang.String getGovCode() {
        return govCode;
    }


    /**
     * Sets the govCode value for this CustomerType.
     * 
     * @param govCode
     */
    public void setGovCode(java.lang.String govCode) {
        this.govCode = govCode;
    }


    /**
     * Gets the salesPersonName value for this CustomerType.
     * 
     * @return salesPersonName
     */
    public java.lang.String getSalesPersonName() {
        return salesPersonName;
    }


    /**
     * Sets the salesPersonName value for this CustomerType.
     * 
     * @param salesPersonName
     */
    public void setSalesPersonName(java.lang.String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }


    /**
     * Gets the salesContactNumber value for this CustomerType.
     * 
     * @return salesContactNumber
     */
    public java.lang.String getSalesContactNumber() {
        return salesContactNumber;
    }


    /**
     * Sets the salesContactNumber value for this CustomerType.
     * 
     * @param salesContactNumber
     */
    public void setSalesContactNumber(java.lang.String salesContactNumber) {
        this.salesContactNumber = salesContactNumber;
    }


    /**
     * Gets the companyName value for this CustomerType.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CustomerType.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the salesPersonId value for this CustomerType.
     * 
     * @return salesPersonId
     */
    public java.lang.String getSalesPersonId() {
        return salesPersonId;
    }


    /**
     * Sets the salesPersonId value for this CustomerType.
     * 
     * @param salesPersonId
     */
    public void setSalesPersonId(java.lang.String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }


    /**
     * Gets the billPeriod value for this CustomerType.
     * 
     * @return billPeriod
     */
    public java.lang.Integer getBillPeriod() {
        return billPeriod;
    }


    /**
     * Sets the billPeriod value for this CustomerType.
     * 
     * @param billPeriod
     */
    public void setBillPeriod(java.lang.Integer billPeriod) {
        this.billPeriod = billPeriod;
    }


    /**
     * Gets the billPeriodUnits value for this CustomerType.
     * 
     * @return billPeriodUnits
     */
    public java.lang.Integer getBillPeriodUnits() {
        return billPeriodUnits;
    }


    /**
     * Sets the billPeriodUnits value for this CustomerType.
     * 
     * @param billPeriodUnits
     */
    public void setBillPeriodUnits(java.lang.Integer billPeriodUnits) {
        this.billPeriodUnits = billPeriodUnits;
    }


    /**
     * Gets the billPerStatement value for this CustomerType.
     * 
     * @return billPerStatement
     */
    public java.lang.Integer getBillPerStatement() {
        return billPerStatement;
    }


    /**
     * Sets the billPerStatement value for this CustomerType.
     * 
     * @param billPerStatement
     */
    public void setBillPerStatement(java.lang.Integer billPerStatement) {
        this.billPerStatement = billPerStatement;
    }


    /**
     * Gets the companyClass value for this CustomerType.
     * 
     * @return companyClass
     */
    public java.lang.String getCompanyClass() {
        return companyClass;
    }


    /**
     * Sets the companyClass value for this CustomerType.
     * 
     * @param companyClass
     */
    public void setCompanyClass(java.lang.String companyClass) {
        this.companyClass = companyClass;
    }


    /**
     * Gets the custCreditLimit value for this CustomerType.
     * 
     * @return custCreditLimit
     */
    public java.lang.String getCustCreditLimit() {
        return custCreditLimit;
    }


    /**
     * Sets the custCreditLimit value for this CustomerType.
     * 
     * @param custCreditLimit
     */
    public void setCustCreditLimit(java.lang.String custCreditLimit) {
        this.custCreditLimit = custCreditLimit;
    }


    /**
     * Gets the custCreditLimitOverride value for this CustomerType.
     * 
     * @return custCreditLimitOverride
     */
    public java.lang.String getCustCreditLimitOverride() {
        return custCreditLimitOverride;
    }


    /**
     * Sets the custCreditLimitOverride value for this CustomerType.
     * 
     * @param custCreditLimitOverride
     */
    public void setCustCreditLimitOverride(java.lang.String custCreditLimitOverride) {
        this.custCreditLimitOverride = custCreditLimitOverride;
    }


    /**
     * Gets the domainId value for this CustomerType.
     * 
     * @return domainId
     */
    public java.lang.Integer getDomainId() {
        return domainId;
    }


    /**
     * Sets the domainId value for this CustomerType.
     * 
     * @param domainId
     */
    public void setDomainId(java.lang.Integer domainId) {
        this.domainId = domainId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerType)) return false;
        CustomerType other = (CustomerType) obj;
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
            this.customerType == other.getCustomerType() &&
            ((this.parentCARef==null && other.getParentCARef()==null) || 
             (this.parentCARef!=null &&
              this.parentCARef.equals(other.getParentCARef()))) &&
            ((this.nextBillDateTime==null && other.getNextBillDateTime()==null) || 
             (this.nextBillDateTime!=null &&
              this.nextBillDateTime.equals(other.getNextBillDateTime()))) &&
            ((this.summaryStyleIdNbl==null && other.getSummaryStyleIdNbl()==null) || 
             (this.summaryStyleIdNbl!=null &&
              this.summaryStyleIdNbl.equals(other.getSummaryStyleIdNbl()))) &&
            ((this.summaryBillHandlingCode==null && other.getSummaryBillHandlingCode()==null) || 
             (this.summaryBillHandlingCode!=null &&
              this.summaryBillHandlingCode.equals(other.getSummaryBillHandlingCode()))) &&
            ((this.taxInclusive==null && other.getTaxInclusive()==null) || 
             (this.taxInclusive!=null &&
              this.taxInclusive.equals(other.getTaxInclusive()))) &&
            ((this.govCode==null && other.getGovCode()==null) || 
             (this.govCode!=null &&
              this.govCode.equals(other.getGovCode()))) &&
            ((this.salesPersonName==null && other.getSalesPersonName()==null) || 
             (this.salesPersonName!=null &&
              this.salesPersonName.equals(other.getSalesPersonName()))) &&
            ((this.salesContactNumber==null && other.getSalesContactNumber()==null) || 
             (this.salesContactNumber!=null &&
              this.salesContactNumber.equals(other.getSalesContactNumber()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.salesPersonId==null && other.getSalesPersonId()==null) || 
             (this.salesPersonId!=null &&
              this.salesPersonId.equals(other.getSalesPersonId()))) &&
            ((this.billPeriod==null && other.getBillPeriod()==null) || 
             (this.billPeriod!=null &&
              this.billPeriod.equals(other.getBillPeriod()))) &&
            ((this.billPeriodUnits==null && other.getBillPeriodUnits()==null) || 
             (this.billPeriodUnits!=null &&
              this.billPeriodUnits.equals(other.getBillPeriodUnits()))) &&
            ((this.billPerStatement==null && other.getBillPerStatement()==null) || 
             (this.billPerStatement!=null &&
              this.billPerStatement.equals(other.getBillPerStatement()))) &&
            ((this.companyClass==null && other.getCompanyClass()==null) || 
             (this.companyClass!=null &&
              this.companyClass.equals(other.getCompanyClass()))) &&
            ((this.custCreditLimit==null && other.getCustCreditLimit()==null) || 
             (this.custCreditLimit!=null &&
              this.custCreditLimit.equals(other.getCustCreditLimit()))) &&
            ((this.custCreditLimitOverride==null && other.getCustCreditLimitOverride()==null) || 
             (this.custCreditLimitOverride!=null &&
              this.custCreditLimitOverride.equals(other.getCustCreditLimitOverride()))) &&
            ((this.domainId==null && other.getDomainId()==null) || 
             (this.domainId!=null &&
              this.domainId.equals(other.getDomainId())));
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
        _hashCode += getCustomerType();
        if (getParentCARef() != null) {
            _hashCode += getParentCARef().hashCode();
        }
        if (getNextBillDateTime() != null) {
            _hashCode += getNextBillDateTime().hashCode();
        }
        if (getSummaryStyleIdNbl() != null) {
            _hashCode += getSummaryStyleIdNbl().hashCode();
        }
        if (getSummaryBillHandlingCode() != null) {
            _hashCode += getSummaryBillHandlingCode().hashCode();
        }
        if (getTaxInclusive() != null) {
            _hashCode += getTaxInclusive().hashCode();
        }
        if (getGovCode() != null) {
            _hashCode += getGovCode().hashCode();
        }
        if (getSalesPersonName() != null) {
            _hashCode += getSalesPersonName().hashCode();
        }
        if (getSalesContactNumber() != null) {
            _hashCode += getSalesContactNumber().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getSalesPersonId() != null) {
            _hashCode += getSalesPersonId().hashCode();
        }
        if (getBillPeriod() != null) {
            _hashCode += getBillPeriod().hashCode();
        }
        if (getBillPeriodUnits() != null) {
            _hashCode += getBillPeriodUnits().hashCode();
        }
        if (getBillPerStatement() != null) {
            _hashCode += getBillPerStatement().hashCode();
        }
        if (getCompanyClass() != null) {
            _hashCode += getCompanyClass().hashCode();
        }
        if (getCustCreditLimit() != null) {
            _hashCode += getCustCreditLimit().hashCode();
        }
        if (getCustCreditLimitOverride() != null) {
            _hashCode += getCustCreditLimitOverride().hashCode();
        }
        if (getDomainId() != null) {
            _hashCode += getDomainId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

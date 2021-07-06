/**
 * RBMCustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class RBMCustomerType  implements java.io.Serializable {
    private java.lang.String customerPK;

    private java.lang.String parentCustomerPK;

    private int customerTypeId;

    private java.lang.Integer invoicingCoId;

    private java.lang.Integer marketSegmentId;

    private java.lang.String companyName;

    private java.lang.String taxExemptRef;

    private java.lang.Integer providerId;

    private java.lang.String password;

    private java.lang.Integer billPeriod;

    private java.lang.Integer billPeriodUnits;

    private java.lang.Long nextBillDtm;

    private java.lang.Integer billsPerStatement;

    private java.lang.String vatRegistration;

    private java.lang.Integer permissionId;

    private boolean concatenateBillsBoo;

    private java.lang.Integer domainId;

    private java.lang.String summaryContactPK;

    private java.lang.String summaryCurrencyCode;

    private java.lang.Integer summaryStyleId;

    private java.lang.String summaryBillHandlingCode;

    public RBMCustomerType() {
    }

    public RBMCustomerType(
           java.lang.String customerPK,
           java.lang.String parentCustomerPK,
           int customerTypeId,
           java.lang.Integer invoicingCoId,
           java.lang.Integer marketSegmentId,
           java.lang.String companyName,
           java.lang.String taxExemptRef,
           java.lang.Integer providerId,
           java.lang.String password,
           java.lang.Integer billPeriod,
           java.lang.Integer billPeriodUnits,
           java.lang.Long nextBillDtm,
           java.lang.Integer billsPerStatement,
           java.lang.String vatRegistration,
           java.lang.Integer permissionId,
           boolean concatenateBillsBoo,
           java.lang.Integer domainId,
           java.lang.String summaryContactPK,
           java.lang.String summaryCurrencyCode,
           java.lang.Integer summaryStyleId,
           java.lang.String summaryBillHandlingCode) {
           this.customerPK = customerPK;
           this.parentCustomerPK = parentCustomerPK;
           this.customerTypeId = customerTypeId;
           this.invoicingCoId = invoicingCoId;
           this.marketSegmentId = marketSegmentId;
           this.companyName = companyName;
           this.taxExemptRef = taxExemptRef;
           this.providerId = providerId;
           this.password = password;
           this.billPeriod = billPeriod;
           this.billPeriodUnits = billPeriodUnits;
           this.nextBillDtm = nextBillDtm;
           this.billsPerStatement = billsPerStatement;
           this.vatRegistration = vatRegistration;
           this.permissionId = permissionId;
           this.concatenateBillsBoo = concatenateBillsBoo;
           this.domainId = domainId;
           this.summaryContactPK = summaryContactPK;
           this.summaryCurrencyCode = summaryCurrencyCode;
           this.summaryStyleId = summaryStyleId;
           this.summaryBillHandlingCode = summaryBillHandlingCode;
    }


    /**
     * Gets the customerPK value for this RBMCustomerType.
     * 
     * @return customerPK
     */
    public java.lang.String getCustomerPK() {
        return customerPK;
    }


    /**
     * Sets the customerPK value for this RBMCustomerType.
     * 
     * @param customerPK
     */
    public void setCustomerPK(java.lang.String customerPK) {
        this.customerPK = customerPK;
    }


    /**
     * Gets the parentCustomerPK value for this RBMCustomerType.
     * 
     * @return parentCustomerPK
     */
    public java.lang.String getParentCustomerPK() {
        return parentCustomerPK;
    }


    /**
     * Sets the parentCustomerPK value for this RBMCustomerType.
     * 
     * @param parentCustomerPK
     */
    public void setParentCustomerPK(java.lang.String parentCustomerPK) {
        this.parentCustomerPK = parentCustomerPK;
    }


    /**
     * Gets the customerTypeId value for this RBMCustomerType.
     * 
     * @return customerTypeId
     */
    public int getCustomerTypeId() {
        return customerTypeId;
    }


    /**
     * Sets the customerTypeId value for this RBMCustomerType.
     * 
     * @param customerTypeId
     */
    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }


    /**
     * Gets the invoicingCoId value for this RBMCustomerType.
     * 
     * @return invoicingCoId
     */
    public java.lang.Integer getInvoicingCoId() {
        return invoicingCoId;
    }


    /**
     * Sets the invoicingCoId value for this RBMCustomerType.
     * 
     * @param invoicingCoId
     */
    public void setInvoicingCoId(java.lang.Integer invoicingCoId) {
        this.invoicingCoId = invoicingCoId;
    }


    /**
     * Gets the marketSegmentId value for this RBMCustomerType.
     * 
     * @return marketSegmentId
     */
    public java.lang.Integer getMarketSegmentId() {
        return marketSegmentId;
    }


    /**
     * Sets the marketSegmentId value for this RBMCustomerType.
     * 
     * @param marketSegmentId
     */
    public void setMarketSegmentId(java.lang.Integer marketSegmentId) {
        this.marketSegmentId = marketSegmentId;
    }


    /**
     * Gets the companyName value for this RBMCustomerType.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this RBMCustomerType.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the taxExemptRef value for this RBMCustomerType.
     * 
     * @return taxExemptRef
     */
    public java.lang.String getTaxExemptRef() {
        return taxExemptRef;
    }


    /**
     * Sets the taxExemptRef value for this RBMCustomerType.
     * 
     * @param taxExemptRef
     */
    public void setTaxExemptRef(java.lang.String taxExemptRef) {
        this.taxExemptRef = taxExemptRef;
    }


    /**
     * Gets the providerId value for this RBMCustomerType.
     * 
     * @return providerId
     */
    public java.lang.Integer getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this RBMCustomerType.
     * 
     * @param providerId
     */
    public void setProviderId(java.lang.Integer providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the password value for this RBMCustomerType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this RBMCustomerType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the billPeriod value for this RBMCustomerType.
     * 
     * @return billPeriod
     */
    public java.lang.Integer getBillPeriod() {
        return billPeriod;
    }


    /**
     * Sets the billPeriod value for this RBMCustomerType.
     * 
     * @param billPeriod
     */
    public void setBillPeriod(java.lang.Integer billPeriod) {
        this.billPeriod = billPeriod;
    }


    /**
     * Gets the billPeriodUnits value for this RBMCustomerType.
     * 
     * @return billPeriodUnits
     */
    public java.lang.Integer getBillPeriodUnits() {
        return billPeriodUnits;
    }


    /**
     * Sets the billPeriodUnits value for this RBMCustomerType.
     * 
     * @param billPeriodUnits
     */
    public void setBillPeriodUnits(java.lang.Integer billPeriodUnits) {
        this.billPeriodUnits = billPeriodUnits;
    }


    /**
     * Gets the nextBillDtm value for this RBMCustomerType.
     * 
     * @return nextBillDtm
     */
    public java.lang.Long getNextBillDtm() {
        return nextBillDtm;
    }


    /**
     * Sets the nextBillDtm value for this RBMCustomerType.
     * 
     * @param nextBillDtm
     */
    public void setNextBillDtm(java.lang.Long nextBillDtm) {
        this.nextBillDtm = nextBillDtm;
    }


    /**
     * Gets the billsPerStatement value for this RBMCustomerType.
     * 
     * @return billsPerStatement
     */
    public java.lang.Integer getBillsPerStatement() {
        return billsPerStatement;
    }


    /**
     * Sets the billsPerStatement value for this RBMCustomerType.
     * 
     * @param billsPerStatement
     */
    public void setBillsPerStatement(java.lang.Integer billsPerStatement) {
        this.billsPerStatement = billsPerStatement;
    }


    /**
     * Gets the vatRegistration value for this RBMCustomerType.
     * 
     * @return vatRegistration
     */
    public java.lang.String getVatRegistration() {
        return vatRegistration;
    }


    /**
     * Sets the vatRegistration value for this RBMCustomerType.
     * 
     * @param vatRegistration
     */
    public void setVatRegistration(java.lang.String vatRegistration) {
        this.vatRegistration = vatRegistration;
    }


    /**
     * Gets the permissionId value for this RBMCustomerType.
     * 
     * @return permissionId
     */
    public java.lang.Integer getPermissionId() {
        return permissionId;
    }


    /**
     * Sets the permissionId value for this RBMCustomerType.
     * 
     * @param permissionId
     */
    public void setPermissionId(java.lang.Integer permissionId) {
        this.permissionId = permissionId;
    }


    /**
     * Gets the concatenateBillsBoo value for this RBMCustomerType.
     * 
     * @return concatenateBillsBoo
     */
    public boolean isConcatenateBillsBoo() {
        return concatenateBillsBoo;
    }


    /**
     * Sets the concatenateBillsBoo value for this RBMCustomerType.
     * 
     * @param concatenateBillsBoo
     */
    public void setConcatenateBillsBoo(boolean concatenateBillsBoo) {
        this.concatenateBillsBoo = concatenateBillsBoo;
    }


    /**
     * Gets the domainId value for this RBMCustomerType.
     * 
     * @return domainId
     */
    public java.lang.Integer getDomainId() {
        return domainId;
    }


    /**
     * Sets the domainId value for this RBMCustomerType.
     * 
     * @param domainId
     */
    public void setDomainId(java.lang.Integer domainId) {
        this.domainId = domainId;
    }


    /**
     * Gets the summaryContactPK value for this RBMCustomerType.
     * 
     * @return summaryContactPK
     */
    public java.lang.String getSummaryContactPK() {
        return summaryContactPK;
    }


    /**
     * Sets the summaryContactPK value for this RBMCustomerType.
     * 
     * @param summaryContactPK
     */
    public void setSummaryContactPK(java.lang.String summaryContactPK) {
        this.summaryContactPK = summaryContactPK;
    }


    /**
     * Gets the summaryCurrencyCode value for this RBMCustomerType.
     * 
     * @return summaryCurrencyCode
     */
    public java.lang.String getSummaryCurrencyCode() {
        return summaryCurrencyCode;
    }


    /**
     * Sets the summaryCurrencyCode value for this RBMCustomerType.
     * 
     * @param summaryCurrencyCode
     */
    public void setSummaryCurrencyCode(java.lang.String summaryCurrencyCode) {
        this.summaryCurrencyCode = summaryCurrencyCode;
    }


    /**
     * Gets the summaryStyleId value for this RBMCustomerType.
     * 
     * @return summaryStyleId
     */
    public java.lang.Integer getSummaryStyleId() {
        return summaryStyleId;
    }


    /**
     * Sets the summaryStyleId value for this RBMCustomerType.
     * 
     * @param summaryStyleId
     */
    public void setSummaryStyleId(java.lang.Integer summaryStyleId) {
        this.summaryStyleId = summaryStyleId;
    }


    /**
     * Gets the summaryBillHandlingCode value for this RBMCustomerType.
     * 
     * @return summaryBillHandlingCode
     */
    public java.lang.String getSummaryBillHandlingCode() {
        return summaryBillHandlingCode;
    }


    /**
     * Sets the summaryBillHandlingCode value for this RBMCustomerType.
     * 
     * @param summaryBillHandlingCode
     */
    public void setSummaryBillHandlingCode(java.lang.String summaryBillHandlingCode) {
        this.summaryBillHandlingCode = summaryBillHandlingCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RBMCustomerType)) return false;
        RBMCustomerType other = (RBMCustomerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPK==null && other.getCustomerPK()==null) || 
             (this.customerPK!=null &&
              this.customerPK.equals(other.getCustomerPK()))) &&
            ((this.parentCustomerPK==null && other.getParentCustomerPK()==null) || 
             (this.parentCustomerPK!=null &&
              this.parentCustomerPK.equals(other.getParentCustomerPK()))) &&
            this.customerTypeId == other.getCustomerTypeId() &&
            ((this.invoicingCoId==null && other.getInvoicingCoId()==null) || 
             (this.invoicingCoId!=null &&
              this.invoicingCoId.equals(other.getInvoicingCoId()))) &&
            ((this.marketSegmentId==null && other.getMarketSegmentId()==null) || 
             (this.marketSegmentId!=null &&
              this.marketSegmentId.equals(other.getMarketSegmentId()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.taxExemptRef==null && other.getTaxExemptRef()==null) || 
             (this.taxExemptRef!=null &&
              this.taxExemptRef.equals(other.getTaxExemptRef()))) &&
            ((this.providerId==null && other.getProviderId()==null) || 
             (this.providerId!=null &&
              this.providerId.equals(other.getProviderId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.billPeriod==null && other.getBillPeriod()==null) || 
             (this.billPeriod!=null &&
              this.billPeriod.equals(other.getBillPeriod()))) &&
            ((this.billPeriodUnits==null && other.getBillPeriodUnits()==null) || 
             (this.billPeriodUnits!=null &&
              this.billPeriodUnits.equals(other.getBillPeriodUnits()))) &&
            ((this.nextBillDtm==null && other.getNextBillDtm()==null) || 
             (this.nextBillDtm!=null &&
              this.nextBillDtm.equals(other.getNextBillDtm()))) &&
            ((this.billsPerStatement==null && other.getBillsPerStatement()==null) || 
             (this.billsPerStatement!=null &&
              this.billsPerStatement.equals(other.getBillsPerStatement()))) &&
            ((this.vatRegistration==null && other.getVatRegistration()==null) || 
             (this.vatRegistration!=null &&
              this.vatRegistration.equals(other.getVatRegistration()))) &&
            ((this.permissionId==null && other.getPermissionId()==null) || 
             (this.permissionId!=null &&
              this.permissionId.equals(other.getPermissionId()))) &&
            this.concatenateBillsBoo == other.isConcatenateBillsBoo() &&
            ((this.domainId==null && other.getDomainId()==null) || 
             (this.domainId!=null &&
              this.domainId.equals(other.getDomainId()))) &&
            ((this.summaryContactPK==null && other.getSummaryContactPK()==null) || 
             (this.summaryContactPK!=null &&
              this.summaryContactPK.equals(other.getSummaryContactPK()))) &&
            ((this.summaryCurrencyCode==null && other.getSummaryCurrencyCode()==null) || 
             (this.summaryCurrencyCode!=null &&
              this.summaryCurrencyCode.equals(other.getSummaryCurrencyCode()))) &&
            ((this.summaryStyleId==null && other.getSummaryStyleId()==null) || 
             (this.summaryStyleId!=null &&
              this.summaryStyleId.equals(other.getSummaryStyleId()))) &&
            ((this.summaryBillHandlingCode==null && other.getSummaryBillHandlingCode()==null) || 
             (this.summaryBillHandlingCode!=null &&
              this.summaryBillHandlingCode.equals(other.getSummaryBillHandlingCode())));
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
        if (getCustomerPK() != null) {
            _hashCode += getCustomerPK().hashCode();
        }
        if (getParentCustomerPK() != null) {
            _hashCode += getParentCustomerPK().hashCode();
        }
        _hashCode += getCustomerTypeId();
        if (getInvoicingCoId() != null) {
            _hashCode += getInvoicingCoId().hashCode();
        }
        if (getMarketSegmentId() != null) {
            _hashCode += getMarketSegmentId().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getTaxExemptRef() != null) {
            _hashCode += getTaxExemptRef().hashCode();
        }
        if (getProviderId() != null) {
            _hashCode += getProviderId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getBillPeriod() != null) {
            _hashCode += getBillPeriod().hashCode();
        }
        if (getBillPeriodUnits() != null) {
            _hashCode += getBillPeriodUnits().hashCode();
        }
        if (getNextBillDtm() != null) {
            _hashCode += getNextBillDtm().hashCode();
        }
        if (getBillsPerStatement() != null) {
            _hashCode += getBillsPerStatement().hashCode();
        }
        if (getVatRegistration() != null) {
            _hashCode += getVatRegistration().hashCode();
        }
        if (getPermissionId() != null) {
            _hashCode += getPermissionId().hashCode();
        }
        _hashCode += (isConcatenateBillsBoo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDomainId() != null) {
            _hashCode += getDomainId().hashCode();
        }
        if (getSummaryContactPK() != null) {
            _hashCode += getSummaryContactPK().hashCode();
        }
        if (getSummaryCurrencyCode() != null) {
            _hashCode += getSummaryCurrencyCode().hashCode();
        }
        if (getSummaryStyleId() != null) {
            _hashCode += getSummaryStyleId().hashCode();
        }
        if (getSummaryBillHandlingCode() != null) {
            _hashCode += getSummaryBillHandlingCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

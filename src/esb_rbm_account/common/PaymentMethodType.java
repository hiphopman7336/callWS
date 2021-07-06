/**
 * PaymentMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class PaymentMethodType  implements java.io.Serializable {
    private java.lang.String accountId;

    private int paymentMethodId;

    private java.lang.String bankCode;

    private java.lang.String bankBranchCode;

    private java.lang.String bankAccountName;

    private java.lang.String bankAccountNumber;

    private java.lang.String taxId;

    public PaymentMethodType() {
    }

    public PaymentMethodType(
           java.lang.String accountId,
           int paymentMethodId,
           java.lang.String bankCode,
           java.lang.String bankBranchCode,
           java.lang.String bankAccountName,
           java.lang.String bankAccountNumber,
           java.lang.String taxId) {
           this.accountId = accountId;
           this.paymentMethodId = paymentMethodId;
           this.bankCode = bankCode;
           this.bankBranchCode = bankBranchCode;
           this.bankAccountName = bankAccountName;
           this.bankAccountNumber = bankAccountNumber;
           this.taxId = taxId;
    }


    /**
     * Gets the accountId value for this PaymentMethodType.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PaymentMethodType.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the paymentMethodId value for this PaymentMethodType.
     * 
     * @return paymentMethodId
     */
    public int getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentMethodType.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the bankCode value for this PaymentMethodType.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this PaymentMethodType.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankBranchCode value for this PaymentMethodType.
     * 
     * @return bankBranchCode
     */
    public java.lang.String getBankBranchCode() {
        return bankBranchCode;
    }


    /**
     * Sets the bankBranchCode value for this PaymentMethodType.
     * 
     * @param bankBranchCode
     */
    public void setBankBranchCode(java.lang.String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }


    /**
     * Gets the bankAccountName value for this PaymentMethodType.
     * 
     * @return bankAccountName
     */
    public java.lang.String getBankAccountName() {
        return bankAccountName;
    }


    /**
     * Sets the bankAccountName value for this PaymentMethodType.
     * 
     * @param bankAccountName
     */
    public void setBankAccountName(java.lang.String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }


    /**
     * Gets the bankAccountNumber value for this PaymentMethodType.
     * 
     * @return bankAccountNumber
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this PaymentMethodType.
     * 
     * @param bankAccountNumber
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the taxId value for this PaymentMethodType.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PaymentMethodType.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodType)) return false;
        PaymentMethodType other = (PaymentMethodType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            this.paymentMethodId == other.getPaymentMethodId() &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankBranchCode==null && other.getBankBranchCode()==null) || 
             (this.bankBranchCode!=null &&
              this.bankBranchCode.equals(other.getBankBranchCode()))) &&
            ((this.bankAccountName==null && other.getBankAccountName()==null) || 
             (this.bankAccountName!=null &&
              this.bankAccountName.equals(other.getBankAccountName()))) &&
            ((this.bankAccountNumber==null && other.getBankAccountNumber()==null) || 
             (this.bankAccountNumber!=null &&
              this.bankAccountNumber.equals(other.getBankAccountNumber()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        _hashCode += getPaymentMethodId();
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankBranchCode() != null) {
            _hashCode += getBankBranchCode().hashCode();
        }
        if (getBankAccountName() != null) {
            _hashCode += getBankAccountName().hashCode();
        }
        if (getBankAccountNumber() != null) {
            _hashCode += getBankAccountNumber().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

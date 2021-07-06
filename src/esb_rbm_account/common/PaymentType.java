/**
 * PaymentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class PaymentType  implements java.io.Serializable {
    private int paymentMethodId;

    private java.lang.String taxId;

    private java.lang.String bankCode;

    private java.lang.String bankBranchCode;

    private java.lang.String bankAccountName;

    private java.lang.String bankAccountNumber;

    private java.lang.String startDat;

    private java.lang.String upToDat;

    public PaymentType() {
    }

    public PaymentType(
           int paymentMethodId,
           java.lang.String taxId,
           java.lang.String bankCode,
           java.lang.String bankBranchCode,
           java.lang.String bankAccountName,
           java.lang.String bankAccountNumber,
           java.lang.String startDat,
           java.lang.String upToDat) {
           this.paymentMethodId = paymentMethodId;
           this.taxId = taxId;
           this.bankCode = bankCode;
           this.bankBranchCode = bankBranchCode;
           this.bankAccountName = bankAccountName;
           this.bankAccountNumber = bankAccountNumber;
           this.startDat = startDat;
           this.upToDat = upToDat;
    }


    /**
     * Gets the paymentMethodId value for this PaymentType.
     * 
     * @return paymentMethodId
     */
    public int getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentType.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the taxId value for this PaymentType.
     * 
     * @return taxId
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PaymentType.
     * 
     * @param taxId
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the bankCode value for this PaymentType.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this PaymentType.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankBranchCode value for this PaymentType.
     * 
     * @return bankBranchCode
     */
    public java.lang.String getBankBranchCode() {
        return bankBranchCode;
    }


    /**
     * Sets the bankBranchCode value for this PaymentType.
     * 
     * @param bankBranchCode
     */
    public void setBankBranchCode(java.lang.String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }


    /**
     * Gets the bankAccountName value for this PaymentType.
     * 
     * @return bankAccountName
     */
    public java.lang.String getBankAccountName() {
        return bankAccountName;
    }


    /**
     * Sets the bankAccountName value for this PaymentType.
     * 
     * @param bankAccountName
     */
    public void setBankAccountName(java.lang.String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }


    /**
     * Gets the bankAccountNumber value for this PaymentType.
     * 
     * @return bankAccountNumber
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this PaymentType.
     * 
     * @param bankAccountNumber
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the startDat value for this PaymentType.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this PaymentType.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the upToDat value for this PaymentType.
     * 
     * @return upToDat
     */
    public java.lang.String getUpToDat() {
        return upToDat;
    }


    /**
     * Sets the upToDat value for this PaymentType.
     * 
     * @param upToDat
     */
    public void setUpToDat(java.lang.String upToDat) {
        this.upToDat = upToDat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentType)) return false;
        PaymentType other = (PaymentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.paymentMethodId == other.getPaymentMethodId() &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
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
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.upToDat==null && other.getUpToDat()==null) || 
             (this.upToDat!=null &&
              this.upToDat.equals(other.getUpToDat())));
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
        _hashCode += getPaymentMethodId();
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
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
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getUpToDat() != null) {
            _hashCode += getUpToDat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

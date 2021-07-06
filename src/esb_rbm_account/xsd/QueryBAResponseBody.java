/**
 * QueryBAResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class QueryBAResponseBody  implements java.io.Serializable {
    private esb_rbm_account.common.AccountInfoType accountInfo;

    private esb_rbm_account.common.AddressType addressInfo;

    private esb_rbm_account.common.PaymentType paymentInfo;

    private esb_rbm_account.common.HistoriedAccountStatus historiedAccountStatus;

    public QueryBAResponseBody() {
    }

    public QueryBAResponseBody(
           esb_rbm_account.common.AccountInfoType accountInfo,
           esb_rbm_account.common.AddressType addressInfo,
           esb_rbm_account.common.PaymentType paymentInfo,
           esb_rbm_account.common.HistoriedAccountStatus historiedAccountStatus) {
           this.accountInfo = accountInfo;
           this.addressInfo = addressInfo;
           this.paymentInfo = paymentInfo;
           this.historiedAccountStatus = historiedAccountStatus;
    }


    /**
     * Gets the accountInfo value for this QueryBAResponseBody.
     * 
     * @return accountInfo
     */
    public esb_rbm_account.common.AccountInfoType getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this QueryBAResponseBody.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(esb_rbm_account.common.AccountInfoType accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the addressInfo value for this QueryBAResponseBody.
     * 
     * @return addressInfo
     */
    public esb_rbm_account.common.AddressType getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this QueryBAResponseBody.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(esb_rbm_account.common.AddressType addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the paymentInfo value for this QueryBAResponseBody.
     * 
     * @return paymentInfo
     */
    public esb_rbm_account.common.PaymentType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this QueryBAResponseBody.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(esb_rbm_account.common.PaymentType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the historiedAccountStatus value for this QueryBAResponseBody.
     * 
     * @return historiedAccountStatus
     */
    public esb_rbm_account.common.HistoriedAccountStatus getHistoriedAccountStatus() {
        return historiedAccountStatus;
    }


    /**
     * Sets the historiedAccountStatus value for this QueryBAResponseBody.
     * 
     * @param historiedAccountStatus
     */
    public void setHistoriedAccountStatus(esb_rbm_account.common.HistoriedAccountStatus historiedAccountStatus) {
        this.historiedAccountStatus = historiedAccountStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBAResponseBody)) return false;
        QueryBAResponseBody other = (QueryBAResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.historiedAccountStatus==null && other.getHistoriedAccountStatus()==null) || 
             (this.historiedAccountStatus!=null &&
              this.historiedAccountStatus.equals(other.getHistoriedAccountStatus())));
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
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getHistoriedAccountStatus() != null) {
            _hashCode += getHistoriedAccountStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

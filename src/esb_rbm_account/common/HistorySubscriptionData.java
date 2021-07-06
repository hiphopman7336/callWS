/**
 * HistorySubscriptionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class HistorySubscriptionData  implements java.io.Serializable {
    private java.lang.String startDat;

    private java.lang.String accountNum;

    private java.lang.String subscriptionLabel;

    private int cpsId;

    public HistorySubscriptionData() {
    }

    public HistorySubscriptionData(
           java.lang.String startDat,
           java.lang.String accountNum,
           java.lang.String subscriptionLabel,
           int cpsId) {
           this.startDat = startDat;
           this.accountNum = accountNum;
           this.subscriptionLabel = subscriptionLabel;
           this.cpsId = cpsId;
    }


    /**
     * Gets the startDat value for this HistorySubscriptionData.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this HistorySubscriptionData.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the accountNum value for this HistorySubscriptionData.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this HistorySubscriptionData.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the subscriptionLabel value for this HistorySubscriptionData.
     * 
     * @return subscriptionLabel
     */
    public java.lang.String getSubscriptionLabel() {
        return subscriptionLabel;
    }


    /**
     * Sets the subscriptionLabel value for this HistorySubscriptionData.
     * 
     * @param subscriptionLabel
     */
    public void setSubscriptionLabel(java.lang.String subscriptionLabel) {
        this.subscriptionLabel = subscriptionLabel;
    }


    /**
     * Gets the cpsId value for this HistorySubscriptionData.
     * 
     * @return cpsId
     */
    public int getCpsId() {
        return cpsId;
    }


    /**
     * Sets the cpsId value for this HistorySubscriptionData.
     * 
     * @param cpsId
     */
    public void setCpsId(int cpsId) {
        this.cpsId = cpsId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistorySubscriptionData)) return false;
        HistorySubscriptionData other = (HistorySubscriptionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            ((this.subscriptionLabel==null && other.getSubscriptionLabel()==null) || 
             (this.subscriptionLabel!=null &&
              this.subscriptionLabel.equals(other.getSubscriptionLabel()))) &&
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
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        if (getSubscriptionLabel() != null) {
            _hashCode += getSubscriptionLabel().hashCode();
        }
        _hashCode += getCpsId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

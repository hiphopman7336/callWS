/**
 * SubscriptionDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class SubscriptionDataType  implements java.io.Serializable {
    private java.lang.Integer subscriptionType;

    private java.lang.Integer billingTariffId;

    private java.lang.String startDateTime;

    private java.lang.String offerID;

    private java.lang.String serviceNo;

    private int cpsId;

    private java.lang.String offerSequence;

    private java.lang.String srNumber;

    private java.lang.String offerEndDate;

    private java.lang.String subscriptionLabel;

    private java.lang.String promotionCreditLimit;

    public SubscriptionDataType() {
    }

    public SubscriptionDataType(
           java.lang.Integer subscriptionType,
           java.lang.Integer billingTariffId,
           java.lang.String startDateTime,
           java.lang.String offerID,
           java.lang.String serviceNo,
           int cpsId,
           java.lang.String offerSequence,
           java.lang.String srNumber,
           java.lang.String offerEndDate,
           java.lang.String subscriptionLabel,
           java.lang.String promotionCreditLimit) {
           this.subscriptionType = subscriptionType;
           this.billingTariffId = billingTariffId;
           this.startDateTime = startDateTime;
           this.offerID = offerID;
           this.serviceNo = serviceNo;
           this.cpsId = cpsId;
           this.offerSequence = offerSequence;
           this.srNumber = srNumber;
           this.offerEndDate = offerEndDate;
           this.subscriptionLabel = subscriptionLabel;
           this.promotionCreditLimit = promotionCreditLimit;
    }


    /**
     * Gets the subscriptionType value for this SubscriptionDataType.
     * 
     * @return subscriptionType
     */
    public java.lang.Integer getSubscriptionType() {
        return subscriptionType;
    }


    /**
     * Sets the subscriptionType value for this SubscriptionDataType.
     * 
     * @param subscriptionType
     */
    public void setSubscriptionType(java.lang.Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    /**
     * Gets the billingTariffId value for this SubscriptionDataType.
     * 
     * @return billingTariffId
     */
    public java.lang.Integer getBillingTariffId() {
        return billingTariffId;
    }


    /**
     * Sets the billingTariffId value for this SubscriptionDataType.
     * 
     * @param billingTariffId
     */
    public void setBillingTariffId(java.lang.Integer billingTariffId) {
        this.billingTariffId = billingTariffId;
    }


    /**
     * Gets the startDateTime value for this SubscriptionDataType.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this SubscriptionDataType.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the offerID value for this SubscriptionDataType.
     * 
     * @return offerID
     */
    public java.lang.String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this SubscriptionDataType.
     * 
     * @param offerID
     */
    public void setOfferID(java.lang.String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the serviceNo value for this SubscriptionDataType.
     * 
     * @return serviceNo
     */
    public java.lang.String getServiceNo() {
        return serviceNo;
    }


    /**
     * Sets the serviceNo value for this SubscriptionDataType.
     * 
     * @param serviceNo
     */
    public void setServiceNo(java.lang.String serviceNo) {
        this.serviceNo = serviceNo;
    }


    /**
     * Gets the cpsId value for this SubscriptionDataType.
     * 
     * @return cpsId
     */
    public int getCpsId() {
        return cpsId;
    }


    /**
     * Sets the cpsId value for this SubscriptionDataType.
     * 
     * @param cpsId
     */
    public void setCpsId(int cpsId) {
        this.cpsId = cpsId;
    }


    /**
     * Gets the offerSequence value for this SubscriptionDataType.
     * 
     * @return offerSequence
     */
    public java.lang.String getOfferSequence() {
        return offerSequence;
    }


    /**
     * Sets the offerSequence value for this SubscriptionDataType.
     * 
     * @param offerSequence
     */
    public void setOfferSequence(java.lang.String offerSequence) {
        this.offerSequence = offerSequence;
    }


    /**
     * Gets the srNumber value for this SubscriptionDataType.
     * 
     * @return srNumber
     */
    public java.lang.String getSrNumber() {
        return srNumber;
    }


    /**
     * Sets the srNumber value for this SubscriptionDataType.
     * 
     * @param srNumber
     */
    public void setSrNumber(java.lang.String srNumber) {
        this.srNumber = srNumber;
    }


    /**
     * Gets the offerEndDate value for this SubscriptionDataType.
     * 
     * @return offerEndDate
     */
    public java.lang.String getOfferEndDate() {
        return offerEndDate;
    }


    /**
     * Sets the offerEndDate value for this SubscriptionDataType.
     * 
     * @param offerEndDate
     */
    public void setOfferEndDate(java.lang.String offerEndDate) {
        this.offerEndDate = offerEndDate;
    }


    /**
     * Gets the subscriptionLabel value for this SubscriptionDataType.
     * 
     * @return subscriptionLabel
     */
    public java.lang.String getSubscriptionLabel() {
        return subscriptionLabel;
    }


    /**
     * Sets the subscriptionLabel value for this SubscriptionDataType.
     * 
     * @param subscriptionLabel
     */
    public void setSubscriptionLabel(java.lang.String subscriptionLabel) {
        this.subscriptionLabel = subscriptionLabel;
    }


    /**
     * Gets the promotionCreditLimit value for this SubscriptionDataType.
     * 
     * @return promotionCreditLimit
     */
    public java.lang.String getPromotionCreditLimit() {
        return promotionCreditLimit;
    }


    /**
     * Sets the promotionCreditLimit value for this SubscriptionDataType.
     * 
     * @param promotionCreditLimit
     */
    public void setPromotionCreditLimit(java.lang.String promotionCreditLimit) {
        this.promotionCreditLimit = promotionCreditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionDataType)) return false;
        SubscriptionDataType other = (SubscriptionDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptionType==null && other.getSubscriptionType()==null) || 
             (this.subscriptionType!=null &&
              this.subscriptionType.equals(other.getSubscriptionType()))) &&
            ((this.billingTariffId==null && other.getBillingTariffId()==null) || 
             (this.billingTariffId!=null &&
              this.billingTariffId.equals(other.getBillingTariffId()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID()))) &&
            ((this.serviceNo==null && other.getServiceNo()==null) || 
             (this.serviceNo!=null &&
              this.serviceNo.equals(other.getServiceNo()))) &&
            this.cpsId == other.getCpsId() &&
            ((this.offerSequence==null && other.getOfferSequence()==null) || 
             (this.offerSequence!=null &&
              this.offerSequence.equals(other.getOfferSequence()))) &&
            ((this.srNumber==null && other.getSrNumber()==null) || 
             (this.srNumber!=null &&
              this.srNumber.equals(other.getSrNumber()))) &&
            ((this.offerEndDate==null && other.getOfferEndDate()==null) || 
             (this.offerEndDate!=null &&
              this.offerEndDate.equals(other.getOfferEndDate()))) &&
            ((this.subscriptionLabel==null && other.getSubscriptionLabel()==null) || 
             (this.subscriptionLabel!=null &&
              this.subscriptionLabel.equals(other.getSubscriptionLabel()))) &&
            ((this.promotionCreditLimit==null && other.getPromotionCreditLimit()==null) || 
             (this.promotionCreditLimit!=null &&
              this.promotionCreditLimit.equals(other.getPromotionCreditLimit())));
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
        if (getSubscriptionType() != null) {
            _hashCode += getSubscriptionType().hashCode();
        }
        if (getBillingTariffId() != null) {
            _hashCode += getBillingTariffId().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getServiceNo() != null) {
            _hashCode += getServiceNo().hashCode();
        }
        _hashCode += getCpsId();
        if (getOfferSequence() != null) {
            _hashCode += getOfferSequence().hashCode();
        }
        if (getSrNumber() != null) {
            _hashCode += getSrNumber().hashCode();
        }
        if (getOfferEndDate() != null) {
            _hashCode += getOfferEndDate().hashCode();
        }
        if (getSubscriptionLabel() != null) {
            _hashCode += getSubscriptionLabel().hashCode();
        }
        if (getPromotionCreditLimit() != null) {
            _hashCode += getPromotionCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

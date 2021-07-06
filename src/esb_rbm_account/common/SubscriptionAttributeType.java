/**
 * SubscriptionAttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class SubscriptionAttributeType  implements java.io.Serializable {
    private int subscriptionSeq;

    private java.lang.String offerId;

    private java.lang.String serviceNo;

    private java.lang.String offerSeq;

    private java.lang.String srNumber;

    private java.lang.String offerEndDate;

    private java.lang.String promotionCreditLimit;

    public SubscriptionAttributeType() {
    }

    public SubscriptionAttributeType(
           int subscriptionSeq,
           java.lang.String offerId,
           java.lang.String serviceNo,
           java.lang.String offerSeq,
           java.lang.String srNumber,
           java.lang.String offerEndDate,
           java.lang.String promotionCreditLimit) {
           this.subscriptionSeq = subscriptionSeq;
           this.offerId = offerId;
           this.serviceNo = serviceNo;
           this.offerSeq = offerSeq;
           this.srNumber = srNumber;
           this.offerEndDate = offerEndDate;
           this.promotionCreditLimit = promotionCreditLimit;
    }


    /**
     * Gets the subscriptionSeq value for this SubscriptionAttributeType.
     * 
     * @return subscriptionSeq
     */
    public int getSubscriptionSeq() {
        return subscriptionSeq;
    }


    /**
     * Sets the subscriptionSeq value for this SubscriptionAttributeType.
     * 
     * @param subscriptionSeq
     */
    public void setSubscriptionSeq(int subscriptionSeq) {
        this.subscriptionSeq = subscriptionSeq;
    }


    /**
     * Gets the offerId value for this SubscriptionAttributeType.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SubscriptionAttributeType.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the serviceNo value for this SubscriptionAttributeType.
     * 
     * @return serviceNo
     */
    public java.lang.String getServiceNo() {
        return serviceNo;
    }


    /**
     * Sets the serviceNo value for this SubscriptionAttributeType.
     * 
     * @param serviceNo
     */
    public void setServiceNo(java.lang.String serviceNo) {
        this.serviceNo = serviceNo;
    }


    /**
     * Gets the offerSeq value for this SubscriptionAttributeType.
     * 
     * @return offerSeq
     */
    public java.lang.String getOfferSeq() {
        return offerSeq;
    }


    /**
     * Sets the offerSeq value for this SubscriptionAttributeType.
     * 
     * @param offerSeq
     */
    public void setOfferSeq(java.lang.String offerSeq) {
        this.offerSeq = offerSeq;
    }


    /**
     * Gets the srNumber value for this SubscriptionAttributeType.
     * 
     * @return srNumber
     */
    public java.lang.String getSrNumber() {
        return srNumber;
    }


    /**
     * Sets the srNumber value for this SubscriptionAttributeType.
     * 
     * @param srNumber
     */
    public void setSrNumber(java.lang.String srNumber) {
        this.srNumber = srNumber;
    }


    /**
     * Gets the offerEndDate value for this SubscriptionAttributeType.
     * 
     * @return offerEndDate
     */
    public java.lang.String getOfferEndDate() {
        return offerEndDate;
    }


    /**
     * Sets the offerEndDate value for this SubscriptionAttributeType.
     * 
     * @param offerEndDate
     */
    public void setOfferEndDate(java.lang.String offerEndDate) {
        this.offerEndDate = offerEndDate;
    }


    /**
     * Gets the promotionCreditLimit value for this SubscriptionAttributeType.
     * 
     * @return promotionCreditLimit
     */
    public java.lang.String getPromotionCreditLimit() {
        return promotionCreditLimit;
    }


    /**
     * Sets the promotionCreditLimit value for this SubscriptionAttributeType.
     * 
     * @param promotionCreditLimit
     */
    public void setPromotionCreditLimit(java.lang.String promotionCreditLimit) {
        this.promotionCreditLimit = promotionCreditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionAttributeType)) return false;
        SubscriptionAttributeType other = (SubscriptionAttributeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subscriptionSeq == other.getSubscriptionSeq() &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.serviceNo==null && other.getServiceNo()==null) || 
             (this.serviceNo!=null &&
              this.serviceNo.equals(other.getServiceNo()))) &&
            ((this.offerSeq==null && other.getOfferSeq()==null) || 
             (this.offerSeq!=null &&
              this.offerSeq.equals(other.getOfferSeq()))) &&
            ((this.srNumber==null && other.getSrNumber()==null) || 
             (this.srNumber!=null &&
              this.srNumber.equals(other.getSrNumber()))) &&
            ((this.offerEndDate==null && other.getOfferEndDate()==null) || 
             (this.offerEndDate!=null &&
              this.offerEndDate.equals(other.getOfferEndDate()))) &&
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
        _hashCode += getSubscriptionSeq();
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getServiceNo() != null) {
            _hashCode += getServiceNo().hashCode();
        }
        if (getOfferSeq() != null) {
            _hashCode += getOfferSeq().hashCode();
        }
        if (getSrNumber() != null) {
            _hashCode += getSrNumber().hashCode();
        }
        if (getOfferEndDate() != null) {
            _hashCode += getOfferEndDate().hashCode();
        }
        if (getPromotionCreditLimit() != null) {
            _hashCode += getPromotionCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

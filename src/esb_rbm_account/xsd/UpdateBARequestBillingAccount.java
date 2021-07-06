/**
 * UpdateBARequestBillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class UpdateBARequestBillingAccount  implements java.io.Serializable {
    private java.lang.String customerAccountId;

    private java.lang.Long billingAccountTypeCode;

    private java.lang.String billingAccountTypeName;

    private java.lang.String billingAccountName;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String titleName;

    private java.lang.String addressName;

    private java.lang.String billingAccountId;

    private java.lang.String parentBillingAccount;

    private java.lang.String homeLocationId;

    private java.lang.String homeLocationName;

    private java.lang.Boolean billable;

    private java.lang.Boolean isBlacklist;

    private java.lang.Integer billingAccountStatus;

    private java.lang.Integer rateClass;

    private java.lang.Integer customerClass;

    private java.lang.Integer coverPageType;

    private java.lang.Integer companySize;

    private java.lang.String bAStartDate;

    private java.lang.String bAEndDate;

    private java.lang.Integer paymentMethod;

    private java.lang.String bankName;

    private java.lang.String bankAccountName;

    private java.lang.String bankAccountNumber;

    private java.lang.String bankBranch;

    private java.lang.String billMedia;

    private java.lang.String billCycle;

    private java.lang.Integer creditClassId;

    private java.lang.String nextBillDate;

    private java.lang.Integer billType;

    private java.lang.Integer billFrequence;

    private java.lang.Integer billFrequenceUnit;

    private java.lang.Integer withHoldingTexIndicator;

    private java.lang.String currencyCode;

    private java.lang.Integer languageId;

    private java.lang.Integer vatCode;

    private java.lang.Boolean isGovernment;

    private java.lang.Boolean isSbu;

    private java.lang.Integer billPerStatement;

    private java.lang.String notificationType;

    private java.lang.String registrationId;

    private java.lang.String citizenId;

    private java.lang.String passportNo;

    private java.lang.String primaryServiceNo;

    private java.lang.String billingEmail;

    private java.lang.String VATRegistrationCode;

    private java.lang.String billCompany;

    private java.lang.String legalAddress;

    private java.lang.String legalName;

    private esb_rbm_account.xsd.BillingAddress billingAddress;

    private java.lang.Boolean isUpdateLegalName;

    private java.lang.Boolean isUpdateLegalAddress;

    private java.lang.Boolean isUpdateNextBillDate;

    private java.lang.Boolean isUpdateContactTel;

    private java.lang.Integer billStyleId;

    private java.lang.String daytimeContactTel;

    private java.lang.String daytimeExtension;

    private java.lang.String eveningContactTel;

    private java.lang.String eveningExtension;

    private java.lang.String faxContactTel;

    private java.lang.String mobileContactTel;

    public UpdateBARequestBillingAccount() {
    }

    public UpdateBARequestBillingAccount(
           java.lang.String customerAccountId,
           java.lang.Long billingAccountTypeCode,
           java.lang.String billingAccountTypeName,
           java.lang.String billingAccountName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String titleName,
           java.lang.String addressName,
           java.lang.String billingAccountId,
           java.lang.String parentBillingAccount,
           java.lang.String homeLocationId,
           java.lang.String homeLocationName,
           java.lang.Boolean billable,
           java.lang.Boolean isBlacklist,
           java.lang.Integer billingAccountStatus,
           java.lang.Integer rateClass,
           java.lang.Integer customerClass,
           java.lang.Integer coverPageType,
           java.lang.Integer companySize,
           java.lang.String bAStartDate,
           java.lang.String bAEndDate,
           java.lang.Integer paymentMethod,
           java.lang.String bankName,
           java.lang.String bankAccountName,
           java.lang.String bankAccountNumber,
           java.lang.String bankBranch,
           java.lang.String billMedia,
           java.lang.String billCycle,
           java.lang.Integer creditClassId,
           java.lang.String nextBillDate,
           java.lang.Integer billType,
           java.lang.Integer billFrequence,
           java.lang.Integer billFrequenceUnit,
           java.lang.Integer withHoldingTexIndicator,
           java.lang.String currencyCode,
           java.lang.Integer languageId,
           java.lang.Integer vatCode,
           java.lang.Boolean isGovernment,
           java.lang.Boolean isSbu,
           java.lang.Integer billPerStatement,
           java.lang.String notificationType,
           java.lang.String registrationId,
           java.lang.String citizenId,
           java.lang.String passportNo,
           java.lang.String primaryServiceNo,
           java.lang.String billingEmail,
           java.lang.String VATRegistrationCode,
           java.lang.String billCompany,
           java.lang.String legalAddress,
           java.lang.String legalName,
           esb_rbm_account.xsd.BillingAddress billingAddress,
           java.lang.Boolean isUpdateLegalName,
           java.lang.Boolean isUpdateLegalAddress,
           java.lang.Boolean isUpdateNextBillDate,
           java.lang.Boolean isUpdateContactTel,
           java.lang.Integer billStyleId,
           java.lang.String daytimeContactTel,
           java.lang.String daytimeExtension,
           java.lang.String eveningContactTel,
           java.lang.String eveningExtension,
           java.lang.String faxContactTel,
           java.lang.String mobileContactTel) {
           this.customerAccountId = customerAccountId;
           this.billingAccountTypeCode = billingAccountTypeCode;
           this.billingAccountTypeName = billingAccountTypeName;
           this.billingAccountName = billingAccountName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.titleName = titleName;
           this.addressName = addressName;
           this.billingAccountId = billingAccountId;
           this.parentBillingAccount = parentBillingAccount;
           this.homeLocationId = homeLocationId;
           this.homeLocationName = homeLocationName;
           this.billable = billable;
           this.isBlacklist = isBlacklist;
           this.billingAccountStatus = billingAccountStatus;
           this.rateClass = rateClass;
           this.customerClass = customerClass;
           this.coverPageType = coverPageType;
           this.companySize = companySize;
           this.bAStartDate = bAStartDate;
           this.bAEndDate = bAEndDate;
           this.paymentMethod = paymentMethod;
           this.bankName = bankName;
           this.bankAccountName = bankAccountName;
           this.bankAccountNumber = bankAccountNumber;
           this.bankBranch = bankBranch;
           this.billMedia = billMedia;
           this.billCycle = billCycle;
           this.creditClassId = creditClassId;
           this.nextBillDate = nextBillDate;
           this.billType = billType;
           this.billFrequence = billFrequence;
           this.billFrequenceUnit = billFrequenceUnit;
           this.withHoldingTexIndicator = withHoldingTexIndicator;
           this.currencyCode = currencyCode;
           this.languageId = languageId;
           this.vatCode = vatCode;
           this.isGovernment = isGovernment;
           this.isSbu = isSbu;
           this.billPerStatement = billPerStatement;
           this.notificationType = notificationType;
           this.registrationId = registrationId;
           this.citizenId = citizenId;
           this.passportNo = passportNo;
           this.primaryServiceNo = primaryServiceNo;
           this.billingEmail = billingEmail;
           this.VATRegistrationCode = VATRegistrationCode;
           this.billCompany = billCompany;
           this.legalAddress = legalAddress;
           this.legalName = legalName;
           this.billingAddress = billingAddress;
           this.isUpdateLegalName = isUpdateLegalName;
           this.isUpdateLegalAddress = isUpdateLegalAddress;
           this.isUpdateNextBillDate = isUpdateNextBillDate;
           this.isUpdateContactTel = isUpdateContactTel;
           this.billStyleId = billStyleId;
           this.daytimeContactTel = daytimeContactTel;
           this.daytimeExtension = daytimeExtension;
           this.eveningContactTel = eveningContactTel;
           this.eveningExtension = eveningExtension;
           this.faxContactTel = faxContactTel;
           this.mobileContactTel = mobileContactTel;
    }


    /**
     * Gets the customerAccountId value for this UpdateBARequestBillingAccount.
     * 
     * @return customerAccountId
     */
    public java.lang.String getCustomerAccountId() {
        return customerAccountId;
    }


    /**
     * Sets the customerAccountId value for this UpdateBARequestBillingAccount.
     * 
     * @param customerAccountId
     */
    public void setCustomerAccountId(java.lang.String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }


    /**
     * Gets the billingAccountTypeCode value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAccountTypeCode
     */
    public java.lang.Long getBillingAccountTypeCode() {
        return billingAccountTypeCode;
    }


    /**
     * Sets the billingAccountTypeCode value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAccountTypeCode
     */
    public void setBillingAccountTypeCode(java.lang.Long billingAccountTypeCode) {
        this.billingAccountTypeCode = billingAccountTypeCode;
    }


    /**
     * Gets the billingAccountTypeName value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAccountTypeName
     */
    public java.lang.String getBillingAccountTypeName() {
        return billingAccountTypeName;
    }


    /**
     * Sets the billingAccountTypeName value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAccountTypeName
     */
    public void setBillingAccountTypeName(java.lang.String billingAccountTypeName) {
        this.billingAccountTypeName = billingAccountTypeName;
    }


    /**
     * Gets the billingAccountName value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAccountName
     */
    public java.lang.String getBillingAccountName() {
        return billingAccountName;
    }


    /**
     * Sets the billingAccountName value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAccountName
     */
    public void setBillingAccountName(java.lang.String billingAccountName) {
        this.billingAccountName = billingAccountName;
    }


    /**
     * Gets the firstName value for this UpdateBARequestBillingAccount.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UpdateBARequestBillingAccount.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UpdateBARequestBillingAccount.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UpdateBARequestBillingAccount.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the titleName value for this UpdateBARequestBillingAccount.
     * 
     * @return titleName
     */
    public java.lang.String getTitleName() {
        return titleName;
    }


    /**
     * Sets the titleName value for this UpdateBARequestBillingAccount.
     * 
     * @param titleName
     */
    public void setTitleName(java.lang.String titleName) {
        this.titleName = titleName;
    }


    /**
     * Gets the addressName value for this UpdateBARequestBillingAccount.
     * 
     * @return addressName
     */
    public java.lang.String getAddressName() {
        return addressName;
    }


    /**
     * Sets the addressName value for this UpdateBARequestBillingAccount.
     * 
     * @param addressName
     */
    public void setAddressName(java.lang.String addressName) {
        this.addressName = addressName;
    }


    /**
     * Gets the billingAccountId value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAccountId
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the parentBillingAccount value for this UpdateBARequestBillingAccount.
     * 
     * @return parentBillingAccount
     */
    public java.lang.String getParentBillingAccount() {
        return parentBillingAccount;
    }


    /**
     * Sets the parentBillingAccount value for this UpdateBARequestBillingAccount.
     * 
     * @param parentBillingAccount
     */
    public void setParentBillingAccount(java.lang.String parentBillingAccount) {
        this.parentBillingAccount = parentBillingAccount;
    }


    /**
     * Gets the homeLocationId value for this UpdateBARequestBillingAccount.
     * 
     * @return homeLocationId
     */
    public java.lang.String getHomeLocationId() {
        return homeLocationId;
    }


    /**
     * Sets the homeLocationId value for this UpdateBARequestBillingAccount.
     * 
     * @param homeLocationId
     */
    public void setHomeLocationId(java.lang.String homeLocationId) {
        this.homeLocationId = homeLocationId;
    }


    /**
     * Gets the homeLocationName value for this UpdateBARequestBillingAccount.
     * 
     * @return homeLocationName
     */
    public java.lang.String getHomeLocationName() {
        return homeLocationName;
    }


    /**
     * Sets the homeLocationName value for this UpdateBARequestBillingAccount.
     * 
     * @param homeLocationName
     */
    public void setHomeLocationName(java.lang.String homeLocationName) {
        this.homeLocationName = homeLocationName;
    }


    /**
     * Gets the billable value for this UpdateBARequestBillingAccount.
     * 
     * @return billable
     */
    public java.lang.Boolean getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this UpdateBARequestBillingAccount.
     * 
     * @param billable
     */
    public void setBillable(java.lang.Boolean billable) {
        this.billable = billable;
    }


    /**
     * Gets the isBlacklist value for this UpdateBARequestBillingAccount.
     * 
     * @return isBlacklist
     */
    public java.lang.Boolean getIsBlacklist() {
        return isBlacklist;
    }


    /**
     * Sets the isBlacklist value for this UpdateBARequestBillingAccount.
     * 
     * @param isBlacklist
     */
    public void setIsBlacklist(java.lang.Boolean isBlacklist) {
        this.isBlacklist = isBlacklist;
    }


    /**
     * Gets the billingAccountStatus value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAccountStatus
     */
    public java.lang.Integer getBillingAccountStatus() {
        return billingAccountStatus;
    }


    /**
     * Sets the billingAccountStatus value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAccountStatus
     */
    public void setBillingAccountStatus(java.lang.Integer billingAccountStatus) {
        this.billingAccountStatus = billingAccountStatus;
    }


    /**
     * Gets the rateClass value for this UpdateBARequestBillingAccount.
     * 
     * @return rateClass
     */
    public java.lang.Integer getRateClass() {
        return rateClass;
    }


    /**
     * Sets the rateClass value for this UpdateBARequestBillingAccount.
     * 
     * @param rateClass
     */
    public void setRateClass(java.lang.Integer rateClass) {
        this.rateClass = rateClass;
    }


    /**
     * Gets the customerClass value for this UpdateBARequestBillingAccount.
     * 
     * @return customerClass
     */
    public java.lang.Integer getCustomerClass() {
        return customerClass;
    }


    /**
     * Sets the customerClass value for this UpdateBARequestBillingAccount.
     * 
     * @param customerClass
     */
    public void setCustomerClass(java.lang.Integer customerClass) {
        this.customerClass = customerClass;
    }


    /**
     * Gets the coverPageType value for this UpdateBARequestBillingAccount.
     * 
     * @return coverPageType
     */
    public java.lang.Integer getCoverPageType() {
        return coverPageType;
    }


    /**
     * Sets the coverPageType value for this UpdateBARequestBillingAccount.
     * 
     * @param coverPageType
     */
    public void setCoverPageType(java.lang.Integer coverPageType) {
        this.coverPageType = coverPageType;
    }


    /**
     * Gets the companySize value for this UpdateBARequestBillingAccount.
     * 
     * @return companySize
     */
    public java.lang.Integer getCompanySize() {
        return companySize;
    }


    /**
     * Sets the companySize value for this UpdateBARequestBillingAccount.
     * 
     * @param companySize
     */
    public void setCompanySize(java.lang.Integer companySize) {
        this.companySize = companySize;
    }


    /**
     * Gets the bAStartDate value for this UpdateBARequestBillingAccount.
     * 
     * @return bAStartDate
     */
    public java.lang.String getBAStartDate() {
        return bAStartDate;
    }


    /**
     * Sets the bAStartDate value for this UpdateBARequestBillingAccount.
     * 
     * @param bAStartDate
     */
    public void setBAStartDate(java.lang.String bAStartDate) {
        this.bAStartDate = bAStartDate;
    }


    /**
     * Gets the bAEndDate value for this UpdateBARequestBillingAccount.
     * 
     * @return bAEndDate
     */
    public java.lang.String getBAEndDate() {
        return bAEndDate;
    }


    /**
     * Sets the bAEndDate value for this UpdateBARequestBillingAccount.
     * 
     * @param bAEndDate
     */
    public void setBAEndDate(java.lang.String bAEndDate) {
        this.bAEndDate = bAEndDate;
    }


    /**
     * Gets the paymentMethod value for this UpdateBARequestBillingAccount.
     * 
     * @return paymentMethod
     */
    public java.lang.Integer getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this UpdateBARequestBillingAccount.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the bankName value for this UpdateBARequestBillingAccount.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this UpdateBARequestBillingAccount.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankAccountName value for this UpdateBARequestBillingAccount.
     * 
     * @return bankAccountName
     */
    public java.lang.String getBankAccountName() {
        return bankAccountName;
    }


    /**
     * Sets the bankAccountName value for this UpdateBARequestBillingAccount.
     * 
     * @param bankAccountName
     */
    public void setBankAccountName(java.lang.String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }


    /**
     * Gets the bankAccountNumber value for this UpdateBARequestBillingAccount.
     * 
     * @return bankAccountNumber
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this UpdateBARequestBillingAccount.
     * 
     * @param bankAccountNumber
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the bankBranch value for this UpdateBARequestBillingAccount.
     * 
     * @return bankBranch
     */
    public java.lang.String getBankBranch() {
        return bankBranch;
    }


    /**
     * Sets the bankBranch value for this UpdateBARequestBillingAccount.
     * 
     * @param bankBranch
     */
    public void setBankBranch(java.lang.String bankBranch) {
        this.bankBranch = bankBranch;
    }


    /**
     * Gets the billMedia value for this UpdateBARequestBillingAccount.
     * 
     * @return billMedia
     */
    public java.lang.String getBillMedia() {
        return billMedia;
    }


    /**
     * Sets the billMedia value for this UpdateBARequestBillingAccount.
     * 
     * @param billMedia
     */
    public void setBillMedia(java.lang.String billMedia) {
        this.billMedia = billMedia;
    }


    /**
     * Gets the billCycle value for this UpdateBARequestBillingAccount.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this UpdateBARequestBillingAccount.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the creditClassId value for this UpdateBARequestBillingAccount.
     * 
     * @return creditClassId
     */
    public java.lang.Integer getCreditClassId() {
        return creditClassId;
    }


    /**
     * Sets the creditClassId value for this UpdateBARequestBillingAccount.
     * 
     * @param creditClassId
     */
    public void setCreditClassId(java.lang.Integer creditClassId) {
        this.creditClassId = creditClassId;
    }


    /**
     * Gets the nextBillDate value for this UpdateBARequestBillingAccount.
     * 
     * @return nextBillDate
     */
    public java.lang.String getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this UpdateBARequestBillingAccount.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(java.lang.String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the billType value for this UpdateBARequestBillingAccount.
     * 
     * @return billType
     */
    public java.lang.Integer getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this UpdateBARequestBillingAccount.
     * 
     * @param billType
     */
    public void setBillType(java.lang.Integer billType) {
        this.billType = billType;
    }


    /**
     * Gets the billFrequence value for this UpdateBARequestBillingAccount.
     * 
     * @return billFrequence
     */
    public java.lang.Integer getBillFrequence() {
        return billFrequence;
    }


    /**
     * Sets the billFrequence value for this UpdateBARequestBillingAccount.
     * 
     * @param billFrequence
     */
    public void setBillFrequence(java.lang.Integer billFrequence) {
        this.billFrequence = billFrequence;
    }


    /**
     * Gets the billFrequenceUnit value for this UpdateBARequestBillingAccount.
     * 
     * @return billFrequenceUnit
     */
    public java.lang.Integer getBillFrequenceUnit() {
        return billFrequenceUnit;
    }


    /**
     * Sets the billFrequenceUnit value for this UpdateBARequestBillingAccount.
     * 
     * @param billFrequenceUnit
     */
    public void setBillFrequenceUnit(java.lang.Integer billFrequenceUnit) {
        this.billFrequenceUnit = billFrequenceUnit;
    }


    /**
     * Gets the withHoldingTexIndicator value for this UpdateBARequestBillingAccount.
     * 
     * @return withHoldingTexIndicator
     */
    public java.lang.Integer getWithHoldingTexIndicator() {
        return withHoldingTexIndicator;
    }


    /**
     * Sets the withHoldingTexIndicator value for this UpdateBARequestBillingAccount.
     * 
     * @param withHoldingTexIndicator
     */
    public void setWithHoldingTexIndicator(java.lang.Integer withHoldingTexIndicator) {
        this.withHoldingTexIndicator = withHoldingTexIndicator;
    }


    /**
     * Gets the currencyCode value for this UpdateBARequestBillingAccount.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this UpdateBARequestBillingAccount.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the languageId value for this UpdateBARequestBillingAccount.
     * 
     * @return languageId
     */
    public java.lang.Integer getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this UpdateBARequestBillingAccount.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the vatCode value for this UpdateBARequestBillingAccount.
     * 
     * @return vatCode
     */
    public java.lang.Integer getVatCode() {
        return vatCode;
    }


    /**
     * Sets the vatCode value for this UpdateBARequestBillingAccount.
     * 
     * @param vatCode
     */
    public void setVatCode(java.lang.Integer vatCode) {
        this.vatCode = vatCode;
    }


    /**
     * Gets the isGovernment value for this UpdateBARequestBillingAccount.
     * 
     * @return isGovernment
     */
    public java.lang.Boolean getIsGovernment() {
        return isGovernment;
    }


    /**
     * Sets the isGovernment value for this UpdateBARequestBillingAccount.
     * 
     * @param isGovernment
     */
    public void setIsGovernment(java.lang.Boolean isGovernment) {
        this.isGovernment = isGovernment;
    }


    /**
     * Gets the isSbu value for this UpdateBARequestBillingAccount.
     * 
     * @return isSbu
     */
    public java.lang.Boolean getIsSbu() {
        return isSbu;
    }


    /**
     * Sets the isSbu value for this UpdateBARequestBillingAccount.
     * 
     * @param isSbu
     */
    public void setIsSbu(java.lang.Boolean isSbu) {
        this.isSbu = isSbu;
    }


    /**
     * Gets the billPerStatement value for this UpdateBARequestBillingAccount.
     * 
     * @return billPerStatement
     */
    public java.lang.Integer getBillPerStatement() {
        return billPerStatement;
    }


    /**
     * Sets the billPerStatement value for this UpdateBARequestBillingAccount.
     * 
     * @param billPerStatement
     */
    public void setBillPerStatement(java.lang.Integer billPerStatement) {
        this.billPerStatement = billPerStatement;
    }


    /**
     * Gets the notificationType value for this UpdateBARequestBillingAccount.
     * 
     * @return notificationType
     */
    public java.lang.String getNotificationType() {
        return notificationType;
    }


    /**
     * Sets the notificationType value for this UpdateBARequestBillingAccount.
     * 
     * @param notificationType
     */
    public void setNotificationType(java.lang.String notificationType) {
        this.notificationType = notificationType;
    }


    /**
     * Gets the registrationId value for this UpdateBARequestBillingAccount.
     * 
     * @return registrationId
     */
    public java.lang.String getRegistrationId() {
        return registrationId;
    }


    /**
     * Sets the registrationId value for this UpdateBARequestBillingAccount.
     * 
     * @param registrationId
     */
    public void setRegistrationId(java.lang.String registrationId) {
        this.registrationId = registrationId;
    }


    /**
     * Gets the citizenId value for this UpdateBARequestBillingAccount.
     * 
     * @return citizenId
     */
    public java.lang.String getCitizenId() {
        return citizenId;
    }


    /**
     * Sets the citizenId value for this UpdateBARequestBillingAccount.
     * 
     * @param citizenId
     */
    public void setCitizenId(java.lang.String citizenId) {
        this.citizenId = citizenId;
    }


    /**
     * Gets the passportNo value for this UpdateBARequestBillingAccount.
     * 
     * @return passportNo
     */
    public java.lang.String getPassportNo() {
        return passportNo;
    }


    /**
     * Sets the passportNo value for this UpdateBARequestBillingAccount.
     * 
     * @param passportNo
     */
    public void setPassportNo(java.lang.String passportNo) {
        this.passportNo = passportNo;
    }


    /**
     * Gets the primaryServiceNo value for this UpdateBARequestBillingAccount.
     * 
     * @return primaryServiceNo
     */
    public java.lang.String getPrimaryServiceNo() {
        return primaryServiceNo;
    }


    /**
     * Sets the primaryServiceNo value for this UpdateBARequestBillingAccount.
     * 
     * @param primaryServiceNo
     */
    public void setPrimaryServiceNo(java.lang.String primaryServiceNo) {
        this.primaryServiceNo = primaryServiceNo;
    }


    /**
     * Gets the billingEmail value for this UpdateBARequestBillingAccount.
     * 
     * @return billingEmail
     */
    public java.lang.String getBillingEmail() {
        return billingEmail;
    }


    /**
     * Sets the billingEmail value for this UpdateBARequestBillingAccount.
     * 
     * @param billingEmail
     */
    public void setBillingEmail(java.lang.String billingEmail) {
        this.billingEmail = billingEmail;
    }


    /**
     * Gets the VATRegistrationCode value for this UpdateBARequestBillingAccount.
     * 
     * @return VATRegistrationCode
     */
    public java.lang.String getVATRegistrationCode() {
        return VATRegistrationCode;
    }


    /**
     * Sets the VATRegistrationCode value for this UpdateBARequestBillingAccount.
     * 
     * @param VATRegistrationCode
     */
    public void setVATRegistrationCode(java.lang.String VATRegistrationCode) {
        this.VATRegistrationCode = VATRegistrationCode;
    }


    /**
     * Gets the billCompany value for this UpdateBARequestBillingAccount.
     * 
     * @return billCompany
     */
    public java.lang.String getBillCompany() {
        return billCompany;
    }


    /**
     * Sets the billCompany value for this UpdateBARequestBillingAccount.
     * 
     * @param billCompany
     */
    public void setBillCompany(java.lang.String billCompany) {
        this.billCompany = billCompany;
    }


    /**
     * Gets the legalAddress value for this UpdateBARequestBillingAccount.
     * 
     * @return legalAddress
     */
    public java.lang.String getLegalAddress() {
        return legalAddress;
    }


    /**
     * Sets the legalAddress value for this UpdateBARequestBillingAccount.
     * 
     * @param legalAddress
     */
    public void setLegalAddress(java.lang.String legalAddress) {
        this.legalAddress = legalAddress;
    }


    /**
     * Gets the legalName value for this UpdateBARequestBillingAccount.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this UpdateBARequestBillingAccount.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the billingAddress value for this UpdateBARequestBillingAccount.
     * 
     * @return billingAddress
     */
    public esb_rbm_account.xsd.BillingAddress getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this UpdateBARequestBillingAccount.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(esb_rbm_account.xsd.BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the isUpdateLegalName value for this UpdateBARequestBillingAccount.
     * 
     * @return isUpdateLegalName
     */
    public java.lang.Boolean getIsUpdateLegalName() {
        return isUpdateLegalName;
    }


    /**
     * Sets the isUpdateLegalName value for this UpdateBARequestBillingAccount.
     * 
     * @param isUpdateLegalName
     */
    public void setIsUpdateLegalName(java.lang.Boolean isUpdateLegalName) {
        this.isUpdateLegalName = isUpdateLegalName;
    }


    /**
     * Gets the isUpdateLegalAddress value for this UpdateBARequestBillingAccount.
     * 
     * @return isUpdateLegalAddress
     */
    public java.lang.Boolean getIsUpdateLegalAddress() {
        return isUpdateLegalAddress;
    }


    /**
     * Sets the isUpdateLegalAddress value for this UpdateBARequestBillingAccount.
     * 
     * @param isUpdateLegalAddress
     */
    public void setIsUpdateLegalAddress(java.lang.Boolean isUpdateLegalAddress) {
        this.isUpdateLegalAddress = isUpdateLegalAddress;
    }


    /**
     * Gets the isUpdateNextBillDate value for this UpdateBARequestBillingAccount.
     * 
     * @return isUpdateNextBillDate
     */
    public java.lang.Boolean getIsUpdateNextBillDate() {
        return isUpdateNextBillDate;
    }


    /**
     * Sets the isUpdateNextBillDate value for this UpdateBARequestBillingAccount.
     * 
     * @param isUpdateNextBillDate
     */
    public void setIsUpdateNextBillDate(java.lang.Boolean isUpdateNextBillDate) {
        this.isUpdateNextBillDate = isUpdateNextBillDate;
    }


    /**
     * Gets the isUpdateContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @return isUpdateContactTel
     */
    public java.lang.Boolean getIsUpdateContactTel() {
        return isUpdateContactTel;
    }


    /**
     * Sets the isUpdateContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @param isUpdateContactTel
     */
    public void setIsUpdateContactTel(java.lang.Boolean isUpdateContactTel) {
        this.isUpdateContactTel = isUpdateContactTel;
    }


    /**
     * Gets the billStyleId value for this UpdateBARequestBillingAccount.
     * 
     * @return billStyleId
     */
    public java.lang.Integer getBillStyleId() {
        return billStyleId;
    }


    /**
     * Sets the billStyleId value for this UpdateBARequestBillingAccount.
     * 
     * @param billStyleId
     */
    public void setBillStyleId(java.lang.Integer billStyleId) {
        this.billStyleId = billStyleId;
    }


    /**
     * Gets the daytimeContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @return daytimeContactTel
     */
    public java.lang.String getDaytimeContactTel() {
        return daytimeContactTel;
    }


    /**
     * Sets the daytimeContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @param daytimeContactTel
     */
    public void setDaytimeContactTel(java.lang.String daytimeContactTel) {
        this.daytimeContactTel = daytimeContactTel;
    }


    /**
     * Gets the daytimeExtension value for this UpdateBARequestBillingAccount.
     * 
     * @return daytimeExtension
     */
    public java.lang.String getDaytimeExtension() {
        return daytimeExtension;
    }


    /**
     * Sets the daytimeExtension value for this UpdateBARequestBillingAccount.
     * 
     * @param daytimeExtension
     */
    public void setDaytimeExtension(java.lang.String daytimeExtension) {
        this.daytimeExtension = daytimeExtension;
    }


    /**
     * Gets the eveningContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @return eveningContactTel
     */
    public java.lang.String getEveningContactTel() {
        return eveningContactTel;
    }


    /**
     * Sets the eveningContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @param eveningContactTel
     */
    public void setEveningContactTel(java.lang.String eveningContactTel) {
        this.eveningContactTel = eveningContactTel;
    }


    /**
     * Gets the eveningExtension value for this UpdateBARequestBillingAccount.
     * 
     * @return eveningExtension
     */
    public java.lang.String getEveningExtension() {
        return eveningExtension;
    }


    /**
     * Sets the eveningExtension value for this UpdateBARequestBillingAccount.
     * 
     * @param eveningExtension
     */
    public void setEveningExtension(java.lang.String eveningExtension) {
        this.eveningExtension = eveningExtension;
    }


    /**
     * Gets the faxContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @return faxContactTel
     */
    public java.lang.String getFaxContactTel() {
        return faxContactTel;
    }


    /**
     * Sets the faxContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @param faxContactTel
     */
    public void setFaxContactTel(java.lang.String faxContactTel) {
        this.faxContactTel = faxContactTel;
    }


    /**
     * Gets the mobileContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @return mobileContactTel
     */
    public java.lang.String getMobileContactTel() {
        return mobileContactTel;
    }


    /**
     * Sets the mobileContactTel value for this UpdateBARequestBillingAccount.
     * 
     * @param mobileContactTel
     */
    public void setMobileContactTel(java.lang.String mobileContactTel) {
        this.mobileContactTel = mobileContactTel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBARequestBillingAccount)) return false;
        UpdateBARequestBillingAccount other = (UpdateBARequestBillingAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerAccountId==null && other.getCustomerAccountId()==null) || 
             (this.customerAccountId!=null &&
              this.customerAccountId.equals(other.getCustomerAccountId()))) &&
            ((this.billingAccountTypeCode==null && other.getBillingAccountTypeCode()==null) || 
             (this.billingAccountTypeCode!=null &&
              this.billingAccountTypeCode.equals(other.getBillingAccountTypeCode()))) &&
            ((this.billingAccountTypeName==null && other.getBillingAccountTypeName()==null) || 
             (this.billingAccountTypeName!=null &&
              this.billingAccountTypeName.equals(other.getBillingAccountTypeName()))) &&
            ((this.billingAccountName==null && other.getBillingAccountName()==null) || 
             (this.billingAccountName!=null &&
              this.billingAccountName.equals(other.getBillingAccountName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.titleName==null && other.getTitleName()==null) || 
             (this.titleName!=null &&
              this.titleName.equals(other.getTitleName()))) &&
            ((this.addressName==null && other.getAddressName()==null) || 
             (this.addressName!=null &&
              this.addressName.equals(other.getAddressName()))) &&
            ((this.billingAccountId==null && other.getBillingAccountId()==null) || 
             (this.billingAccountId!=null &&
              this.billingAccountId.equals(other.getBillingAccountId()))) &&
            ((this.parentBillingAccount==null && other.getParentBillingAccount()==null) || 
             (this.parentBillingAccount!=null &&
              this.parentBillingAccount.equals(other.getParentBillingAccount()))) &&
            ((this.homeLocationId==null && other.getHomeLocationId()==null) || 
             (this.homeLocationId!=null &&
              this.homeLocationId.equals(other.getHomeLocationId()))) &&
            ((this.homeLocationName==null && other.getHomeLocationName()==null) || 
             (this.homeLocationName!=null &&
              this.homeLocationName.equals(other.getHomeLocationName()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this.isBlacklist==null && other.getIsBlacklist()==null) || 
             (this.isBlacklist!=null &&
              this.isBlacklist.equals(other.getIsBlacklist()))) &&
            ((this.billingAccountStatus==null && other.getBillingAccountStatus()==null) || 
             (this.billingAccountStatus!=null &&
              this.billingAccountStatus.equals(other.getBillingAccountStatus()))) &&
            ((this.rateClass==null && other.getRateClass()==null) || 
             (this.rateClass!=null &&
              this.rateClass.equals(other.getRateClass()))) &&
            ((this.customerClass==null && other.getCustomerClass()==null) || 
             (this.customerClass!=null &&
              this.customerClass.equals(other.getCustomerClass()))) &&
            ((this.coverPageType==null && other.getCoverPageType()==null) || 
             (this.coverPageType!=null &&
              this.coverPageType.equals(other.getCoverPageType()))) &&
            ((this.companySize==null && other.getCompanySize()==null) || 
             (this.companySize!=null &&
              this.companySize.equals(other.getCompanySize()))) &&
            ((this.bAStartDate==null && other.getBAStartDate()==null) || 
             (this.bAStartDate!=null &&
              this.bAStartDate.equals(other.getBAStartDate()))) &&
            ((this.bAEndDate==null && other.getBAEndDate()==null) || 
             (this.bAEndDate!=null &&
              this.bAEndDate.equals(other.getBAEndDate()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankAccountName==null && other.getBankAccountName()==null) || 
             (this.bankAccountName!=null &&
              this.bankAccountName.equals(other.getBankAccountName()))) &&
            ((this.bankAccountNumber==null && other.getBankAccountNumber()==null) || 
             (this.bankAccountNumber!=null &&
              this.bankAccountNumber.equals(other.getBankAccountNumber()))) &&
            ((this.bankBranch==null && other.getBankBranch()==null) || 
             (this.bankBranch!=null &&
              this.bankBranch.equals(other.getBankBranch()))) &&
            ((this.billMedia==null && other.getBillMedia()==null) || 
             (this.billMedia!=null &&
              this.billMedia.equals(other.getBillMedia()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.creditClassId==null && other.getCreditClassId()==null) || 
             (this.creditClassId!=null &&
              this.creditClassId.equals(other.getCreditClassId()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.billFrequence==null && other.getBillFrequence()==null) || 
             (this.billFrequence!=null &&
              this.billFrequence.equals(other.getBillFrequence()))) &&
            ((this.billFrequenceUnit==null && other.getBillFrequenceUnit()==null) || 
             (this.billFrequenceUnit!=null &&
              this.billFrequenceUnit.equals(other.getBillFrequenceUnit()))) &&
            ((this.withHoldingTexIndicator==null && other.getWithHoldingTexIndicator()==null) || 
             (this.withHoldingTexIndicator!=null &&
              this.withHoldingTexIndicator.equals(other.getWithHoldingTexIndicator()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.vatCode==null && other.getVatCode()==null) || 
             (this.vatCode!=null &&
              this.vatCode.equals(other.getVatCode()))) &&
            ((this.isGovernment==null && other.getIsGovernment()==null) || 
             (this.isGovernment!=null &&
              this.isGovernment.equals(other.getIsGovernment()))) &&
            ((this.isSbu==null && other.getIsSbu()==null) || 
             (this.isSbu!=null &&
              this.isSbu.equals(other.getIsSbu()))) &&
            ((this.billPerStatement==null && other.getBillPerStatement()==null) || 
             (this.billPerStatement!=null &&
              this.billPerStatement.equals(other.getBillPerStatement()))) &&
            ((this.notificationType==null && other.getNotificationType()==null) || 
             (this.notificationType!=null &&
              this.notificationType.equals(other.getNotificationType()))) &&
            ((this.registrationId==null && other.getRegistrationId()==null) || 
             (this.registrationId!=null &&
              this.registrationId.equals(other.getRegistrationId()))) &&
            ((this.citizenId==null && other.getCitizenId()==null) || 
             (this.citizenId!=null &&
              this.citizenId.equals(other.getCitizenId()))) &&
            ((this.passportNo==null && other.getPassportNo()==null) || 
             (this.passportNo!=null &&
              this.passportNo.equals(other.getPassportNo()))) &&
            ((this.primaryServiceNo==null && other.getPrimaryServiceNo()==null) || 
             (this.primaryServiceNo!=null &&
              this.primaryServiceNo.equals(other.getPrimaryServiceNo()))) &&
            ((this.billingEmail==null && other.getBillingEmail()==null) || 
             (this.billingEmail!=null &&
              this.billingEmail.equals(other.getBillingEmail()))) &&
            ((this.VATRegistrationCode==null && other.getVATRegistrationCode()==null) || 
             (this.VATRegistrationCode!=null &&
              this.VATRegistrationCode.equals(other.getVATRegistrationCode()))) &&
            ((this.billCompany==null && other.getBillCompany()==null) || 
             (this.billCompany!=null &&
              this.billCompany.equals(other.getBillCompany()))) &&
            ((this.legalAddress==null && other.getLegalAddress()==null) || 
             (this.legalAddress!=null &&
              this.legalAddress.equals(other.getLegalAddress()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.isUpdateLegalName==null && other.getIsUpdateLegalName()==null) || 
             (this.isUpdateLegalName!=null &&
              this.isUpdateLegalName.equals(other.getIsUpdateLegalName()))) &&
            ((this.isUpdateLegalAddress==null && other.getIsUpdateLegalAddress()==null) || 
             (this.isUpdateLegalAddress!=null &&
              this.isUpdateLegalAddress.equals(other.getIsUpdateLegalAddress()))) &&
            ((this.isUpdateNextBillDate==null && other.getIsUpdateNextBillDate()==null) || 
             (this.isUpdateNextBillDate!=null &&
              this.isUpdateNextBillDate.equals(other.getIsUpdateNextBillDate()))) &&
            ((this.isUpdateContactTel==null && other.getIsUpdateContactTel()==null) || 
             (this.isUpdateContactTel!=null &&
              this.isUpdateContactTel.equals(other.getIsUpdateContactTel()))) &&
            ((this.billStyleId==null && other.getBillStyleId()==null) || 
             (this.billStyleId!=null &&
              this.billStyleId.equals(other.getBillStyleId()))) &&
            ((this.daytimeContactTel==null && other.getDaytimeContactTel()==null) || 
             (this.daytimeContactTel!=null &&
              this.daytimeContactTel.equals(other.getDaytimeContactTel()))) &&
            ((this.daytimeExtension==null && other.getDaytimeExtension()==null) || 
             (this.daytimeExtension!=null &&
              this.daytimeExtension.equals(other.getDaytimeExtension()))) &&
            ((this.eveningContactTel==null && other.getEveningContactTel()==null) || 
             (this.eveningContactTel!=null &&
              this.eveningContactTel.equals(other.getEveningContactTel()))) &&
            ((this.eveningExtension==null && other.getEveningExtension()==null) || 
             (this.eveningExtension!=null &&
              this.eveningExtension.equals(other.getEveningExtension()))) &&
            ((this.faxContactTel==null && other.getFaxContactTel()==null) || 
             (this.faxContactTel!=null &&
              this.faxContactTel.equals(other.getFaxContactTel()))) &&
            ((this.mobileContactTel==null && other.getMobileContactTel()==null) || 
             (this.mobileContactTel!=null &&
              this.mobileContactTel.equals(other.getMobileContactTel())));
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
        if (getCustomerAccountId() != null) {
            _hashCode += getCustomerAccountId().hashCode();
        }
        if (getBillingAccountTypeCode() != null) {
            _hashCode += getBillingAccountTypeCode().hashCode();
        }
        if (getBillingAccountTypeName() != null) {
            _hashCode += getBillingAccountTypeName().hashCode();
        }
        if (getBillingAccountName() != null) {
            _hashCode += getBillingAccountName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getTitleName() != null) {
            _hashCode += getTitleName().hashCode();
        }
        if (getAddressName() != null) {
            _hashCode += getAddressName().hashCode();
        }
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        if (getParentBillingAccount() != null) {
            _hashCode += getParentBillingAccount().hashCode();
        }
        if (getHomeLocationId() != null) {
            _hashCode += getHomeLocationId().hashCode();
        }
        if (getHomeLocationName() != null) {
            _hashCode += getHomeLocationName().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (getIsBlacklist() != null) {
            _hashCode += getIsBlacklist().hashCode();
        }
        if (getBillingAccountStatus() != null) {
            _hashCode += getBillingAccountStatus().hashCode();
        }
        if (getRateClass() != null) {
            _hashCode += getRateClass().hashCode();
        }
        if (getCustomerClass() != null) {
            _hashCode += getCustomerClass().hashCode();
        }
        if (getCoverPageType() != null) {
            _hashCode += getCoverPageType().hashCode();
        }
        if (getCompanySize() != null) {
            _hashCode += getCompanySize().hashCode();
        }
        if (getBAStartDate() != null) {
            _hashCode += getBAStartDate().hashCode();
        }
        if (getBAEndDate() != null) {
            _hashCode += getBAEndDate().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankAccountName() != null) {
            _hashCode += getBankAccountName().hashCode();
        }
        if (getBankAccountNumber() != null) {
            _hashCode += getBankAccountNumber().hashCode();
        }
        if (getBankBranch() != null) {
            _hashCode += getBankBranch().hashCode();
        }
        if (getBillMedia() != null) {
            _hashCode += getBillMedia().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getCreditClassId() != null) {
            _hashCode += getCreditClassId().hashCode();
        }
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getBillFrequence() != null) {
            _hashCode += getBillFrequence().hashCode();
        }
        if (getBillFrequenceUnit() != null) {
            _hashCode += getBillFrequenceUnit().hashCode();
        }
        if (getWithHoldingTexIndicator() != null) {
            _hashCode += getWithHoldingTexIndicator().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getVatCode() != null) {
            _hashCode += getVatCode().hashCode();
        }
        if (getIsGovernment() != null) {
            _hashCode += getIsGovernment().hashCode();
        }
        if (getIsSbu() != null) {
            _hashCode += getIsSbu().hashCode();
        }
        if (getBillPerStatement() != null) {
            _hashCode += getBillPerStatement().hashCode();
        }
        if (getNotificationType() != null) {
            _hashCode += getNotificationType().hashCode();
        }
        if (getRegistrationId() != null) {
            _hashCode += getRegistrationId().hashCode();
        }
        if (getCitizenId() != null) {
            _hashCode += getCitizenId().hashCode();
        }
        if (getPassportNo() != null) {
            _hashCode += getPassportNo().hashCode();
        }
        if (getPrimaryServiceNo() != null) {
            _hashCode += getPrimaryServiceNo().hashCode();
        }
        if (getBillingEmail() != null) {
            _hashCode += getBillingEmail().hashCode();
        }
        if (getVATRegistrationCode() != null) {
            _hashCode += getVATRegistrationCode().hashCode();
        }
        if (getBillCompany() != null) {
            _hashCode += getBillCompany().hashCode();
        }
        if (getLegalAddress() != null) {
            _hashCode += getLegalAddress().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getIsUpdateLegalName() != null) {
            _hashCode += getIsUpdateLegalName().hashCode();
        }
        if (getIsUpdateLegalAddress() != null) {
            _hashCode += getIsUpdateLegalAddress().hashCode();
        }
        if (getIsUpdateNextBillDate() != null) {
            _hashCode += getIsUpdateNextBillDate().hashCode();
        }
        if (getIsUpdateContactTel() != null) {
            _hashCode += getIsUpdateContactTel().hashCode();
        }
        if (getBillStyleId() != null) {
            _hashCode += getBillStyleId().hashCode();
        }
        if (getDaytimeContactTel() != null) {
            _hashCode += getDaytimeContactTel().hashCode();
        }
        if (getDaytimeExtension() != null) {
            _hashCode += getDaytimeExtension().hashCode();
        }
        if (getEveningContactTel() != null) {
            _hashCode += getEveningContactTel().hashCode();
        }
        if (getEveningExtension() != null) {
            _hashCode += getEveningExtension().hashCode();
        }
        if (getFaxContactTel() != null) {
            _hashCode += getFaxContactTel().hashCode();
        }
        if (getMobileContactTel() != null) {
            _hashCode += getMobileContactTel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * AccountInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class AccountInfoType  implements java.io.Serializable {
    private java.lang.String specialBill;

    private java.lang.String VATBranchId;

    private java.lang.String VATBranchName;

    private java.lang.String VATHeadquarterType;

    private java.lang.String customerRef;

    private java.lang.String title;

    private java.lang.String fname;

    private java.lang.String lname;

    private java.lang.String email;

    private java.lang.String mobileContactTel;

    private java.lang.String accountName;

    private java.lang.String currencyCode;

    private java.lang.Integer billStyleId;

    private int paymentMethodId;

    private int creditClassId;

    private java.lang.Long creditLimit;

    private java.lang.String goLiveDateTime;

    private java.lang.String startDate;

    private int billPeriod;

    private int billPeriodUnits;

    private int billsPerStatement;

    private java.lang.String nextBillDate;

    private long eventsPerDay;

    private boolean taxInclusive;

    private java.lang.String billHandlingCode;

    private int defaultCPSIdNbl;

    private java.lang.String accountType;

    private java.lang.String billCycle;

    private java.lang.String govCode;

    private java.lang.String homeLocationCode;

    private java.lang.String notificationType;

    private java.lang.String printCenterCode;

    private java.lang.String personalId;

    private java.lang.String passportNumber;

    private java.lang.String businessTaxRegistration;

    private java.lang.String primaryServiceNo;

    private int languageId;

    private int vatCode;

    private java.lang.Boolean isBlacklist;

    private java.lang.Boolean isSBU;

    private java.lang.String isGovernment;

    private java.lang.String HQRebateAccountBoo;

    private java.lang.Integer billingDriver;

    private java.lang.String CRMCARef;

    private java.lang.String VATRegistrationCode;

    private java.lang.String billCompany;

    private java.lang.String legalName;

    private java.lang.String legalAddress;

    private java.lang.String terminationDat;

    private java.lang.Integer terminationReasonId;

    private java.lang.String terminationReasonText;

    private java.lang.String nextBillDtm;

    private java.lang.String lastBillDtm;

    private java.lang.String revRcvCostCtr;

    private java.lang.Integer billingStatus;

    private java.lang.String birthDate;

    private java.lang.Boolean prePayBoo;

    private java.lang.String overrideFlag;

    private java.lang.String contactType;

    private java.lang.String contactRefNo;

    private java.lang.String invoicingCompany;

    private java.lang.String accLevelContract;

    private java.lang.String govContractNo;

    public AccountInfoType() {
    }

    public AccountInfoType(
           java.lang.String specialBill,
           java.lang.String VATBranchId,
           java.lang.String VATBranchName,
           java.lang.String VATHeadquarterType,
           java.lang.String customerRef,
           java.lang.String title,
           java.lang.String fname,
           java.lang.String lname,
           java.lang.String email,
           java.lang.String mobileContactTel,
           java.lang.String accountName,
           java.lang.String currencyCode,
           java.lang.Integer billStyleId,
           int paymentMethodId,
           int creditClassId,
           java.lang.Long creditLimit,
           java.lang.String goLiveDateTime,
           java.lang.String startDate,
           int billPeriod,
           int billPeriodUnits,
           int billsPerStatement,
           java.lang.String nextBillDate,
           long eventsPerDay,
           boolean taxInclusive,
           java.lang.String billHandlingCode,
           int defaultCPSIdNbl,
           java.lang.String accountType,
           java.lang.String billCycle,
           java.lang.String govCode,
           java.lang.String homeLocationCode,
           java.lang.String notificationType,
           java.lang.String printCenterCode,
           java.lang.String personalId,
           java.lang.String passportNumber,
           java.lang.String businessTaxRegistration,
           java.lang.String primaryServiceNo,
           int languageId,
           int vatCode,
           java.lang.Boolean isBlacklist,
           java.lang.Boolean isSBU,
           java.lang.String isGovernment,
           java.lang.String HQRebateAccountBoo,
           java.lang.Integer billingDriver,
           java.lang.String CRMCARef,
           java.lang.String VATRegistrationCode,
           java.lang.String billCompany,
           java.lang.String legalName,
           java.lang.String legalAddress,
           java.lang.String terminationDat,
           java.lang.Integer terminationReasonId,
           java.lang.String terminationReasonText,
           java.lang.String nextBillDtm,
           java.lang.String lastBillDtm,
           java.lang.String revRcvCostCtr,
           java.lang.Integer billingStatus,
           java.lang.String birthDate,
           java.lang.Boolean prePayBoo,
           java.lang.String overrideFlag,
           java.lang.String contactType,
           java.lang.String contactRefNo,
           java.lang.String invoicingCompany,
           java.lang.String accLevelContract,
           java.lang.String govContractNo) {
           this.specialBill = specialBill;
           this.VATBranchId = VATBranchId;
           this.VATBranchName = VATBranchName;
           this.VATHeadquarterType = VATHeadquarterType;
           this.customerRef = customerRef;
           this.title = title;
           this.fname = fname;
           this.lname = lname;
           this.email = email;
           this.mobileContactTel = mobileContactTel;
           this.accountName = accountName;
           this.currencyCode = currencyCode;
           this.billStyleId = billStyleId;
           this.paymentMethodId = paymentMethodId;
           this.creditClassId = creditClassId;
           this.creditLimit = creditLimit;
           this.goLiveDateTime = goLiveDateTime;
           this.startDate = startDate;
           this.billPeriod = billPeriod;
           this.billPeriodUnits = billPeriodUnits;
           this.billsPerStatement = billsPerStatement;
           this.nextBillDate = nextBillDate;
           this.eventsPerDay = eventsPerDay;
           this.taxInclusive = taxInclusive;
           this.billHandlingCode = billHandlingCode;
           this.defaultCPSIdNbl = defaultCPSIdNbl;
           this.accountType = accountType;
           this.billCycle = billCycle;
           this.govCode = govCode;
           this.homeLocationCode = homeLocationCode;
           this.notificationType = notificationType;
           this.printCenterCode = printCenterCode;
           this.personalId = personalId;
           this.passportNumber = passportNumber;
           this.businessTaxRegistration = businessTaxRegistration;
           this.primaryServiceNo = primaryServiceNo;
           this.languageId = languageId;
           this.vatCode = vatCode;
           this.isBlacklist = isBlacklist;
           this.isSBU = isSBU;
           this.isGovernment = isGovernment;
           this.HQRebateAccountBoo = HQRebateAccountBoo;
           this.billingDriver = billingDriver;
           this.CRMCARef = CRMCARef;
           this.VATRegistrationCode = VATRegistrationCode;
           this.billCompany = billCompany;
           this.legalName = legalName;
           this.legalAddress = legalAddress;
           this.terminationDat = terminationDat;
           this.terminationReasonId = terminationReasonId;
           this.terminationReasonText = terminationReasonText;
           this.nextBillDtm = nextBillDtm;
           this.lastBillDtm = lastBillDtm;
           this.revRcvCostCtr = revRcvCostCtr;
           this.billingStatus = billingStatus;
           this.birthDate = birthDate;
           this.prePayBoo = prePayBoo;
           this.overrideFlag = overrideFlag;
           this.contactType = contactType;
           this.contactRefNo = contactRefNo;
           this.invoicingCompany = invoicingCompany;
           this.accLevelContract = accLevelContract;
           this.govContractNo = govContractNo;
    }


    /**
     * Gets the specialBill value for this AccountInfoType.
     * 
     * @return specialBill
     */
    public java.lang.String getSpecialBill() {
        return specialBill;
    }


    /**
     * Sets the specialBill value for this AccountInfoType.
     * 
     * @param specialBill
     */
    public void setSpecialBill(java.lang.String specialBill) {
        this.specialBill = specialBill;
    }


    /**
     * Gets the VATBranchId value for this AccountInfoType.
     * 
     * @return VATBranchId
     */
    public java.lang.String getVATBranchId() {
        return VATBranchId;
    }


    /**
     * Sets the VATBranchId value for this AccountInfoType.
     * 
     * @param VATBranchId
     */
    public void setVATBranchId(java.lang.String VATBranchId) {
        this.VATBranchId = VATBranchId;
    }


    /**
     * Gets the VATBranchName value for this AccountInfoType.
     * 
     * @return VATBranchName
     */
    public java.lang.String getVATBranchName() {
        return VATBranchName;
    }


    /**
     * Sets the VATBranchName value for this AccountInfoType.
     * 
     * @param VATBranchName
     */
    public void setVATBranchName(java.lang.String VATBranchName) {
        this.VATBranchName = VATBranchName;
    }


    /**
     * Gets the VATHeadquarterType value for this AccountInfoType.
     * 
     * @return VATHeadquarterType
     */
    public java.lang.String getVATHeadquarterType() {
        return VATHeadquarterType;
    }


    /**
     * Sets the VATHeadquarterType value for this AccountInfoType.
     * 
     * @param VATHeadquarterType
     */
    public void setVATHeadquarterType(java.lang.String VATHeadquarterType) {
        this.VATHeadquarterType = VATHeadquarterType;
    }


    /**
     * Gets the customerRef value for this AccountInfoType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this AccountInfoType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the title value for this AccountInfoType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this AccountInfoType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the fname value for this AccountInfoType.
     * 
     * @return fname
     */
    public java.lang.String getFname() {
        return fname;
    }


    /**
     * Sets the fname value for this AccountInfoType.
     * 
     * @param fname
     */
    public void setFname(java.lang.String fname) {
        this.fname = fname;
    }


    /**
     * Gets the lname value for this AccountInfoType.
     * 
     * @return lname
     */
    public java.lang.String getLname() {
        return lname;
    }


    /**
     * Sets the lname value for this AccountInfoType.
     * 
     * @param lname
     */
    public void setLname(java.lang.String lname) {
        this.lname = lname;
    }


    /**
     * Gets the email value for this AccountInfoType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AccountInfoType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the mobileContactTel value for this AccountInfoType.
     * 
     * @return mobileContactTel
     */
    public java.lang.String getMobileContactTel() {
        return mobileContactTel;
    }


    /**
     * Sets the mobileContactTel value for this AccountInfoType.
     * 
     * @param mobileContactTel
     */
    public void setMobileContactTel(java.lang.String mobileContactTel) {
        this.mobileContactTel = mobileContactTel;
    }


    /**
     * Gets the accountName value for this AccountInfoType.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this AccountInfoType.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the currencyCode value for this AccountInfoType.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this AccountInfoType.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the billStyleId value for this AccountInfoType.
     * 
     * @return billStyleId
     */
    public java.lang.Integer getBillStyleId() {
        return billStyleId;
    }


    /**
     * Sets the billStyleId value for this AccountInfoType.
     * 
     * @param billStyleId
     */
    public void setBillStyleId(java.lang.Integer billStyleId) {
        this.billStyleId = billStyleId;
    }


    /**
     * Gets the paymentMethodId value for this AccountInfoType.
     * 
     * @return paymentMethodId
     */
    public int getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this AccountInfoType.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the creditClassId value for this AccountInfoType.
     * 
     * @return creditClassId
     */
    public int getCreditClassId() {
        return creditClassId;
    }


    /**
     * Sets the creditClassId value for this AccountInfoType.
     * 
     * @param creditClassId
     */
    public void setCreditClassId(int creditClassId) {
        this.creditClassId = creditClassId;
    }


    /**
     * Gets the creditLimit value for this AccountInfoType.
     * 
     * @return creditLimit
     */
    public java.lang.Long getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this AccountInfoType.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Long creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the goLiveDateTime value for this AccountInfoType.
     * 
     * @return goLiveDateTime
     */
    public java.lang.String getGoLiveDateTime() {
        return goLiveDateTime;
    }


    /**
     * Sets the goLiveDateTime value for this AccountInfoType.
     * 
     * @param goLiveDateTime
     */
    public void setGoLiveDateTime(java.lang.String goLiveDateTime) {
        this.goLiveDateTime = goLiveDateTime;
    }


    /**
     * Gets the startDate value for this AccountInfoType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AccountInfoType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the billPeriod value for this AccountInfoType.
     * 
     * @return billPeriod
     */
    public int getBillPeriod() {
        return billPeriod;
    }


    /**
     * Sets the billPeriod value for this AccountInfoType.
     * 
     * @param billPeriod
     */
    public void setBillPeriod(int billPeriod) {
        this.billPeriod = billPeriod;
    }


    /**
     * Gets the billPeriodUnits value for this AccountInfoType.
     * 
     * @return billPeriodUnits
     */
    public int getBillPeriodUnits() {
        return billPeriodUnits;
    }


    /**
     * Sets the billPeriodUnits value for this AccountInfoType.
     * 
     * @param billPeriodUnits
     */
    public void setBillPeriodUnits(int billPeriodUnits) {
        this.billPeriodUnits = billPeriodUnits;
    }


    /**
     * Gets the billsPerStatement value for this AccountInfoType.
     * 
     * @return billsPerStatement
     */
    public int getBillsPerStatement() {
        return billsPerStatement;
    }


    /**
     * Sets the billsPerStatement value for this AccountInfoType.
     * 
     * @param billsPerStatement
     */
    public void setBillsPerStatement(int billsPerStatement) {
        this.billsPerStatement = billsPerStatement;
    }


    /**
     * Gets the nextBillDate value for this AccountInfoType.
     * 
     * @return nextBillDate
     */
    public java.lang.String getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this AccountInfoType.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(java.lang.String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the eventsPerDay value for this AccountInfoType.
     * 
     * @return eventsPerDay
     */
    public long getEventsPerDay() {
        return eventsPerDay;
    }


    /**
     * Sets the eventsPerDay value for this AccountInfoType.
     * 
     * @param eventsPerDay
     */
    public void setEventsPerDay(long eventsPerDay) {
        this.eventsPerDay = eventsPerDay;
    }


    /**
     * Gets the taxInclusive value for this AccountInfoType.
     * 
     * @return taxInclusive
     */
    public boolean isTaxInclusive() {
        return taxInclusive;
    }


    /**
     * Sets the taxInclusive value for this AccountInfoType.
     * 
     * @param taxInclusive
     */
    public void setTaxInclusive(boolean taxInclusive) {
        this.taxInclusive = taxInclusive;
    }


    /**
     * Gets the billHandlingCode value for this AccountInfoType.
     * 
     * @return billHandlingCode
     */
    public java.lang.String getBillHandlingCode() {
        return billHandlingCode;
    }


    /**
     * Sets the billHandlingCode value for this AccountInfoType.
     * 
     * @param billHandlingCode
     */
    public void setBillHandlingCode(java.lang.String billHandlingCode) {
        this.billHandlingCode = billHandlingCode;
    }


    /**
     * Gets the defaultCPSIdNbl value for this AccountInfoType.
     * 
     * @return defaultCPSIdNbl
     */
    public int getDefaultCPSIdNbl() {
        return defaultCPSIdNbl;
    }


    /**
     * Sets the defaultCPSIdNbl value for this AccountInfoType.
     * 
     * @param defaultCPSIdNbl
     */
    public void setDefaultCPSIdNbl(int defaultCPSIdNbl) {
        this.defaultCPSIdNbl = defaultCPSIdNbl;
    }


    /**
     * Gets the accountType value for this AccountInfoType.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountInfoType.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the billCycle value for this AccountInfoType.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this AccountInfoType.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the govCode value for this AccountInfoType.
     * 
     * @return govCode
     */
    public java.lang.String getGovCode() {
        return govCode;
    }


    /**
     * Sets the govCode value for this AccountInfoType.
     * 
     * @param govCode
     */
    public void setGovCode(java.lang.String govCode) {
        this.govCode = govCode;
    }


    /**
     * Gets the homeLocationCode value for this AccountInfoType.
     * 
     * @return homeLocationCode
     */
    public java.lang.String getHomeLocationCode() {
        return homeLocationCode;
    }


    /**
     * Sets the homeLocationCode value for this AccountInfoType.
     * 
     * @param homeLocationCode
     */
    public void setHomeLocationCode(java.lang.String homeLocationCode) {
        this.homeLocationCode = homeLocationCode;
    }


    /**
     * Gets the notificationType value for this AccountInfoType.
     * 
     * @return notificationType
     */
    public java.lang.String getNotificationType() {
        return notificationType;
    }


    /**
     * Sets the notificationType value for this AccountInfoType.
     * 
     * @param notificationType
     */
    public void setNotificationType(java.lang.String notificationType) {
        this.notificationType = notificationType;
    }


    /**
     * Gets the printCenterCode value for this AccountInfoType.
     * 
     * @return printCenterCode
     */
    public java.lang.String getPrintCenterCode() {
        return printCenterCode;
    }


    /**
     * Sets the printCenterCode value for this AccountInfoType.
     * 
     * @param printCenterCode
     */
    public void setPrintCenterCode(java.lang.String printCenterCode) {
        this.printCenterCode = printCenterCode;
    }


    /**
     * Gets the personalId value for this AccountInfoType.
     * 
     * @return personalId
     */
    public java.lang.String getPersonalId() {
        return personalId;
    }


    /**
     * Sets the personalId value for this AccountInfoType.
     * 
     * @param personalId
     */
    public void setPersonalId(java.lang.String personalId) {
        this.personalId = personalId;
    }


    /**
     * Gets the passportNumber value for this AccountInfoType.
     * 
     * @return passportNumber
     */
    public java.lang.String getPassportNumber() {
        return passportNumber;
    }


    /**
     * Sets the passportNumber value for this AccountInfoType.
     * 
     * @param passportNumber
     */
    public void setPassportNumber(java.lang.String passportNumber) {
        this.passportNumber = passportNumber;
    }


    /**
     * Gets the businessTaxRegistration value for this AccountInfoType.
     * 
     * @return businessTaxRegistration
     */
    public java.lang.String getBusinessTaxRegistration() {
        return businessTaxRegistration;
    }


    /**
     * Sets the businessTaxRegistration value for this AccountInfoType.
     * 
     * @param businessTaxRegistration
     */
    public void setBusinessTaxRegistration(java.lang.String businessTaxRegistration) {
        this.businessTaxRegistration = businessTaxRegistration;
    }


    /**
     * Gets the primaryServiceNo value for this AccountInfoType.
     * 
     * @return primaryServiceNo
     */
    public java.lang.String getPrimaryServiceNo() {
        return primaryServiceNo;
    }


    /**
     * Sets the primaryServiceNo value for this AccountInfoType.
     * 
     * @param primaryServiceNo
     */
    public void setPrimaryServiceNo(java.lang.String primaryServiceNo) {
        this.primaryServiceNo = primaryServiceNo;
    }


    /**
     * Gets the languageId value for this AccountInfoType.
     * 
     * @return languageId
     */
    public int getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this AccountInfoType.
     * 
     * @param languageId
     */
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the vatCode value for this AccountInfoType.
     * 
     * @return vatCode
     */
    public int getVatCode() {
        return vatCode;
    }


    /**
     * Sets the vatCode value for this AccountInfoType.
     * 
     * @param vatCode
     */
    public void setVatCode(int vatCode) {
        this.vatCode = vatCode;
    }


    /**
     * Gets the isBlacklist value for this AccountInfoType.
     * 
     * @return isBlacklist
     */
    public java.lang.Boolean getIsBlacklist() {
        return isBlacklist;
    }


    /**
     * Sets the isBlacklist value for this AccountInfoType.
     * 
     * @param isBlacklist
     */
    public void setIsBlacklist(java.lang.Boolean isBlacklist) {
        this.isBlacklist = isBlacklist;
    }


    /**
     * Gets the isSBU value for this AccountInfoType.
     * 
     * @return isSBU
     */
    public java.lang.Boolean getIsSBU() {
        return isSBU;
    }


    /**
     * Sets the isSBU value for this AccountInfoType.
     * 
     * @param isSBU
     */
    public void setIsSBU(java.lang.Boolean isSBU) {
        this.isSBU = isSBU;
    }


    /**
     * Gets the isGovernment value for this AccountInfoType.
     * 
     * @return isGovernment
     */
    public java.lang.String getIsGovernment() {
        return isGovernment;
    }


    /**
     * Sets the isGovernment value for this AccountInfoType.
     * 
     * @param isGovernment
     */
    public void setIsGovernment(java.lang.String isGovernment) {
        this.isGovernment = isGovernment;
    }


    /**
     * Gets the HQRebateAccountBoo value for this AccountInfoType.
     * 
     * @return HQRebateAccountBoo
     */
    public java.lang.String getHQRebateAccountBoo() {
        return HQRebateAccountBoo;
    }


    /**
     * Sets the HQRebateAccountBoo value for this AccountInfoType.
     * 
     * @param HQRebateAccountBoo
     */
    public void setHQRebateAccountBoo(java.lang.String HQRebateAccountBoo) {
        this.HQRebateAccountBoo = HQRebateAccountBoo;
    }


    /**
     * Gets the billingDriver value for this AccountInfoType.
     * 
     * @return billingDriver
     */
    public java.lang.Integer getBillingDriver() {
        return billingDriver;
    }


    /**
     * Sets the billingDriver value for this AccountInfoType.
     * 
     * @param billingDriver
     */
    public void setBillingDriver(java.lang.Integer billingDriver) {
        this.billingDriver = billingDriver;
    }


    /**
     * Gets the CRMCARef value for this AccountInfoType.
     * 
     * @return CRMCARef
     */
    public java.lang.String getCRMCARef() {
        return CRMCARef;
    }


    /**
     * Sets the CRMCARef value for this AccountInfoType.
     * 
     * @param CRMCARef
     */
    public void setCRMCARef(java.lang.String CRMCARef) {
        this.CRMCARef = CRMCARef;
    }


    /**
     * Gets the VATRegistrationCode value for this AccountInfoType.
     * 
     * @return VATRegistrationCode
     */
    public java.lang.String getVATRegistrationCode() {
        return VATRegistrationCode;
    }


    /**
     * Sets the VATRegistrationCode value for this AccountInfoType.
     * 
     * @param VATRegistrationCode
     */
    public void setVATRegistrationCode(java.lang.String VATRegistrationCode) {
        this.VATRegistrationCode = VATRegistrationCode;
    }


    /**
     * Gets the billCompany value for this AccountInfoType.
     * 
     * @return billCompany
     */
    public java.lang.String getBillCompany() {
        return billCompany;
    }


    /**
     * Sets the billCompany value for this AccountInfoType.
     * 
     * @param billCompany
     */
    public void setBillCompany(java.lang.String billCompany) {
        this.billCompany = billCompany;
    }


    /**
     * Gets the legalName value for this AccountInfoType.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this AccountInfoType.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the legalAddress value for this AccountInfoType.
     * 
     * @return legalAddress
     */
    public java.lang.String getLegalAddress() {
        return legalAddress;
    }


    /**
     * Sets the legalAddress value for this AccountInfoType.
     * 
     * @param legalAddress
     */
    public void setLegalAddress(java.lang.String legalAddress) {
        this.legalAddress = legalAddress;
    }


    /**
     * Gets the terminationDat value for this AccountInfoType.
     * 
     * @return terminationDat
     */
    public java.lang.String getTerminationDat() {
        return terminationDat;
    }


    /**
     * Sets the terminationDat value for this AccountInfoType.
     * 
     * @param terminationDat
     */
    public void setTerminationDat(java.lang.String terminationDat) {
        this.terminationDat = terminationDat;
    }


    /**
     * Gets the terminationReasonId value for this AccountInfoType.
     * 
     * @return terminationReasonId
     */
    public java.lang.Integer getTerminationReasonId() {
        return terminationReasonId;
    }


    /**
     * Sets the terminationReasonId value for this AccountInfoType.
     * 
     * @param terminationReasonId
     */
    public void setTerminationReasonId(java.lang.Integer terminationReasonId) {
        this.terminationReasonId = terminationReasonId;
    }


    /**
     * Gets the terminationReasonText value for this AccountInfoType.
     * 
     * @return terminationReasonText
     */
    public java.lang.String getTerminationReasonText() {
        return terminationReasonText;
    }


    /**
     * Sets the terminationReasonText value for this AccountInfoType.
     * 
     * @param terminationReasonText
     */
    public void setTerminationReasonText(java.lang.String terminationReasonText) {
        this.terminationReasonText = terminationReasonText;
    }


    /**
     * Gets the nextBillDtm value for this AccountInfoType.
     * 
     * @return nextBillDtm
     */
    public java.lang.String getNextBillDtm() {
        return nextBillDtm;
    }


    /**
     * Sets the nextBillDtm value for this AccountInfoType.
     * 
     * @param nextBillDtm
     */
    public void setNextBillDtm(java.lang.String nextBillDtm) {
        this.nextBillDtm = nextBillDtm;
    }


    /**
     * Gets the lastBillDtm value for this AccountInfoType.
     * 
     * @return lastBillDtm
     */
    public java.lang.String getLastBillDtm() {
        return lastBillDtm;
    }


    /**
     * Sets the lastBillDtm value for this AccountInfoType.
     * 
     * @param lastBillDtm
     */
    public void setLastBillDtm(java.lang.String lastBillDtm) {
        this.lastBillDtm = lastBillDtm;
    }


    /**
     * Gets the revRcvCostCtr value for this AccountInfoType.
     * 
     * @return revRcvCostCtr
     */
    public java.lang.String getRevRcvCostCtr() {
        return revRcvCostCtr;
    }


    /**
     * Sets the revRcvCostCtr value for this AccountInfoType.
     * 
     * @param revRcvCostCtr
     */
    public void setRevRcvCostCtr(java.lang.String revRcvCostCtr) {
        this.revRcvCostCtr = revRcvCostCtr;
    }


    /**
     * Gets the billingStatus value for this AccountInfoType.
     * 
     * @return billingStatus
     */
    public java.lang.Integer getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this AccountInfoType.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(java.lang.Integer billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the birthDate value for this AccountInfoType.
     * 
     * @return birthDate
     */
    public java.lang.String getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this AccountInfoType.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.lang.String birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the prePayBoo value for this AccountInfoType.
     * 
     * @return prePayBoo
     */
    public java.lang.Boolean getPrePayBoo() {
        return prePayBoo;
    }


    /**
     * Sets the prePayBoo value for this AccountInfoType.
     * 
     * @param prePayBoo
     */
    public void setPrePayBoo(java.lang.Boolean prePayBoo) {
        this.prePayBoo = prePayBoo;
    }


    /**
     * Gets the overrideFlag value for this AccountInfoType.
     * 
     * @return overrideFlag
     */
    public java.lang.String getOverrideFlag() {
        return overrideFlag;
    }


    /**
     * Sets the overrideFlag value for this AccountInfoType.
     * 
     * @param overrideFlag
     */
    public void setOverrideFlag(java.lang.String overrideFlag) {
        this.overrideFlag = overrideFlag;
    }


    /**
     * Gets the contactType value for this AccountInfoType.
     * 
     * @return contactType
     */
    public java.lang.String getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this AccountInfoType.
     * 
     * @param contactType
     */
    public void setContactType(java.lang.String contactType) {
        this.contactType = contactType;
    }


    /**
     * Gets the contactRefNo value for this AccountInfoType.
     * 
     * @return contactRefNo
     */
    public java.lang.String getContactRefNo() {
        return contactRefNo;
    }


    /**
     * Sets the contactRefNo value for this AccountInfoType.
     * 
     * @param contactRefNo
     */
    public void setContactRefNo(java.lang.String contactRefNo) {
        this.contactRefNo = contactRefNo;
    }


    /**
     * Gets the invoicingCompany value for this AccountInfoType.
     * 
     * @return invoicingCompany
     */
    public java.lang.String getInvoicingCompany() {
        return invoicingCompany;
    }


    /**
     * Sets the invoicingCompany value for this AccountInfoType.
     * 
     * @param invoicingCompany
     */
    public void setInvoicingCompany(java.lang.String invoicingCompany) {
        this.invoicingCompany = invoicingCompany;
    }


    /**
     * Gets the accLevelContract value for this AccountInfoType.
     * 
     * @return accLevelContract
     */
    public java.lang.String getAccLevelContract() {
        return accLevelContract;
    }


    /**
     * Sets the accLevelContract value for this AccountInfoType.
     * 
     * @param accLevelContract
     */
    public void setAccLevelContract(java.lang.String accLevelContract) {
        this.accLevelContract = accLevelContract;
    }


    /**
     * Gets the govContractNo value for this AccountInfoType.
     * 
     * @return govContractNo
     */
    public java.lang.String getGovContractNo() {
        return govContractNo;
    }


    /**
     * Sets the govContractNo value for this AccountInfoType.
     * 
     * @param govContractNo
     */
    public void setGovContractNo(java.lang.String govContractNo) {
        this.govContractNo = govContractNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountInfoType)) return false;
        AccountInfoType other = (AccountInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialBill==null && other.getSpecialBill()==null) || 
             (this.specialBill!=null &&
              this.specialBill.equals(other.getSpecialBill()))) &&
            ((this.VATBranchId==null && other.getVATBranchId()==null) || 
             (this.VATBranchId!=null &&
              this.VATBranchId.equals(other.getVATBranchId()))) &&
            ((this.VATBranchName==null && other.getVATBranchName()==null) || 
             (this.VATBranchName!=null &&
              this.VATBranchName.equals(other.getVATBranchName()))) &&
            ((this.VATHeadquarterType==null && other.getVATHeadquarterType()==null) || 
             (this.VATHeadquarterType!=null &&
              this.VATHeadquarterType.equals(other.getVATHeadquarterType()))) &&
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.fname==null && other.getFname()==null) || 
             (this.fname!=null &&
              this.fname.equals(other.getFname()))) &&
            ((this.lname==null && other.getLname()==null) || 
             (this.lname!=null &&
              this.lname.equals(other.getLname()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.mobileContactTel==null && other.getMobileContactTel()==null) || 
             (this.mobileContactTel!=null &&
              this.mobileContactTel.equals(other.getMobileContactTel()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.billStyleId==null && other.getBillStyleId()==null) || 
             (this.billStyleId!=null &&
              this.billStyleId.equals(other.getBillStyleId()))) &&
            this.paymentMethodId == other.getPaymentMethodId() &&
            this.creditClassId == other.getCreditClassId() &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.goLiveDateTime==null && other.getGoLiveDateTime()==null) || 
             (this.goLiveDateTime!=null &&
              this.goLiveDateTime.equals(other.getGoLiveDateTime()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.billPeriod == other.getBillPeriod() &&
            this.billPeriodUnits == other.getBillPeriodUnits() &&
            this.billsPerStatement == other.getBillsPerStatement() &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            this.eventsPerDay == other.getEventsPerDay() &&
            this.taxInclusive == other.isTaxInclusive() &&
            ((this.billHandlingCode==null && other.getBillHandlingCode()==null) || 
             (this.billHandlingCode!=null &&
              this.billHandlingCode.equals(other.getBillHandlingCode()))) &&
            this.defaultCPSIdNbl == other.getDefaultCPSIdNbl() &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.govCode==null && other.getGovCode()==null) || 
             (this.govCode!=null &&
              this.govCode.equals(other.getGovCode()))) &&
            ((this.homeLocationCode==null && other.getHomeLocationCode()==null) || 
             (this.homeLocationCode!=null &&
              this.homeLocationCode.equals(other.getHomeLocationCode()))) &&
            ((this.notificationType==null && other.getNotificationType()==null) || 
             (this.notificationType!=null &&
              this.notificationType.equals(other.getNotificationType()))) &&
            ((this.printCenterCode==null && other.getPrintCenterCode()==null) || 
             (this.printCenterCode!=null &&
              this.printCenterCode.equals(other.getPrintCenterCode()))) &&
            ((this.personalId==null && other.getPersonalId()==null) || 
             (this.personalId!=null &&
              this.personalId.equals(other.getPersonalId()))) &&
            ((this.passportNumber==null && other.getPassportNumber()==null) || 
             (this.passportNumber!=null &&
              this.passportNumber.equals(other.getPassportNumber()))) &&
            ((this.businessTaxRegistration==null && other.getBusinessTaxRegistration()==null) || 
             (this.businessTaxRegistration!=null &&
              this.businessTaxRegistration.equals(other.getBusinessTaxRegistration()))) &&
            ((this.primaryServiceNo==null && other.getPrimaryServiceNo()==null) || 
             (this.primaryServiceNo!=null &&
              this.primaryServiceNo.equals(other.getPrimaryServiceNo()))) &&
            this.languageId == other.getLanguageId() &&
            this.vatCode == other.getVatCode() &&
            ((this.isBlacklist==null && other.getIsBlacklist()==null) || 
             (this.isBlacklist!=null &&
              this.isBlacklist.equals(other.getIsBlacklist()))) &&
            ((this.isSBU==null && other.getIsSBU()==null) || 
             (this.isSBU!=null &&
              this.isSBU.equals(other.getIsSBU()))) &&
            ((this.isGovernment==null && other.getIsGovernment()==null) || 
             (this.isGovernment!=null &&
              this.isGovernment.equals(other.getIsGovernment()))) &&
            ((this.HQRebateAccountBoo==null && other.getHQRebateAccountBoo()==null) || 
             (this.HQRebateAccountBoo!=null &&
              this.HQRebateAccountBoo.equals(other.getHQRebateAccountBoo()))) &&
            ((this.billingDriver==null && other.getBillingDriver()==null) || 
             (this.billingDriver!=null &&
              this.billingDriver.equals(other.getBillingDriver()))) &&
            ((this.CRMCARef==null && other.getCRMCARef()==null) || 
             (this.CRMCARef!=null &&
              this.CRMCARef.equals(other.getCRMCARef()))) &&
            ((this.VATRegistrationCode==null && other.getVATRegistrationCode()==null) || 
             (this.VATRegistrationCode!=null &&
              this.VATRegistrationCode.equals(other.getVATRegistrationCode()))) &&
            ((this.billCompany==null && other.getBillCompany()==null) || 
             (this.billCompany!=null &&
              this.billCompany.equals(other.getBillCompany()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.legalAddress==null && other.getLegalAddress()==null) || 
             (this.legalAddress!=null &&
              this.legalAddress.equals(other.getLegalAddress()))) &&
            ((this.terminationDat==null && other.getTerminationDat()==null) || 
             (this.terminationDat!=null &&
              this.terminationDat.equals(other.getTerminationDat()))) &&
            ((this.terminationReasonId==null && other.getTerminationReasonId()==null) || 
             (this.terminationReasonId!=null &&
              this.terminationReasonId.equals(other.getTerminationReasonId()))) &&
            ((this.terminationReasonText==null && other.getTerminationReasonText()==null) || 
             (this.terminationReasonText!=null &&
              this.terminationReasonText.equals(other.getTerminationReasonText()))) &&
            ((this.nextBillDtm==null && other.getNextBillDtm()==null) || 
             (this.nextBillDtm!=null &&
              this.nextBillDtm.equals(other.getNextBillDtm()))) &&
            ((this.lastBillDtm==null && other.getLastBillDtm()==null) || 
             (this.lastBillDtm!=null &&
              this.lastBillDtm.equals(other.getLastBillDtm()))) &&
            ((this.revRcvCostCtr==null && other.getRevRcvCostCtr()==null) || 
             (this.revRcvCostCtr!=null &&
              this.revRcvCostCtr.equals(other.getRevRcvCostCtr()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.prePayBoo==null && other.getPrePayBoo()==null) || 
             (this.prePayBoo!=null &&
              this.prePayBoo.equals(other.getPrePayBoo()))) &&
            ((this.overrideFlag==null && other.getOverrideFlag()==null) || 
             (this.overrideFlag!=null &&
              this.overrideFlag.equals(other.getOverrideFlag()))) &&
            ((this.contactType==null && other.getContactType()==null) || 
             (this.contactType!=null &&
              this.contactType.equals(other.getContactType()))) &&
            ((this.contactRefNo==null && other.getContactRefNo()==null) || 
             (this.contactRefNo!=null &&
              this.contactRefNo.equals(other.getContactRefNo()))) &&
            ((this.invoicingCompany==null && other.getInvoicingCompany()==null) || 
             (this.invoicingCompany!=null &&
              this.invoicingCompany.equals(other.getInvoicingCompany()))) &&
            ((this.accLevelContract==null && other.getAccLevelContract()==null) || 
             (this.accLevelContract!=null &&
              this.accLevelContract.equals(other.getAccLevelContract()))) &&
            ((this.govContractNo==null && other.getGovContractNo()==null) || 
             (this.govContractNo!=null &&
              this.govContractNo.equals(other.getGovContractNo())));
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
        if (getSpecialBill() != null) {
            _hashCode += getSpecialBill().hashCode();
        }
        if (getVATBranchId() != null) {
            _hashCode += getVATBranchId().hashCode();
        }
        if (getVATBranchName() != null) {
            _hashCode += getVATBranchName().hashCode();
        }
        if (getVATHeadquarterType() != null) {
            _hashCode += getVATHeadquarterType().hashCode();
        }
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFname() != null) {
            _hashCode += getFname().hashCode();
        }
        if (getLname() != null) {
            _hashCode += getLname().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getMobileContactTel() != null) {
            _hashCode += getMobileContactTel().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getBillStyleId() != null) {
            _hashCode += getBillStyleId().hashCode();
        }
        _hashCode += getPaymentMethodId();
        _hashCode += getCreditClassId();
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getGoLiveDateTime() != null) {
            _hashCode += getGoLiveDateTime().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += getBillPeriod();
        _hashCode += getBillPeriodUnits();
        _hashCode += getBillsPerStatement();
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        _hashCode += new Long(getEventsPerDay()).hashCode();
        _hashCode += (isTaxInclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBillHandlingCode() != null) {
            _hashCode += getBillHandlingCode().hashCode();
        }
        _hashCode += getDefaultCPSIdNbl();
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getGovCode() != null) {
            _hashCode += getGovCode().hashCode();
        }
        if (getHomeLocationCode() != null) {
            _hashCode += getHomeLocationCode().hashCode();
        }
        if (getNotificationType() != null) {
            _hashCode += getNotificationType().hashCode();
        }
        if (getPrintCenterCode() != null) {
            _hashCode += getPrintCenterCode().hashCode();
        }
        if (getPersonalId() != null) {
            _hashCode += getPersonalId().hashCode();
        }
        if (getPassportNumber() != null) {
            _hashCode += getPassportNumber().hashCode();
        }
        if (getBusinessTaxRegistration() != null) {
            _hashCode += getBusinessTaxRegistration().hashCode();
        }
        if (getPrimaryServiceNo() != null) {
            _hashCode += getPrimaryServiceNo().hashCode();
        }
        _hashCode += getLanguageId();
        _hashCode += getVatCode();
        if (getIsBlacklist() != null) {
            _hashCode += getIsBlacklist().hashCode();
        }
        if (getIsSBU() != null) {
            _hashCode += getIsSBU().hashCode();
        }
        if (getIsGovernment() != null) {
            _hashCode += getIsGovernment().hashCode();
        }
        if (getHQRebateAccountBoo() != null) {
            _hashCode += getHQRebateAccountBoo().hashCode();
        }
        if (getBillingDriver() != null) {
            _hashCode += getBillingDriver().hashCode();
        }
        if (getCRMCARef() != null) {
            _hashCode += getCRMCARef().hashCode();
        }
        if (getVATRegistrationCode() != null) {
            _hashCode += getVATRegistrationCode().hashCode();
        }
        if (getBillCompany() != null) {
            _hashCode += getBillCompany().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getLegalAddress() != null) {
            _hashCode += getLegalAddress().hashCode();
        }
        if (getTerminationDat() != null) {
            _hashCode += getTerminationDat().hashCode();
        }
        if (getTerminationReasonId() != null) {
            _hashCode += getTerminationReasonId().hashCode();
        }
        if (getTerminationReasonText() != null) {
            _hashCode += getTerminationReasonText().hashCode();
        }
        if (getNextBillDtm() != null) {
            _hashCode += getNextBillDtm().hashCode();
        }
        if (getLastBillDtm() != null) {
            _hashCode += getLastBillDtm().hashCode();
        }
        if (getRevRcvCostCtr() != null) {
            _hashCode += getRevRcvCostCtr().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getPrePayBoo() != null) {
            _hashCode += getPrePayBoo().hashCode();
        }
        if (getOverrideFlag() != null) {
            _hashCode += getOverrideFlag().hashCode();
        }
        if (getContactType() != null) {
            _hashCode += getContactType().hashCode();
        }
        if (getContactRefNo() != null) {
            _hashCode += getContactRefNo().hashCode();
        }
        if (getInvoicingCompany() != null) {
            _hashCode += getInvoicingCompany().hashCode();
        }
        if (getAccLevelContract() != null) {
            _hashCode += getAccLevelContract().hashCode();
        }
        if (getGovContractNo() != null) {
            _hashCode += getGovContractNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

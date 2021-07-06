/**
 * AccountPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.wsdl;

public interface AccountPortType extends java.rmi.Remote {
    public esb_rbm_account.xsd.CheckDebtResponse checkDebt_PS(esb_rbm_account.xsd.CheckDebtRequest checkDebtRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.CreateBAResponse createBA_PS(esb_rbm_account.xsd.CreateBARequest createBARequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.TerminateAccountResponse terminateAccount_PS(esb_rbm_account.xsd.TerminateAccountRequest terminateAccountRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.CheckDebtRequest modifyBillingAddress_PS(esb_rbm_account.xsd.CreateBARequest createBARequest) throws java.rmi.RemoteException;
    public java.lang.String modifyInstallationAddress_PS(java.lang.String modifyInstallationAddressRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.SuspendAccountResponse suspendAccount_PS(esb_rbm_account.xsd.SuspendAccountRequest suspendAccountRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ReactivateSuspendedAccountResponse reactivateSuspendedAccount_PS(esb_rbm_account.xsd.ReactivateSuspendedAccountRequest reactivateSuspendedAccountRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.GetAccountStatusResponse getAccountStatus_PS(esb_rbm_account.xsd.GetAccountStatusRequest getAccountStatusRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.QueryBAResponse queryBA_PS(esb_rbm_account.xsd.QueryBARequest queryBARequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.UpdateBAResponse updateBA_PS(esb_rbm_account.xsd.UpdateBARequest updateBARequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.UpdateBAContractResponse updateBAContract_PS(esb_rbm_account.xsd.UpdateBAContractRequest updateBAContractRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.UpdateAccountAttributesResponse updateAccountAttributes_PS(esb_rbm_account.xsd.UpdateAccountAttributesRequest updateAccountAttributesRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.CheckDebtWithDetailResponse checkDebtWithDetail_PS(esb_rbm_account.xsd.CheckDebtWithDetailRequest parameter) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ModifyBillCycleResponse modifyBillCycle_PS(esb_rbm_account.xsd.ModifyBillCycleRequest modifyBillCycle_PSRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ModifyAccountCPSResponse modifyAccountCPS_PS(esb_rbm_account.xsd.ModifyAccountCPSRequest modifyAccountCPS_PSRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ReadAccountUnbilledDataResponse readAccountUnbilledData_PS(esb_rbm_account.xsd.ReadAccountUnbilledDataRequest readAccountUnbilledData_PSRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ModifyAccountBillHandlingResponse modifyAccountBillHandling_PS(esb_rbm_account.xsd.ModifyAccountBillHandlingRequest modifyAccountBillHandling_PSRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.ModifyAccountContractTypeResponse modifyAccountContractType_PS(esb_rbm_account.xsd.ModifyAccountContractTypeRequest MModifyAccountContractType_PSRequest) throws java.rmi.RemoteException;
    public esb_rbm_account.xsd.QueryAccountDetailsResponse queryAccountDetails_PS(esb_rbm_account.xsd.QueryAccountDetailsRequest queryAccountDetails_PSRequest) throws java.rmi.RemoteException;
}

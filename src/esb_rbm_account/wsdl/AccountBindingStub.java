/**
 * AccountBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.wsdl;

public class AccountBindingStub extends org.apache.axis.client.Stub implements esb_rbm_account.wsdl.AccountPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckDebt_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CheckDebtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtRequest"), esb_rbm_account.xsd.CheckDebtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.CheckDebtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CheckDebtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBA_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CreateBARequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CreateBARequest"), esb_rbm_account.xsd.CreateBARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CreateBAResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.CreateBAResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CreateBAResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TerminateAccount_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TerminateAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "TerminateAccountRequest"), esb_rbm_account.xsd.TerminateAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "TerminateAccountResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.TerminateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "TerminateAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyBillingAddress_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CreateBARequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CreateBARequest"), esb_rbm_account.xsd.CreateBARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtRequest"));
        oper.setReturnClass(esb_rbm_account.xsd.CheckDebtRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CheckDebtRequest"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyInstallationAddress_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModifyInstallationAddressRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModifyInstallationAddressResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SuspendAccount_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SuspendAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "SuspendAccountRequest"), esb_rbm_account.xsd.SuspendAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "SuspendAccountResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.SuspendAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SuspendAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReactivateSuspendedAccount_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReactivateSuspendedAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReactivateSuspendedAccountRequest"), esb_rbm_account.xsd.ReactivateSuspendedAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReactivateSuspendedAccountResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ReactivateSuspendedAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ReactivateSuspendedAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountStatus_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetAccountStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "GetAccountStatusRequest"), esb_rbm_account.xsd.GetAccountStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "GetAccountStatusResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.GetAccountStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetAccountStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBA_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryBARequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryBARequest"), esb_rbm_account.xsd.QueryBARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryBAResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.QueryBAResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "QueryBAResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateBA_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateBARequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBARequest"), esb_rbm_account.xsd.UpdateBARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.UpdateBAResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "UpdateBAResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateBAContract_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateBAContractRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAContractRequest"), esb_rbm_account.xsd.UpdateBAContractRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAContractResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.UpdateBAContractResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "UpdateBAContractResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccountAttributes_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateAccountAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateAccountAttributesRequest"), esb_rbm_account.xsd.UpdateAccountAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateAccountAttributesResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.UpdateAccountAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "UpdateAccountAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckDebtWithDetail_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtWithDetailRequest"), esb_rbm_account.xsd.CheckDebtWithDetailRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtWithDetailResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.CheckDebtWithDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "parameter"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyBillCycle_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModifyBillCycle_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillCycleRequest"), esb_rbm_account.xsd.ModifyBillCycleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillCycleResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ModifyBillCycleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModifyBillCycle_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyAccountCPS_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModifyAccountCPS_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountCPSRequest"), esb_rbm_account.xsd.ModifyAccountCPSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountCPSResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ModifyAccountCPSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModifyAccountCPS_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReadAccountUnbilledData_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReadAccountUnbilledData_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReadAccountUnbilledDataRequest"), esb_rbm_account.xsd.ReadAccountUnbilledDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReadAccountUnbilledDataResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ReadAccountUnbilledDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ReadAccountUnbilledData_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyAccountBillHandling_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModifyAccountBillHandling_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountBillHandlingRequest"), esb_rbm_account.xsd.ModifyAccountBillHandlingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountBillHandlingResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ModifyAccountBillHandlingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModifyAccountBillHandling_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyAccountContractType_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "MModifyAccountContractType_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountContractTypeRequest"), esb_rbm_account.xsd.ModifyAccountContractTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountContractTypeResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.ModifyAccountContractTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModifyAccountContractType_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAccountDetails_PS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryAccountDetails_PSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccountDetailsRequest"), esb_rbm_account.xsd.QueryAccountDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccountDetailsResponse"));
        oper.setReturnClass(esb_rbm_account.xsd.QueryAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "QueryAccountDetails_PSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public AccountBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AccountBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AccountBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/common-integrated", ">contextIntegrator");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common_integrated.ContextIntegrator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/common-integrated", "IntegrationContextHeader");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common_integrated.IntegrationContextHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/common-integrated", "IntegrationContextMessage");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common_integrated.IntegrationContextMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/common-integrated", "Result");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common_integrated.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>ModifyAccountCPSResponse>body>return");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountCPSResponseBodyReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>ModifyBillCycleResponse>body>return");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillCycleResponseBodyReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>QueryAccountDetailsResponse>body>accountDetail");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccountDetailsResponseBodyAccountDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>ReadAccountUnbilledDataResponse>body>return");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReadAccountUnbilledDataResponseBodyReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>UpdateAccountAttributesRequest>body>accountAttributes");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateAccountAttributesRequestBodyAccountAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">billingAddress");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.BillingAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CheckDebtRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CheckDebtResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CheckDebtWithDetailRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtWithDetailRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CheckDebtWithDetailResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtWithDetailResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CreateBARequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CreateBARequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">CreateBAResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CreateBAResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">GetAccountStatusRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.GetAccountStatusRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">GetAccountStatusResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.GetAccountStatusResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyAccountBillHandlingRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountBillHandlingRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyAccountContractTypeRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountContractTypeRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyAccountCPSRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountCPSRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyAccountCPSResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountCPSResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyBillCycleRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillCycleRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyBillCycleResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillCycleResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyBillingAddressRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillingAddressRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ModifyBillingAddressResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillingAddressResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">QueryAccount_15Response>billingAccount");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccount_15ResponseBillingAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">QueryAccountDetailsRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccountDetailsRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">QueryAccountDetailsResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccountDetailsResponseBodyAccountDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">>QueryAccountDetailsResponse>body>accountDetail");
            qName2 = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "accountDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">QueryBARequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryBARequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">QueryBAResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryBAResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ReactivateSuspendedAccountRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReactivateSuspendedAccountRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ReactivateSuspendedAccountResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReactivateSuspendedAccountResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ReadAccountUnbilledDataRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReadAccountUnbilledDataRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">ReadAccountUnbilledDataResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReadAccountUnbilledDataResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">SuspendAccountRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.SuspendAccountRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">SuspendAccountResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.SuspendAccountResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">TerminateAccountRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.TerminateAccountRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">TerminateAccountResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.TerminateAccountResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">UpdateAccountAttributesRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateAccountAttributesRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">UpdateAccountAttributesResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateAccountAttributesResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">UpdateBAContractRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBAContractRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">UpdateBARequest>billingAccount");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBARequestBillingAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", ">UpdateBillCycleForBARequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBillCycleForBARequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtWithDetailRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtWithDetailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CheckDebtWithDetailResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CheckDebtWithDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CreateBARequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CreateBARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "CreateBAResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.CreateBAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "GetAccountStatusRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.GetAccountStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "GetAccountStatusResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.GetAccountStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccount_13Request");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccount_13Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccount_13Response");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccount_13Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountBillHandlingRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountBillHandlingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountBillHandlingResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountBillHandlingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountContractTypeRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountContractTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountContractTypeResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountContractTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountCPSRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountCPSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyAccountCPSResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyAccountCPSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillCycleRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillCycleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillCycleResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillCycleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillingAddressRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillingAddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ModifyBillingAddressResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ModifyBillingAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccount_15Request");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccount_15Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccount_15Response");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccount_15Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryBARequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryBARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "QueryBAResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.QueryBAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReactivateSuspendedAccountRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReactivateSuspendedAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReactivateSuspendedAccountResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReactivateSuspendedAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReadAccountUnbilledDataRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReadAccountUnbilledDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "ReadAccountUnbilledDataResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.ReadAccountUnbilledDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "SuspendAccountRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.SuspendAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "SuspendAccountResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.SuspendAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "TerminateAccountRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.TerminateAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "TerminateAccountResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.TerminateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateAccountAttributesRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateAccountAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateAccountAttributesResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateAccountAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAContractRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBAContractRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAContractResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBAContractResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBARequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBAResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBillCycleForBARequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBillCycleForBARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/account", "UpdateBillCycleForBAResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.xsd.UpdateBillCycleForBAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", ">CreateAddressRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.CreateAddressRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", ">CreateAddressResponse>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.CreateAddressResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", ">ModifyAddressRequest>body");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.ModifyAddressRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", "CreateAddressRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.CreateAddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", "CreateAddressResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.CreateAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", "ModifyAddressRequest");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.ModifyAddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/address", "ModifyAddressResponse");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.address.ModifyAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">>ProductInstanceType>EventSources>eventSource");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">>ProductInstanceType>EventTypes>eventType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeEventTypesEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>address");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>EventSources");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">>ProductInstanceType>EventSources>eventSource");
            qName2 = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "eventSource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>EventTypes");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeEventTypesEventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">>ProductInstanceType>EventTypes>eventType");
            qName2 = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "eventType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>OverridePriceData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeOverridePriceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>OverrideRateData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceTypeOverrideRateData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">RBMCustomerType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.RBMCustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AccountInfoType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.AccountInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AddressPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.AddressPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AddressType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AdjustmentPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.AdjustmentPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "BillRequestPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.BillRequestPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ContactPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ContactPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ContactType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ContactType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "CustomerType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.CustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "HistoriedAccountStatus");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.HistoriedAccountStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "HistoriedContactData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.HistoriedContactData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "HistoriedProductInstanceTariffData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.HistoriedProductInstanceTariffData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "HistorySubscriptionData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.HistorySubscriptionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "HistorySubscriptionStatus");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.HistorySubscriptionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ModifyEventSourceData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ModifyEventSourceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ModifyHistoriedSubscriptionData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ModifyHistoriedSubscriptionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "OverridePrice");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.OverridePrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "PaymentMethodType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.PaymentMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "PaymentType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductAttributesType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductAttributesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductAttrPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductAttrPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductInstanceInfoType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductInstancePKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstancePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductInstanceType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductInstanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "ProductTariff");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.ProductTariff.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "RBMAddressType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.RBMAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "RBMContactData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.RBMContactData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "RBMContactType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.RBMContactType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "SIMData");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.SIMData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "SubscriptionAttributeType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.SubscriptionAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "SubscriptionDataType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.SubscriptionDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "SubscriptionPKType");
            cachedSerQNames.add(qName);
            cls = esb_rbm_account.common.SubscriptionPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public esb_rbm_account.xsd.CheckDebtResponse checkDebt_PS(esb_rbm_account.xsd.CheckDebtRequest checkDebtRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/CheckDebt_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "CheckDebt_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkDebtRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.CheckDebtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.CheckDebtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.CheckDebtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.CreateBAResponse createBA_PS(esb_rbm_account.xsd.CreateBARequest createBARequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/CreateBA_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "CreateBA_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createBARequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.CreateBAResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.CreateBAResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.CreateBAResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.TerminateAccountResponse terminateAccount_PS(esb_rbm_account.xsd.TerminateAccountRequest terminateAccountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/TerminateAccount_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "TerminateAccount_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {terminateAccountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.TerminateAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.TerminateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.TerminateAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.CheckDebtRequest modifyBillingAddress_PS(esb_rbm_account.xsd.CreateBARequest createBARequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyBillingAddress_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyBillingAddress_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createBARequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.CheckDebtRequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.CheckDebtRequest) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.CheckDebtRequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String modifyInstallationAddress_PS(java.lang.String modifyInstallationAddressRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyInstallationAddress_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyInstallationAddress_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyInstallationAddressRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.SuspendAccountResponse suspendAccount_PS(esb_rbm_account.xsd.SuspendAccountRequest suspendAccountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/SuspendAccount_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "SuspendAccount_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {suspendAccountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.SuspendAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.SuspendAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.SuspendAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ReactivateSuspendedAccountResponse reactivateSuspendedAccount_PS(esb_rbm_account.xsd.ReactivateSuspendedAccountRequest reactivateSuspendedAccountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ReactivateSuspendedAccount_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ReactivateSuspendedAccount_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reactivateSuspendedAccountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ReactivateSuspendedAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ReactivateSuspendedAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ReactivateSuspendedAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.GetAccountStatusResponse getAccountStatus_PS(esb_rbm_account.xsd.GetAccountStatusRequest getAccountStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/GetAccountStatus_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "GetAccountStatus_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAccountStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.GetAccountStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.GetAccountStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.GetAccountStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.QueryBAResponse queryBA_PS(esb_rbm_account.xsd.QueryBARequest queryBARequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/QueryBA_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "QueryBA_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryBARequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.QueryBAResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.QueryBAResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.QueryBAResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.UpdateBAResponse updateBA_PS(esb_rbm_account.xsd.UpdateBARequest updateBARequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/UpdateBA_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "UpdateBA_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateBARequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.UpdateBAResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.UpdateBAResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.UpdateBAResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.UpdateBAContractResponse updateBAContract_PS(esb_rbm_account.xsd.UpdateBAContractRequest updateBAContractRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/UpdateBAContract_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "UpdateBAContract_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateBAContractRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.UpdateBAContractResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.UpdateBAContractResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.UpdateBAContractResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.UpdateAccountAttributesResponse updateAccountAttributes_PS(esb_rbm_account.xsd.UpdateAccountAttributesRequest updateAccountAttributesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/UpdateAccountAttributes_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "UpdateAccountAttributes_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateAccountAttributesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.UpdateAccountAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.UpdateAccountAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.UpdateAccountAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.CheckDebtWithDetailResponse checkDebtWithDetail_PS(esb_rbm_account.xsd.CheckDebtWithDetailRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/CheckDebtWithDetail_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "CheckDebtWithDetail_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.CheckDebtWithDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.CheckDebtWithDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.CheckDebtWithDetailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ModifyBillCycleResponse modifyBillCycle_PS(esb_rbm_account.xsd.ModifyBillCycleRequest modifyBillCycle_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyBillCycle_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyBillCycle_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyBillCycle_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ModifyBillCycleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ModifyBillCycleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ModifyBillCycleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ModifyAccountCPSResponse modifyAccountCPS_PS(esb_rbm_account.xsd.ModifyAccountCPSRequest modifyAccountCPS_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyAccountCPS_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyAccountCPS_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyAccountCPS_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ModifyAccountCPSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ModifyAccountCPSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ModifyAccountCPSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ReadAccountUnbilledDataResponse readAccountUnbilledData_PS(esb_rbm_account.xsd.ReadAccountUnbilledDataRequest readAccountUnbilledData_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ReadAccountUnbilledData_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ReadAccountUnbilledData_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {readAccountUnbilledData_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ReadAccountUnbilledDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ReadAccountUnbilledDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ReadAccountUnbilledDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ModifyAccountBillHandlingResponse modifyAccountBillHandling_PS(esb_rbm_account.xsd.ModifyAccountBillHandlingRequest modifyAccountBillHandling_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyAccountBillHandling_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyAccountBillHandling_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyAccountBillHandling_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ModifyAccountBillHandlingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ModifyAccountBillHandlingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ModifyAccountBillHandlingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.ModifyAccountContractTypeResponse modifyAccountContractType_PS(esb_rbm_account.xsd.ModifyAccountContractTypeRequest MModifyAccountContractType_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/ModifyAccountContractType_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "ModifyAccountContractType_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {MModifyAccountContractType_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.ModifyAccountContractTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.ModifyAccountContractTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.ModifyAccountContractTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public esb_rbm_account.xsd.QueryAccountDetailsResponse queryAccountDetails_PS(esb_rbm_account.xsd.QueryAccountDetailsRequest queryAccountDetails_PSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://new.webservice.namespace/QueryAccountDetails_PS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://new.webservice.namespace", "QueryAccountDetails_PS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryAccountDetails_PSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (esb_rbm_account.xsd.QueryAccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (esb_rbm_account.xsd.QueryAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, esb_rbm_account.xsd.QueryAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

package action;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.apache.axis.SimpleChain;
import org.apache.axis.configuration.BasicClientConfig;
import org.apache.axis.transport.http.CommonsHTTPSender;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;

import esb_rbm_account.common.AccountInfoType;
import esb_rbm_account.common_integrated.ContextIntegrator;
import esb_rbm_account.common_integrated.IntegrationContextHeader;
import esb_rbm_account.common_integrated.Result;
import esb_rbm_account.wsdl.AccountBindingStub;
import esb_rbm_account.wsdl.AccountPortType;
import esb_rbm_account.wsdl.AccountServicesLocator;
import esb_rbm_account.xsd.QueryBARequest;
import esb_rbm_account.xsd.QueryBARequestBody;
import esb_rbm_account.xsd.QueryBAResponse;
import esb_rbm_account.xsd.QueryBAResponseBody;
import sendRequest.HttpConnectionUtil;

/**
 * Servlet implementation class servTestCallws
 */
@WebServlet("/servTestCallws")
public class servTestCallws extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Logger log = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servTestCallws() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info(getDateTimeCurrent().toString() +"|callWS|"+ "Start Application");
		doGet(request, response);
		System.out.println(request.getParameter("num"));
		String num = request.getParameter("num");
//		String sr = "OOOP-640702-000000101";
		
		String sr = null;
		try {
			sr = new function().generateSR();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject res = new JSONObject();
		if (num.equals("1")) { try {
			res = queryBA_stub(sr, "199027844980");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		else if(num.equals("2")) { try {
			res = queryBA_xml(sr);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		else if(num.equals("3")) { try {
			res = queryCAforAll_xml(sr);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		
		try {
			request.setAttribute("req", res.get("req"));
			request.setAttribute("res", res.get("res"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("sr", sr);
		request.getRequestDispatcher("other.jsp").forward(request,response);
	}
	
	public static JSONObject queryBA_xml(String sr) throws JSONException {
		System.out.println("------------ queryBA_xml ------------");
		String baId ="199027844980";
		String requestXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:new=\"http://new.webservice.namespace\" xmlns:com=\"http://totbilling.tot.co.th/esb/common-integrated\" xmlns:acc=\"http://totbilling.tot.co.th/esb/rbm/account\">";
		requestXML = requestXML + "<soapenv:Header/>";
		requestXML = requestXML + "<soapenv:Body>";
		requestXML = requestXML + "<new:QueryBA_PS>";
		requestXML = requestXML + "<QueryBARequest>";
		requestXML = requestXML + "<com:contextIntegrator>";
		requestXML = requestXML + "<com:header>";
		requestXML = requestXML + "<com:transactionId>"+ sr +"</com:transactionId>";
		requestXML = requestXML + "<com:integrationKeyRef>BPM</com:integrationKeyRef>";
		requestXML = requestXML + "</com:header>";
		requestXML = requestXML + "<com:message>";
		requestXML = requestXML + "<com:integrationResult>";
		requestXML = requestXML + "<com:result>?</com:result>";
		requestXML = requestXML + "<com:esbReturnCode>?</com:esbReturnCode>";
		requestXML = requestXML + "<com:esbReturnMsg>?</com:esbReturnMsg>";
		requestXML = requestXML + "<com:destinationReturnCode>?</com:destinationReturnCode>";
		requestXML = requestXML + "<com:destinationReturnMsg>?</com:destinationReturnMsg>";
		requestXML = requestXML + "</com:integrationResult>";
		requestXML = requestXML + "</com:message>";
		requestXML = requestXML + "</com:contextIntegrator>";
		requestXML = requestXML + "<acc:body>";
		requestXML = requestXML + "<acc:billingAccountId>"+ baId +"</acc:billingAccountId>";
		requestXML = requestXML + "</acc:body>";
		requestXML = requestXML + "</QueryBARequest>";
		requestXML = requestXML + "</new:QueryBA_PS>";
		requestXML = requestXML + "</soapenv:Body>";
		requestXML = requestXML + "</soapenv:Envelope>";
		String ws = "/RBM/RBM_QueryBA_PS";

		JSONObject res = sendRequest(requestXML, ws, sr);

		return  res;
	}
	
	public static JSONObject queryCAforAll_xml(String sr) throws JSONException {
		String ws = "/CRM/CRM_QueryCAforAll_PS";
		String baId = "199027844980";
		String requestXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:crm=\"http://totbilling.tot.co.th/esb/wsdl/CRM/CRM_QueryCAforAll\" xmlns:com=\"http://totbilling.tot.co.th/esb/common-integrated\" xmlns:crm1=\"http://totbilling.tot.co.th/esb/xsd/CRM/CRM_QueryCAforAll\">";
		requestXML = requestXML + "<soapenv:Header/>";
		requestXML = requestXML + "<soapenv:Body>";
		requestXML = requestXML + "<crm:CRM_QueryCAforAll_PS>";
		requestXML = requestXML + "<CRM_QueryCAforAll_PSRequest>";
		requestXML = requestXML + "<com:contextIntegrator>";
		requestXML = requestXML + "<com:header>";
		requestXML = requestXML + "<com:transactionId>" + sr + "</com:transactionId>";
		requestXML = requestXML + "<com:integrationKeyRef>" + "BPM" + "</com:integrationKeyRef>";
		requestXML = requestXML + "</com:header>";
		requestXML = requestXML + "<!--Optional:-->";
		requestXML = requestXML + "<com:message>";
		requestXML = requestXML + "<com:integrationResult>";
		requestXML = requestXML + "<com:result>?</com:result>";
		requestXML = requestXML + "<com:esbReturnCode>?</com:esbReturnCode>";
		requestXML = requestXML + "<com:esbReturnMsg>?</com:esbReturnMsg>";
		requestXML = requestXML + "<com:destinationReturnCode>?</com:destinationReturnCode>";
		requestXML = requestXML + "<com:destinationReturnMsg>?</com:destinationReturnMsg>";
		requestXML = requestXML + "</com:integrationResult>";
		requestXML = requestXML + "</com:message>";
		requestXML = requestXML + "</com:contextIntegrator>";
		requestXML = requestXML + "<crm1:body>";
		requestXML = requestXML + "<crm1:citizenId></crm1:citizenId>";
		requestXML = requestXML + "<crm1:RegistrationID></crm1:RegistrationID>";
		requestXML = requestXML + "<crm1:PassportNo></crm1:PassportNo>";
		requestXML = requestXML + "<crm1:CA_TaxID></crm1:CA_TaxID>";
		requestXML = requestXML + "<crm1:assetNo></crm1:assetNo>";
		requestXML = requestXML + "<crm1:BA_ID>" + baId + "</crm1:BA_ID>";
		requestXML = requestXML + "<crm1:CA_ID></crm1:CA_ID>";
		requestXML = requestXML + "<crm1:CA_all>false</crm1:CA_all>";
		requestXML = requestXML + "<crm1:BA_allStatus>false</crm1:BA_allStatus>";
		requestXML = requestXML + "<crm1:Asset_allStatus>false</crm1:Asset_allStatus>";
		requestXML = requestXML + "<crm1:BA_Asset_All>false</crm1:BA_Asset_All>";
		requestXML = requestXML + "</crm1:body>";
		requestXML = requestXML + "</CRM_QueryCAforAll_PSRequest>";
		requestXML = requestXML + "</crm:CRM_QueryCAforAll_PS>";
		requestXML = requestXML + "</soapenv:Body>";
		requestXML = requestXML + "</soapenv:Envelope>";
		
		JSONObject res = sendRequest(requestXML, ws, sr);
		System.out.println(res);

		return  res;
	}
	
	public static JSONObject sendRequest(String request, String wsName, String sr) throws JSONException{
		int timeout = 10000;  // 10s
		String response = "";
		JSONObject res = new JSONObject();
		
		try {
			log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(request));
			String pathENV = "http://10.1.71.67:7001/TOTBilling/ProxyServices/";  // UAT
			response = HttpConnectionUtil.executePost(pathENV + wsName, request, timeout);
			
			log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(response));
			
			if (response == null){
				System.out.println("nulllllllllllllllllllll");
			}
			else {
				response = response.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
				String[] removeList = {"xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"",
		        		"xmlns:new=\"http://new.webservice.namespace\"",
		        		"xmlns:com=\"http://totbilling.tot.co.th/esb/common-integrated\"",
		        		"xmlns:acc=\"http://totbilling.tot.co.th/esb/rbm/account\"",
		        		"xmlns:com1=\"http://totbilling.tot.co.th/esb/rbm/common\"",
		        		"xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"",
		        		"xmlns:cus=\"http://totbilling.tot.co.th/esb/rbm/customer\"",
		        		"xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"",
		        		"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"",
		        		"xmlns:sub=\"http://totbilling.tot.co.th/esb/rbm/subscription\"",
		        		"xmlns:even=\"http://totbilling.tot.co.th/esb/rbm/event\"",
		        		"xmlns:ser1=\"http://totbilling.tot.co.th/esb/xsd/crm/servicerequest\"",
		        		"xmlns:ser=\"http://totbilling.tot.co.th/esb/services/crm/servicerequest\""
				};
				
				for(int i=0; i<removeList.length; i++){
					request = request.replace(removeList[i],"");
					response = response.replace(removeList[i],"");
		        }
				res.put("res", new StringFormate().JSONFormate(XML.toJSONObject(response)));
			}
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
		
		res.put("req", new StringFormate().JSONFormate(XML.toJSONObject(request)));
		
		
		return res;
	}
	
	public static JSONObject queryBA_stub(String sr, String baId) throws JSONException {		
		
		String [] data = new String[4];
		JSONObject res = new JSONObject();
		QueryBAResponse response = new QueryBAResponse();
		
		try	{
			
			System.setProperty("org.apache.commons.logging.LogFactory", "org.apache.commons.logging.impl.LogFactoryImpl");
			
			System.out.println("**----------------- Request queryBA Start ----------------**");
			
			String integrationKeyRef = "BPM";
			//String transactionId = new function().generateSR();
			
			String queryBAEndpoint = "http://10.1.71.67:7001/TOTBilling/ProxyServices/RBM/RBM_QueryBA_PS";
	    	BasicClientConfig basicClientConfig = new BasicClientConfig();
	        SimpleChain simpleChain = new SimpleChain();
	        simpleChain.addHandler(new CommonsHTTPSender());
	        basicClientConfig.deployTransport("http", simpleChain);
	 
	        AccountServicesLocator accountServiceLocator = new AccountServicesLocator(basicClientConfig);
	        AccountPortType accountPortType =  accountServiceLocator.getAccountPort(new URL(queryBAEndpoint));
		    
	       
	        
	    	AccountBindingStub accountStub = (AccountBindingStub) accountPortType;
	    	IntegrationContextHeader header = new IntegrationContextHeader();
	    	header.setTransactionId(sr);
			header.setIntegrationKeyRef(integrationKeyRef);
			
			ContextIntegrator contextIntegrator = new ContextIntegrator();
	    	contextIntegrator.setHeader(header);
	    		    		    	
	    	QueryBARequestBody body = new QueryBARequestBody();
	    	body.setBillingAccountId(baId);
	    	
			QueryBARequest queryBARequest = new QueryBARequest();
			queryBARequest.setContextIntegrator(contextIntegrator);
			queryBARequest.setBody(body);
									    
			System.out.println("----------------------------------------------------------------");
		    System.out.println();
		    
		    log.info(getDateTimeCurrent().toString() +"|callWS|"+ queryBAEndpoint);
		    log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(queryBARequest));
		    
		    res.put("req", new StringFormate().JSONFormate(queryBARequest));
		    
			try {
		
				response = accountStub.queryBA_PS(queryBARequest);			
				
				log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(response));
				
				Result result = response.getContextIntegrator().getMessage().getIntegrationResult();
				
				log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(result));
				if(!result.isResult()) {
					System.out.println("queryBA_PS failed:[" + result.getEsbReturnMsg() + "]");
				}else {
					QueryBAResponseBody responseBody = response.getBody();
					AccountInfoType accountInfo = responseBody.getAccountInfo();
					data[0] = accountInfo.getCustomerRef();
					data[1] = accountInfo.getBillCycle();
					data[2] = accountInfo.getHomeLocationCode();
					data[3] =accountInfo.getLastBillDtm();
				}
				
				System.out.println("Success");
			}
			catch(Exception e) {
				System.out.println("Error!!!!" + e);
			}
			
			System.out.println("**----------------- Request queryBA End ----------------**");

		}
		catch(Exception e) {
			System.out.println("RBM_QueryBA_PS Fails!!!!");
		}
		
		log.info(getDateTimeCurrent().toString() +"|callWS|"+ new Gson().toJson(data));
		
		res.put("res", Arrays.toString(data));
		
		log.info(getDateTimeCurrent().toString() +"|callWS|"+ "End Application");
		return res;
	}
	
	public static DateTime getDateTimeCurrent(){
		DateTime dateTime = new DateTime();
		//2020-09-24T16:02:58.319+07:00
		return dateTime;		
	}
}

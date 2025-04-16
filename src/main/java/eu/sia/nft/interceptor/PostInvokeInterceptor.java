package eu.sia.nft.interceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.ServiceInvokerInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PostInvokeInterceptor extends AbstractSoapInterceptor {

    private static final Map<String, TreeMap<Double, Integer>> probabilityMap = new HashMap<String, TreeMap<Double, Integer>>();
    private static final Logger logger = LogManager.getLogger(PostInvokeInterceptor.class);
    
    private static final String PAAGETPAYMENT = "paGetPayment";
    private static final String PAAGETPAYMENTV2 = "paGetPaymentV2";
    private static final String PASENDRT = "paSendRT";
    private static final String PASENDRTV2 = "paSendRTV2";
    private static final String PAVERIFYPAYMENTNOTICE = "paVerifyPaymentNotice";
    private static final String PAAATTIVARPT = "paaAttivaRPT";
    private static final String PAACHIEDINUMEROAVVISO = "paaChiediNumeroAvviso";
    private static final String PAAINVIART = "paaInviaRT";
    private static final String PAAVERIFICARPT = "paaVerificaRPT";
        
    static {
    	
    	TreeMap<Double, Integer> paGetPaymentProb = new TreeMap<Double, Integer>();
    	paGetPaymentProb.put(0.05, 200);
    	paGetPaymentProb.put(0.4, 300);
    	paGetPaymentProb.put(0.6, 400);
    	paGetPaymentProb.put(0.8, 500);
    	paGetPaymentProb.put(0.9, 600);
    	paGetPaymentProb.put(1.0, 1700);
    	
    	
    	TreeMap<Double, Integer> paGetPaymentV2Prob = new TreeMap<Double, Integer>();
    	paGetPaymentV2Prob.put(0.15, 150);
    	paGetPaymentV2Prob.put(0.4, 350);
    	paGetPaymentV2Prob.put(0.6, 550);
    	paGetPaymentV2Prob.put(0.75, 750);
    	paGetPaymentV2Prob.put(0.88, 1200);
    	paGetPaymentV2Prob.put(1.0, 2500);
    	
    	TreeMap<Double, Integer> paSendRTProb = new TreeMap<Double, Integer>();
    	paSendRTProb.put(0.3, 200);
    	paSendRTProb.put(0.6, 300);
    	paSendRTProb.put(0.75, 400);
    	paSendRTProb.put(0.88, 550);
    	paSendRTProb.put(1.0, 1000);
    	
    	TreeMap<Double, Integer> paSendRTV2Prob = new TreeMap<Double, Integer>();
    	paSendRTV2Prob.put(0.13, 200);
    	paSendRTV2Prob.put(0.43, 300);
    	paSendRTV2Prob.put(0.56, 400);
    	paSendRTV2Prob.put(0.76, 500);
    	paSendRTV2Prob.put(0.9, 650);
    	paSendRTV2Prob.put(1.0, 1700);
    	
    	TreeMap<Double, Integer> paVerifyPaymentNoticeProb = new TreeMap<Double, Integer>();
    	paVerifyPaymentNoticeProb.put(0.1, 150);
    	paVerifyPaymentNoticeProb.put(0.4, 300);
    	paVerifyPaymentNoticeProb.put(0.7, 450);
    	paVerifyPaymentNoticeProb.put(0.8, 700);
    	paVerifyPaymentNoticeProb.put(1.0, 1700);
    	
    	TreeMap<Double, Integer> paaAttivaRPTProb = new TreeMap<Double, Integer>();
    	paaAttivaRPTProb.put(0.4, 300);
    	paaAttivaRPTProb.put(0.6, 400);
    	paaAttivaRPTProb.put(0.7, 550);
    	paaAttivaRPTProb.put(0.85, 800);
    	paaAttivaRPTProb.put(1.0, 1700);
    	
    	TreeMap<Double, Integer> paaChiediNumeroAvvisoProb = new TreeMap<Double, Integer>();
    	paaChiediNumeroAvvisoProb.put(0.1, 300);
    	paaChiediNumeroAvvisoProb.put(0.2, 450);
    	paaChiediNumeroAvvisoProb.put(0.25, 700);
    	paaChiediNumeroAvvisoProb.put(0.30, 950);
    	paaChiediNumeroAvvisoProb.put(0.55, 1500);
    	paaChiediNumeroAvvisoProb.put(0.9, 2000);
    	paaChiediNumeroAvvisoProb.put(1.0, 6000);
    	
    	TreeMap<Double, Integer> paaInviaRTProb = new TreeMap<Double, Integer>();
    	paaInviaRTProb.put(0.07, 200);
    	paaInviaRTProb.put(0.27, 300);
    	paaInviaRTProb.put(0.48, 400);
    	paaInviaRTProb.put(0.62, 500);
    	paaInviaRTProb.put(0.7, 600);
    	paaInviaRTProb.put(0.81, 750);
    	paaInviaRTProb.put(0.94, 1700);
    	paaInviaRTProb.put(1.0, 6000);
    	
    	TreeMap<Double, Integer> paaVerificaRPTProb = new TreeMap<Double, Integer>();
    	paaVerificaRPTProb.put(0.31, 300);  
    	paaVerificaRPTProb.put(0.52, 450); 
    	paaVerificaRPTProb.put(0.67, 700);
    	paaVerificaRPTProb.put(0.73, 950);
    	paaVerificaRPTProb.put(0.93, 1700);
    	paaVerificaRPTProb.put(1.0, 6000);
    	
    	
    	probabilityMap.put(PAAGETPAYMENT, paGetPaymentProb);
    	probabilityMap.put(PAAGETPAYMENTV2, paGetPaymentV2Prob);
    	probabilityMap.put(PASENDRT, paSendRTProb);
    	probabilityMap.put(PASENDRTV2, paSendRTV2Prob);
    	probabilityMap.put(PAVERIFYPAYMENTNOTICE, paVerifyPaymentNoticeProb);
    	probabilityMap.put(PAAATTIVARPT, paaAttivaRPTProb);
    	probabilityMap.put(PAACHIEDINUMEROAVVISO, paaChiediNumeroAvvisoProb);
    	probabilityMap.put(PAAINVIART, paaInviaRTProb);
    	probabilityMap.put(PAAVERIFICARPT, paaVerificaRPTProb);
    }
    
	public PostInvokeInterceptor() {
		super(Phase.INVOKE);
		addAfter(ServiceInvokerInterceptor.class.getName());
		
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		boolean isSleepEnabled = Boolean.valueOf(System.getenv("sleepEnabled"));
		if(isSleepEnabled) {
			manageSleep(message);
		}
		message.getExchange().put("PostInvokeTime", System.currentTimeMillis());
	}
	
	private void manageSleep(SoapMessage message) {
		//get api name from soap
		final String OPERATION = "javax.xml.ws.wsdl.operation";
		String messageOperation = message.get(OPERATION).toString();
		messageOperation = messageOperation.substring(messageOperation.indexOf('}')+1);
		double randomValue = Math.random(); // [0, 1)
		int sleep = 0;
		boolean isTimeoutEnabled = Boolean.valueOf(System.getenv("timeoutEnabled"));
		if(isTimeoutEnabled && randomValue <=0.2) {
			sleep = 15100; //timeout
		}
		else
		{
			sleep = probabilisticSleep(messageOperation);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				logger.error("sleep error", e);
			}
		}
		message.getExchange().put("SleepTime", sleep);
		
	}
			
	private int probabilisticSleep(String apiName) {
		TreeMap<Double, Integer> probMap = probabilityMap.get(apiName);
		if(probMap == null || probMap.isEmpty()) {
			logger.warn("{} probMap not managed, return default sleep", apiName);
			return 0;
		}
		double randomValue = Math.random(); // [0, 1)
		Entry<Double, Integer> ceilingEntry = probMap.ceilingEntry(randomValue);
	    return ceilingEntry == null? 0 : ceilingEntry.getValue();
	}

}
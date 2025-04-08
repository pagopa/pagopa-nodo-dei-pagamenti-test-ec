package eu.sia.nft.interceptor;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.ServiceInvokerInterceptor;
import org.apache.cxf.phase.Phase;

public class PostInvokeInterceptor extends AbstractSoapInterceptor {

	private final Random random = new Random();
    private final NavigableMap<Double, int[]> probabilityMap = new TreeMap<>();
    
	public PostInvokeInterceptor() {
		super(Phase.INVOKE);
		addAfter(ServiceInvokerInterceptor.class.getName());
		probabilityMap.put(0.1, new int[]{100, 100});  // 10% prob range 100 - 100
        probabilityMap.put(0.9, new int[]{0, 0});  // 90% prob range 0 - 0
        //probabilityMap.put(1.0, new int[]{600, 1000}); // 20% prob range 600 - 1000
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		boolean isSleepEnabled = Boolean.valueOf(System.getenv("sleepEnabled"));
		if(isSleepEnabled) {
			double randomValue = random.nextDouble(); // get number between 0 and 1
	        int[] range = probabilityMap.higherEntry(randomValue).getValue(); //select range
	        int sleepTime = random.nextInt(range[1] - range[0] + 1) + range[0]; //generate sleep with range
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			message.getExchange().put("SleepTime", sleepTime);
		}
		message.getExchange().put("PostInvokeTime", System.currentTimeMillis());
	}

}
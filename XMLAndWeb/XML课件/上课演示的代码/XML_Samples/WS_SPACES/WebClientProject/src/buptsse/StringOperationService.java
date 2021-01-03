
package buptsse;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* StringOperationService service = new StringOperationService();
* StringOperationDelegate portType = service.getStringOperationPort();
* portType.compareString(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "StringOperationService", targetNamespace = "http://buptsse/", wsdlLocation = "http://localhost:8080/WebServiceProject/StringOperationPort?WSDL")
public class StringOperationService extends Service {

	private final static URL STRINGOPERATIONSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(buptsse.StringOperationService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = buptsse.StringOperationService.class.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/WebServiceProject/StringOperationPort?WSDL");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://localhost:8080/WebServiceProject/StringOperationPort?WSDL', retrying as a local file");
			logger.warning(e.getMessage());
		}
		STRINGOPERATIONSERVICE_WSDL_LOCATION = url;
	}

	public StringOperationService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public StringOperationService() {
		super(STRINGOPERATIONSERVICE_WSDL_LOCATION, new QName("http://buptsse/", "StringOperationService"));
	}

	/**
	 * 
	 * @return returns StringOperationDelegate
	 */
	@WebEndpoint(name = "StringOperationPort")
	public StringOperationDelegate getStringOperationPort() {
		return super.getPort(new QName("http://buptsse/", "StringOperationPort"), StringOperationDelegate.class);
	}

}

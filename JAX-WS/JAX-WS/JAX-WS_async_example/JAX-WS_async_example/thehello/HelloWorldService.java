
package thehello;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWorldService", targetNamespace = "http://thehello/", wsdlLocation = "http://localhost:8082/helloanother?wsdl")
public class HelloWorldService
    extends Service
{

    private final static URL HELLOWORLDSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDSERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVICE_QNAME = new QName("http://thehello/", "HelloWorldService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/helloanother?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDSERVICE_WSDL_LOCATION = url;
        HELLOWORLDSERVICE_EXCEPTION = e;
    }

    public HelloWorldService() {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort() {
        return super.getPort(new QName("http://thehello/", "HelloWorldPort"), HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://thehello/", "HelloWorldPort"), HelloWorld.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVICE_WSDL_LOCATION;
    }

}

package ru.burmistrov.soaptm.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import org.springframework.stereotype.Component;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-05-16T17:25:18.120+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "AuthEndpointService",
                  wsdlLocation = "http://localhost:8080/services/authEndpoint?wsdl",
                  targetNamespace = "http://endpoint.soaptm.burmistrov.ru/")
@Component
public class AuthEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://endpoint.soaptm.burmistrov.ru/", "AuthEndpointService");
    public final static QName AuthEndpointPort = new QName("http://endpoint.soaptm.burmistrov.ru/", "AuthEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/authEndpoint?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AuthEndpointService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/authEndpoint?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AuthEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AuthEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AuthEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AuthEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IAuthEndpoint
     */
    @WebEndpoint(name = "AuthEndpointPort")
    public IAuthEndpoint getAuthEndpointPort() {
        return super.getPort(AuthEndpointPort, IAuthEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAuthEndpoint
     */
    @WebEndpoint(name = "AuthEndpointPort")
    public IAuthEndpoint getAuthEndpointPort(WebServiceFeature... features) {
        return super.getPort(AuthEndpointPort, IAuthEndpoint.class, features);
    }

}

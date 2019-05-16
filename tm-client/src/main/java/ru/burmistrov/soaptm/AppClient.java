package ru.burmistrov.soaptm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.burmistrov.soaptm.api.endpoint.Exception_Exception;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.configuration.SpringConfiguration;
import ru.burmistrov.soaptm.endpoint.AuthEndpointService;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

public class AppClient {

    public static void main(final String[] args) throws Exception_Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAuthEndpoint authEndpoint = context.getBean(IAuthEndpoint.class);
        authEndpoint.auth("admin", "admin");
        Map<String, List<String>> map = (Map<String, List<String>>)
                ((BindingProvider)authEndpoint).getResponseContext().get(MessageContext.HTTP_RESPONSE_HEADERS);
        System.out.println(map.get("Set-Cookie"));


    }

}

package ru.burmistrov.soapTM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soapTM.configuration.SpringConfiguration;

public class AppClient {

    public static void main(final String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IProjectEndpoint projectEndpoint = context.getBean(IProjectEndpoint.class);
    }

}

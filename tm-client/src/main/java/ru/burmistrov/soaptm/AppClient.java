package ru.burmistrov.soaptm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.configuration.SpringConfiguration;

public class AppClient {

    public static void main(final String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IProjectEndpoint projectEndpoint = context.getBean(IProjectEndpoint.class);
        System.out.println(projectEndpoint);
    }

}

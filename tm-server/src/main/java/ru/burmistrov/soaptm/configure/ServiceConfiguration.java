package ru.burmistrov.soaptm.configure;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint;

import javax.xml.ws.Endpoint;

@Configuration
@ComponentScan("ru.burmistrov.soaptm")
public class ServiceConfiguration {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpointProject(IProjectEndpoint projectEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), projectEndpoint);
        endpoint.publish("/projectEndpoint");
        return endpoint;
    }

    @Bean
    public Endpoint endpointTask(ITaskEndpoint taskEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), taskEndpoint);
        endpoint.publish("/taskEndpoint");
        return endpoint;
    }

    @Bean
    public Endpoint endpointAuth(IAuthEndpoint authEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), authEndpoint);
        endpoint.publish("/authEndpoint");
        return endpoint;
    }

}

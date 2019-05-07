package ru.burmistrov.soapTM.configure;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soapTM.api.endpoint.ITaskEndpoint;

import javax.xml.ws.Endpoint;

@Configuration
@ComponentScan("ru.burmistrov.soapTM")
public class ServiceConfiguration {

    private final IProjectEndpoint projectEndpoint;

    private final ITaskEndpoint taskEndpoint;

    @Autowired
    public ServiceConfiguration(IProjectEndpoint projectEndpoint, ITaskEndpoint taskEndpoint) {
        this.projectEndpoint = projectEndpoint;
        this.taskEndpoint = taskEndpoint;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus cxf() {
        return new SpringBus();
    }

    @Bean
    public Endpoint projectEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(cxf(), projectEndpoint);
        endpoint.publish("/projectEndpoint");
        return endpoint;
    }

    @Bean
    public Endpoint taskEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(cxf(), taskEndpoint);
        endpoint.publish("/taskEndpoint");
        return endpoint;
    }

}

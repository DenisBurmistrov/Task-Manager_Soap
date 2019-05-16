package ru.burmistrov.soapTM.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.burmistrov.soapTM.api.endpoint.IAuthEndpoint;
import ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soapTM.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soapTM.endpoint.AuthEndpointService;
import ru.burmistrov.soapTM.endpoint.ProjectEndpointService;
import ru.burmistrov.soapTM.endpoint.TaskEndpointService;

@Component
public class EndpointProducer {

    @Autowired
    private ProjectEndpointService projectEndpointService;

    @Autowired
    private TaskEndpointService taskEndpointService;

    @Autowired
    private AuthEndpointService userEndpointService;

    @Bean
    public IProjectEndpoint getProjectEndpoint() {
        return projectEndpointService.getProjectEndpointPort();
    }

    @Bean
    public ITaskEndpoint getTaskEndpoint() {
        return taskEndpointService.getTaskEndpointPort();
    }

    @Bean
    public IAuthEndpoint getAdminEndpoint() {
        return userEndpointService.getAuthEndpointPort();
    }
}

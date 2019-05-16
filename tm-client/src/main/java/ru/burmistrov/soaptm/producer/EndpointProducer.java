package ru.burmistrov.soaptm.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soaptm.endpoint.AuthEndpointService;
import ru.burmistrov.soaptm.endpoint.ProjectEndpointService;
import ru.burmistrov.soaptm.endpoint.TaskEndpointService;

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

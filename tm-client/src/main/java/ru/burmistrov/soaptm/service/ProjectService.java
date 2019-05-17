package ru.burmistrov.soaptm.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soaptm.api.endpoint.Exception_Exception;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.api.endpoint.ProjectDto;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectService {

    private final IProjectEndpoint projectEndpoint;

    @Autowired
    public ProjectService(IProjectEndpoint projectEndpoint) {
        this.projectEndpoint = projectEndpoint;
    }

    public List<ProjectDto> fingAllProjects(@NotNull final List<String> cookies) throws Exception_Exception {
        setCookie(cookies);
        return projectEndpoint.findAllProjects();
    }

    public ProjectDto findProjectById(@NotNull final List<String> cookies, @NotNull final String id) throws Exception_Exception {
        setCookie(cookies);
        return projectEndpoint.findOneProjectById(id);
    }

    public ProjectDto persist(
            @NotNull final List<String> cookies, @NotNull final String name, @NotNull final  String description,
            @NotNull final String dateEnd) throws Exception_Exception {
        setCookie(cookies);
        return projectEndpoint.createProject(name, description, dateEnd);
    }

    public void merge(
            @NotNull final List<String> cookies, @NotNull final String id, @NotNull final String name,
            @NotNull final String description, @NotNull final String dateEnd) throws Exception_Exception {
        setCookie(cookies);
        projectEndpoint.updateProjectById(id ,name, description, dateEnd);
    }

    public void removeById(@NotNull final List<String> cookies, @NotNull final String id) throws Exception_Exception {
        setCookie(cookies);
        projectEndpoint.removeProjectById(id);
    }

    private void setCookie(@NotNull final List<String> cookies) {
        @NotNull final Map<String, Object> requestContext = ((BindingProvider) projectEndpoint).getRequestContext();
        @NotNull final Map<String, List<String>> requestHeaders = new HashMap<>();
        requestHeaders.put("Cookie", cookies);
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
    }
}

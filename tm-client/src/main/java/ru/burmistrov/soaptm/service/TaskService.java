package ru.burmistrov.soaptm.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soaptm.api.endpoint.Exception_Exception;
import ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soaptm.api.endpoint.TaskDto;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    private final ITaskEndpoint taskEndpoint;

    @Autowired
    public TaskService(ITaskEndpoint taskEndpoint) {
        this.taskEndpoint = taskEndpoint;
    }

    public List<TaskDto> fingAllTasks(@NotNull final List<String> cookies, @NotNull final String projectId) throws Exception_Exception {
        setCookie(cookies);
        return taskEndpoint.findAllTasksInProject(projectId);
    }

    public TaskDto findTaskById(@NotNull final List<String> cookies,@NotNull final  String taskId) throws Exception_Exception {
        setCookie(cookies);
        return taskEndpoint.findOneTaskById(taskId);
    }

    public TaskDto persist(
            @NotNull final List<String> cookies, @NotNull final String projectId, @NotNull final String name,
            @NotNull final  String description, @NotNull final String dateEnd) throws Exception_Exception {
        setCookie(cookies);
        return taskEndpoint.createTask(projectId ,name, description, dateEnd);
    }

    public void merge(
            @NotNull final List<String> cookies, @NotNull final String projectId, @NotNull final String taskId,
            @NotNull final String id, @NotNull final String name, @NotNull final String description,
            @NotNull final String dateEnd) throws Exception_Exception {
        setCookie(cookies);
        taskEndpoint.updateTaskById(projectId, taskId ,name, description, dateEnd);
    }

    public void removeById(@NotNull final List<String> cookies, @NotNull final String id) throws Exception_Exception {
        setCookie(cookies);
        taskEndpoint.removeTaskById(id);
    }

    private void setCookie(@NotNull final List<String> cookies) {
        @NotNull final Map<String, Object> requestContext = ((BindingProvider) taskEndpoint).getRequestContext();
        @NotNull final Map<String, List<String>> requestHeaders = new HashMap<>();
        requestHeaders.put("Cookie", cookies);
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
    }
}

package ru.burmistrov.soapTM.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soapTM.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soapTM.api.service.ITaskService;
import ru.burmistrov.soapTM.entity.dto.TaskDto;

import javax.jws.WebService;
import java.util.List;

@NoArgsConstructor
@WebService(endpointInterface = "ru.burmistrov.soapTM.api.endpoint.ITaskEndpoint")
@Service
public class TaskEndpoint implements ITaskEndpoint {

    private ITaskService taskService;

    @Autowired
    public TaskEndpoint(ITaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void updateTaskById
            (@NotNull final String userId, @NotNull final String projectId, @NotNull final String taskId,
             @NotNull final String newName, @NotNull final String description, @NotNull final String dateEnd) throws Exception {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(taskId);
        taskDto.setName(newName);
        taskDto.setDescription(description);
        taskDto.setDateEnd(dateEnd);
        taskDto.setProjectId(projectId);
        taskService.merge(taskDto, userId);
    }


    @Nullable
    @Override
    public TaskDto createTask(@NotNull final String userId, @NotNull final String projectId, @NotNull final String name,
                              @NotNull final String description, @NotNull final String dateEnd) throws Exception {
        TaskDto taskDto = new TaskDto();
        taskDto.setName(name);
        taskDto.setDescription(description);
        taskDto.setDateEnd(dateEnd);
        taskDto.setProjectId(projectId);
        return taskService.persist(taskDto, userId);
    }

    @Override
    public void removeTaskById(@NotNull final String userId, @NotNull final String taskId) throws Exception {
        taskService.removeById(taskId, userId);
    }

    @Nullable
    @Override
    public List<TaskDto> findAllTasksInProject(@NotNull final String userId, @NotNull final String projectId) throws Exception {
        return taskService.findAllInProject(userId, projectId);
    }

    @Nullable
    @Override
    public TaskDto findOneTaskById(@NotNull final String userId, @NotNull final String taskId) throws Exception {
        return taskService.findOneById(taskId, userId);
    }
}

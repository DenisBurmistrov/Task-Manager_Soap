package ru.burmistrov.soaptm.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soaptm.api.service.ITaskService;
import ru.burmistrov.soaptm.entity.CustomUser;
import ru.burmistrov.soaptm.entity.dto.TaskDto;

import javax.jws.WebService;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@WebService(endpointInterface = "ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint")
@Service
public class TaskEndpoint implements ITaskEndpoint {

    private ITaskService taskService;

    @Autowired
    public TaskEndpoint(ITaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void updateTaskById
            (@NotNull final String projectId, @NotNull final String taskId,
             @NotNull final String newName, @NotNull final String description, @NotNull final String dateEnd) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        TaskDto taskDto = new TaskDto();
        taskDto.setId(taskId);
        taskDto.setName(newName);
        taskDto.setDescription(description);
        taskDto.setDateEnd(dateEnd);
        taskDto.setProjectId(projectId);
        taskService.merge(taskDto, Objects.requireNonNull(customUser.getUser()).getId());
    }


    @Nullable
    @Override
    public TaskDto createTask(@NotNull final String projectId, @NotNull final String name,
                              @NotNull final String description, @NotNull final String dateEnd) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        TaskDto taskDto = new TaskDto();
        taskDto.setName(name);
        taskDto.setDescription(description);
        taskDto.setDateEnd(dateEnd);
        taskDto.setProjectId(projectId);
        return taskService.persist(taskDto, Objects.requireNonNull(customUser.getUser()).getId());
    }

    @Override
    public void removeTaskById(@NotNull final String taskId) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        taskService.removeById(taskId, Objects.requireNonNull(customUser.getUser()).getId());
    }

    @Nullable
    @Override
    public List<TaskDto> findAllTasksInProject(@NotNull final String projectId) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        return taskService.findAllInProject(Objects.requireNonNull(customUser.getUser()).getId(), projectId);
    }

    @Nullable
    @Override
    public TaskDto findOneTaskById(@NotNull final String taskId) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        return taskService.findOneById(taskId, Objects.requireNonNull(customUser.getUser()).getId());
    }
}

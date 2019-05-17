package ru.burmistrov.soaptm.api.endpoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.soaptm.entity.dto.TaskDto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ITaskEndpoint {

    @WebMethod
    void updateTaskById
            (@WebParam(name = "projectId") @NotNull final String projectId,
             @WebParam(name = "taskId") @NotNull final String taskId,
             @WebParam(name = "newName") @NotNull final String newName,
             @WebParam(name = "description") @NotNull final String description,
             @WebParam(name = "dateEnd") @NotNull final String dateEnd) throws Exception;

    @WebMethod
    @Nullable
    TaskDto createTask
            (@WebParam(name = "projectId") @NotNull final String projectId,
             @WebParam(name = "name") @NotNull final String name,
             @WebParam(name = "description") @NotNull final String description,
             @WebParam(name = "dateEnd") @NotNull final String dateEnd) throws Exception;

    @WebMethod
    void removeTaskById
            (@WebParam(name = "taskId") @NotNull final String taskId) throws Exception;


    @WebMethod
    @Nullable
    List<TaskDto> findAllTasksInProject
            (@WebParam(name = "projectId") @NotNull final String projectId) throws Exception;

    @Nullable
    @WebMethod
    TaskDto findOneTaskById
            (@WebParam(name = "taskId") @NotNull final String taskId) throws Exception;
}

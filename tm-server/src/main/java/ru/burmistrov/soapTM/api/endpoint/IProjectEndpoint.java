package ru.burmistrov.soapTM.api.endpoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.soapTM.entity.dto.ProjectDto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface IProjectEndpoint {

    @WebMethod
    void removeProjectById
            (@WebParam(name = "userId") @NotNull final String userId,
             @WebParam(name = "projectId") @NotNull final String projectId) throws Exception;

    @Nullable
    @WebMethod
    ProjectDto createProject
            (@WebParam(name = "userId") @NotNull final String userId,
             @WebParam(name = "name") @NotNull final String name, @WebParam(name = "description") @NotNull final String description,
             @WebParam(name = "dateEnd") @NotNull final String dateEnd) throws Exception;

    @WebMethod
    void updateProjectById
            (@WebParam(name = "userId") @NotNull final String userId,
             @WebParam(name = "projectId") @NotNull final String projectId,
             @WebParam(name = "name") @NotNull final String name,
             @WebParam(name = "description") @NotNull final String description,
             @WebParam(name = "dateEnd") @NotNull final String dateEnd) throws Exception;

    @Nullable
    @WebMethod
    List<ProjectDto> findAllProjects
            (@WebParam(name = "userId") @NotNull final String userId) throws Exception;

    @Nullable
    @WebMethod
    ProjectDto findOneProjectById
            (@WebParam(name = "userId") @NotNull final String userId,
             @WebParam(name = "projectId") @NotNull final String projectId) throws Exception;

}

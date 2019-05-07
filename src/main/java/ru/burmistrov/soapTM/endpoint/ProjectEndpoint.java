package ru.burmistrov.soapTM.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soapTM.api.service.IProjectService;
import ru.burmistrov.soapTM.entity.dto.ProjectDto;
import ru.burmistrov.soapTM.util.DateUtil;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@WebService
@Service
public class ProjectEndpoint implements IProjectEndpoint {

    private IProjectService projectService;

    @Autowired
    public ProjectEndpoint(IProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public void removeProjectById(@NotNull String userId, @NotNull String projectId) throws Exception {
        projectService.removeById(projectId, userId);
    }

    @Nullable
    @Override
    public ProjectDto createProject
            (@NotNull String userId, @NotNull String name,
             @NotNull String description, @NotNull String dateEnd) throws Exception {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(name);
        projectDto.setDescription(description);
        projectDto.setDateEnd(dateEnd);
        return projectService.persist(projectDto, userId);
    }

    @Override
    public void updateProjectById(@NotNull String userId, @NotNull String projectId,
                                  @NotNull String name, @NotNull String description,
                                  @NotNull String dateEnd) throws Exception {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(projectId);
        projectDto.setName(name);
        projectDto.setDescription(description);
        projectDto.setDateEnd(dateEnd);
        projectService.merge(projectDto, userId);

    }

    @Nullable
    @Override
    public List<ProjectDto> findAllProjects(@NotNull String userId) throws Exception {
        return projectService.findAll(userId);
    }

    @Nullable
    @Override
    public ProjectDto findOneProjectById(@NotNull String userId, @NotNull String projectId) throws Exception {
        return projectService.findOneById(projectId, userId);
    }
}

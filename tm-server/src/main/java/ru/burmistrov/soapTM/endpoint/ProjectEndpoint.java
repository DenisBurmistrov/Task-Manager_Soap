package ru.burmistrov.soapTM.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soapTM.api.service.IProjectService;
import ru.burmistrov.soapTM.entity.CustomUser;
import ru.burmistrov.soapTM.entity.dto.ProjectDto;
import ru.burmistrov.soapTM.util.DateUtil;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@WebService(endpointInterface = "ru.burmistrov.soapTM.api.endpoint.IProjectEndpoint")
@NoArgsConstructor
public class ProjectEndpoint implements IProjectEndpoint {

    private IProjectService projectService;

    @Autowired
    public ProjectEndpoint(IProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public void removeProjectById(@NotNull String projectId) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        projectService.removeById(projectId, Objects.requireNonNull(customUser.getUser()).getId());
    }

    @Nullable
    @Override
    public ProjectDto createProject
            (@NotNull String name,
             @NotNull String description, @NotNull String dateEnd) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(name);
        projectDto.setDescription(description);
        projectDto.setDateEnd(dateEnd);
        return projectService.persist(projectDto, Objects.requireNonNull(customUser.getUser()).getId());
    }

    @Override
    public void updateProjectById(@NotNull String projectId,
                                  @NotNull String name, @NotNull String description,
                                  @NotNull String dateEnd) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(projectId);
        projectDto.setName(name);
        projectDto.setDescription(description);
        projectDto.setDateEnd(dateEnd);
        projectService.merge(projectDto, Objects.requireNonNull(customUser.getUser()).getId());

    }

    @Nullable
    @Override
    public List<ProjectDto> findAllProjects() throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        return projectService.findAll(Objects.requireNonNull(customUser.getUser()).getId());
    }

    @Nullable
    @Override
    public ProjectDto findOneProjectById(@NotNull String projectId) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        return projectService.findOneById(projectId, customUser.getUser().getId());
    }
}

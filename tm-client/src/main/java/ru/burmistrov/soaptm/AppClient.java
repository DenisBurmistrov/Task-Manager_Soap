package ru.burmistrov.soaptm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.burmistrov.soaptm.api.endpoint.Exception_Exception;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;
import ru.burmistrov.soaptm.api.endpoint.IProjectEndpoint;
import ru.burmistrov.soaptm.api.endpoint.ITaskEndpoint;
import ru.burmistrov.soaptm.configuration.SpringConfiguration;
import ru.burmistrov.soaptm.endpoint.AuthEndpointService;
import ru.burmistrov.soaptm.service.AuthService;
import ru.burmistrov.soaptm.service.ProjectService;
import ru.burmistrov.soaptm.service.TaskService;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

public class AppClient {

    public static void main(final String[] args) throws Exception_Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AuthService authService = context.getBean(AuthService.class);
        ProjectService projectService = context.getBean(ProjectService.class);
        TaskService taskService = context.getBean(TaskService.class);

        List<String> cookies = authService.auth("admin", "admin");
        //Project
//        System.out.println(projectService.fingAllProjects(cookies));
//        System.out.println(projectService.findProjectById(cookies, "44186ac4-f11a-4c8b-b8fe-1c3e2f03eed0"));
//        System.out.println(projectService.persist(cookies, "test", "test", "11.11.2020"));
//        projectService.merge(cookies, "44186ac4-f11a-4c8b-b8fe-1c3e2f03eed0", "test1", "test1", "11.11.2020");
//        projectService.removeById(cookies, "b32cb870-81d5-4119-b9e9-bd020fb3bcda");]

        //Task
//        System.out.println(taskService.findTaskById(cookies, "9ee3e057-c876-4e02-86be-79fc67daa303"));
//        System.out.println(taskService.persist(cookies, "44186ac4-f11a-4c8b-b8fe-1c3e2f03eed0", "test123", "test123", "11.11.2020"));
//        System.out.println(taskService.fingAllTasks(cookies, "44186ac4-f11a-4c8b-b8fe-1c3e2f03eed0"));
//        taskService.merge(cookies, "44186ac4-f11a-4c8b-b8fe-1c3e2f03eed0", "951f7d68-a6cd-4f99-a7a4-e60d9e7dd3a6",
//        "testt", "testt", "11.11.2020");
//        taskService.removeById(cookies, "951f7d68-a6cd-4f99-a7a4-e60d9e7dd3a6");
    }

}

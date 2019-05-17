package ru.burmistrov.soaptm.api.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-05-16T17:25:17.843+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", name = "IProjectEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface IProjectEndpoint {

    @WebMethod
    @RequestWrapper(localName = "findAllProjects", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.FindAllProjects")
    @ResponseWrapper(localName = "findAllProjectsResponse", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.FindAllProjectsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.soaptm.api.endpoint.ProjectDto> findAllProjects() throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateProjectById", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.UpdateProjectById")
    @ResponseWrapper(localName = "updateProjectByIdResponse", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.UpdateProjectByIdResponse")
    public void updateProjectById(
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "dateEnd", targetNamespace = "")
        java.lang.String dateEnd
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "createProject", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.CreateProject")
    @ResponseWrapper(localName = "createProjectResponse", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.CreateProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.soaptm.api.endpoint.ProjectDto createProject(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "dateEnd", targetNamespace = "")
        java.lang.String dateEnd
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeProjectById", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.RemoveProjectById")
    @ResponseWrapper(localName = "removeProjectByIdResponse", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.RemoveProjectByIdResponse")
    public void removeProjectById(
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "findOneProjectById", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.FindOneProjectById")
    @ResponseWrapper(localName = "findOneProjectByIdResponse", targetNamespace = "http://endpoint.api.soaptm.burmistrov.ru/", className = "ru.burmistrov.soaptm.api.endpoint.FindOneProjectByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.soaptm.api.endpoint.ProjectDto findOneProjectById(
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    ) throws Exception_Exception;
}

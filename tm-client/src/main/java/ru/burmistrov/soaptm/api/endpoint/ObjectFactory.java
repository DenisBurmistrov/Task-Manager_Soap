
package ru.burmistrov.soaptm.api.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.burmistrov.soaptm.api.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateTask_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "createTask");
    private final static QName _CreateTaskResponse_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "createTaskResponse");
    private final static QName _FindAllTasksInProject_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "findAllTasksInProject");
    private final static QName _FindAllTasksInProjectResponse_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "findAllTasksInProjectResponse");
    private final static QName _FindOneTaskById_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "findOneTaskById");
    private final static QName _FindOneTaskByIdResponse_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "findOneTaskByIdResponse");
    private final static QName _RemoveTaskById_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "removeTaskById");
    private final static QName _RemoveTaskByIdResponse_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "removeTaskByIdResponse");
    private final static QName _UpdateTaskById_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "updateTaskById");
    private final static QName _UpdateTaskByIdResponse_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "updateTaskByIdResponse");
    private final static QName _Exception_QNAME = new QName("http://endpoint.api.soapTM.burmistrov.ru/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.burmistrov.soaptm.api.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateTask }
     * 
     */
    public CreateTask createCreateTask() {
        return new CreateTask();
    }

    /**
     * Create an instance of {@link CreateTaskResponse }
     * 
     */
    public CreateTaskResponse createCreateTaskResponse() {
        return new CreateTaskResponse();
    }

    /**
     * Create an instance of {@link FindAllTasksInProject }
     * 
     */
    public FindAllTasksInProject createFindAllTasksInProject() {
        return new FindAllTasksInProject();
    }

    /**
     * Create an instance of {@link FindAllTasksInProjectResponse }
     * 
     */
    public FindAllTasksInProjectResponse createFindAllTasksInProjectResponse() {
        return new FindAllTasksInProjectResponse();
    }

    /**
     * Create an instance of {@link FindOneTaskById }
     * 
     */
    public FindOneTaskById createFindOneTaskById() {
        return new FindOneTaskById();
    }

    /**
     * Create an instance of {@link FindOneTaskByIdResponse }
     * 
     */
    public FindOneTaskByIdResponse createFindOneTaskByIdResponse() {
        return new FindOneTaskByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveTaskById }
     * 
     */
    public RemoveTaskById createRemoveTaskById() {
        return new RemoveTaskById();
    }

    /**
     * Create an instance of {@link RemoveTaskByIdResponse }
     * 
     */
    public RemoveTaskByIdResponse createRemoveTaskByIdResponse() {
        return new RemoveTaskByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateTaskById }
     * 
     */
    public UpdateTaskById createUpdateTaskById() {
        return new UpdateTaskById();
    }

    /**
     * Create an instance of {@link UpdateTaskByIdResponse }
     * 
     */
    public UpdateTaskByIdResponse createUpdateTaskByIdResponse() {
        return new UpdateTaskByIdResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link TaskDto }
     * 
     */
    public TaskDto createTaskDto() {
        return new TaskDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "createTask")
    public JAXBElement<CreateTask> createCreateTask(CreateTask value) {
        return new JAXBElement<CreateTask>(_CreateTask_QNAME, CreateTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "createTaskResponse")
    public JAXBElement<CreateTaskResponse> createCreateTaskResponse(CreateTaskResponse value) {
        return new JAXBElement<CreateTaskResponse>(_CreateTaskResponse_QNAME, CreateTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTasksInProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "findAllTasksInProject")
    public JAXBElement<FindAllTasksInProject> createFindAllTasksInProject(FindAllTasksInProject value) {
        return new JAXBElement<FindAllTasksInProject>(_FindAllTasksInProject_QNAME, FindAllTasksInProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTasksInProjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "findAllTasksInProjectResponse")
    public JAXBElement<FindAllTasksInProjectResponse> createFindAllTasksInProjectResponse(FindAllTasksInProjectResponse value) {
        return new JAXBElement<FindAllTasksInProjectResponse>(_FindAllTasksInProjectResponse_QNAME, FindAllTasksInProjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneTaskById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "findOneTaskById")
    public JAXBElement<FindOneTaskById> createFindOneTaskById(FindOneTaskById value) {
        return new JAXBElement<FindOneTaskById>(_FindOneTaskById_QNAME, FindOneTaskById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneTaskByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "findOneTaskByIdResponse")
    public JAXBElement<FindOneTaskByIdResponse> createFindOneTaskByIdResponse(FindOneTaskByIdResponse value) {
        return new JAXBElement<FindOneTaskByIdResponse>(_FindOneTaskByIdResponse_QNAME, FindOneTaskByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTaskById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "removeTaskById")
    public JAXBElement<RemoveTaskById> createRemoveTaskById(RemoveTaskById value) {
        return new JAXBElement<RemoveTaskById>(_RemoveTaskById_QNAME, RemoveTaskById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTaskByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "removeTaskByIdResponse")
    public JAXBElement<RemoveTaskByIdResponse> createRemoveTaskByIdResponse(RemoveTaskByIdResponse value) {
        return new JAXBElement<RemoveTaskByIdResponse>(_RemoveTaskByIdResponse_QNAME, RemoveTaskByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTaskById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "updateTaskById")
    public JAXBElement<UpdateTaskById> createUpdateTaskById(UpdateTaskById value) {
        return new JAXBElement<UpdateTaskById>(_UpdateTaskById_QNAME, UpdateTaskById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTaskByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "updateTaskByIdResponse")
    public JAXBElement<UpdateTaskByIdResponse> createUpdateTaskByIdResponse(UpdateTaskByIdResponse value) {
        return new JAXBElement<UpdateTaskByIdResponse>(_UpdateTaskByIdResponse_QNAME, UpdateTaskByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soapTM.burmistrov.ru/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}

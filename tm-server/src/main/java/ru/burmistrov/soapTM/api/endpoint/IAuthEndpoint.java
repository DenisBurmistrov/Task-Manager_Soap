package ru.burmistrov.soapTM.api.endpoint;

import org.jetbrains.annotations.NotNull;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IAuthEndpoint {

    @WebMethod
    String auth
            (@WebParam(name = "username") @NotNull final String username,
             @WebParam(name = "password") @NotNull final String password) throws Exception;
}

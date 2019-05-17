package ru.burmistrov.soaptm.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soaptm.api.endpoint.Exception_Exception;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@Service
public class AuthService {

    private final IAuthEndpoint authEndpoint;

    @Autowired
    public AuthService(IAuthEndpoint authEndpoint) {
        this.authEndpoint = authEndpoint;
    }

    public List<String> auth(@NotNull final String username, @NotNull final String password) throws Exception_Exception {
        authEndpoint.auth("admin", "admin");
        Map<String, List<String>> map = (Map<String, List<String>>)
                ((BindingProvider)authEndpoint).getResponseContext().get(MessageContext.HTTP_RESPONSE_HEADERS);
        return map.get("Set-Cookie");
    }
}

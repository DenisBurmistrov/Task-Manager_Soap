package ru.burmistrov.soapTM.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import ru.burmistrov.soapTM.api.endpoint.IAuthEndpoint;

import javax.jws.WebService;

@Service
@WebService(endpointInterface = "ru.burmistrov.soapTM.api.endpoint.IAuthEndpoint")
@NoArgsConstructor
public class AuthEndpoint implements IAuthEndpoint {

    @Override
    public void auth(@NotNull String username, @NotNull String password) throws Exception {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        SecurityContextHolder.getContext().setAuthentication(token);
    }
}

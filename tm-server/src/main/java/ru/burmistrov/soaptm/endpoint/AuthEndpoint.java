package ru.burmistrov.soaptm.endpoint;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint;

import javax.jws.WebService;

@Service
@WebService(endpointInterface = "ru.burmistrov.soaptm.api.endpoint.IAuthEndpoint")
@NoArgsConstructor
public class AuthEndpoint implements IAuthEndpoint {

    @Override
    public void auth(@NotNull String username, @NotNull String password) throws Exception {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        SecurityContextHolder.getContext().setAuthentication(token);
    }
}

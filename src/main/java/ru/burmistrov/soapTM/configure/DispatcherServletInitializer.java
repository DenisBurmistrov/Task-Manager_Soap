package ru.burmistrov.soapTM.configure;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                DataBaseConfig.class,
                SpringSecurityConfig.class,
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }
}

package ru.burmistrov.soapTM.configure;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;

public class AppInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext container) {
        // Method implementation
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        context.register(ServiceConfiguration.class, DataBaseConfiguration.class);

    }
}


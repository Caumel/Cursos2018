package com.autentia.cursos2018;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig() {
        packages("com.autentia.cursos2018.controllers");

        register(MultiPartFeature.class); 	// Configuración para permitir peticiones multipart
        register(CORSResponseFilter.class); //Configuración para permitir CORS
    }
}
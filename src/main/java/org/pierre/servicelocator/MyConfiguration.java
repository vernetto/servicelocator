package org.pierre.servicelocator;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MyConfiguration {
    @Bean
    public ServiceLocatorFactoryBean myServiceLocatorFactoryBean() {
        ServiceLocatorFactoryBean result = new ServiceLocatorFactoryBean();
        result.setServiceLocatorInterface(MyServiceFactory.class);
        Properties mapping = new Properties();
        mapping.put("pippo", "myServiceimplPippo");
        mapping.put("pluto", "myServiceimplPluto");
        result.setServiceMappings(mapping);
        return result;
    }

    @Bean
    public MyService myServiceimplPippo() {
        return new MyServiceimplPippo();
    }

    @Bean
    public MyService myServiceimplPluto() {
        return new MyServiceimplPluto();
    }
}

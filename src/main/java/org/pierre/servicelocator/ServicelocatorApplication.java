package org.pierre.servicelocator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicelocatorApplication implements CommandLineRunner {
    @Autowired
    MyServiceFactory myServiceFactory;

    public static void main(String[] args) {
        SpringApplication.run(ServicelocatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MyService service = myServiceFactory.getService("pippo");
        service.printMessage();
        service = myServiceFactory.getService("pluto");
        service.printMessage();
    }
}

package org.pierre.servicelocator;

public interface MyServiceFactory {
    public MyService getService(String serviceName);
}

package util;

import interactions.ServiceConsumeGet;
import interactions.ServiceConsumeGetWithParameters;

public final class ServiceConsume {
//aca vamos a crear los consumos sea basico sea con parametros etc o post...
    private ServiceConsume() {}

    public static ServiceConsumeGet basicGet(String resource){
        return new ServiceConsumeGet(resource);
    }
    public static ServiceConsumeGetWithParameters getWithParameters(String resource){
        return new ServiceConsumeGetWithParameters();
    }
}



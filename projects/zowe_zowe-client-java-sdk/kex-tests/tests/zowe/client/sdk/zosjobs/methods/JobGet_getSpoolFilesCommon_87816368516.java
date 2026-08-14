package zowe.client.sdk.zosjobs.methods;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobGet_getSpoolFilesCommon_87816368516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8152;
     Object term8165;

    public JobGet_getSpoolFilesCommon_87816368516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8152 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term8152, term8152.getClass(), "connection", null);
        setField(term8152, term8152.getClass(), "request", null);
        setField(term8152, term8152.getClass(), "url", "llRfwANcVF");
        term8165 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.CommonJobInputData"));
        setField(term8165, term8165.getClass(), "jobId", "sUEeHQTWkA");
        setField(term8165, term8165.getClass(), "jobName", "BDIRCxAWLA");
        setBooleanField(term8165, term8165.getClass(), "stepData", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.CommonJobInputData");
        Object[] args = new Object[1];
        args[0] = term8165;
        callMethod(klass, "getSpoolFilesCommon", argTypes, term8152, args);
    }

};



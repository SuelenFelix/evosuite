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

public class JobGet_getJclCommon_1345175994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5755;
     Object term5768;

    public JobGet_getJclCommon_1345175994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5755 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term5755, term5755.getClass(), "connection", null);
        setField(term5755, term5755.getClass(), "request", null);
        setField(term5755, term5755.getClass(), "url", "lCyLIcSuom");
        term5768 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.CommonJobInputData"));
        setField(term5768, term5768.getClass(), "jobId", "CGOpQSZZwI");
        setField(term5768, term5768.getClass(), "jobName", "ypEdrstygY");
        setBooleanField(term5768, term5768.getClass(), "stepData", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.CommonJobInputData");
        Object[] args = new Object[1];
        args[0] = term5768;
        callMethod(klass, "getJclCommon", argTypes, term5755, args);
    }

};



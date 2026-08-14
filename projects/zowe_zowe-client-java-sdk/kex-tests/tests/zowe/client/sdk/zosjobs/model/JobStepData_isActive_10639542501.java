package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobStepData_isActive_10639542501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3883;

    public JobStepData_isActive_10639542501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3897 = new Long(414749984815662075L);
        term3883 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term3883, term3883.getClass(), "active", false);
        setField(term3883, term3883.getClass(), "smfid", "DSNsTGYXDF");
        setField(term3883, term3883.getClass(), "stepNumber", term3897);
        setField(term3883, term3883.getClass(), "owner", "sQvGcVjdEx");
        setField(term3883, term3883.getClass(), "programName", "rLHAoqXgPh");
        setField(term3883, term3883.getClass(), "stepName", "zUlRdimJtU");
        setField(term3883, term3883.getClass(), "pathName", "vwbEQQNQrx");
        setField(term3883, term3883.getClass(), "procStepName", "xtftXXMbem");
        setField(term3883, term3883.getClass(), "completion", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isActive", argTypes, term3883, args);
    }

};



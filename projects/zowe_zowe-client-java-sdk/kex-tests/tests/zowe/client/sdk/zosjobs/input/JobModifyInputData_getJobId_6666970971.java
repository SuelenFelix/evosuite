package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobModifyInputData_getJobId_6666970971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2523;

    public JobModifyInputData_getJobId_6666970971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2523 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData"));
        setField(term2523, term2523.getClass(), "jobName", "aKnKipADSo");
        setField(term2523, term2523.getClass(), "jobId", "wSQxaModmm");
        setField(term2523, term2523.getClass(), "version", "UlajhuVLaP");
        setField(term2523, term2523.getClass(), "jobClass", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term2523, args);
    }

};



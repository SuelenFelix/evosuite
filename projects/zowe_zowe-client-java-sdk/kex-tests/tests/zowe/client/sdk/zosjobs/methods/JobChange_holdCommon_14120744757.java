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

public class JobChange_holdCommon_14120744757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;
     Object term2538;

    public JobChange_holdCommon_14120744757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobChange"));
        setField(term2537, term2537.getClass(), "connection", null);
        setField(term2537, term2537.getClass(), "request", null);
        term2538 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData"));
        setField(term2538, term2538.getClass(), "jobName", "RYdKCNNMBR");
        setField(term2538, term2538.getClass(), "jobId", "yGtHPyvYiQ");
        setField(term2538, term2538.getClass(), "version", "MvRIxilFMJ");
        setField(term2538, term2538.getClass(), "jobClass", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData");
        Object[] args = new Object[1];
        args[0] = term2538;
        callMethod(klass, "holdCommon", argTypes, term2537, args);
    }

};



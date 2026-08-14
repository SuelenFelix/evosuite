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
import java.lang.Integer;

public class JobMonitorInputData_setWatchDelay_13961580722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8944;
     Object term8945;

    public JobMonitorInputData_setWatchDelay_13961580722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8944 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term8944, term8944.getClass(), "jobId", null);
        setField(term8944, term8944.getClass(), "jobName", null);
        setField(term8944, term8944.getClass(), "watchDelay", null);
        setField(term8944, term8944.getClass(), "jobStatus", null);
        setField(term8944, term8944.getClass(), "attempts", null);
        setField(term8944, term8944.getClass(), "lineLimit", null);
        term8945 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8945;
        callMethod(klass, "setWatchDelay", argTypes, term8944, args);
    }

};



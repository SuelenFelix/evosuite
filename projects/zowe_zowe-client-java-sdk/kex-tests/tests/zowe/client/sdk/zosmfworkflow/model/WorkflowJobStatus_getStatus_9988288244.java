package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowJobStatus_getStatus_9988288244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18891;

    public WorkflowJobStatus_getStatus_9988288244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18891 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term18891, term18891.getClass(), "retcode", "lOIEIGbwPj");
        setField(term18891, term18891.getClass(), "jobName", "TvmWaJWmLY");
        setField(term18891, term18891.getClass(), "status", "TSUdwgvHgU");
        setField(term18891, term18891.getClass(), "owner", "YBQxTjzIrN");
        setField(term18891, term18891.getClass(), "subsystem", "xfqaJVcHGx");
        setField(term18891, term18891.getClass(), "jobClass", "bANxpqKESI");
        setField(term18891, term18891.getClass(), "type", "sgpUSVSuVZ");
        setField(term18891, term18891.getClass(), "jobId", "ZOYhOzwINI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term18891, args);
    }

};



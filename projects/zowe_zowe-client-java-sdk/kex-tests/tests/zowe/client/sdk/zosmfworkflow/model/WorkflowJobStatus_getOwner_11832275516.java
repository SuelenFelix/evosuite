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

public class WorkflowJobStatus_getOwner_11832275516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20134;

    public WorkflowJobStatus_getOwner_11832275516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20134 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term20134, term20134.getClass(), "retcode", null);
        setField(term20134, term20134.getClass(), "jobName", null);
        setField(term20134, term20134.getClass(), "status", null);
        setField(term20134, term20134.getClass(), "owner", null);
        setField(term20134, term20134.getClass(), "subsystem", null);
        setField(term20134, term20134.getClass(), "jobClass", null);
        setField(term20134, term20134.getClass(), "type", null);
        setField(term20134, term20134.getClass(), "jobId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term20134, args);
    }

};



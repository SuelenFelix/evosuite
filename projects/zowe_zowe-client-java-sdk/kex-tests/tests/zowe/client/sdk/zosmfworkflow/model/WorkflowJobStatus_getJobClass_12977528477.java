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

public class WorkflowJobStatus_getJobClass_12977528477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19422;

    public WorkflowJobStatus_getJobClass_12977528477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19422 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19422, term19422.getClass(), "retcode", "bzQSjpIauE");
        setField(term19422, term19422.getClass(), "jobName", "ESQqarFUtp");
        setField(term19422, term19422.getClass(), "status", "TiCRQbKtcf");
        setField(term19422, term19422.getClass(), "owner", "shGEZulpDG");
        setField(term19422, term19422.getClass(), "subsystem", "twDnEqZglX");
        setField(term19422, term19422.getClass(), "jobClass", "TWzZFATLAj");
        setField(term19422, term19422.getClass(), "type", "QjsqHrtVMY");
        setField(term19422, term19422.getClass(), "jobId", "PlQZGGhnZK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobClass", argTypes, term19422, args);
    }

};



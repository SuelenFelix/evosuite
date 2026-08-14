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

public class WorkflowJobStatus_getOwner_1183227555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19068;

    public WorkflowJobStatus_getOwner_1183227555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19068 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19068, term19068.getClass(), "retcode", "sPqjQQfymN");
        setField(term19068, term19068.getClass(), "jobName", "tNKFzflLBd");
        setField(term19068, term19068.getClass(), "status", "xHLlctEoGh");
        setField(term19068, term19068.getClass(), "owner", "aqgUzcnqpE");
        setField(term19068, term19068.getClass(), "subsystem", "yZDlWLIKEp");
        setField(term19068, term19068.getClass(), "jobClass", "dAEiXUxDrI");
        setField(term19068, term19068.getClass(), "type", "AgQWngzXPH");
        setField(term19068, term19068.getClass(), "jobId", "EZJmAIzdHM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term19068, args);
    }

};



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

public class WorkflowJobStatus_getSubsystem_18097347916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19245;

    public WorkflowJobStatus_getSubsystem_18097347916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19245 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19245, term19245.getClass(), "retcode", "LAOkeXXkDr");
        setField(term19245, term19245.getClass(), "jobName", "YkZqFgrgVM");
        setField(term19245, term19245.getClass(), "status", "QEJBgSNviH");
        setField(term19245, term19245.getClass(), "owner", "bjigisSVNp");
        setField(term19245, term19245.getClass(), "subsystem", "yJCCaWqQuK");
        setField(term19245, term19245.getClass(), "jobClass", "tgBNqkdndl");
        setField(term19245, term19245.getClass(), "type", "GXKhRJLVFZ");
        setField(term19245, term19245.getClass(), "jobId", "qDflhZTJjR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubsystem", argTypes, term19245, args);
    }

};



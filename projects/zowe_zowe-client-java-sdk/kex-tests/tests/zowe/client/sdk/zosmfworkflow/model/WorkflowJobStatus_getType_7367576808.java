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

public class WorkflowJobStatus_getType_7367576808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19599;

    public WorkflowJobStatus_getType_7367576808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19599 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19599, term19599.getClass(), "retcode", "sTtLCWDEPO");
        setField(term19599, term19599.getClass(), "jobName", "UGMtNRjhnC");
        setField(term19599, term19599.getClass(), "status", "oTnPmmIphJ");
        setField(term19599, term19599.getClass(), "owner", "vTgJolwQXF");
        setField(term19599, term19599.getClass(), "subsystem", "QuNSfeKtAH");
        setField(term19599, term19599.getClass(), "jobClass", "vFhRdscfFA");
        setField(term19599, term19599.getClass(), "type", "ZmfocrvaII");
        setField(term19599, term19599.getClass(), "jobId", "LTbQXrGKuA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term19599, args);
    }

};



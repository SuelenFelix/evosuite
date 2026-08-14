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

public class WorkflowJobStatus_getJobId_5018369269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19776;

    public WorkflowJobStatus_getJobId_5018369269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19776 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19776, term19776.getClass(), "retcode", "gzmGmDALUv");
        setField(term19776, term19776.getClass(), "jobName", "ZRoptBRTDM");
        setField(term19776, term19776.getClass(), "status", "vVVFChfeBQ");
        setField(term19776, term19776.getClass(), "owner", "aASfcqfBbh");
        setField(term19776, term19776.getClass(), "subsystem", "DwpOIkpRFT");
        setField(term19776, term19776.getClass(), "jobClass", "LPlTDoLrUy");
        setField(term19776, term19776.getClass(), "type", "XETimBHIKG");
        setField(term19776, term19776.getClass(), "jobId", "nOKVZSyfbZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term19776, args);
    }

};



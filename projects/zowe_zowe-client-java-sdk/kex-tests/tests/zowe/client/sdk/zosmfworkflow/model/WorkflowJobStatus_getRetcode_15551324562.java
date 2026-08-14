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

public class WorkflowJobStatus_getRetcode_15551324562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18537;

    public WorkflowJobStatus_getRetcode_15551324562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18537 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term18537, term18537.getClass(), "retcode", "AaxnITALtd");
        setField(term18537, term18537.getClass(), "jobName", "RdnRRpWglh");
        setField(term18537, term18537.getClass(), "status", "YcXTXuOFYV");
        setField(term18537, term18537.getClass(), "owner", "HGhIlMCaKM");
        setField(term18537, term18537.getClass(), "subsystem", "pPxivEPfHY");
        setField(term18537, term18537.getClass(), "jobClass", "BiitfiJmRW");
        setField(term18537, term18537.getClass(), "type", "ILHarzuGbn");
        setField(term18537, term18537.getClass(), "jobId", "uNGHHAwCFL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetcode", argTypes, term18537, args);
    }

};



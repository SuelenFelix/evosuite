package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Job_orEmpty_213761340427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28372;

    public Job_orEmpty_213761340427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28372 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28372, term28372.getClass(), "jobId", null);
        setField(term28372, term28372.getClass(), "jobName", null);
        setField(term28372, term28372.getClass(), "subSystem", null);
        setField(term28372, term28372.getClass(), "owner", null);
        setField(term28372, term28372.getClass(), "status", null);
        setField(term28372, term28372.getClass(), "type", null);
        setField(term28372, term28372.getClass(), "classs", null);
        setField(term28372, term28372.getClass(), "retCode", null);
        setField(term28372, term28372.getClass(), "stepData", null);
        setField(term28372, term28372.getClass(), "url", null);
        setField(term28372, term28372.getClass(), "filesUrl", null);
        setField(term28372, term28372.getClass(), "jobCorrelator", null);
        setField(term28372, term28372.getClass(), "phase", null);
        setField(term28372, term28372.getClass(), "phaseName", null);
        setField(term28372, term28372.getClass(), "execSystem", null);
        setField(term28372, term28372.getClass(), "execMember", null);
        setField(term28372, term28372.getClass(), "execSubmitted", null);
        setField(term28372, term28372.getClass(), "execStarted", null);
        setField(term28372, term28372.getClass(), "execEnded", null);
        setField(term28372, term28372.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "orEmpty", argTypes, term28372, args);
    }

};



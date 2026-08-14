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

public class Job_Builder_stepData_139120280231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53161;

    public Job_Builder_stepData_139120280231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53161 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        setField(term53161, term53161.getClass(), "jobId", null);
        setField(term53161, term53161.getClass(), "jobName", null);
        setField(term53161, term53161.getClass(), "subSystem", null);
        setField(term53161, term53161.getClass(), "owner", null);
        setField(term53161, term53161.getClass(), "status", null);
        setField(term53161, term53161.getClass(), "type", null);
        setField(term53161, term53161.getClass(), "classs", null);
        setField(term53161, term53161.getClass(), "retCode", null);
        setField(term53161, term53161.getClass(), "stepData", null);
        setField(term53161, term53161.getClass(), "url", null);
        setField(term53161, term53161.getClass(), "filesUrl", null);
        setField(term53161, term53161.getClass(), "jobCorrelator", null);
        setField(term53161, term53161.getClass(), "phase", null);
        setField(term53161, term53161.getClass(), "phaseName", null);
        setField(term53161, term53161.getClass(), "execSystem", null);
        setField(term53161, term53161.getClass(), "execMember", null);
        setField(term53161, term53161.getClass(), "execSubmitted", null);
        setField(term53161, term53161.getClass(), "execStarted", null);
        setField(term53161, term53161.getClass(), "execEnded", null);
        setField(term53161, term53161.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "stepData", argTypes, term53161, args);
    }

};



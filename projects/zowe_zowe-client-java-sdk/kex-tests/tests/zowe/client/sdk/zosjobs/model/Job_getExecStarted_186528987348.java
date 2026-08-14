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

public class Job_getExecStarted_186528987348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28392;

    public Job_getExecStarted_186528987348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28392 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28392, term28392.getClass(), "jobId", null);
        setField(term28392, term28392.getClass(), "jobName", null);
        setField(term28392, term28392.getClass(), "subSystem", null);
        setField(term28392, term28392.getClass(), "owner", null);
        setField(term28392, term28392.getClass(), "status", null);
        setField(term28392, term28392.getClass(), "type", null);
        setField(term28392, term28392.getClass(), "classs", null);
        setField(term28392, term28392.getClass(), "retCode", null);
        setField(term28392, term28392.getClass(), "stepData", null);
        setField(term28392, term28392.getClass(), "url", null);
        setField(term28392, term28392.getClass(), "filesUrl", null);
        setField(term28392, term28392.getClass(), "jobCorrelator", null);
        setField(term28392, term28392.getClass(), "phase", null);
        setField(term28392, term28392.getClass(), "phaseName", null);
        setField(term28392, term28392.getClass(), "execSystem", null);
        setField(term28392, term28392.getClass(), "execMember", null);
        setField(term28392, term28392.getClass(), "execSubmitted", null);
        setField(term28392, term28392.getClass(), "execStarted", null);
        setField(term28392, term28392.getClass(), "execEnded", null);
        setField(term28392, term28392.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecStarted", argTypes, term28392, args);
    }

};



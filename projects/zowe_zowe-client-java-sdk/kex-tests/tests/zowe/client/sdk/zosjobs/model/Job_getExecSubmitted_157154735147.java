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

public class Job_getExecSubmitted_157154735147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28391;

    public Job_getExecSubmitted_157154735147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28391 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28391, term28391.getClass(), "jobId", null);
        setField(term28391, term28391.getClass(), "jobName", null);
        setField(term28391, term28391.getClass(), "subSystem", null);
        setField(term28391, term28391.getClass(), "owner", null);
        setField(term28391, term28391.getClass(), "status", null);
        setField(term28391, term28391.getClass(), "type", null);
        setField(term28391, term28391.getClass(), "classs", null);
        setField(term28391, term28391.getClass(), "retCode", null);
        setField(term28391, term28391.getClass(), "stepData", null);
        setField(term28391, term28391.getClass(), "url", null);
        setField(term28391, term28391.getClass(), "filesUrl", null);
        setField(term28391, term28391.getClass(), "jobCorrelator", null);
        setField(term28391, term28391.getClass(), "phase", null);
        setField(term28391, term28391.getClass(), "phaseName", null);
        setField(term28391, term28391.getClass(), "execSystem", null);
        setField(term28391, term28391.getClass(), "execMember", null);
        setField(term28391, term28391.getClass(), "execSubmitted", null);
        setField(term28391, term28391.getClass(), "execStarted", null);
        setField(term28391, term28391.getClass(), "execEnded", null);
        setField(term28391, term28391.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecSubmitted", argTypes, term28391, args);
    }

};



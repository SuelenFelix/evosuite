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

public class Job_Builder_jobCorrelator_108413507034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53164;

    public Job_Builder_jobCorrelator_108413507034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53164 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        setField(term53164, term53164.getClass(), "jobId", null);
        setField(term53164, term53164.getClass(), "jobName", null);
        setField(term53164, term53164.getClass(), "subSystem", null);
        setField(term53164, term53164.getClass(), "owner", null);
        setField(term53164, term53164.getClass(), "status", null);
        setField(term53164, term53164.getClass(), "type", null);
        setField(term53164, term53164.getClass(), "classs", null);
        setField(term53164, term53164.getClass(), "retCode", null);
        setField(term53164, term53164.getClass(), "stepData", null);
        setField(term53164, term53164.getClass(), "url", null);
        setField(term53164, term53164.getClass(), "filesUrl", null);
        setField(term53164, term53164.getClass(), "jobCorrelator", null);
        setField(term53164, term53164.getClass(), "phase", null);
        setField(term53164, term53164.getClass(), "phaseName", null);
        setField(term53164, term53164.getClass(), "execSystem", null);
        setField(term53164, term53164.getClass(), "execMember", null);
        setField(term53164, term53164.getClass(), "execSubmitted", null);
        setField(term53164, term53164.getClass(), "execStarted", null);
        setField(term53164, term53164.getClass(), "execEnded", null);
        setField(term53164, term53164.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "jobCorrelator", argTypes, term53164, args);
    }

};



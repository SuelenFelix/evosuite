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

public class Job_Builder_execStarted_69717381240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53170;

    public Job_Builder_execStarted_69717381240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53170 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        setField(term53170, term53170.getClass(), "jobId", null);
        setField(term53170, term53170.getClass(), "jobName", null);
        setField(term53170, term53170.getClass(), "subSystem", null);
        setField(term53170, term53170.getClass(), "owner", null);
        setField(term53170, term53170.getClass(), "status", null);
        setField(term53170, term53170.getClass(), "type", null);
        setField(term53170, term53170.getClass(), "classs", null);
        setField(term53170, term53170.getClass(), "retCode", null);
        setField(term53170, term53170.getClass(), "stepData", null);
        setField(term53170, term53170.getClass(), "url", null);
        setField(term53170, term53170.getClass(), "filesUrl", null);
        setField(term53170, term53170.getClass(), "jobCorrelator", null);
        setField(term53170, term53170.getClass(), "phase", null);
        setField(term53170, term53170.getClass(), "phaseName", null);
        setField(term53170, term53170.getClass(), "execSystem", null);
        setField(term53170, term53170.getClass(), "execMember", null);
        setField(term53170, term53170.getClass(), "execSubmitted", null);
        setField(term53170, term53170.getClass(), "execStarted", null);
        setField(term53170, term53170.getClass(), "execEnded", null);
        setField(term53170, term53170.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "execStarted", argTypes, term53170, args);
    }

};



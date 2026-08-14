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

public class Job_Builder_jobId_166825425223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53153;

    public Job_Builder_jobId_166825425223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53153 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        setField(term53153, term53153.getClass(), "jobId", null);
        setField(term53153, term53153.getClass(), "jobName", null);
        setField(term53153, term53153.getClass(), "subSystem", null);
        setField(term53153, term53153.getClass(), "owner", null);
        setField(term53153, term53153.getClass(), "status", null);
        setField(term53153, term53153.getClass(), "type", null);
        setField(term53153, term53153.getClass(), "classs", null);
        setField(term53153, term53153.getClass(), "retCode", null);
        setField(term53153, term53153.getClass(), "stepData", null);
        setField(term53153, term53153.getClass(), "url", null);
        setField(term53153, term53153.getClass(), "filesUrl", null);
        setField(term53153, term53153.getClass(), "jobCorrelator", null);
        setField(term53153, term53153.getClass(), "phase", null);
        setField(term53153, term53153.getClass(), "phaseName", null);
        setField(term53153, term53153.getClass(), "execSystem", null);
        setField(term53153, term53153.getClass(), "execMember", null);
        setField(term53153, term53153.getClass(), "execSubmitted", null);
        setField(term53153, term53153.getClass(), "execStarted", null);
        setField(term53153, term53153.getClass(), "execEnded", null);
        setField(term53153, term53153.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "jobId", argTypes, term53153, args);
    }

};



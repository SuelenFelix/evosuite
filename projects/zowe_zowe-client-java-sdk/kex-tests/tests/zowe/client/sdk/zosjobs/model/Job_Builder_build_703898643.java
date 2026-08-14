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

public class Job_Builder_build_703898643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53173;

    public Job_Builder_build_703898643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53173 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        setField(term53173, term53173.getClass(), "jobId", null);
        setField(term53173, term53173.getClass(), "jobName", null);
        setField(term53173, term53173.getClass(), "subSystem", null);
        setField(term53173, term53173.getClass(), "owner", null);
        setField(term53173, term53173.getClass(), "status", null);
        setField(term53173, term53173.getClass(), "type", null);
        setField(term53173, term53173.getClass(), "classs", null);
        setField(term53173, term53173.getClass(), "retCode", null);
        setField(term53173, term53173.getClass(), "stepData", null);
        setField(term53173, term53173.getClass(), "url", null);
        setField(term53173, term53173.getClass(), "filesUrl", null);
        setField(term53173, term53173.getClass(), "jobCorrelator", null);
        setField(term53173, term53173.getClass(), "phase", null);
        setField(term53173, term53173.getClass(), "phaseName", null);
        setField(term53173, term53173.getClass(), "execSystem", null);
        setField(term53173, term53173.getClass(), "execMember", null);
        setField(term53173, term53173.getClass(), "execSubmitted", null);
        setField(term53173, term53173.getClass(), "execStarted", null);
        setField(term53173, term53173.getClass(), "execEnded", null);
        setField(term53173, term53173.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term53173, args);
    }

};



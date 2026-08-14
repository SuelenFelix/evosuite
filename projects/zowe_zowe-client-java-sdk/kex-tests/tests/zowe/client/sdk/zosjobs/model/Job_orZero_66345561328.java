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

public class Job_orZero_66345561328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28373;

    public Job_orZero_66345561328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28373 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28373, term28373.getClass(), "jobId", null);
        setField(term28373, term28373.getClass(), "jobName", null);
        setField(term28373, term28373.getClass(), "subSystem", null);
        setField(term28373, term28373.getClass(), "owner", null);
        setField(term28373, term28373.getClass(), "status", null);
        setField(term28373, term28373.getClass(), "type", null);
        setField(term28373, term28373.getClass(), "classs", null);
        setField(term28373, term28373.getClass(), "retCode", null);
        setField(term28373, term28373.getClass(), "stepData", null);
        setField(term28373, term28373.getClass(), "url", null);
        setField(term28373, term28373.getClass(), "filesUrl", null);
        setField(term28373, term28373.getClass(), "jobCorrelator", null);
        setField(term28373, term28373.getClass(), "phase", null);
        setField(term28373, term28373.getClass(), "phaseName", null);
        setField(term28373, term28373.getClass(), "execSystem", null);
        setField(term28373, term28373.getClass(), "execMember", null);
        setField(term28373, term28373.getClass(), "execSubmitted", null);
        setField(term28373, term28373.getClass(), "execStarted", null);
        setField(term28373, term28373.getClass(), "execEnded", null);
        setField(term28373, term28373.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "orZero", argTypes, term28373, args);
    }

};



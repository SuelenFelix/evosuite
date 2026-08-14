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

public class Job_getPhaseName_182160906144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28388;

    public Job_getPhaseName_182160906144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28388 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28388, term28388.getClass(), "jobId", null);
        setField(term28388, term28388.getClass(), "jobName", null);
        setField(term28388, term28388.getClass(), "subSystem", null);
        setField(term28388, term28388.getClass(), "owner", null);
        setField(term28388, term28388.getClass(), "status", null);
        setField(term28388, term28388.getClass(), "type", null);
        setField(term28388, term28388.getClass(), "classs", null);
        setField(term28388, term28388.getClass(), "retCode", null);
        setField(term28388, term28388.getClass(), "stepData", null);
        setField(term28388, term28388.getClass(), "url", null);
        setField(term28388, term28388.getClass(), "filesUrl", null);
        setField(term28388, term28388.getClass(), "jobCorrelator", null);
        setField(term28388, term28388.getClass(), "phase", null);
        setField(term28388, term28388.getClass(), "phaseName", null);
        setField(term28388, term28388.getClass(), "execSystem", null);
        setField(term28388, term28388.getClass(), "execMember", null);
        setField(term28388, term28388.getClass(), "execSubmitted", null);
        setField(term28388, term28388.getClass(), "execStarted", null);
        setField(term28388, term28388.getClass(), "execEnded", null);
        setField(term28388, term28388.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhaseName", argTypes, term28388, args);
    }

};



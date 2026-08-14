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

public class Job_getType_55688400536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28380;

    public Job_getType_55688400536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28380 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        setField(term28380, term28380.getClass(), "jobId", null);
        setField(term28380, term28380.getClass(), "jobName", null);
        setField(term28380, term28380.getClass(), "subSystem", null);
        setField(term28380, term28380.getClass(), "owner", null);
        setField(term28380, term28380.getClass(), "status", null);
        setField(term28380, term28380.getClass(), "type", null);
        setField(term28380, term28380.getClass(), "classs", null);
        setField(term28380, term28380.getClass(), "retCode", null);
        setField(term28380, term28380.getClass(), "stepData", null);
        setField(term28380, term28380.getClass(), "url", null);
        setField(term28380, term28380.getClass(), "filesUrl", null);
        setField(term28380, term28380.getClass(), "jobCorrelator", null);
        setField(term28380, term28380.getClass(), "phase", null);
        setField(term28380, term28380.getClass(), "phaseName", null);
        setField(term28380, term28380.getClass(), "execSystem", null);
        setField(term28380, term28380.getClass(), "execMember", null);
        setField(term28380, term28380.getClass(), "execSubmitted", null);
        setField(term28380, term28380.getClass(), "execStarted", null);
        setField(term28380, term28380.getClass(), "execEnded", null);
        setField(term28380, term28380.getClass(), "reasonNotRunning", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term28380, args);
    }

};



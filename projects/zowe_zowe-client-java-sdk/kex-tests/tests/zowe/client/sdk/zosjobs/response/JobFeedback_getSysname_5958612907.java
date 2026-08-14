package zowe.client.sdk.zosjobs.response;

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
import static zowe.client.sdk.zosjobs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobFeedback_getSysname_5958612907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348;

    public JobFeedback_getSysname_5958612907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1348 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term1348, term1348.getClass(), "jobId", "dEnhdmILtU");
        setField(term1348, term1348.getClass(), "jobName", "hoicvmsovO");
        setField(term1348, term1348.getClass(), "originalJobId", "eqJfYWRaEL");
        setField(term1348, term1348.getClass(), "owner", "fhkbdRViHi");
        setField(term1348, term1348.getClass(), "member", "uWHnvSvaPl");
        setField(term1348, term1348.getClass(), "sysname", "kBdSllIBVz");
        setField(term1348, term1348.getClass(), "jobCorrelator", "TJmVBGfTML");
        setField(term1348, term1348.getClass(), "status", "tPlsykYBqO");
        setField(term1348, term1348.getClass(), "internalCode", "bLPjGVBhlX");
        setField(term1348, term1348.getClass(), "message", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSysname", argTypes, term1348, args);
    }

};



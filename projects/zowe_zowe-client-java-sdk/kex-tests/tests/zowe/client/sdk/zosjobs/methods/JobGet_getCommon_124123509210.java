package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class JobGet_getCommon_124123509210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6049;
     Object term6062;

    public JobGet_getCommon_124123509210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6049 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term6049, term6049.getClass(), "connection", null);
        setField(term6049, term6049.getClass(), "request", null);
        setField(term6049, term6049.getClass(), "url", "jDmhBrIoDa");
        Integer term6087 = new Integer(568599855);
        term6062 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData"));
        setField(term6062, term6062.getClass(), "owner", "SPtPatHeOm");
        setField(term6062, term6062.getClass(), "prefix", "ywmcuThdfL");
        setField(term6062, term6062.getClass(), "maxJobs", term6087);
        setField(term6062, term6062.getClass(), "jobId", "GBOEuByOfr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData");
        Object[] args = new Object[1];
        args[0] = term6062;
        callMethod(klass, "getCommon", argTypes, term6049, args);
    }

};



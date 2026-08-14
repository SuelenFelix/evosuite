package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class JobGetInputData_Builder_maxJobs_16790174233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2307;
     Object term2328;

    public JobGetInputData_Builder_maxJobs_16790174233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2314 = new Integer(1000);
        term2307 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData$Builder"));
        setField(term2307, term2307.getClass(), "owner", "*");
        setField(term2307, term2307.getClass(), "prefix", "*");
        setField(term2307, term2307.getClass(), "maxJobs", term2314);
        setField(term2307, term2307.getClass(), "jobId", "dWRymuLBtr");
        term2328 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2328;
        callMethod(klass, "maxJobs", argTypes, term2307, args);
    }

};



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

public class JobGetInputData_toString_160778435411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;

    public JobGetInputData_toString_160778435411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3355 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData"));
        setField(term3355, term3355.getClass(), "owner", null);
        setField(term3355, term3355.getClass(), "prefix", null);
        setField(term3355, term3355.getClass(), "maxJobs", null);
        setField(term3355, term3355.getClass(), "jobId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3355, args);
    }

};



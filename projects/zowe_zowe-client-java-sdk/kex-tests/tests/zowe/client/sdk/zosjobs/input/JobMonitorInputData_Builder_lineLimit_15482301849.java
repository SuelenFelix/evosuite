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

public class JobMonitorInputData_Builder_lineLimit_15482301849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2223;
     Object term2224;

    public JobMonitorInputData_Builder_lineLimit_15482301849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2223 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term2223, term2223.getClass(), "jobId", null);
        setField(term2223, term2223.getClass(), "jobName", null);
        setField(term2223, term2223.getClass(), "watchDelay", null);
        setField(term2223, term2223.getClass(), "jobStatus", null);
        setField(term2223, term2223.getClass(), "attempts", null);
        setField(term2223, term2223.getClass(), "lineLimit", null);
        term2224 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2224;
        callMethod(klass, "lineLimit", argTypes, term2223, args);
    }

};



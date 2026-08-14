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
import java.lang.String;
import java.lang.Object;

public class JobMonitorInputData_getJobName_3849904254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6240;

    public JobMonitorInputData_getJobName_3849904254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6265 = new Integer(-226514366);
        Class<? extends Object> term6302 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term6301 = ((Class) term6302).getDeclaredField((String) "ACTIVE");
        ((Field) term6301).setAccessible(true);
        Object enum10 = ((Field) term6301).get((Object) null);
        Integer term6277 = new Integer(1193880199);
        Integer term6279 = new Integer(-1087774327);
        term6240 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term6240, term6240.getClass(), "jobId", "tRxZafjqIx");
        setField(term6240, term6240.getClass(), "jobName", "DhjNLmRMCu");
        setField(term6240, term6240.getClass(), "watchDelay", term6265);
        setField(term6240, term6240.getClass(), "jobStatus", enum10);
        setField(term6240, term6240.getClass(), "attempts", term6277);
        setField(term6240, term6240.getClass(), "lineLimit", term6279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term6240, args);
    }

};



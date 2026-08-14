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

public class JobMonitorInputData_getJobStatus_8205017745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6546;

    public JobMonitorInputData_getJobStatus_8205017745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6571 = new Integer(-1530420153);
        Class<? extends Object> term6607 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term6606 = ((Class) term6607).getDeclaredField((String) "INPUT");
        ((Field) term6606).setAccessible(true);
        Object enum11 = ((Field) term6606).get((Object) null);
        Integer term6582 = new Integer(-469968304);
        Integer term6584 = new Integer(-1145578966);
        term6546 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term6546, term6546.getClass(), "jobId", "PgPzMSEjjX");
        setField(term6546, term6546.getClass(), "jobName", "wzsPSPcRdj");
        setField(term6546, term6546.getClass(), "watchDelay", term6571);
        setField(term6546, term6546.getClass(), "jobStatus", enum11);
        setField(term6546, term6546.getClass(), "attempts", term6582);
        setField(term6546, term6546.getClass(), "lineLimit", term6584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobStatus", argTypes, term6546, args);
    }

};



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

public class JobMonitorInputData_setJobStatus_10469006936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6848;
     Object enum13;

    public JobMonitorInputData_setJobStatus_10469006936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6873 = new Integer(679763016);
        Class<? extends Object> term6919 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term6918 = ((Class) term6919).getDeclaredField((String) "ACTIVE");
        ((Field) term6918).setAccessible(true);
        Object enum12 = ((Field) term6918).get((Object) null);
        Integer term6885 = new Integer(1962444399);
        Integer term6887 = new Integer(767834723);
        term6848 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term6848, term6848.getClass(), "jobId", "kGMQdqJYyB");
        setField(term6848, term6848.getClass(), "jobName", "XJJNClzHRf");
        setField(term6848, term6848.getClass(), "watchDelay", term6873);
        setField(term6848, term6848.getClass(), "jobStatus", enum12);
        setField(term6848, term6848.getClass(), "attempts", term6885);
        setField(term6848, term6848.getClass(), "lineLimit", term6887);
        Class<? extends Object> term7164 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term7163 = ((Class) term7164).getDeclaredField((String) "INPUT");
        ((Field) term7163).setAccessible(true);
        enum13 = ((Field) term7163).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "setJobStatus", argTypes, term6848, args);
    }

};



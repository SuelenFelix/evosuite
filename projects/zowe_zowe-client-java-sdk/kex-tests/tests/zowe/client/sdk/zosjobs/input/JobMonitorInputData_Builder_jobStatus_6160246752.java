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

public class JobMonitorInputData_Builder_jobStatus_6160246752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;
     Object enum2;

    public JobMonitorInputData_Builder_jobStatus_6160246752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term765 = new Integer(391863371);
        Class<? extends Object> term812 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term811 = ((Class) term812).getDeclaredField((String) "OUTPUT");
        ((Field) term811).setAccessible(true);
        Object enum1 = ((Field) term811).get((Object) null);
        Integer term777 = new Integer(-1922583790);
        Integer term779 = new Integer(-616727354);
        term740 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term740, term740.getClass(), "jobId", "hNxWaHcfhY");
        setField(term740, term740.getClass(), "jobName", "RkybSrpybU");
        setField(term740, term740.getClass(), "watchDelay", term765);
        setField(term740, term740.getClass(), "jobStatus", enum1);
        setField(term740, term740.getClass(), "attempts", term777);
        setField(term740, term740.getClass(), "lineLimit", term779);
        Class<? extends Object> term1057 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term1056 = ((Class) term1057).getDeclaredField((String) "ACTIVE");
        ((Field) term1056).setAccessible(true);
        enum2 = ((Field) term1056).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "jobStatus", argTypes, term740, args);
    }

};



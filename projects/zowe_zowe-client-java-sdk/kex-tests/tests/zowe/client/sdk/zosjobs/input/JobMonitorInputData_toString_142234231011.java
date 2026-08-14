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

public class JobMonitorInputData_toString_142234231011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8629;

    public JobMonitorInputData_toString_142234231011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8654 = new Integer(-1048298087);
        Class<? extends Object> term8690 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term8689 = ((Class) term8690).getDeclaredField((String) "INPUT");
        ((Field) term8689).setAccessible(true);
        Object enum18 = ((Field) term8689).get((Object) null);
        Integer term8665 = new Integer(292681826);
        Integer term8667 = new Integer(458147407);
        term8629 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term8629, term8629.getClass(), "jobId", "AZdLeSugwv");
        setField(term8629, term8629.getClass(), "jobName", "RMsXuyzKJV");
        setField(term8629, term8629.getClass(), "watchDelay", term8654);
        setField(term8629, term8629.getClass(), "jobStatus", enum18);
        setField(term8629, term8629.getClass(), "attempts", term8665);
        setField(term8629, term8629.getClass(), "lineLimit", term8667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8629, args);
    }

};



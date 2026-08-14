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
import java.lang.String;
import java.lang.Object;

public class JobMonitor_checkStatus_7393468845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12339;
     Object term12343;

    public JobMonitor_checkStatus_7393468845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12339 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term12339, term12339.getClass(), "connection", null);
        setIntField(term12339, term12339.getClass(), "attempts", -1339778481);
        setIntField(term12339, term12339.getClass(), "watchDelay", 1725571209);
        setIntField(term12339, term12339.getClass(), "lineLimit", -522618178);
        Integer term12368 = new Integer(-1922583790);
        Class<? extends Object> term12405 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term12404 = ((Class) term12405).getDeclaredField((String) "OUTPUT");
        ((Field) term12404).setAccessible(true);
        Object enum1 = ((Field) term12404).get((Object) null);
        Integer term12380 = new Integer(-616727354);
        Integer term12382 = new Integer(-1955890973);
        term12343 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term12343, term12343.getClass(), "jobId", "jcWKHRWhyj");
        setField(term12343, term12343.getClass(), "jobName", "nrQjODRMLD");
        setField(term12343, term12343.getClass(), "watchDelay", term12368);
        setField(term12343, term12343.getClass(), "jobStatus", enum1);
        setField(term12343, term12343.getClass(), "attempts", term12380);
        setField(term12343, term12343.getClass(), "lineLimit", term12382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Object[] args = new Object[1];
        args[0] = term12343;
        callMethod(klass, "checkStatus", argTypes, term12339, args);
    }

};



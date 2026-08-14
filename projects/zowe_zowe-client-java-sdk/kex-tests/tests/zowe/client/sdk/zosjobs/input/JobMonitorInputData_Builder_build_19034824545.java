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

public class JobMonitorInputData_Builder_build_19034824545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1913;

    public JobMonitorInputData_Builder_build_19034824545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1938 = new Integer(1134449235);
        Class<? extends Object> term1975 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term1974 = ((Class) term1975).getDeclaredField((String) "ACTIVE");
        ((Field) term1974).setAccessible(true);
        Object enum5 = ((Field) term1974).get((Object) null);
        Integer term1950 = new Integer(-883034806);
        Integer term1952 = new Integer(1585847225);
        term1913 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term1913, term1913.getClass(), "jobId", "flxyYxBRtu");
        setField(term1913, term1913.getClass(), "jobName", "OclPbYPkcH");
        setField(term1913, term1913.getClass(), "watchDelay", term1938);
        setField(term1913, term1913.getClass(), "jobStatus", enum5);
        setField(term1913, term1913.getClass(), "attempts", term1950);
        setField(term1913, term1913.getClass(), "lineLimit", term1952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1913, args);
    }

};



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

public class JobMonitorInputData_Builder_watchDelay_8690095894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609;
     Object term1649;

    public JobMonitorInputData_Builder_watchDelay_8690095894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1634 = new Integer(-1339778481);
        Class<? extends Object> term1672 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term1671 = ((Class) term1672).getDeclaredField((String) "INPUT");
        ((Field) term1671).setAccessible(true);
        Object enum4 = ((Field) term1671).get((Object) null);
        Integer term1645 = new Integer(1725571209);
        Integer term1647 = new Integer(-522618178);
        term1609 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term1609, term1609.getClass(), "jobId", "BYqFIqCKAV");
        setField(term1609, term1609.getClass(), "jobName", "vrQLuWIDJX");
        setField(term1609, term1609.getClass(), "watchDelay", term1634);
        setField(term1609, term1609.getClass(), "jobStatus", enum4);
        setField(term1609, term1609.getClass(), "attempts", term1645);
        setField(term1609, term1609.getClass(), "lineLimit", term1647);
        term1649 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1649;
        callMethod(klass, "watchDelay", argTypes, term1609, args);
    }

};



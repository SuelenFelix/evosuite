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

public class JobMonitorInputData_getLineLimit_10618842777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7405;

    public JobMonitorInputData_getLineLimit_10618842777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7430 = new Integer(-602026508);
        Class<? extends Object> term7467 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term7466 = ((Class) term7467).getDeclaredField((String) "OUTPUT");
        ((Field) term7466).setAccessible(true);
        Object enum14 = ((Field) term7466).get((Object) null);
        Integer term7442 = new Integer(-157887805);
        Integer term7444 = new Integer(1876565163);
        term7405 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term7405, term7405.getClass(), "jobId", "HDaezxQfQR");
        setField(term7405, term7405.getClass(), "jobName", "iikZEapDlu");
        setField(term7405, term7405.getClass(), "watchDelay", term7430);
        setField(term7405, term7405.getClass(), "jobStatus", enum14);
        setField(term7405, term7405.getClass(), "attempts", term7442);
        setField(term7405, term7405.getClass(), "lineLimit", term7444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLineLimit", argTypes, term7405, args);
    }

};



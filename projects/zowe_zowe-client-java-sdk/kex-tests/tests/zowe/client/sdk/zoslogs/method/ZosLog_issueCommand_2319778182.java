package zowe.client.sdk.zoslogs.method;

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
import static zowe.client.sdk.zoslogs.method.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZosLog_issueCommand_2319778182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public ZosLog_issueCommand_2319778182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("zowe.client.sdk.zoslogs.method.ZosLog"));
        setField(term1, term1.getClass(), "connection", null);
        setField(term1, term1.getClass(), "request", null);
        Class<? extends Object> term117 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term116 = ((Class) term117).getDeclaredField((String) "OPERLOG");
        ((Field) term116).setAccessible(true);
        Object enum0 = ((Field) term116).get((Object) null);
        Class<? extends Object> term397 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term396 = ((Class) term397).getDeclaredField((String) "FORWARD");
        ((Field) term396).setAccessible(true);
        Object enum1 = ((Field) term396).get((Object) null);
        term2 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term2, term2.getClass(), "startTime", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "hardCopy", enum0);
        setField(term2, term2.getClass(), "direction", enum1);
        setField(term2, term2.getClass(), "timeRange", "sjlJAEtRrb");
        setBooleanField(term2, term2.getClass(), "processResponses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.method.ZosLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "issueCommand", argTypes, term1, args);
    }

};



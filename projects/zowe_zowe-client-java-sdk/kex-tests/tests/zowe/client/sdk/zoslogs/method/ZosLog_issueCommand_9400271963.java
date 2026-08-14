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
import java.lang.Integer;

public class ZosLog_issueCommand_9400271963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;
     Object term650;
     Object term716;

    public ZosLog_issueCommand_9400271963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649 = newInstance(Class.forName("zowe.client.sdk.zoslogs.method.ZosLog"));
        setField(term649, term649.getClass(), "connection", null);
        setField(term649, term649.getClass(), "request", null);
        Class<? extends Object> term729 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term728 = ((Class) term729).getDeclaredField((String) "OPERLOG");
        ((Field) term728).setAccessible(true);
        Object enum2 = ((Field) term728).get((Object) null);
        Class<? extends Object> term967 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term966 = ((Class) term967).getDeclaredField((String) "FORWARD");
        ((Field) term966).setAccessible(true);
        Object enum3 = ((Field) term966).get((Object) null);
        term650 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term650, term650.getClass(), "startTime", "MuLcgQHgqz");
        setField(term650, term650.getClass(), "hardCopy", enum2);
        setField(term650, term650.getClass(), "direction", enum3);
        setField(term650, term650.getClass(), "timeRange", "xxtlPwDYFs");
        setBooleanField(term650, term650.getClass(), "processResponses", false);
        term716 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.method.ZosLog");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term650;
        args[1] = term716;
        callMethod(klass, "issueCommand", argTypes, term649, args);
    }

};



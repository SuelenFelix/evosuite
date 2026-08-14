package zowe.client.sdk.zoslogs.input;

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
import static zowe.client.sdk.zoslogs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZosLogInputData_getTimeRange_21360247354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5824;

    public ZosLogInputData_getTimeRange_21360247354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5901 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term5900 = ((Class) term5901).getDeclaredField((String) "SYSLOG");
        ((Field) term5900).setAccessible(true);
        Object enum20 = ((Field) term5900).get((Object) null);
        Class<? extends Object> term6136 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term6135 = ((Class) term6136).getDeclaredField((String) "BACKWARD");
        ((Field) term6135).setAccessible(true);
        Object enum21 = ((Field) term6135).get((Object) null);
        term5824 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term5824, term5824.getClass(), "startTime", "xOEqzGAmDU");
        setField(term5824, term5824.getClass(), "hardCopy", enum20);
        setField(term5824, term5824.getClass(), "direction", enum21);
        setField(term5824, term5824.getClass(), "timeRange", "eZFUvlxvGV");
        setBooleanField(term5824, term5824.getClass(), "processResponses", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeRange", argTypes, term5824, args);
    }

};



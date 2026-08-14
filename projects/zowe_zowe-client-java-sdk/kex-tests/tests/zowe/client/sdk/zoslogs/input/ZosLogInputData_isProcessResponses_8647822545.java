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

public class ZosLogInputData_isProcessResponses_8647822545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6391;

    public ZosLogInputData_isProcessResponses_8647822545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6468 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term6467 = ((Class) term6468).getDeclaredField((String) "OPERLOG");
        ((Field) term6467).setAccessible(true);
        Object enum22 = ((Field) term6467).get((Object) null);
        Class<? extends Object> term6706 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term6705 = ((Class) term6706).getDeclaredField((String) "FORWARD");
        ((Field) term6705).setAccessible(true);
        Object enum23 = ((Field) term6705).get((Object) null);
        term6391 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term6391, term6391.getClass(), "startTime", "BYqFIqCKAV");
        setField(term6391, term6391.getClass(), "hardCopy", enum22);
        setField(term6391, term6391.getClass(), "direction", enum23);
        setField(term6391, term6391.getClass(), "timeRange", "vrQLuWIDJX");
        setBooleanField(term6391, term6391.getClass(), "processResponses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isProcessResponses", argTypes, term6391, args);
    }

};



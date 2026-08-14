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

public class ZosLogInputData_toString_4338979626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6958;

    public ZosLogInputData_toString_4338979626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7035 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term7034 = ((Class) term7035).getDeclaredField((String) "SYSLOG");
        ((Field) term7034).setAccessible(true);
        Object enum24 = ((Field) term7034).get((Object) null);
        Class<? extends Object> term7270 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term7269 = ((Class) term7270).getDeclaredField((String) "BACKWARD");
        ((Field) term7269).setAccessible(true);
        Object enum25 = ((Field) term7269).get((Object) null);
        term6958 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term6958, term6958.getClass(), "startTime", "flxyYxBRtu");
        setField(term6958, term6958.getClass(), "hardCopy", enum24);
        setField(term6958, term6958.getClass(), "direction", enum25);
        setField(term6958, term6958.getClass(), "timeRange", "OclPbYPkcH");
        setBooleanField(term6958, term6958.getClass(), "processResponses", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6958, args);
    }

};



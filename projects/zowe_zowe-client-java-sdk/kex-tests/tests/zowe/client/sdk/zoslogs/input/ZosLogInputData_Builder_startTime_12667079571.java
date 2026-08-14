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

public class ZosLogInputData_Builder_startTime_12667079571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ZosLogInputData_Builder_startTime_12667079571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129 = Class.forName((String) "zowe.client.sdk.zoslogs.types.HardCopyType");
        Field term128 = ((Class) term129).getDeclaredField((String) "OPERLOG");
        ((Field) term128).setAccessible(true);
        Object enum0 = ((Field) term128).get((Object) null);
        Class<? extends Object> term409 = Class.forName((String) "zowe.client.sdk.zoslogs.types.DirectionType");
        Field term408 = ((Class) term409).getDeclaredField((String) "FORWARD");
        ((Field) term408).setAccessible(true);
        Object enum1 = ((Field) term408).get((Object) null);
        term1 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term1, term1.getClass(), "startTime", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "hardCopy", enum0);
        setField(term1, term1.getClass(), "direction", enum1);
        setField(term1, term1.getClass(), "timeRange", "sjlJAEtRrb");
        setBooleanField(term1, term1.getClass(), "processResponses", false);
        setIntField(term1, term1.getClass(), "queryCount", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "startTime", argTypes, term1, args);
    }

};



package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_getPattern_9631548203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23490;

    public DsnListInputData_getPattern_9631548203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23582 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term23581 = ((Class) term23582).getDeclaredField((String) "BASE");
        ((Field) term23581).setAccessible(true);
        Object enum23 = ((Field) term23581).get((Object) null);
        term23490 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term23490, term23490.getClass(), "volume", "QiUprSEluR");
        setField(term23490, term23490.getClass(), "attribute", enum23);
        setField(term23490, term23490.getClass(), "maxLength", "cDOXXottZh");
        setField(term23490, term23490.getClass(), "start", "rfqJDkDppz");
        setField(term23490, term23490.getClass(), "recall", "MGorMVGauT");
        setField(term23490, term23490.getClass(), "pattern", "jXKxUGTuEF");
        setField(term23490, term23490.getClass(), "responseTimeout", "nDCcyhiTnS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPattern", argTypes, term23490, args);
    }

};



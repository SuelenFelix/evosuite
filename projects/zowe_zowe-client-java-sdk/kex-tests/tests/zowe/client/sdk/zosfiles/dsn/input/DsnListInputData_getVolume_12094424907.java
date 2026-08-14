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

public class DsnListInputData_getVolume_12094424907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25094;

    public DsnListInputData_getVolume_12094424907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25186 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term25185 = ((Class) term25186).getDeclaredField((String) "BASE");
        ((Field) term25185).setAccessible(true);
        Object enum27 = ((Field) term25185).get((Object) null);
        term25094 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term25094, term25094.getClass(), "volume", "AbonCTtbef");
        setField(term25094, term25094.getClass(), "attribute", enum27);
        setField(term25094, term25094.getClass(), "maxLength", "maXrGOGoKA");
        setField(term25094, term25094.getClass(), "start", "zAkgWQVCpM");
        setField(term25094, term25094.getClass(), "recall", "yQUDyOroXU");
        setField(term25094, term25094.getClass(), "pattern", "xweqkPdyJH");
        setField(term25094, term25094.getClass(), "responseTimeout", "kwteHWzwcc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term25094, args);
    }

};



package io.github.janlely.jparser.impl.json;

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
import static io.github.janlely.jparser.impl.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JsonMember_setValue_6420181835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446;
     Object term1471;

    public JsonMember_setValue_6420181835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1492 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term1491 = ((Class) term1492).getDeclaredField((String) "OBJECT");
        ((Field) term1491).setAccessible(true);
        Object enum5 = ((Field) term1491).get((Object) null);
        term1446 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term1459 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term1470 = newInstance(Class.forName("java.lang.Object"));
        setField(term1446, term1446.getClass(), "key", "EGtDIRbSSb");
        setField(term1459, term1459.getClass(), "type", enum5);
        setField(term1459, term1459.getClass(), "value", term1470);
        setField(term1446, term1446.getClass(), "value", term1459);
        Class<? extends Object> term1737 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term1736 = ((Class) term1737).getDeclaredField((String) "NULL");
        ((Field) term1736).setAccessible(true);
        Object enum6 = ((Field) term1736).get((Object) null);
        term1471 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term1480 = newInstance(Class.forName("java.lang.Object"));
        setField(term1471, term1471.getClass(), "type", enum6);
        setField(term1471, term1471.getClass(), "value", term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.json.JsonValue");
        Object[] args = new Object[1];
        args[0] = term1471;
        callMethod(klass, "setValue", argTypes, term1446, args);
    }

};



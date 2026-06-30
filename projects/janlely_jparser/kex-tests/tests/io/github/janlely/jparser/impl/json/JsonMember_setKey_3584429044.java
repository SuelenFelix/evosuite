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

public class JsonMember_setKey_3584429044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;

    public JsonMember_setKey_3584429044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1195 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term1194 = ((Class) term1195).getDeclaredField((String) "ARRAY");
        ((Field) term1194).setAccessible(true);
        Object enum4 = ((Field) term1194).get((Object) null);
        term1148 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term1161 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term1171 = newInstance(Class.forName("java.lang.Object"));
        setField(term1148, term1148.getClass(), "key", "xxtlPwDYFs");
        setField(term1161, term1161.getClass(), "type", enum4);
        setField(term1161, term1161.getClass(), "value", term1171);
        setField(term1148, term1148.getClass(), "value", term1161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setKey", argTypes, term1148, args);
    }

};



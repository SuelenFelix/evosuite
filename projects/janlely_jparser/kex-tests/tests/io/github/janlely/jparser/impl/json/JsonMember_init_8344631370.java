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
import java.lang.String;
import java.lang.Object;

public class JsonMember_init_8344631370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;

    public JsonMember_init_8344631370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term358 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term357 = ((Class) term358).getDeclaredField((String) "BOOL");
        ((Field) term357).setAccessible(true);
        Object enum1 = ((Field) term357).get((Object) null);
        term337 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term346 = newInstance(Class.forName("java.lang.Object"));
        setField(term337, term337.getClass(), "type", enum1);
        setField(term337, term337.getClass(), "value", term346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.github.janlely.jparser.impl.json.JsonValue");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term337;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



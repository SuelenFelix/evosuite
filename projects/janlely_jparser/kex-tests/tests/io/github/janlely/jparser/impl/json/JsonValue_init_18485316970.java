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

public class JsonValue_init_18485316970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term11;

    public JsonValue_init_18485316970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term67 = ((Class) term68).getDeclaredField((String) "OBJECT");
        ((Field) term67).setAccessible(true);
        enum0 = ((Field) term67).get((Object) null);
        term11 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.json.JsonType");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = term11;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



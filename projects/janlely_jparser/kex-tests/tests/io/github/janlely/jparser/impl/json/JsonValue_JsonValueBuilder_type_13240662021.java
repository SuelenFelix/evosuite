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

public class JsonValue_JsonValueBuilder_type_13240662021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5503;
     Object enum21;

    public JsonValue_JsonValueBuilder_type_13240662021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5525 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term5524 = ((Class) term5525).getDeclaredField((String) "STRING");
        ((Field) term5524).setAccessible(true);
        Object enum20 = ((Field) term5524).get((Object) null);
        term5503 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder"));
        Object term5514 = newInstance(Class.forName("java.lang.Object"));
        setField(term5503, term5503.getClass(), "type", enum20);
        setField(term5503, term5503.getClass(), "value", term5514);
        Class<? extends Object> term5770 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term5769 = ((Class) term5770).getDeclaredField((String) "ARRAY");
        ((Field) term5769).setAccessible(true);
        enum21 = ((Field) term5769).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.json.JsonType");
        Object[] args = new Object[1];
        args[0] = enum21;
        callMethod(klass, "type", argTypes, term5503, args);
    }

};



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

public class JsonValue_JsonValueBuilder_value_7598824652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6011;
     Object term6023;

    public JsonValue_JsonValueBuilder_value_7598824652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6025 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term6024 = ((Class) term6025).getDeclaredField((String) "NUMBER");
        ((Field) term6024).setAccessible(true);
        Object enum22 = ((Field) term6024).get((Object) null);
        term6011 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder"));
        Object term6022 = newInstance(Class.forName("java.lang.Object"));
        setField(term6011, term6011.getClass(), "type", enum22);
        setField(term6011, term6011.getClass(), "value", term6022);
        term6023 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6023;
        callMethod(klass, "value", argTypes, term6011, args);
    }

};



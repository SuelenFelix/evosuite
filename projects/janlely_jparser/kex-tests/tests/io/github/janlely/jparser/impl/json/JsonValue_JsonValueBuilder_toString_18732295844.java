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

public class JsonValue_JsonValueBuilder_toString_18732295844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6526;

    public JsonValue_JsonValueBuilder_toString_18732295844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6539 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term6538 = ((Class) term6539).getDeclaredField((String) "STRING");
        ((Field) term6538).setAccessible(true);
        Object enum24 = ((Field) term6538).get((Object) null);
        term6526 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder"));
        Object term6537 = newInstance(Class.forName("java.lang.Object"));
        setField(term6526, term6526.getClass(), "type", enum24);
        setField(term6526, term6526.getClass(), "value", term6537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6526, args);
    }

};



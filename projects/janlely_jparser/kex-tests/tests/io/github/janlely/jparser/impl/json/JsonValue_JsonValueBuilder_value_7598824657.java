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

public class JsonValue_JsonValueBuilder_value_7598824657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6784;

    public JsonValue_JsonValueBuilder_value_7598824657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6784 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder"));
        setField(term6784, term6784.getClass(), "type", null);
        setField(term6784, term6784.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term6784, args);
    }

};



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

public class JsonValue_JsonValueBuilder_build_7368947818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6785;

    public JsonValue_JsonValueBuilder_build_7368947818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6785 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder"));
        setField(term6785, term6785.getClass(), "type", null);
        setField(term6785, term6785.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonValue$JsonValueBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term6785, args);
    }

};



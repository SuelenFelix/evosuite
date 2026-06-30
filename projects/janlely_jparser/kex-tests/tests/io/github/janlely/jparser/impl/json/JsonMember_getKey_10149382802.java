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

public class JsonMember_getKey_10149382802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;

    public JsonMember_getKey_10149382802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term632 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term631 = ((Class) term632).getDeclaredField((String) "NUMBER");
        ((Field) term631).setAccessible(true);
        Object enum2 = ((Field) term631).get((Object) null);
        term596 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term609 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term620 = newInstance(Class.forName("java.lang.Object"));
        setField(term596, term596.getClass(), "key", "sjlJAEtRrb");
        setField(term609, term609.getClass(), "type", enum2);
        setField(term609, term609.getClass(), "value", term620);
        setField(term596, term596.getClass(), "value", term609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term596, args);
    }

};



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

public class JsonMember_hashCode_6870080278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2529;

    public JsonMember_hashCode_6870080278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2564 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term2563 = ((Class) term2564).getDeclaredField((String) "ARRAY");
        ((Field) term2563).setAccessible(true);
        Object enum9 = ((Field) term2563).get((Object) null);
        term2529 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term2542 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term2552 = newInstance(Class.forName("java.lang.Object"));
        setField(term2529, term2529.getClass(), "key", "hRNSzYYIrc");
        setField(term2542, term2542.getClass(), "type", enum9);
        setField(term2542, term2542.getClass(), "value", term2552);
        setField(term2529, term2529.getClass(), "value", term2542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2529, args);
    }

};



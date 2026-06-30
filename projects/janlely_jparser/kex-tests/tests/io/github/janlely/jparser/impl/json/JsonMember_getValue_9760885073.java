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

public class JsonMember_getValue_9760885073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;

    public JsonMember_getValue_9760885073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term910 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term909 = ((Class) term910).getDeclaredField((String) "NULL");
        ((Field) term909).setAccessible(true);
        Object enum3 = ((Field) term909).get((Object) null);
        term876 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term889 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term898 = newInstance(Class.forName("java.lang.Object"));
        setField(term876, term876.getClass(), "key", "MuLcgQHgqz");
        setField(term889, term889.getClass(), "type", enum3);
        setField(term889, term889.getClass(), "value", term898);
        setField(term876, term876.getClass(), "value", term889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term876, args);
    }

};



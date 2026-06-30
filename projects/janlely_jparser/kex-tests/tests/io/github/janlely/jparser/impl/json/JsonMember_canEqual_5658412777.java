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

public class JsonMember_canEqual_5658412777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;
     Object term2276;

    public JsonMember_canEqual_5658412777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2288 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term2287 = ((Class) term2288).getDeclaredField((String) "ARRAY");
        ((Field) term2287).setAccessible(true);
        Object enum8 = ((Field) term2287).get((Object) null);
        term2252 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term2265 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term2275 = newInstance(Class.forName("java.lang.Object"));
        setField(term2252, term2252.getClass(), "key", "MjGYSRKTNF");
        setField(term2265, term2265.getClass(), "type", enum8);
        setField(term2265, term2265.getClass(), "value", term2275);
        setField(term2252, term2252.getClass(), "value", term2265);
        term2276 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2276;
        callMethod(klass, "canEqual", argTypes, term2252, args);
    }

};



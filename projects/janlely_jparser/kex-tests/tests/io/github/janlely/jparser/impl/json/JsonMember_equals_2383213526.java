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

public class JsonMember_equals_2383213526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;
     Object term1999;

    public JsonMember_equals_2383213526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2011 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term2010 = ((Class) term2011).getDeclaredField((String) "ARRAY");
        ((Field) term2010).setAccessible(true);
        Object enum7 = ((Field) term2010).get((Object) null);
        term1975 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term1988 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term1998 = newInstance(Class.forName("java.lang.Object"));
        setField(term1975, term1975.getClass(), "key", "SzjVpOQTyS");
        setField(term1988, term1988.getClass(), "type", enum7);
        setField(term1988, term1988.getClass(), "value", term1998);
        setField(term1975, term1975.getClass(), "value", term1988);
        term1999 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1999;
        callMethod(klass, "equals", argTypes, term1975, args);
    }

};



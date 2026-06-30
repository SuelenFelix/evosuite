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

public class JsonMember_toString_11977677179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;

    public JsonMember_toString_11977677179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2841 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term2840 = ((Class) term2841).getDeclaredField((String) "NUMBER");
        ((Field) term2840).setAccessible(true);
        Object enum10 = ((Field) term2840).get((Object) null);
        term2805 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember"));
        Object term2818 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term2829 = newInstance(Class.forName("java.lang.Object"));
        setField(term2805, term2805.getClass(), "key", "RMFIsYGgne");
        setField(term2818, term2818.getClass(), "type", enum10);
        setField(term2818, term2818.getClass(), "value", term2829);
        setField(term2805, term2805.getClass(), "value", term2818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2805, args);
    }

};



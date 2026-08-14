package io.github.janlely.jparser.impl.regex;

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
import static io.github.janlely.jparser.impl.regex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RepeatToken_setValue_9729494876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6275;
     Object term6287;

    public RepeatToken_setValue_9729494876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6289 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term6288 = ((Class) term6289).getDeclaredField((String) "REPEAT");
        ((Field) term6288).setAccessible(true);
        Object enum20 = ((Field) term6288).get((Object) null);
        term6275 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term6286 = newInstance(Class.forName("java.lang.Object"));
        setField(term6275, term6275.getClass(), "type", enum20);
        setField(term6275, term6275.getClass(), "value", term6286);
        term6287 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6287;
        callMethod(klass, "setValue", argTypes, term6275, args);
    }

};



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

public class RepeatToken_toString_16809826709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17497;

    public RepeatToken_toString_16809826709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17512 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term17511 = ((Class) term17512).getDeclaredField((String) "OPTIONAL");
        ((Field) term17511).setAccessible(true);
        Object enum45 = ((Field) term17511).get((Object) null);
        term17497 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term17510 = newInstance(Class.forName("java.lang.Object"));
        setField(term17497, term17497.getClass(), "type", enum45);
        setField(term17497, term17497.getClass(), "value", term17510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17497, args);
    }

};



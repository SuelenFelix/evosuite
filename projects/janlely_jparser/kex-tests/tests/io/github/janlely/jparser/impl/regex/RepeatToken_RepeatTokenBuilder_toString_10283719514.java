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

public class RepeatToken_RepeatTokenBuilder_toString_10283719514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10091;

    public RepeatToken_RepeatTokenBuilder_toString_10283719514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10106 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term10105 = ((Class) term10106).getDeclaredField((String) "OPTIONAL");
        ((Field) term10105).setAccessible(true);
        Object enum33 = ((Field) term10105).get((Object) null);
        term10091 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder"));
        Object term10104 = newInstance(Class.forName("java.lang.Object"));
        setField(term10091, term10091.getClass(), "type", enum33);
        setField(term10091, term10091.getClass(), "value", term10104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10091, args);
    }

};



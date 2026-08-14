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

public class RParser_canEqual_70008588514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24549;
     Object term24561;

    public RParser_canEqual_70008588514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24563 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term24562 = ((Class) term24563).getDeclaredField((String) "START");
        ((Field) term24562).setAccessible(true);
        Object enum68 = ((Field) term24562).get((Object) null);
        term24549 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term24549, term24549.getClass(), "type", enum68);
        setIntField(term24549, term24549.getClass(), "quoteId", 1270666529);
        setIntField(term24549, term24549.getClass(), "groupId", -1146679443);
        setField(term24549, term24549.getClass(), "parser", null);
        setField(term24549, term24549.getClass(), "func", null);
        term24561 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24561;
        callMethod(klass, "canEqual", argTypes, term24549, args);
    }

};



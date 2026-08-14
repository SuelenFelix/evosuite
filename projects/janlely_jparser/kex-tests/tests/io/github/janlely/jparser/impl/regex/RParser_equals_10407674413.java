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

public class RParser_equals_10407674413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24239;
     Object term24251;

    public RParser_equals_10407674413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24253 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term24252 = ((Class) term24253).getDeclaredField((String) "GROUP");
        ((Field) term24252).setAccessible(true);
        Object enum67 = ((Field) term24252).get((Object) null);
        term24239 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term24239, term24239.getClass(), "type", enum67);
        setIntField(term24239, term24239.getClass(), "quoteId", 1684998508);
        setIntField(term24239, term24239.getClass(), "groupId", -1476644457);
        setField(term24239, term24239.getClass(), "parser", null);
        setField(term24239, term24239.getClass(), "func", null);
        term24251 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24251;
        callMethod(klass, "equals", argTypes, term24239, args);
    }

};



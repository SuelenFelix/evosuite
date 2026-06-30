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
     Object term14402;
     Object term14414;

    public RParser_equals_10407674413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14416 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term14415 = ((Class) term14416).getDeclaredField((String) "START");
        ((Field) term14415).setAccessible(true);
        Object enum47 = ((Field) term14415).get((Object) null);
        term14402 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term14402, term14402.getClass(), "type", enum47);
        setIntField(term14402, term14402.getClass(), "quoteId", -1016503459);
        setIntField(term14402, term14402.getClass(), "groupId", -1968847291);
        setField(term14402, term14402.getClass(), "parser", null);
        setField(term14402, term14402.getClass(), "func", null);
        term14414 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14414;
        callMethod(klass, "equals", argTypes, term14402, args);
    }

};



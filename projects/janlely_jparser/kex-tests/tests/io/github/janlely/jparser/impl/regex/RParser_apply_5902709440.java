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

public class RParser_apply_5902709440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10375;

    public RParser_apply_5902709440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10388 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term10387 = ((Class) term10388).getDeclaredField((String) "QUOTE");
        ((Field) term10387).setAccessible(true);
        Object enum34 = ((Field) term10387).get((Object) null);
        term10375 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term10375, term10375.getClass(), "type", enum34);
        setIntField(term10375, term10375.getClass(), "quoteId", -655067527);
        setIntField(term10375, term10375.getClass(), "groupId", -6029667);
        setField(term10375, term10375.getClass(), "parser", null);
        setField(term10375, term10375.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "apply", argTypes, term10375, args);
    }

};



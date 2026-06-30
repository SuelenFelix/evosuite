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

public class RParser_getQuoteId_20466992114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11303;

    public RParser_getQuoteId_20466992114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11316 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term11315 = ((Class) term11316).getDeclaredField((String) "START");
        ((Field) term11315).setAccessible(true);
        Object enum37 = ((Field) term11315).get((Object) null);
        term11303 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term11303, term11303.getClass(), "type", enum37);
        setIntField(term11303, term11303.getClass(), "quoteId", 590364439);
        setIntField(term11303, term11303.getClass(), "groupId", 865208305);
        setField(term11303, term11303.getClass(), "parser", null);
        setField(term11303, term11303.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuoteId", argTypes, term11303, args);
    }

};



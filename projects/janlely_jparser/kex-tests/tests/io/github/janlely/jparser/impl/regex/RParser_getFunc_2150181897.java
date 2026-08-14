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

public class RParser_getFunc_2150181897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22373;

    public RParser_getFunc_2150181897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22387 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term22386 = ((Class) term22387).getDeclaredField((String) "PARSER");
        ((Field) term22386).setAccessible(true);
        Object enum61 = ((Field) term22386).get((Object) null);
        term22373 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term22373, term22373.getClass(), "type", enum61);
        setIntField(term22373, term22373.getClass(), "quoteId", -749861210);
        setIntField(term22373, term22373.getClass(), "groupId", 1694224101);
        setField(term22373, term22373.getClass(), "parser", null);
        setField(term22373, term22373.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunc", argTypes, term22373, args);
    }

};



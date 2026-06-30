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

public class RParser_getType_1227085103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10994;

    public RParser_getType_1227085103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11007 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term11006 = ((Class) term11007).getDeclaredField((String) "QUOTE");
        ((Field) term11006).setAccessible(true);
        Object enum36 = ((Field) term11006).get((Object) null);
        term10994 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term10994, term10994.getClass(), "type", enum36);
        setIntField(term10994, term10994.getClass(), "quoteId", -1007160944);
        setIntField(term10994, term10994.getClass(), "groupId", 1135664017);
        setField(term10994, term10994.getClass(), "parser", null);
        setField(term10994, term10994.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term10994, args);
    }

};



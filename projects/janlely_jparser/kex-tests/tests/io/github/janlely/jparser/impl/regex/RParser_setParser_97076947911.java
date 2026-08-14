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

public class RParser_setParser_97076947911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23621;

    public RParser_setParser_97076947911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23634 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term23633 = ((Class) term23634).getDeclaredField((String) "START");
        ((Field) term23633).setAccessible(true);
        Object enum65 = ((Field) term23633).get((Object) null);
        term23621 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term23621, term23621.getClass(), "type", enum65);
        setIntField(term23621, term23621.getClass(), "quoteId", -75206835);
        setIntField(term23621, term23621.getClass(), "groupId", -1618206977);
        setField(term23621, term23621.getClass(), "parser", null);
        setField(term23621, term23621.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Parser");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setParser", argTypes, term23621, args);
    }

};



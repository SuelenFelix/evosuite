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

public class RParser_getFunc_2150181898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12237;

    public RParser_getFunc_2150181898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12250 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term12249 = ((Class) term12250).getDeclaredField((String) "GROUP");
        ((Field) term12249).setAccessible(true);
        Object enum40 = ((Field) term12249).get((Object) null);
        term12237 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term12237, term12237.getClass(), "type", enum40);
        setIntField(term12237, term12237.getClass(), "quoteId", -73683645);
        setIntField(term12237, term12237.getClass(), "groupId", -226514366);
        setField(term12237, term12237.getClass(), "parser", null);
        setField(term12237, term12237.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunc", argTypes, term12237, args);
    }

};



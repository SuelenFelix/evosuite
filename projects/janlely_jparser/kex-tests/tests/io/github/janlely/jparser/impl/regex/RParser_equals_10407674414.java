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

public class RParser_equals_10407674414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14405;
     Object term14417;

    public RParser_equals_10407674414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14419 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term14418 = ((Class) term14419).getDeclaredField((String) "START");
        ((Field) term14418).setAccessible(true);
        Object enum47 = ((Field) term14418).get((Object) null);
        term14405 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term14405, term14405.getClass(), "type", enum47);
        setIntField(term14405, term14405.getClass(), "quoteId", -1016503459);
        setIntField(term14405, term14405.getClass(), "groupId", -1968847291);
        setField(term14405, term14405.getClass(), "parser", null);
        setField(term14405, term14405.getClass(), "func", null);
        term14417 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14417;
        callMethod(klass, "equals", argTypes, term14405, args);
    }

};



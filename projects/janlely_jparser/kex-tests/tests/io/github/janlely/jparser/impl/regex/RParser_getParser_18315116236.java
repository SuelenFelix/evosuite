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

public class RParser_getParser_18315116236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11921;

    public RParser_getParser_18315116236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11935 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term11934 = ((Class) term11935).getDeclaredField((String) "PARSER");
        ((Field) term11934).setAccessible(true);
        Object enum39 = ((Field) term11934).get((Object) null);
        term11921 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term11921, term11921.getClass(), "type", enum39);
        setIntField(term11921, term11921.getClass(), "quoteId", -203030934);
        setIntField(term11921, term11921.getClass(), "groupId", -1179120542);
        setField(term11921, term11921.getClass(), "parser", null);
        setField(term11921, term11921.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParser", argTypes, term11921, args);
    }

};



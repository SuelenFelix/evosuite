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

public class RParser_setType_21188998609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12546;
     Object enum42;

    public RParser_setType_21188998609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12568 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term12567 = ((Class) term12568).getDeclaredField((String) "GROUP");
        ((Field) term12567).setAccessible(true);
        Object enum41 = ((Field) term12567).get((Object) null);
        term12546 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term12546, term12546.getClass(), "type", enum41);
        setIntField(term12546, term12546.getClass(), "quoteId", 1193880199);
        setIntField(term12546, term12546.getClass(), "groupId", -1087774327);
        setField(term12546, term12546.getClass(), "parser", null);
        setField(term12546, term12546.getClass(), "func", null);
        Class<? extends Object> term12865 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term12864 = ((Class) term12865).getDeclaredField((String) "QUOTE");
        ((Field) term12864).setAccessible(true);
        enum42 = ((Field) term12864).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "setType", argTypes, term12546, args);
    }

};



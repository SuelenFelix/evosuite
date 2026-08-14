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

public class RParser_setType_21188998608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22686;
     Object enum62;

    public RParser_setType_21188998608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22699 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term22698 = ((Class) term22699).getDeclaredField((String) "GROUP");
        ((Field) term22698).setAccessible(true);
        enum62 = ((Field) term22698).get((Object) null);
        term22686 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term22686, term22686.getClass(), "type", enum62);
        setIntField(term22686, term22686.getClass(), "quoteId", 937859191);
        setIntField(term22686, term22686.getClass(), "groupId", -916584829);
        setField(term22686, term22686.getClass(), "parser", null);
        setField(term22686, term22686.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Object[] args = new Object[1];
        args[0] = enum62;
        callMethod(klass, "setType", argTypes, term22686, args);
    }

};



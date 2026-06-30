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

public class RParser_RParserBuilder_toString_6391352877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4039;

    public RParser_RParserBuilder_toString_6391352877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4052 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term4051 = ((Class) term4052).getDeclaredField((String) "GROUP");
        ((Field) term4051).setAccessible(true);
        Object enum12 = ((Field) term4051).get((Object) null);
        term4039 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term4039, term4039.getClass(), "type", enum12);
        setIntField(term4039, term4039.getClass(), "quoteId", 1622346318);
        setIntField(term4039, term4039.getClass(), "groupId", 1048535127);
        setField(term4039, term4039.getClass(), "parser", null);
        setField(term4039, term4039.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4039, args);
    }

};



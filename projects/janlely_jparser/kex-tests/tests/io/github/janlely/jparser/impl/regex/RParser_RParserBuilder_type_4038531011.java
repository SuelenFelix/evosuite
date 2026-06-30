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

public class RParser_RParserBuilder_type_4038531011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1871;
     Object enum6;

    public RParser_RParserBuilder_type_4038531011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1894 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term1893 = ((Class) term1894).getDeclaredField((String) "QUOTE");
        ((Field) term1893).setAccessible(true);
        Object enum5 = ((Field) term1893).get((Object) null);
        term1871 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term1871, term1871.getClass(), "type", enum5);
        setIntField(term1871, term1871.getClass(), "quoteId", -1922583790);
        setIntField(term1871, term1871.getClass(), "groupId", -616727354);
        setField(term1871, term1871.getClass(), "parser", null);
        setField(term1871, term1871.getClass(), "func", null);
        Class<? extends Object> term2191 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term2190 = ((Class) term2191).getDeclaredField((String) "PARSER");
        ((Field) term2190).setAccessible(true);
        enum6 = ((Field) term2190).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "type", argTypes, term1871, args);
    }

};



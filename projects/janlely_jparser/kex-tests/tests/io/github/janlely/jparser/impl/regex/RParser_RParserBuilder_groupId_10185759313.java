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
import java.lang.Integer;

public class RParser_RParserBuilder_groupId_10185759313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2801;
     Object term2813;

    public RParser_RParserBuilder_groupId_10185759313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2816 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term2815 = ((Class) term2816).getDeclaredField((String) "START");
        ((Field) term2815).setAccessible(true);
        Object enum8 = ((Field) term2815).get((Object) null);
        term2801 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term2801, term2801.getClass(), "type", enum8);
        setIntField(term2801, term2801.getClass(), "quoteId", -1339778481);
        setIntField(term2801, term2801.getClass(), "groupId", 1725571209);
        setField(term2801, term2801.getClass(), "parser", null);
        setField(term2801, term2801.getClass(), "func", null);
        term2813 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2813;
        callMethod(klass, "groupId", argTypes, term2801, args);
    }

};



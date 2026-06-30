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

public class RParser_RParserBuilder_quoteId_10185763122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2490;
     Object term2502;

    public RParser_RParserBuilder_quoteId_10185763122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2505 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term2504 = ((Class) term2505).getDeclaredField((String) "GROUP");
        ((Field) term2504).setAccessible(true);
        Object enum7 = ((Field) term2504).get((Object) null);
        term2490 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term2490, term2490.getClass(), "type", enum7);
        setIntField(term2490, term2490.getClass(), "quoteId", -1955890973);
        setIntField(term2490, term2490.getClass(), "groupId", -2038273078);
        setField(term2490, term2490.getClass(), "parser", null);
        setField(term2490, term2490.getClass(), "func", null);
        term2502 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2502;
        callMethod(klass, "quoteId", argTypes, term2490, args);
    }

};



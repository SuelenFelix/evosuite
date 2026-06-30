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

public class RParser_RParserBuilder_parser_20599057864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112;

    public RParser_RParserBuilder_parser_20599057864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3125 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term3124 = ((Class) term3125).getDeclaredField((String) "GROUP");
        ((Field) term3124).setAccessible(true);
        Object enum9 = ((Field) term3124).get((Object) null);
        term3112 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term3112, term3112.getClass(), "type", enum9);
        setIntField(term3112, term3112.getClass(), "quoteId", 1134449235);
        setIntField(term3112, term3112.getClass(), "groupId", -883034806);
        setField(term3112, term3112.getClass(), "parser", null);
        setField(term3112, term3112.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Parser");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parser", argTypes, term3112, args);
    }

};



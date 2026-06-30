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

public class RParser_RParserBuilder_build_12014102956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3730;

    public RParser_RParserBuilder_build_12014102956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3743 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term3742 = ((Class) term3743).getDeclaredField((String) "QUOTE");
        ((Field) term3742).setAccessible(true);
        Object enum11 = ((Field) term3742).get((Object) null);
        term3730 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term3730, term3730.getClass(), "type", enum11);
        setIntField(term3730, term3730.getClass(), "quoteId", -1685132342);
        setIntField(term3730, term3730.getClass(), "groupId", -1456670397);
        setField(term3730, term3730.getClass(), "parser", null);
        setField(term3730, term3730.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3730, args);
    }

};



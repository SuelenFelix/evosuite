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

public class RParser_RParserBuilder_type_4038531019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4348;

    public RParser_RParserBuilder_type_4038531019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4348 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term4348, term4348.getClass(), "type", null);
        setIntField(term4348, term4348.getClass(), "quoteId", 0);
        setIntField(term4348, term4348.getClass(), "groupId", 0);
        setField(term4348, term4348.getClass(), "parser", null);
        setField(term4348, term4348.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "type", argTypes, term4348, args);
    }

};



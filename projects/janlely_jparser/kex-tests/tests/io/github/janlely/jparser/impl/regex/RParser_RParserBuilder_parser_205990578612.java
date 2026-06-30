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

public class RParser_RParserBuilder_parser_205990578612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4361;

    public RParser_RParserBuilder_parser_205990578612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4361 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder"));
        setField(term4361, term4361.getClass(), "type", null);
        setIntField(term4361, term4361.getClass(), "quoteId", 0);
        setIntField(term4361, term4361.getClass(), "groupId", 0);
        setField(term4361, term4361.getClass(), "parser", null);
        setField(term4361, term4361.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser$RParserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Parser");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parser", argTypes, term4361, args);
    }

};



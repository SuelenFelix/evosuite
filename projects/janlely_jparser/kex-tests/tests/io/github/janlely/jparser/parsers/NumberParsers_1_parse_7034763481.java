package io.github.janlely.jparser.parsers;

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
import static io.github.janlely.jparser.parsers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NumberParsers_1_parse_7034763481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public NumberParsers_1_parse_7034763481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("io.github.janlely.jparser.parsers.NumberParsers$1"));
        setBooleanField(term13, term13.getClass(), "ignore", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.parsers.NumberParsers$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.IBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term13, args);
    }

};



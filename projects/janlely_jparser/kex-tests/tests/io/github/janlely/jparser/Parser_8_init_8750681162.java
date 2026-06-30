package io.github.janlely.jparser;

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
import static io.github.janlely.jparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class Parser_8_init_8750681162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15034;
     Object term15036;
     Object term15038;
     Object term15040;

    public Parser_8_init_8750681162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15034 = new Integer(0);
        term15036 = new Integer(0);
        term15038 = new Boolean(false);
        term15040 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Parser$8");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Parser");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.function.Supplier");
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term15034;
        args[2] = null;
        args[3] = term15036;
        args[4] = term15038;
        args[5] = term15040;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



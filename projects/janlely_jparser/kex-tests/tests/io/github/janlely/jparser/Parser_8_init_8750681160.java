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

public class Parser_8_init_8750681160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15020;
     Object term15022;
     Object term15024;
     Object term15026;

    public Parser_8_init_8750681160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15020 = new Integer(-1899301124);
        term15022 = new Integer(-1882480155);
        term15024 = new Boolean(true);
        term15026 = new Boolean(true);
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
        args[1] = term15020;
        args[2] = null;
        args[3] = term15022;
        args[4] = term15024;
        args[5] = term15026;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



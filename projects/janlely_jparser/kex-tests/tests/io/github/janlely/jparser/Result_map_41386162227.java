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

public class Result_map_41386162227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14762;

    public Result_map_41386162227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14762 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14762, term14762.getClass(), "result", null);
        setField(term14762, term14762.getClass(), "errorMsg", null);
        setIntField(term14762, term14762.getClass(), "length", 0);
        setIntField(term14762, term14762.getClass(), "pos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "map", argTypes, term14762, args);
    }

};



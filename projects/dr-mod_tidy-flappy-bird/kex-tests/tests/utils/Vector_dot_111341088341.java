package utils;

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
import static utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vector_dot_111341088341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;

    public Vector_dot_111341088341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term196, term196.getClass(), "x", 0.0F);
        setFloatField(term196, term196.getClass(), "y", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("utils.Vector");
        argTypes[1] = Class.forName("utils.Vector");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "dot", argTypes, term196, args);
    }

};



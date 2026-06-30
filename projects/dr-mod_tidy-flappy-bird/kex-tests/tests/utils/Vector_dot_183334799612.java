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

public class Vector_dot_183334799612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term69;

    public Vector_dot_183334799612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term66, term66.getClass(), "x", 0.15826964F);
        setFloatField(term66, term66.getClass(), "y", 0.45691717F);
        term69 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term69, term69.getClass(), "x", 0.17877543F);
        setFloatField(term69, term69.getClass(), "y", 0.8598297F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("utils.Vector");
        Object[] args = new Object[1];
        args[0] = term69;
        callMethod(klass, "dot", argTypes, term66, args);
    }

};



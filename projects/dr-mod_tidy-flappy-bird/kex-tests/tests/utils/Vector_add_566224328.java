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
import java.lang.Float;

public class Vector_add_566224328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term44;
     Object term46;

    public Vector_add_566224328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term41, term41.getClass(), "x", 0.97262454F);
        setFloatField(term41, term41.getClass(), "y", 0.76550204F);
        term44 = new Float(0.26441735F);
        term46 = new Float(0.13745493F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term44;
        args[1] = term46;
        callMethod(klass, "add", argTypes, term41, args);
    }

};



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

public class Vector_dist_31390454411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term63;

    public Vector_dist_31390454411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term60, term60.getClass(), "x", 0.7467328F);
        setFloatField(term60, term60.getClass(), "y", 0.6436713F);
        term63 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term63, term63.getClass(), "x", 0.89057696F);
        setFloatField(term63, term63.getClass(), "y", 0.7332741F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("utils.Vector");
        argTypes[1] = Class.forName("utils.Vector");
        Object[] args = new Object[2];
        args[0] = term60;
        args[1] = term63;
        callMethod(klass, "dist", argTypes, null, args);
    }

};



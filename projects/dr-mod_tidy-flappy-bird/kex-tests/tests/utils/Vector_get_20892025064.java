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

public class Vector_get_20892025064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term18;

    public Vector_get_20892025064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term15, term15.getClass(), "x", 0.2857073F);
        setFloatField(term15, term15.getClass(), "y", 0.6880585F);
        term18 = (float[]) newFloatArray(5);
        setFloatElement(term18, 0, 0.40176582F);
        setFloatElement(term18, 1, 0.8783184F);
        setFloatElement(term18, 2, 0.26413453F);
        setFloatElement(term18, 3, 0.7944024F);
        setFloatElement(term18, 4, 0.3692338F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "get", argTypes, term15, args);
    }

};



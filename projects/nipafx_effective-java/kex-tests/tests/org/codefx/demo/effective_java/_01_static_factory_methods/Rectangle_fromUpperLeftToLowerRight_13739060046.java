package org.codefx.demo.effective_java._01_static_factory_methods;

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
import static org.codefx.demo.effective_java._01_static_factory_methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Rectangle_fromUpperLeftToLowerRight_13739060046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public Rectangle_fromUpperLeftToLowerRight_13739060046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Rectangle"));
        setField(term33, term33.getClass(), "lowerLeft", null);
        setField(term33, term33.getClass(), "upperRight", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Rectangle");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Point");
        argTypes[1] = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Point");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fromUpperLeftToLowerRight", argTypes, term33, args);
    }

};



package io.zenwave360.jsonrefparser.resolver;

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
import static io.zenwave360.jsonrefparser.resolver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClasspathResolver_withResourceClassLoader_9262084474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7172;

    public ClasspathResolver_withResourceClassLoader_9262084474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7172 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.ClasspathResolver"));
        setField(term7172, term7172.getClass(), "resourceClassLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.ClasspathResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.ClassLoader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withResourceClassLoader", argTypes, term7172, args);
    }

};



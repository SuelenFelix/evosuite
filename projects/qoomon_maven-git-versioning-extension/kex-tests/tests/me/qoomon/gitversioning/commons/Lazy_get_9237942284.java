package me.qoomon.gitversioning.commons;

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
import static me.qoomon.gitversioning.commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Lazy_get_9237942284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;

    public Lazy_get_9237942284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1036 = newInstance(Class.forName("me.qoomon.gitversioning.commons.Lazy"));
        Object term1037 = newInstance(Class.forName("java.lang.Object"));
        setField(term1036, term1036.getClass(), "initializer", null);
        setField(term1036, term1036.getClass(), "value", term1037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.gitversioning.commons.Lazy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.qoomon.gitversioning.commons.Lazy");
        Object[] args = new Object[1];
        args[0] = term1036;
        callMethod(klass, "get", argTypes, null, args);
    }

};



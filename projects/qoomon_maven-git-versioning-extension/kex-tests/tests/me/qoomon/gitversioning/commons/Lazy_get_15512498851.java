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

public class Lazy_get_15512498851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034;

    public Lazy_get_15512498851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1034 = newInstance(Class.forName("me.qoomon.gitversioning.commons.Lazy"));
        setField(term1034, term1034.getClass(), "initializer", null);
        setField(term1034, term1034.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.gitversioning.commons.Lazy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term1034, args);
    }

};



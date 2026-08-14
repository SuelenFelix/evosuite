package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cover_equals_65471877111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37615;
     Object term37664;

    public Cover_equals_65471877111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37615 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term37615, term37615.getClass(), "id", "UHsHREPriw");
        setField(term37615, term37615.getClass(), "smallUrl", "DIwfYhyVhT");
        setField(term37615, term37615.getClass(), "mediumUrl", "jtunRPVOvC");
        setField(term37615, term37615.getClass(), "largeUrl", "MkzyPfWvZB");
        term37664 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37664;
        callMethod(klass, "equals", argTypes, term37615, args);
    }

};



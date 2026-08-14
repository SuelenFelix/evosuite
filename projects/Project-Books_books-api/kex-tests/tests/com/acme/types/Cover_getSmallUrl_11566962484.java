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

public class Cover_getSmallUrl_11566962484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36926;

    public Cover_getSmallUrl_11566962484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36926 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term36926, term36926.getClass(), "id", "NNQTRipcCv");
        setField(term36926, term36926.getClass(), "smallUrl", "dZhWZfUVgS");
        setField(term36926, term36926.getClass(), "mediumUrl", "qMvhAPFRIy");
        setField(term36926, term36926.getClass(), "largeUrl", "mbszMHbKhk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmallUrl", argTypes, term36926, args);
    }

};



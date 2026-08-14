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

public class Cover_getMediumUrl_17711676346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37126;

    public Cover_getMediumUrl_17711676346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37126 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term37126, term37126.getClass(), "id", "LyyBpbZJne");
        setField(term37126, term37126.getClass(), "smallUrl", "olEGCxILaf");
        setField(term37126, term37126.getClass(), "mediumUrl", "fYdHEyfDKW");
        setField(term37126, term37126.getClass(), "largeUrl", "BsoNPgPWxB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMediumUrl", argTypes, term37126, args);
    }

};



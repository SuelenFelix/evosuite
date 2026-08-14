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

public class Cover_Builder_build_13047069861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50426;

    public Cover_Builder_build_13047069861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50426 = newInstance(Class.forName("com.acme.types.Cover$Builder"));
        setField(term50426, term50426.getClass(), "id", "fEistPaGxy");
        setField(term50426, term50426.getClass(), "smallUrl", "nblUmIwMZt");
        setField(term50426, term50426.getClass(), "mediumUrl", "jrbsNrloog");
        setField(term50426, term50426.getClass(), "largeUrl", "HgvnIvqOcq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term50426, args);
    }

};



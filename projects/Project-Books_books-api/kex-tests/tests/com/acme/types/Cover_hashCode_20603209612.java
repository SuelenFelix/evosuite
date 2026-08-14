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

public class Cover_hashCode_20603209612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37705;

    public Cover_hashCode_20603209612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37705 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term37705, term37705.getClass(), "id", "BTiJXpfldl");
        setField(term37705, term37705.getClass(), "smallUrl", "WayKgiTEQo");
        setField(term37705, term37705.getClass(), "mediumUrl", "SQWqwRyawD");
        setField(term37705, term37705.getClass(), "largeUrl", "oqZiibHuxe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Cover");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term37705, args);
    }

};



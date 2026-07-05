package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Activity_getContent_3290048363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6165;

    public Activity_getContent_3290048363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6166 = new Long(-6950146046121430355L);
        term6165 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6165, term6165.getClass(), "id", term6166);
        setField(term6165, term6165.getClass(), "content", "XXvscsYBWv");
        setField(term6165, term6165.getClass(), "imageUrl", "uePedtiAfL");
        setField(term6165, term6165.getClass(), "name", "AdSHvysxQB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term6165, args);
    }

};



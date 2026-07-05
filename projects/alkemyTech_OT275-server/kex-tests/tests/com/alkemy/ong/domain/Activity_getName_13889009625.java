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

public class Activity_getName_13889009625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6303;

    public Activity_getName_13889009625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6304 = new Long(-6342139649364011743L);
        term6303 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6303, term6303.getClass(), "id", term6304);
        setField(term6303, term6303.getClass(), "content", "EEYmuwyVDP");
        setField(term6303, term6303.getClass(), "imageUrl", "EWFbEDAVrE");
        setField(term6303, term6303.getClass(), "name", "EMiMtYgfvr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6303, args);
    }

};



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

public class Activity_setId_17684195216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6372;
     Object term6411;

    public Activity_setId_17684195216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6373 = new Long(-4924950707540628022L);
        term6372 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6372, term6372.getClass(), "id", term6373);
        setField(term6372, term6372.getClass(), "content", "OyYyYYnJuF");
        setField(term6372, term6372.getClass(), "imageUrl", "aYLvcxZohT");
        setField(term6372, term6372.getClass(), "name", "mnHyQbMyld");
        term6411 = new Long(-4393710401270724527L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6411;
        callMethod(klass, "setId", argTypes, term6372, args);
    }

};



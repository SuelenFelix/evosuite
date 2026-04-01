package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stay_getLng_65476192338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4163;

    public Stay_getLng_65476192338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4163 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4163, term4163.getClass(), "addr1", null);
        setField(term4163, term4163.getClass(), "addr2", null);
        setField(term4163, term4163.getClass(), "areaCode", null);
        setField(term4163, term4163.getClass(), "sigunguCode", null);
        setField(term4163, term4163.getClass(), "representImg", null);
        setField(term4163, term4163.getClass(), "sumnail", null);
        setDoubleField(term4163, term4163.getClass(), "lng", 0.0);
        setDoubleField(term4163, term4163.getClass(), "lat", 0.0);
        setField(term4163, term4163.getClass(), "tel", null);
        setField(term4163, term4163.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLng", argTypes, term4163, args);
    }

};



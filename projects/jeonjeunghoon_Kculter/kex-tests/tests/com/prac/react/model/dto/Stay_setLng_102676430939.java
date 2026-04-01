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
import java.lang.Double;

public class Stay_setLng_102676430939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4166;
     Object term4169;

    public Stay_setLng_102676430939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4166 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4166, term4166.getClass(), "addr1", null);
        setField(term4166, term4166.getClass(), "addr2", null);
        setField(term4166, term4166.getClass(), "areaCode", null);
        setField(term4166, term4166.getClass(), "sigunguCode", null);
        setField(term4166, term4166.getClass(), "representImg", null);
        setField(term4166, term4166.getClass(), "sumnail", null);
        setDoubleField(term4166, term4166.getClass(), "lng", 0.0);
        setDoubleField(term4166, term4166.getClass(), "lat", 0.0);
        setField(term4166, term4166.getClass(), "tel", null);
        setField(term4166, term4166.getClass(), "title", null);
        term4169 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4169;
        callMethod(klass, "setLng", argTypes, term4166, args);
    }

};



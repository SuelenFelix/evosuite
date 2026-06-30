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

public class Stay_getSigunguCode_113515967131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4142;

    public Stay_getSigunguCode_113515967131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4142 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4142, term4142.getClass(), "addr1", null);
        setField(term4142, term4142.getClass(), "addr2", null);
        setField(term4142, term4142.getClass(), "areaCode", null);
        setField(term4142, term4142.getClass(), "sigunguCode", null);
        setField(term4142, term4142.getClass(), "representImg", null);
        setField(term4142, term4142.getClass(), "sumnail", null);
        setDoubleField(term4142, term4142.getClass(), "lng", 0.0);
        setDoubleField(term4142, term4142.getClass(), "lat", 0.0);
        setField(term4142, term4142.getClass(), "tel", null);
        setField(term4142, term4142.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSigunguCode", argTypes, term4142, args);
    }

};



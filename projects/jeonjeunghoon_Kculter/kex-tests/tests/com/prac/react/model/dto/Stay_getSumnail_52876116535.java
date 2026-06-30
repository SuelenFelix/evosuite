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

public class Stay_getSumnail_52876116535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4154;

    public Stay_getSumnail_52876116535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4154 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4154, term4154.getClass(), "addr1", null);
        setField(term4154, term4154.getClass(), "addr2", null);
        setField(term4154, term4154.getClass(), "areaCode", null);
        setField(term4154, term4154.getClass(), "sigunguCode", null);
        setField(term4154, term4154.getClass(), "representImg", null);
        setField(term4154, term4154.getClass(), "sumnail", null);
        setDoubleField(term4154, term4154.getClass(), "lng", 0.0);
        setDoubleField(term4154, term4154.getClass(), "lat", 0.0);
        setField(term4154, term4154.getClass(), "tel", null);
        setField(term4154, term4154.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumnail", argTypes, term4154, args);
    }

};



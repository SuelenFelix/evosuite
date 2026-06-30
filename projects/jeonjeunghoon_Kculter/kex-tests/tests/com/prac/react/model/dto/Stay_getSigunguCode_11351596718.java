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

public class Stay_getSigunguCode_11351596718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;

    public Stay_getSigunguCode_11351596718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term1321, term1321.getClass(), "addr1", "nHXjMycHlU");
        setField(term1321, term1321.getClass(), "addr2", "ieCtQFdkii");
        setField(term1321, term1321.getClass(), "areaCode", "dEnhdmILtU");
        setField(term1321, term1321.getClass(), "sigunguCode", "hoicvmsovO");
        setField(term1321, term1321.getClass(), "representImg", "eqJfYWRaEL");
        setField(term1321, term1321.getClass(), "sumnail", "fhkbdRViHi");
        setDoubleField(term1321, term1321.getClass(), "lng", 0.7031006357544823);
        setDoubleField(term1321, term1321.getClass(), "lat", 0.9527281779865117);
        setField(term1321, term1321.getClass(), "tel", "uWHnvSvaPl");
        setField(term1321, term1321.getClass(), "title", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSigunguCode", argTypes, term1321, args);
    }

};



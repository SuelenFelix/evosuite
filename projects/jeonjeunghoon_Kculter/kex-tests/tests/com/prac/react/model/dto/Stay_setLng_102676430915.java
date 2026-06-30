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

public class Stay_setLng_102676430915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2640;
     Object term2739;

    public Stay_setLng_102676430915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2640 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term2640, term2640.getClass(), "addr1", "pORebkoRdD");
        setField(term2640, term2640.getClass(), "addr2", "mXGCWJDOqA");
        setField(term2640, term2640.getClass(), "areaCode", "dpNsDgfPso");
        setField(term2640, term2640.getClass(), "sigunguCode", "hCWPJQKpdc");
        setField(term2640, term2640.getClass(), "representImg", "WzMEhMXkKx");
        setField(term2640, term2640.getClass(), "sumnail", "XOiDvlDhdc");
        setDoubleField(term2640, term2640.getClass(), "lng", 0.10667076642995188);
        setDoubleField(term2640, term2640.getClass(), "lat", 0.11493000848982304);
        setField(term2640, term2640.getClass(), "tel", "AdxvLJhNLe");
        setField(term2640, term2640.getClass(), "title", "lHfTrWKMPk");
        term2739 = new Double(0.37161417339133307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2739;
        callMethod(klass, "setLng", argTypes, term2640, args);
    }

};



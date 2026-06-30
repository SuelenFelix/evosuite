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

public class Stay_getLng_65476192314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2461;

    public Stay_getLng_65476192314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2461 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term2461, term2461.getClass(), "addr1", "eVpkWxjuki");
        setField(term2461, term2461.getClass(), "addr2", "SJiQaLvSKv");
        setField(term2461, term2461.getClass(), "areaCode", "OEXDRUKcFl");
        setField(term2461, term2461.getClass(), "sigunguCode", "RYdKCNNMBR");
        setField(term2461, term2461.getClass(), "representImg", "yGtHPyvYiQ");
        setField(term2461, term2461.getClass(), "sumnail", "MvRIxilFMJ");
        setDoubleField(term2461, term2461.getClass(), "lng", 0.5840714198152577);
        setDoubleField(term2461, term2461.getClass(), "lat", 0.7559240768573477);
        setField(term2461, term2461.getClass(), "tel", "iNwOJRBEjp");
        setField(term2461, term2461.getClass(), "title", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLng", argTypes, term2461, args);
    }

};



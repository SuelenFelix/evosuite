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

public class Stay_setSigunguCode_12382104879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1500;

    public Stay_setSigunguCode_12382104879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1500 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term1500, term1500.getClass(), "addr1", "TJmVBGfTML");
        setField(term1500, term1500.getClass(), "addr2", "tPlsykYBqO");
        setField(term1500, term1500.getClass(), "areaCode", "bLPjGVBhlX");
        setField(term1500, term1500.getClass(), "sigunguCode", "whBvTVIIlC");
        setField(term1500, term1500.getClass(), "representImg", "IgRJUzaCwW");
        setField(term1500, term1500.getClass(), "sumnail", "JUmudUmaaV");
        setDoubleField(term1500, term1500.getClass(), "lng", 0.9828442029246764);
        setDoubleField(term1500, term1500.getClass(), "lat", 0.2779719046761513);
        setField(term1500, term1500.getClass(), "tel", "KoyGrUJeJW");
        setField(term1500, term1500.getClass(), "title", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        callMethod(klass, "setSigunguCode", argTypes, term1500, args);
    }

};



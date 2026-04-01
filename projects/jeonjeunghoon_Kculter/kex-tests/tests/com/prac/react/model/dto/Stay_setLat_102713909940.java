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

public class Stay_setLat_102713909940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5439;
     Object term5442;

    public Stay_setLat_102713909940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5439 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term5439, term5439.getClass(), "addr1", null);
        setField(term5439, term5439.getClass(), "addr2", null);
        setField(term5439, term5439.getClass(), "areaCode", null);
        setField(term5439, term5439.getClass(), "sigunguCode", null);
        setField(term5439, term5439.getClass(), "representImg", null);
        setField(term5439, term5439.getClass(), "sumnail", null);
        setDoubleField(term5439, term5439.getClass(), "lng", 0.0);
        setDoubleField(term5439, term5439.getClass(), "lat", 0.0);
        setField(term5439, term5439.getClass(), "tel", null);
        setField(term5439, term5439.getClass(), "title", null);
        term5442 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5442;
        callMethod(klass, "setLat", argTypes, term5439, args);
    }

};



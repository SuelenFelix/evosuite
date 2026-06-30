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

public class LocationBase_getFirstimage_2476180448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28347;

    public LocationBase_getFirstimage_2476180448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28347 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term28347, term28347.getClass(), "addr1", "aDoBLXfFQI");
        setField(term28347, term28347.getClass(), "addr2", "HTimNhSNVi");
        setField(term28347, term28347.getClass(), "contenttypeid", "IWJWbrHcqm");
        setField(term28347, term28347.getClass(), "firstimage", "ucTcadpUdW");
        setField(term28347, term28347.getClass(), "firstimage2", "AscVKZhCwm");
        setField(term28347, term28347.getClass(), "mapx", "HCvSsQWjLn");
        setField(term28347, term28347.getClass(), "mapy", "FTuOcSieav");
        setField(term28347, term28347.getClass(), "tel", "qSnwPXRuzC");
        setField(term28347, term28347.getClass(), "title", "gqhqalMaKC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstimage", argTypes, term28347, args);
    }

};



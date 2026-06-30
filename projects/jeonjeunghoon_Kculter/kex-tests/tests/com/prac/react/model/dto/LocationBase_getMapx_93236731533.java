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

public class LocationBase_getMapx_93236731533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31076;

    public LocationBase_getMapx_93236731533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31076 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term31076, term31076.getClass(), "addr1", null);
        setField(term31076, term31076.getClass(), "addr2", null);
        setField(term31076, term31076.getClass(), "contenttypeid", null);
        setField(term31076, term31076.getClass(), "firstimage", null);
        setField(term31076, term31076.getClass(), "firstimage2", null);
        setField(term31076, term31076.getClass(), "mapx", null);
        setField(term31076, term31076.getClass(), "mapy", null);
        setField(term31076, term31076.getClass(), "tel", null);
        setField(term31076, term31076.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapx", argTypes, term31076, args);
    }

};



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

public class LocationBase_setFirstimage_120210308430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31073;

    public LocationBase_setFirstimage_120210308430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31073 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term31073, term31073.getClass(), "addr1", null);
        setField(term31073, term31073.getClass(), "addr2", null);
        setField(term31073, term31073.getClass(), "contenttypeid", null);
        setField(term31073, term31073.getClass(), "firstimage", null);
        setField(term31073, term31073.getClass(), "firstimage2", null);
        setField(term31073, term31073.getClass(), "mapx", null);
        setField(term31073, term31073.getClass(), "mapy", null);
        setField(term31073, term31073.getClass(), "tel", null);
        setField(term31073, term31073.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstimage", argTypes, term31073, args);
    }

};



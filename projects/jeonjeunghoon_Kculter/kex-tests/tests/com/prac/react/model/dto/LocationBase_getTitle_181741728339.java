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

public class LocationBase_getTitle_181741728339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31082;

    public LocationBase_getTitle_181741728339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31082 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term31082, term31082.getClass(), "addr1", null);
        setField(term31082, term31082.getClass(), "addr2", null);
        setField(term31082, term31082.getClass(), "contenttypeid", null);
        setField(term31082, term31082.getClass(), "firstimage", null);
        setField(term31082, term31082.getClass(), "firstimage2", null);
        setField(term31082, term31082.getClass(), "mapx", null);
        setField(term31082, term31082.getClass(), "mapy", null);
        setField(term31082, term31082.getClass(), "tel", null);
        setField(term31082, term31082.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term31082, args);
    }

};



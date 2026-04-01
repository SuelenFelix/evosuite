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

public class LocationBase_getAddr2_165791039425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31068;

    public LocationBase_getAddr2_165791039425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31068 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term31068, term31068.getClass(), "addr1", null);
        setField(term31068, term31068.getClass(), "addr2", null);
        setField(term31068, term31068.getClass(), "contenttypeid", null);
        setField(term31068, term31068.getClass(), "firstimage", null);
        setField(term31068, term31068.getClass(), "firstimage2", null);
        setField(term31068, term31068.getClass(), "mapx", null);
        setField(term31068, term31068.getClass(), "mapy", null);
        setField(term31068, term31068.getClass(), "tel", null);
        setField(term31068, term31068.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr2", argTypes, term31068, args);
    }

};



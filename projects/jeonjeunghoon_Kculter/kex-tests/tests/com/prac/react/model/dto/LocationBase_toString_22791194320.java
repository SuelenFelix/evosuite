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

public class LocationBase_toString_22791194320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30867;

    public LocationBase_toString_22791194320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30867 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term30867, term30867.getClass(), "addr1", "JiSIFtJnYv");
        setField(term30867, term30867.getClass(), "addr2", "wxAHQRVgKc");
        setField(term30867, term30867.getClass(), "contenttypeid", "bYsZEHeoeV");
        setField(term30867, term30867.getClass(), "firstimage", "IwvwrQylib");
        setField(term30867, term30867.getClass(), "firstimage2", "ZWJgSttNjg");
        setField(term30867, term30867.getClass(), "mapx", "LQTIjJLkXH");
        setField(term30867, term30867.getClass(), "mapy", "RvkBwedFKx");
        setField(term30867, term30867.getClass(), "tel", "DYzWJljbaE");
        setField(term30867, term30867.getClass(), "title", "idwbHVHUcz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30867, args);
    }

};



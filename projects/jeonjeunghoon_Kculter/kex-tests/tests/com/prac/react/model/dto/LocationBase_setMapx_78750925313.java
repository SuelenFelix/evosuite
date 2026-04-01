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

public class LocationBase_setMapx_78750925313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29386;

    public LocationBase_setMapx_78750925313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29386 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term29386, term29386.getClass(), "addr1", "SAglaHkagn");
        setField(term29386, term29386.getClass(), "addr2", "eZGxUfdoFn");
        setField(term29386, term29386.getClass(), "contenttypeid", "yCWSlaOrSv");
        setField(term29386, term29386.getClass(), "firstimage", "PFpWKxDIRz");
        setField(term29386, term29386.getClass(), "firstimage2", "qePuOCwoCf");
        setField(term29386, term29386.getClass(), "mapx", "vJPujDInGq");
        setField(term29386, term29386.getClass(), "mapy", "cHZGcMhatT");
        setField(term29386, term29386.getClass(), "tel", "OZGyrUPedG");
        setField(term29386, term29386.getClass(), "title", "GAxMzRqmXU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XMhUDGKSWO";
        callMethod(klass, "setMapx", argTypes, term29386, args);
    }

};



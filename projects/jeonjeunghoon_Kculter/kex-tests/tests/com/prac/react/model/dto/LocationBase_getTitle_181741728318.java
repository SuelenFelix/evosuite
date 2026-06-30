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

public class LocationBase_getTitle_181741728318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30447;

    public LocationBase_getTitle_181741728318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30447 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term30447, term30447.getClass(), "addr1", "ScztqspySK");
        setField(term30447, term30447.getClass(), "addr2", "IvYxGwWoVu");
        setField(term30447, term30447.getClass(), "contenttypeid", "XnZHOhTfxL");
        setField(term30447, term30447.getClass(), "firstimage", "oFBhNamtAs");
        setField(term30447, term30447.getClass(), "firstimage2", "YURcpRjwSt");
        setField(term30447, term30447.getClass(), "mapx", "SXMdNSGPog");
        setField(term30447, term30447.getClass(), "mapy", "vsqwOLpDjj");
        setField(term30447, term30447.getClass(), "tel", "rJgXQRsPCl");
        setField(term30447, term30447.getClass(), "title", "RgqpoBknjN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term30447, args);
    }

};



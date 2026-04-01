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

public class LocationBase_setFirstimage_12021030849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28546;

    public LocationBase_setFirstimage_12021030849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28546 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term28546, term28546.getClass(), "addr1", "qkMduZHBXR");
        setField(term28546, term28546.getClass(), "addr2", "jMQsCLYfKd");
        setField(term28546, term28546.getClass(), "contenttypeid", "dpcpGqEQLd");
        setField(term28546, term28546.getClass(), "firstimage", "pButgbcWlR");
        setField(term28546, term28546.getClass(), "firstimage2", "tPiZMhJIXj");
        setField(term28546, term28546.getClass(), "mapx", "lrEkNimddJ");
        setField(term28546, term28546.getClass(), "mapy", "fkeYGEUxMA");
        setField(term28546, term28546.getClass(), "tel", "aJUGPodUIW");
        setField(term28546, term28546.getClass(), "title", "NpjPDfnDRd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SWMYovqYdk";
        callMethod(klass, "setFirstimage", argTypes, term28546, args);
    }

};



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

public class LocationBase_setTel_179242176017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30226;

    public LocationBase_setTel_179242176017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30226 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term30226, term30226.getClass(), "addr1", "sMqpXbgEga");
        setField(term30226, term30226.getClass(), "addr2", "nYJlDpoMcL");
        setField(term30226, term30226.getClass(), "contenttypeid", "SQnbnBmbcf");
        setField(term30226, term30226.getClass(), "firstimage", "jaNVteZrZi");
        setField(term30226, term30226.getClass(), "firstimage2", "bMRkDiPUGu");
        setField(term30226, term30226.getClass(), "mapx", "xjKxECGyLT");
        setField(term30226, term30226.getClass(), "mapy", "ffKeJGEXBT");
        setField(term30226, term30226.getClass(), "tel", "rsnXTpfhqf");
        setField(term30226, term30226.getClass(), "title", "gzvlGZVfnZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rmSqCaXWHi";
        callMethod(klass, "setTel", argTypes, term30226, args);
    }

};



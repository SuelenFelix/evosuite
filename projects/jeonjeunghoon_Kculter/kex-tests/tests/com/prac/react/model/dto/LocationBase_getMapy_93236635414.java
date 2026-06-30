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

public class LocationBase_getMapy_93236635414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29607;

    public LocationBase_getMapy_93236635414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29607 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term29607, term29607.getClass(), "addr1", "jLgzxtuvVo");
        setField(term29607, term29607.getClass(), "addr2", "wmmxjOkPnH");
        setField(term29607, term29607.getClass(), "contenttypeid", "jgRohUQWxJ");
        setField(term29607, term29607.getClass(), "firstimage", "CJlAiZDIQO");
        setField(term29607, term29607.getClass(), "firstimage2", "osgWaTBVoE");
        setField(term29607, term29607.getClass(), "mapx", "mvkMYcgAod");
        setField(term29607, term29607.getClass(), "mapy", "esbhDGQDgF");
        setField(term29607, term29607.getClass(), "tel", "tKlyiBloWu");
        setField(term29607, term29607.getClass(), "title", "uIgRFcwqLd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapy", argTypes, term29607, args);
    }

};



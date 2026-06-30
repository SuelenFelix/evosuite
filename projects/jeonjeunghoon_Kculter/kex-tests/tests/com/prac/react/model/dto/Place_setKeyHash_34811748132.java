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

public class Place_setKeyHash_34811748132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8527;

    public Place_setKeyHash_34811748132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8527 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8527, term8527.getClass(), "placeNum", 0);
        setField(term8527, term8527.getClass(), "keyHash", null);
        setIntField(term8527, term8527.getClass(), "placeType", 0);
        setField(term8527, term8527.getClass(), "culture", null);
        setField(term8527, term8527.getClass(), "kpop", null);
        setDoubleField(term8527, term8527.getClass(), "lat", 0.0);
        setDoubleField(term8527, term8527.getClass(), "lng", 0.0);
        setIntField(term8527, term8527.getClass(), "status", 0);
        setField(term8527, term8527.getClass(), "name", null);
        setField(term8527, term8527.getClass(), "explain", null);
        setField(term8527, term8527.getClass(), "address", null);
        setField(term8527, term8527.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKeyHash", argTypes, term8527, args);
    }

};



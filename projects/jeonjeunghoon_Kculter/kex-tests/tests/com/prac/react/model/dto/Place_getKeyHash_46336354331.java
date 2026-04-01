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

public class Place_getKeyHash_46336354331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8521;

    public Place_getKeyHash_46336354331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8521 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8521, term8521.getClass(), "placeNum", 0);
        setField(term8521, term8521.getClass(), "keyHash", null);
        setIntField(term8521, term8521.getClass(), "placeType", 0);
        setField(term8521, term8521.getClass(), "culture", null);
        setField(term8521, term8521.getClass(), "kpop", null);
        setDoubleField(term8521, term8521.getClass(), "lat", 0.0);
        setDoubleField(term8521, term8521.getClass(), "lng", 0.0);
        setIntField(term8521, term8521.getClass(), "status", 0);
        setField(term8521, term8521.getClass(), "name", null);
        setField(term8521, term8521.getClass(), "explain", null);
        setField(term8521, term8521.getClass(), "address", null);
        setField(term8521, term8521.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyHash", argTypes, term8521, args);
    }

};



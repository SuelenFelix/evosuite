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

public class Place_getAddress_63635046649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8637;

    public Place_getAddress_63635046649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8637 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8637, term8637.getClass(), "placeNum", 0);
        setField(term8637, term8637.getClass(), "keyHash", null);
        setIntField(term8637, term8637.getClass(), "placeType", 0);
        setField(term8637, term8637.getClass(), "culture", null);
        setField(term8637, term8637.getClass(), "kpop", null);
        setDoubleField(term8637, term8637.getClass(), "lat", 0.0);
        setDoubleField(term8637, term8637.getClass(), "lng", 0.0);
        setIntField(term8637, term8637.getClass(), "status", 0);
        setField(term8637, term8637.getClass(), "name", null);
        setField(term8637, term8637.getClass(), "explain", null);
        setField(term8637, term8637.getClass(), "address", null);
        setField(term8637, term8637.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term8637, args);
    }

};



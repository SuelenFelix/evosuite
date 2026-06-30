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
import java.lang.Integer;

public class Place_setPlaceNum_78021352230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8513;
     Object term8519;

    public Place_setPlaceNum_78021352230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8513 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8513, term8513.getClass(), "placeNum", 0);
        setField(term8513, term8513.getClass(), "keyHash", null);
        setIntField(term8513, term8513.getClass(), "placeType", 0);
        setField(term8513, term8513.getClass(), "culture", null);
        setField(term8513, term8513.getClass(), "kpop", null);
        setDoubleField(term8513, term8513.getClass(), "lat", 0.0);
        setDoubleField(term8513, term8513.getClass(), "lng", 0.0);
        setIntField(term8513, term8513.getClass(), "status", 0);
        setField(term8513, term8513.getClass(), "name", null);
        setField(term8513, term8513.getClass(), "explain", null);
        setField(term8513, term8513.getClass(), "address", null);
        setField(term8513, term8513.getClass(), "fileUrl", null);
        term8519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8519;
        callMethod(klass, "setPlaceNum", argTypes, term8513, args);
    }

};



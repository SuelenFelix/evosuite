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

public class Place_toString_27365150053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8661;

    public Place_toString_27365150053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8661 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8661, term8661.getClass(), "placeNum", 0);
        setField(term8661, term8661.getClass(), "keyHash", null);
        setIntField(term8661, term8661.getClass(), "placeType", 0);
        setField(term8661, term8661.getClass(), "culture", null);
        setField(term8661, term8661.getClass(), "kpop", null);
        setDoubleField(term8661, term8661.getClass(), "lat", 0.0);
        setDoubleField(term8661, term8661.getClass(), "lng", 0.0);
        setIntField(term8661, term8661.getClass(), "status", 0);
        setField(term8661, term8661.getClass(), "name", null);
        setField(term8661, term8661.getClass(), "explain", null);
        setField(term8661, term8661.getClass(), "address", null);
        setField(term8661, term8661.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8661, args);
    }

};



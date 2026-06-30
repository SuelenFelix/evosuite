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
import java.lang.Double;

public class Place_setLng_46670774142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8591;
     Object term8597;

    public Place_setLng_46670774142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8591 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8591, term8591.getClass(), "placeNum", 0);
        setField(term8591, term8591.getClass(), "keyHash", null);
        setIntField(term8591, term8591.getClass(), "placeType", 0);
        setField(term8591, term8591.getClass(), "culture", null);
        setField(term8591, term8591.getClass(), "kpop", null);
        setDoubleField(term8591, term8591.getClass(), "lat", 0.0);
        setDoubleField(term8591, term8591.getClass(), "lng", 0.0);
        setIntField(term8591, term8591.getClass(), "status", 0);
        setField(term8591, term8591.getClass(), "name", null);
        setField(term8591, term8591.getClass(), "explain", null);
        setField(term8591, term8591.getClass(), "address", null);
        setField(term8591, term8591.getClass(), "fileUrl", null);
        term8597 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8597;
        callMethod(klass, "setLng", argTypes, term8591, args);
    }

};



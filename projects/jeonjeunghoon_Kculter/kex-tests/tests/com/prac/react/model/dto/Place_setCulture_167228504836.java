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

public class Place_setCulture_167228504836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8553;

    public Place_setCulture_167228504836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8553 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8553, term8553.getClass(), "placeNum", 0);
        setField(term8553, term8553.getClass(), "keyHash", null);
        setIntField(term8553, term8553.getClass(), "placeType", 0);
        setField(term8553, term8553.getClass(), "culture", null);
        setField(term8553, term8553.getClass(), "kpop", null);
        setDoubleField(term8553, term8553.getClass(), "lat", 0.0);
        setDoubleField(term8553, term8553.getClass(), "lng", 0.0);
        setIntField(term8553, term8553.getClass(), "status", 0);
        setField(term8553, term8553.getClass(), "name", null);
        setField(term8553, term8553.getClass(), "explain", null);
        setField(term8553, term8553.getClass(), "address", null);
        setField(term8553, term8553.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCulture", argTypes, term8553, args);
    }

};



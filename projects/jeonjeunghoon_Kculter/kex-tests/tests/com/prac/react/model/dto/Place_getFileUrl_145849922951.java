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

public class Place_getFileUrl_145849922951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8649;

    public Place_getFileUrl_145849922951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8649 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8649, term8649.getClass(), "placeNum", 0);
        setField(term8649, term8649.getClass(), "keyHash", null);
        setIntField(term8649, term8649.getClass(), "placeType", 0);
        setField(term8649, term8649.getClass(), "culture", null);
        setField(term8649, term8649.getClass(), "kpop", null);
        setDoubleField(term8649, term8649.getClass(), "lat", 0.0);
        setDoubleField(term8649, term8649.getClass(), "lng", 0.0);
        setIntField(term8649, term8649.getClass(), "status", 0);
        setField(term8649, term8649.getClass(), "name", null);
        setField(term8649, term8649.getClass(), "explain", null);
        setField(term8649, term8649.getClass(), "address", null);
        setField(term8649, term8649.getClass(), "fileUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term8649, args);
    }

};



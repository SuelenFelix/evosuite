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

public class LocationBase_setFirstimage2_164453598811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28966;

    public LocationBase_setFirstimage2_164453598811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28966 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term28966, term28966.getClass(), "addr1", "jRDZpkFkoD");
        setField(term28966, term28966.getClass(), "addr2", "wwSknqIBIO");
        setField(term28966, term28966.getClass(), "contenttypeid", "zQPAxUFaeX");
        setField(term28966, term28966.getClass(), "firstimage", "cKNHUkrYfK");
        setField(term28966, term28966.getClass(), "firstimage2", "crMeWqJOCQ");
        setField(term28966, term28966.getClass(), "mapx", "VUVgiQvSYa");
        setField(term28966, term28966.getClass(), "mapy", "sEGgJJplmE");
        setField(term28966, term28966.getClass(), "tel", "jyexiarswN");
        setField(term28966, term28966.getClass(), "title", "ZBLFNFVEHD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "miNxpUfOyL";
        callMethod(klass, "setFirstimage2", argTypes, term28966, args);
    }

};



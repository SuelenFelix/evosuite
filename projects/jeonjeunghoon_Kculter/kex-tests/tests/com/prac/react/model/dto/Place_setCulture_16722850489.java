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

public class Place_setCulture_16722850489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5479;

    public Place_setCulture_16722850489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5479 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5479, term5479.getClass(), "placeNum", 590364439);
        setField(term5479, term5479.getClass(), "keyHash", "iIRsCSYqXH");
        setIntField(term5479, term5479.getClass(), "placeType", 865208305);
        setField(term5479, term5479.getClass(), "culture", "nghfqDXyCG");
        setField(term5479, term5479.getClass(), "kpop", "WBAOTqErtm");
        setDoubleField(term5479, term5479.getClass(), "lat", 0.13246999699526574);
        setDoubleField(term5479, term5479.getClass(), "lng", 0.9126850255993704);
        setIntField(term5479, term5479.getClass(), "status", -1275173084);
        setField(term5479, term5479.getClass(), "name", "PqtVXXZMqK");
        setField(term5479, term5479.getClass(), "explain", "rYbtIDVdnd");
        setField(term5479, term5479.getClass(), "address", "UKAReurpHG");
        setField(term5479, term5479.getClass(), "fileUrl", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setCulture", argTypes, term5479, args);
    }

};



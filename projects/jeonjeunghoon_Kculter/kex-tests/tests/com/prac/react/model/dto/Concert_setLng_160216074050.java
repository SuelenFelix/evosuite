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

public class Concert_setLng_160216074050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24069;
     Object term24075;

    public Concert_setLng_160216074050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24069 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24069, term24069.getClass(), "concertNum", 0);
        setField(term24069, term24069.getClass(), "concertHash", null);
        setField(term24069, term24069.getClass(), "concertName", null);
        setField(term24069, term24069.getClass(), "explain", null);
        setField(term24069, term24069.getClass(), "startDate", null);
        setField(term24069, term24069.getClass(), "endDate", null);
        setDoubleField(term24069, term24069.getClass(), "lat", 0.0);
        setDoubleField(term24069, term24069.getClass(), "lng", 0.0);
        setIntField(term24069, term24069.getClass(), "starKey", 0);
        setField(term24069, term24069.getClass(), "starHash", null);
        setField(term24069, term24069.getClass(), "imageUrl", null);
        setIntField(term24069, term24069.getClass(), "status", 0);
        setField(term24069, term24069.getClass(), "starName", null);
        setField(term24069, term24069.getClass(), "placeName", null);
        setField(term24069, term24069.getClass(), "buySite", null);
        term24075 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term24075;
        callMethod(klass, "setLng", argTypes, term24069, args);
    }

};



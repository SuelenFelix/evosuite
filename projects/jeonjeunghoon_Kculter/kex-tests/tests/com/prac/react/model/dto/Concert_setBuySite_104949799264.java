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

public class Concert_setBuySite_104949799264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24159;

    public Concert_setBuySite_104949799264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24159 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24159, term24159.getClass(), "concertNum", 0);
        setField(term24159, term24159.getClass(), "concertHash", null);
        setField(term24159, term24159.getClass(), "concertName", null);
        setField(term24159, term24159.getClass(), "explain", null);
        setField(term24159, term24159.getClass(), "startDate", null);
        setField(term24159, term24159.getClass(), "endDate", null);
        setDoubleField(term24159, term24159.getClass(), "lat", 0.0);
        setDoubleField(term24159, term24159.getClass(), "lng", 0.0);
        setIntField(term24159, term24159.getClass(), "starKey", 0);
        setField(term24159, term24159.getClass(), "starHash", null);
        setField(term24159, term24159.getClass(), "imageUrl", null);
        setIntField(term24159, term24159.getClass(), "status", 0);
        setField(term24159, term24159.getClass(), "starName", null);
        setField(term24159, term24159.getClass(), "placeName", null);
        setField(term24159, term24159.getClass(), "buySite", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBuySite", argTypes, term24159, args);
    }

};



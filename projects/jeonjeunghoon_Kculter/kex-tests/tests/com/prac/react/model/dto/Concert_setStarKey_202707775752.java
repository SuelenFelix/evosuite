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

public class Concert_setStarKey_202707775752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24083;
     Object term24089;

    public Concert_setStarKey_202707775752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24083 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24083, term24083.getClass(), "concertNum", 0);
        setField(term24083, term24083.getClass(), "concertHash", null);
        setField(term24083, term24083.getClass(), "concertName", null);
        setField(term24083, term24083.getClass(), "explain", null);
        setField(term24083, term24083.getClass(), "startDate", null);
        setField(term24083, term24083.getClass(), "endDate", null);
        setDoubleField(term24083, term24083.getClass(), "lat", 0.0);
        setDoubleField(term24083, term24083.getClass(), "lng", 0.0);
        setIntField(term24083, term24083.getClass(), "starKey", 0);
        setField(term24083, term24083.getClass(), "starHash", null);
        setField(term24083, term24083.getClass(), "imageUrl", null);
        setIntField(term24083, term24083.getClass(), "status", 0);
        setField(term24083, term24083.getClass(), "starName", null);
        setField(term24083, term24083.getClass(), "placeName", null);
        setField(term24083, term24083.getClass(), "buySite", null);
        term24089 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24089;
        callMethod(klass, "setStarKey", argTypes, term24083, args);
    }

};



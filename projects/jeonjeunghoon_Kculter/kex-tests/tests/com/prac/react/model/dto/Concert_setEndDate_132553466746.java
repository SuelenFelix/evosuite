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

public class Concert_setEndDate_132553466746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24043;

    public Concert_setEndDate_132553466746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24043 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24043, term24043.getClass(), "concertNum", 0);
        setField(term24043, term24043.getClass(), "concertHash", null);
        setField(term24043, term24043.getClass(), "concertName", null);
        setField(term24043, term24043.getClass(), "explain", null);
        setField(term24043, term24043.getClass(), "startDate", null);
        setField(term24043, term24043.getClass(), "endDate", null);
        setDoubleField(term24043, term24043.getClass(), "lat", 0.0);
        setDoubleField(term24043, term24043.getClass(), "lng", 0.0);
        setIntField(term24043, term24043.getClass(), "starKey", 0);
        setField(term24043, term24043.getClass(), "starHash", null);
        setField(term24043, term24043.getClass(), "imageUrl", null);
        setIntField(term24043, term24043.getClass(), "status", 0);
        setField(term24043, term24043.getClass(), "starName", null);
        setField(term24043, term24043.getClass(), "placeName", null);
        setField(term24043, term24043.getClass(), "buySite", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndDate", argTypes, term24043, args);
    }

};



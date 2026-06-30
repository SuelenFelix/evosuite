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

public class Concert_setStatus_166737338258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24121;
     Object term24127;

    public Concert_setStatus_166737338258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24121 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24121, term24121.getClass(), "concertNum", 0);
        setField(term24121, term24121.getClass(), "concertHash", null);
        setField(term24121, term24121.getClass(), "concertName", null);
        setField(term24121, term24121.getClass(), "explain", null);
        setField(term24121, term24121.getClass(), "startDate", null);
        setField(term24121, term24121.getClass(), "endDate", null);
        setDoubleField(term24121, term24121.getClass(), "lat", 0.0);
        setDoubleField(term24121, term24121.getClass(), "lng", 0.0);
        setIntField(term24121, term24121.getClass(), "starKey", 0);
        setField(term24121, term24121.getClass(), "starHash", null);
        setField(term24121, term24121.getClass(), "imageUrl", null);
        setIntField(term24121, term24121.getClass(), "status", 0);
        setField(term24121, term24121.getClass(), "starName", null);
        setField(term24121, term24121.getClass(), "placeName", null);
        setField(term24121, term24121.getClass(), "buySite", null);
        term24127 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24127;
        callMethod(klass, "setStatus", argTypes, term24121, args);
    }

};



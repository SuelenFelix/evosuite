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

public class Concert_setConcertHash_61609155138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23995;

    public Concert_setConcertHash_61609155138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23995 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term23995, term23995.getClass(), "concertNum", 0);
        setField(term23995, term23995.getClass(), "concertHash", null);
        setField(term23995, term23995.getClass(), "concertName", null);
        setField(term23995, term23995.getClass(), "explain", null);
        setField(term23995, term23995.getClass(), "startDate", null);
        setField(term23995, term23995.getClass(), "endDate", null);
        setDoubleField(term23995, term23995.getClass(), "lat", 0.0);
        setDoubleField(term23995, term23995.getClass(), "lng", 0.0);
        setIntField(term23995, term23995.getClass(), "starKey", 0);
        setField(term23995, term23995.getClass(), "starHash", null);
        setField(term23995, term23995.getClass(), "imageUrl", null);
        setIntField(term23995, term23995.getClass(), "status", 0);
        setField(term23995, term23995.getClass(), "starName", null);
        setField(term23995, term23995.getClass(), "placeName", null);
        setField(term23995, term23995.getClass(), "buySite", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setConcertHash", argTypes, term23995, args);
    }

};



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

public class Concert_getConcertHash_51304073537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23989;

    public Concert_getConcertHash_51304073537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23989 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term23989, term23989.getClass(), "concertNum", 0);
        setField(term23989, term23989.getClass(), "concertHash", null);
        setField(term23989, term23989.getClass(), "concertName", null);
        setField(term23989, term23989.getClass(), "explain", null);
        setField(term23989, term23989.getClass(), "startDate", null);
        setField(term23989, term23989.getClass(), "endDate", null);
        setDoubleField(term23989, term23989.getClass(), "lat", 0.0);
        setDoubleField(term23989, term23989.getClass(), "lng", 0.0);
        setIntField(term23989, term23989.getClass(), "starKey", 0);
        setField(term23989, term23989.getClass(), "starHash", null);
        setField(term23989, term23989.getClass(), "imageUrl", null);
        setIntField(term23989, term23989.getClass(), "status", 0);
        setField(term23989, term23989.getClass(), "starName", null);
        setField(term23989, term23989.getClass(), "placeName", null);
        setField(term23989, term23989.getClass(), "buySite", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConcertHash", argTypes, term23989, args);
    }

};



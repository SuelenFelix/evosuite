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

public class Concert_getBuySite_23801696863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24153;

    public Concert_getBuySite_23801696863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24153 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term24153, term24153.getClass(), "concertNum", 0);
        setField(term24153, term24153.getClass(), "concertHash", null);
        setField(term24153, term24153.getClass(), "concertName", null);
        setField(term24153, term24153.getClass(), "explain", null);
        setField(term24153, term24153.getClass(), "startDate", null);
        setField(term24153, term24153.getClass(), "endDate", null);
        setDoubleField(term24153, term24153.getClass(), "lat", 0.0);
        setDoubleField(term24153, term24153.getClass(), "lng", 0.0);
        setIntField(term24153, term24153.getClass(), "starKey", 0);
        setField(term24153, term24153.getClass(), "starHash", null);
        setField(term24153, term24153.getClass(), "imageUrl", null);
        setIntField(term24153, term24153.getClass(), "status", 0);
        setField(term24153, term24153.getClass(), "starName", null);
        setField(term24153, term24153.getClass(), "placeName", null);
        setField(term24153, term24153.getClass(), "buySite", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuySite", argTypes, term24153, args);
    }

};



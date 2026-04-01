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
import java.lang.Object;

public class Concert_getStarKey_47445787518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21061;

    public Concert_getStarKey_47445787518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21061 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term21099 = newInstance(Class.forName("java.util.Date"));
        Object term21101 = newInstance(Class.forName("java.util.Date"));
        setIntField(term21061, term21061.getClass(), "concertNum", -763799087);
        setField(term21061, term21061.getClass(), "concertHash", "oOUHomyJff");
        setField(term21061, term21061.getClass(), "concertName", "KnnoLMOuur");
        setField(term21061, term21061.getClass(), "explain", "buRpVghIvt");
        setLongField(term21099, term21099.getClass(), "fastTime", 1488725902101L);
        setField(term21099, term21099.getClass(), "cdate", null);
        setField(term21061, term21061.getClass(), "startDate", term21099);
        setLongField(term21101, term21101.getClass(), "fastTime", 1311560117361L);
        setField(term21101, term21101.getClass(), "cdate", null);
        setField(term21061, term21061.getClass(), "endDate", term21101);
        setDoubleField(term21061, term21061.getClass(), "lat", 0.5384156574050297);
        setDoubleField(term21061, term21061.getClass(), "lng", 0.28813953022653416);
        setIntField(term21061, term21061.getClass(), "starKey", 1207142014);
        setField(term21061, term21061.getClass(), "starHash", "oTGxFdiaIW");
        setField(term21061, term21061.getClass(), "imageUrl", "jlyFvaZlmv");
        setIntField(term21061, term21061.getClass(), "status", -876426634);
        setField(term21061, term21061.getClass(), "starName", "sofyLEfomV");
        setField(term21061, term21061.getClass(), "placeName", "zHcDSJHKAb");
        setField(term21061, term21061.getClass(), "buySite", "WRIQkTdeMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarKey", argTypes, term21061, args);
    }

};



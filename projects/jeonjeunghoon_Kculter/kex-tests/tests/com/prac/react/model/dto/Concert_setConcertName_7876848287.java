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

public class Concert_setConcertName_7876848287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18963;

    public Concert_setConcertName_7876848287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18963 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19001 = newInstance(Class.forName("java.util.Date"));
        Object term19003 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18963, term18963.getClass(), "concertNum", -763166094);
        setField(term18963, term18963.getClass(), "concertHash", "YYwIEARNxi");
        setField(term18963, term18963.getClass(), "concertName", "rblXBUdTFc");
        setField(term18963, term18963.getClass(), "explain", "rbsXSOJFKW");
        setLongField(term19001, term19001.getClass(), "fastTime", 1745462962080L);
        setField(term19001, term19001.getClass(), "cdate", null);
        setField(term18963, term18963.getClass(), "startDate", term19001);
        setLongField(term19003, term19003.getClass(), "fastTime", 1349069753960L);
        setField(term19003, term19003.getClass(), "cdate", null);
        setField(term18963, term18963.getClass(), "endDate", term19003);
        setDoubleField(term18963, term18963.getClass(), "lat", 0.20341461558365515);
        setDoubleField(term18963, term18963.getClass(), "lng", 0.10087360265456191);
        setIntField(term18963, term18963.getClass(), "starKey", -222941705);
        setField(term18963, term18963.getClass(), "starHash", "sAgGDoUNlf");
        setField(term18963, term18963.getClass(), "imageUrl", "TSTZcXdFFi");
        setIntField(term18963, term18963.getClass(), "status", 291864719);
        setField(term18963, term18963.getClass(), "starName", "RyaaOzWfYO");
        setField(term18963, term18963.getClass(), "placeName", "HAkxFBZZzz");
        setField(term18963, term18963.getClass(), "buySite", "yejonZnVuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ouesGIsvuG";
        callMethod(klass, "setConcertName", argTypes, term18963, args);
    }

};



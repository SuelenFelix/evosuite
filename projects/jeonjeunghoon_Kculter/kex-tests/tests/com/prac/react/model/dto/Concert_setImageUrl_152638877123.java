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

public class Concert_setImageUrl_152638877123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22015;

    public Concert_setImageUrl_152638877123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22015 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term22053 = newInstance(Class.forName("java.util.Date"));
        Object term22055 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22015, term22015.getClass(), "concertNum", 1713573821);
        setField(term22015, term22015.getClass(), "concertHash", "TqiCjeuoWE");
        setField(term22015, term22015.getClass(), "concertName", "GWWfkXOYLP");
        setField(term22015, term22015.getClass(), "explain", "qvykDllgpT");
        setLongField(term22053, term22053.getClass(), "fastTime", 1819191638549L);
        setField(term22053, term22053.getClass(), "cdate", null);
        setField(term22015, term22015.getClass(), "startDate", term22053);
        setLongField(term22055, term22055.getClass(), "fastTime", 1400691778698L);
        setField(term22055, term22055.getClass(), "cdate", null);
        setField(term22015, term22015.getClass(), "endDate", term22055);
        setDoubleField(term22015, term22015.getClass(), "lat", 0.332320568233212);
        setDoubleField(term22015, term22015.getClass(), "lng", 0.18561351983828822);
        setIntField(term22015, term22015.getClass(), "starKey", 1956590498);
        setField(term22015, term22015.getClass(), "starHash", "hzdUbcLZhZ");
        setField(term22015, term22015.getClass(), "imageUrl", "GlxnEJvYeC");
        setIntField(term22015, term22015.getClass(), "status", 1467356494);
        setField(term22015, term22015.getClass(), "starName", "SLdOGaqmNv");
        setField(term22015, term22015.getClass(), "placeName", "QZfhwDBzyR");
        setField(term22015, term22015.getClass(), "buySite", "HvnMmAOZev");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JTPAQsfRtT";
        callMethod(klass, "setImageUrl", argTypes, term22015, args);
    }

};



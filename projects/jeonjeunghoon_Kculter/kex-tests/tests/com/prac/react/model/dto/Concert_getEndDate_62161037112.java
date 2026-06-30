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

public class Concert_getEndDate_62161037112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19939;

    public Concert_getEndDate_62161037112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19939 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19977 = newInstance(Class.forName("java.util.Date"));
        Object term19979 = newInstance(Class.forName("java.util.Date"));
        setIntField(term19939, term19939.getClass(), "concertNum", 1964967720);
        setField(term19939, term19939.getClass(), "concertHash", "PlOnDkNrvX");
        setField(term19939, term19939.getClass(), "concertName", "MltgFGldop");
        setField(term19939, term19939.getClass(), "explain", "JCWSoxnBJs");
        setLongField(term19977, term19977.getClass(), "fastTime", 1744090065937L);
        setField(term19977, term19977.getClass(), "cdate", null);
        setField(term19939, term19939.getClass(), "startDate", term19977);
        setLongField(term19979, term19979.getClass(), "fastTime", 1347400561385L);
        setField(term19979, term19979.getClass(), "cdate", null);
        setField(term19939, term19939.getClass(), "endDate", term19979);
        setDoubleField(term19939, term19939.getClass(), "lat", 0.33871772875627537);
        setDoubleField(term19939, term19939.getClass(), "lng", 0.9952003100858836);
        setIntField(term19939, term19939.getClass(), "starKey", 1351900243);
        setField(term19939, term19939.getClass(), "starHash", "vAxcpvjEEa");
        setField(term19939, term19939.getClass(), "imageUrl", "FCkOgIBqXE");
        setIntField(term19939, term19939.getClass(), "status", -330897705);
        setField(term19939, term19939.getClass(), "starName", "kadRHthQRD");
        setField(term19939, term19939.getClass(), "placeName", "cGbJSRSpNn");
        setField(term19939, term19939.getClass(), "buySite", "MzXzaqaiHW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term19939, args);
    }

};



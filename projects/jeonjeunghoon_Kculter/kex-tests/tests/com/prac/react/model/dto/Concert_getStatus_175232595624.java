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

public class Concert_getStatus_175232595624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22223;

    public Concert_getStatus_175232595624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22223 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term22261 = newInstance(Class.forName("java.util.Date"));
        Object term22263 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22223, term22223.getClass(), "concertNum", -26316536);
        setField(term22223, term22223.getClass(), "concertHash", "otxkkKfDfl");
        setField(term22223, term22223.getClass(), "concertName", "bqIuFFFwnP");
        setField(term22223, term22223.getClass(), "explain", "hDxvvVgGlk");
        setLongField(term22261, term22261.getClass(), "fastTime", 1741444563811L);
        setField(term22261, term22261.getClass(), "cdate", null);
        setField(term22223, term22223.getClass(), "startDate", term22261);
        setLongField(term22263, term22263.getClass(), "fastTime", 1761994701322L);
        setField(term22263, term22263.getClass(), "cdate", null);
        setField(term22223, term22223.getClass(), "endDate", term22263);
        setDoubleField(term22223, term22223.getClass(), "lat", 0.9678135126533798);
        setDoubleField(term22223, term22223.getClass(), "lng", 0.3275035827937727);
        setIntField(term22223, term22223.getClass(), "starKey", 1716165145);
        setField(term22223, term22223.getClass(), "starHash", "XdjSvjaTqk");
        setField(term22223, term22223.getClass(), "imageUrl", "ukrlYVcvsg");
        setIntField(term22223, term22223.getClass(), "status", 1692937831);
        setField(term22223, term22223.getClass(), "starName", "cpjqTCNflQ");
        setField(term22223, term22223.getClass(), "placeName", "wiYGATEfmw");
        setField(term22223, term22223.getClass(), "buySite", "FiALSqneIg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term22223, args);
    }

};



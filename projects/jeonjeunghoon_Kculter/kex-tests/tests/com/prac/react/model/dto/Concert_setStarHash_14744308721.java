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

public class Concert_setStarHash_14744308721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21621;

    public Concert_setStarHash_14744308721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21621 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term21659 = newInstance(Class.forName("java.util.Date"));
        Object term21661 = newInstance(Class.forName("java.util.Date"));
        setIntField(term21621, term21621.getClass(), "concertNum", 114279242);
        setField(term21621, term21621.getClass(), "concertHash", "ckTRHEIcCK");
        setField(term21621, term21621.getClass(), "concertName", "NYSBqIpNlD");
        setField(term21621, term21621.getClass(), "explain", "OWglDUWQYb");
        setLongField(term21659, term21659.getClass(), "fastTime", 1678177615298L);
        setField(term21659, term21659.getClass(), "cdate", null);
        setField(term21621, term21621.getClass(), "startDate", term21659);
        setLongField(term21661, term21661.getClass(), "fastTime", 1666076287186L);
        setField(term21661, term21661.getClass(), "cdate", null);
        setField(term21621, term21621.getClass(), "endDate", term21661);
        setDoubleField(term21621, term21621.getClass(), "lat", 0.7157998497507287);
        setDoubleField(term21621, term21621.getClass(), "lng", 0.8399796378537906);
        setIntField(term21621, term21621.getClass(), "starKey", 990883365);
        setField(term21621, term21621.getClass(), "starHash", "FiqETbKjpv");
        setField(term21621, term21621.getClass(), "imageUrl", "FxXtdhhXyS");
        setIntField(term21621, term21621.getClass(), "status", 633598642);
        setField(term21621, term21621.getClass(), "starName", "HxCEzaCcgj");
        setField(term21621, term21621.getClass(), "placeName", "PDYPOQncAB");
        setField(term21621, term21621.getClass(), "buySite", "cHqLMqZSmc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hkWmAkXSOW";
        callMethod(klass, "setStarHash", argTypes, term21621, args);
    }

};



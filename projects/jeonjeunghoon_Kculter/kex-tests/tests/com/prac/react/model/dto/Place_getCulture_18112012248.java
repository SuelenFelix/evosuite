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

public class Place_getCulture_18112012248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5319;

    public Place_getCulture_18112012248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5319 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5319, term5319.getClass(), "placeNum", -117576464);
        setField(term5319, term5319.getClass(), "keyHash", "mfCpTPPQQm");
        setIntField(term5319, term5319.getClass(), "placeType", -1007160944);
        setField(term5319, term5319.getClass(), "culture", "OcJCIDNIXA");
        setField(term5319, term5319.getClass(), "kpop", "XfRABIFVEp");
        setDoubleField(term5319, term5319.getClass(), "lat", 0.3227335400819148);
        setDoubleField(term5319, term5319.getClass(), "lng", 0.43337207054070237);
        setIntField(term5319, term5319.getClass(), "status", 1135664017);
        setField(term5319, term5319.getClass(), "name", "MHGKyEnwKc");
        setField(term5319, term5319.getClass(), "explain", "ShIELyuULw");
        setField(term5319, term5319.getClass(), "address", "IpQuOGMgmj");
        setField(term5319, term5319.getClass(), "fileUrl", "pJbnHTYrxn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCulture", argTypes, term5319, args);
    }

};



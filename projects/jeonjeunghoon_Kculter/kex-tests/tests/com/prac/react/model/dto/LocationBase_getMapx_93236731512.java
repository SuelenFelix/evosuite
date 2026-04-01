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

public class LocationBase_getMapx_93236731512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29187;

    public LocationBase_getMapx_93236731512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29187 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term29187, term29187.getClass(), "addr1", "BAPTojeHRU");
        setField(term29187, term29187.getClass(), "addr2", "uqDEIRoVVf");
        setField(term29187, term29187.getClass(), "contenttypeid", "HnLeZhnLzz");
        setField(term29187, term29187.getClass(), "firstimage", "ziYEsRkZmD");
        setField(term29187, term29187.getClass(), "firstimage2", "RFbJNwiLtv");
        setField(term29187, term29187.getClass(), "mapx", "eCxWMOpomA");
        setField(term29187, term29187.getClass(), "mapy", "pkQawlBtEF");
        setField(term29187, term29187.getClass(), "tel", "rdKTcvHHnV");
        setField(term29187, term29187.getClass(), "title", "ELfUfLbXZf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapx", argTypes, term29187, args);
    }

};



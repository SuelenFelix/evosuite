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

public class Stay_setTel_127810474919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3360;

    public Stay_setTel_127810474919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3360 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term3360, term3360.getClass(), "addr1", "jwsfVjMoJT");
        setField(term3360, term3360.getClass(), "addr2", "ZfdXfCCFDf");
        setField(term3360, term3360.getClass(), "areaCode", "MwwjNtdOFT");
        setField(term3360, term3360.getClass(), "sigunguCode", "VYkqXKVlAJ");
        setField(term3360, term3360.getClass(), "representImg", "XkIoWJRNwN");
        setField(term3360, term3360.getClass(), "sumnail", "aNWLJdrZMq");
        setDoubleField(term3360, term3360.getClass(), "lng", 0.5279279537140873);
        setDoubleField(term3360, term3360.getClass(), "lat", 0.3202192021706908);
        setField(term3360, term3360.getClass(), "tel", "HHmNoYxIGj");
        setField(term3360, term3360.getClass(), "title", "PtirvZmsGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        callMethod(klass, "setTel", argTypes, term3360, args);
    }

};



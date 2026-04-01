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

public class Place_getKpop_93007072410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5661;

    public Place_getKpop_93007072410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5661 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5661, term5661.getClass(), "placeNum", -244121226);
        setField(term5661, term5661.getClass(), "keyHash", "vOuMEpOQAg");
        setIntField(term5661, term5661.getClass(), "placeType", -203030934);
        setField(term5661, term5661.getClass(), "culture", "SIODFGaQhr");
        setField(term5661, term5661.getClass(), "kpop", "qYzsiuXOgS");
        setDoubleField(term5661, term5661.getClass(), "lat", 0.11179067076100713);
        setDoubleField(term5661, term5661.getClass(), "lng", 0.5306473989087822);
        setIntField(term5661, term5661.getClass(), "status", -1179120542);
        setField(term5661, term5661.getClass(), "name", "bxrCBbrrct");
        setField(term5661, term5661.getClass(), "explain", "CKWpJaaaxX");
        setField(term5661, term5661.getClass(), "address", "UBRmXJmfrt");
        setField(term5661, term5661.getClass(), "fileUrl", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKpop", argTypes, term5661, args);
    }

};



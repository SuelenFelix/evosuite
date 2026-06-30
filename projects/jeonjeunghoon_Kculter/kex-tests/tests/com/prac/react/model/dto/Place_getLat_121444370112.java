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

public class Place_getLat_121444370112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6003;

    public Place_getLat_121444370112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6003 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6003, term6003.getClass(), "placeNum", -1087774327);
        setField(term6003, term6003.getClass(), "keyHash", "beAMpkroCQ");
        setIntField(term6003, term6003.getClass(), "placeType", -1530420153);
        setField(term6003, term6003.getClass(), "culture", "uSUvKAyuvd");
        setField(term6003, term6003.getClass(), "kpop", "onQLVONGuf");
        setDoubleField(term6003, term6003.getClass(), "lat", 0.016575281023182953);
        setDoubleField(term6003, term6003.getClass(), "lng", 0.5308350402051779);
        setIntField(term6003, term6003.getClass(), "status", -469968304);
        setField(term6003, term6003.getClass(), "name", "SOrEHbcbmn");
        setField(term6003, term6003.getClass(), "explain", "bnsyeQXFdu");
        setField(term6003, term6003.getClass(), "address", "BwtdjiefJn");
        setField(term6003, term6003.getClass(), "fileUrl", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLat", argTypes, term6003, args);
    }

};



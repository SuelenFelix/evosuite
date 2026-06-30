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

public class Place_setKeyHash_3481174815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4815;

    public Place_setKeyHash_3481174815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4815 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term4815, term4815.getClass(), "placeNum", -883034806);
        setField(term4815, term4815.getClass(), "keyHash", "QduALnDSVo");
        setIntField(term4815, term4815.getClass(), "placeType", 1585847225);
        setField(term4815, term4815.getClass(), "culture", "izPpKDErnQ");
        setField(term4815, term4815.getClass(), "kpop", "NnpwZBUTvx");
        setDoubleField(term4815, term4815.getClass(), "lat", 0.8566567697571895);
        setDoubleField(term4815, term4815.getClass(), "lng", 0.9203805380592256);
        setIntField(term4815, term4815.getClass(), "status", 597278769);
        setField(term4815, term4815.getClass(), "name", "tlQSNgTkQX");
        setField(term4815, term4815.getClass(), "explain", "PCipZnmBOF");
        setField(term4815, term4815.getClass(), "address", "zcorEihhLK");
        setField(term4815, term4815.getClass(), "fileUrl", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFyoseFGLF";
        callMethod(klass, "setKeyHash", argTypes, term4815, args);
    }

};



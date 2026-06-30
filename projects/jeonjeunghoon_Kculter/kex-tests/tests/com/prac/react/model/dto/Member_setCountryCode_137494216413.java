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

public class Member_setCountryCode_137494216413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11628;

    public Member_setCountryCode_137494216413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11628 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11628, term11628.getClass(), "memberNum", 480137250);
        setField(term11628, term11628.getClass(), "memberNumHash", "IlBhdrCvHq");
        setField(term11628, term11628.getClass(), "email", "OirVUQhauU");
        setField(term11628, term11628.getClass(), "pwd", "GLbyDfbNZI");
        setField(term11628, term11628.getClass(), "nickName", "oNLcCYDAsO");
        setField(term11628, term11628.getClass(), "countryCode", "CNqMxLvtcJ");
        setIntField(term11628, term11628.getClass(), "age", -341152642);
        setField(term11628, term11628.getClass(), "gender", "ktbqerIaKW");
        setField(term11628, term11628.getClass(), "pfUrl", "VoghngXfsK");
        setIntField(term11628, term11628.getClass(), "mg", -2015854073);
        setIntField(term11628, term11628.getClass(), "status", 538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbahCBMvct";
        callMethod(klass, "setCountryCode", argTypes, term11628, args);
    }

};



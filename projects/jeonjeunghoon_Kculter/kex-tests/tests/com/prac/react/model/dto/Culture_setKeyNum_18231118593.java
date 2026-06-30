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
import java.lang.Integer;

public class Culture_setKeyNum_18231118593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31250;
     Object term31303;

    public Culture_setKeyNum_18231118593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31250 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31250, term31250.getClass(), "keyNum", 1816273440);
        setField(term31250, term31250.getClass(), "keyHash", "KoPzTuvIeK");
        setField(term31250, term31250.getClass(), "name", "SMoWUILIhn");
        setIntField(term31250, term31250.getClass(), "likeCount", -96541009);
        setIntField(term31250, term31250.getClass(), "status", -43719302);
        setField(term31250, term31250.getClass(), "explain", "SvSKSCjgTM");
        setField(term31250, term31250.getClass(), "fileUrl", "UFxnRbWtog");
        setIntField(term31250, term31250.getClass(), "spot", 1024134939);
        term31303 = new Integer(109078154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31303;
        callMethod(klass, "setKeyNum", argTypes, term31250, args);
    }

};



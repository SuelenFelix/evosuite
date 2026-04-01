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

public class Pin_setPinKeyNum_6935097319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24989;
     Object term25029;

    public Pin_setPinKeyNum_6935097319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24989 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24989, term24989.getClass(), "pinNum", 313459791);
        setField(term24989, term24989.getClass(), "pinHash", "svPqsHBvrm");
        setIntField(term24989, term24989.getClass(), "pinType", 752615112);
        setIntField(term24989, term24989.getClass(), "pinKeyNum", -1674430871);
        setField(term24989, term24989.getClass(), "pinKeyHash", "sRzUJLYMmB");
        setField(term24989, term24989.getClass(), "imageUrl", "XxILklSDwz");
        term25029 = new Integer(794352120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25029;
        callMethod(klass, "setPinKeyNum", argTypes, term24989, args);
    }

};



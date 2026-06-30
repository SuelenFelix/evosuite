package com.datajpa.relationship.service;

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
import static com.datajpa.relationship.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ZipcodeServiceImpl_editZipcode_327173984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term32;

    public ZipcodeServiceImpl_editZipcode_327173984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = new Long(-8400487765614892086L);
        Long term45 = new Long(5270370404989704783L);
        term32 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.ZipcodeRequestDto"));
        setField(term32, term32.getClass(), "name", "sjlJAEtRrb");
        setField(term32, term32.getClass(), "cityId", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.service.ZipcodeServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.datajpa.relationship.dto.requestDto.ZipcodeRequestDto");
        Object[] args = new Object[2];
        args[0] = term30;
        args[1] = term32;
        callMethod(klass, "editZipcode", argTypes, null, args);
    }

};



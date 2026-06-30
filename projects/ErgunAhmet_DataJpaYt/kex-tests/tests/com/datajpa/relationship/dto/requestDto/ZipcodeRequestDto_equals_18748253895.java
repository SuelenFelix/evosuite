package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ZipcodeRequestDto_equals_18748253895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;
     Object term374;

    public ZipcodeRequestDto_equals_18748253895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term372 = new Long(-5476826692763582090L);
        term359 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.ZipcodeRequestDto"));
        setField(term359, term359.getClass(), "name", "oVcInYnLWB");
        setField(term359, term359.getClass(), "cityId", term372);
        term374 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.ZipcodeRequestDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term374;
        callMethod(klass, "equals", argTypes, term359, args);
    }

};



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

public class Pin_getPinKeyHash_192646012825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25499;

    public Pin_getPinKeyHash_192646012825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25499 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25499, term25499.getClass(), "pinNum", 0);
        setField(term25499, term25499.getClass(), "pinHash", null);
        setIntField(term25499, term25499.getClass(), "pinType", 0);
        setIntField(term25499, term25499.getClass(), "pinKeyNum", 0);
        setField(term25499, term25499.getClass(), "pinKeyHash", null);
        setField(term25499, term25499.getClass(), "imageUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPinKeyHash", argTypes, term25499, args);
    }

};



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

public class Pin_setPinKeyHash_47673900026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25503;

    public Pin_setPinKeyHash_47673900026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25503 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25503, term25503.getClass(), "pinNum", 0);
        setField(term25503, term25503.getClass(), "pinHash", null);
        setIntField(term25503, term25503.getClass(), "pinType", 0);
        setIntField(term25503, term25503.getClass(), "pinKeyNum", 0);
        setField(term25503, term25503.getClass(), "pinKeyHash", null);
        setField(term25503, term25503.getClass(), "imageUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPinKeyHash", argTypes, term25503, args);
    }

};



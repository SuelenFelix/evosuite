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

public class Pin_setPinNum_178188602618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25465;
     Object term25469;

    public Pin_setPinNum_178188602618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25465 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25465, term25465.getClass(), "pinNum", 0);
        setField(term25465, term25465.getClass(), "pinHash", null);
        setIntField(term25465, term25465.getClass(), "pinType", 0);
        setIntField(term25465, term25465.getClass(), "pinKeyNum", 0);
        setField(term25465, term25465.getClass(), "pinKeyHash", null);
        setField(term25465, term25465.getClass(), "imageUrl", null);
        term25469 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25469;
        callMethod(klass, "setPinNum", argTypes, term25465, args);
    }

};



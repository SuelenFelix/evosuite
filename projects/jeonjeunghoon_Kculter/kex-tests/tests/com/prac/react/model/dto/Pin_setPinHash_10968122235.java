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

public class Pin_setPinHash_10968122235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24685;

    public Pin_setPinHash_10968122235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24685 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24685, term24685.getClass(), "pinNum", 1465188553);
        setField(term24685, term24685.getClass(), "pinHash", "WzGudiEARD");
        setIntField(term24685, term24685.getClass(), "pinType", 1633913667);
        setIntField(term24685, term24685.getClass(), "pinKeyNum", 1292332296);
        setField(term24685, term24685.getClass(), "pinKeyHash", "IoefPqGtaj");
        setField(term24685, term24685.getClass(), "imageUrl", "YMmtjELJuB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FzyIShiOmb";
        callMethod(klass, "setPinHash", argTypes, term24685, args);
    }

};



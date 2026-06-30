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

public class Pin_getPinKeyNum_10745992198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24919;

    public Pin_getPinKeyNum_10745992198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24919 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24919, term24919.getClass(), "pinNum", -1912429941);
        setField(term24919, term24919.getClass(), "pinHash", "VoKhXiLAaW");
        setIntField(term24919, term24919.getClass(), "pinType", 1801052257);
        setIntField(term24919, term24919.getClass(), "pinKeyNum", -2110556060);
        setField(term24919, term24919.getClass(), "pinKeyHash", "CaalXzRXQI");
        setField(term24919, term24919.getClass(), "imageUrl", "eRBnKPjyVg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPinKeyNum", argTypes, term24919, args);
    }

};



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

public class Pin_getPinKeyHash_192646012810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25061;

    public Pin_getPinKeyHash_192646012810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25061 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25061, term25061.getClass(), "pinNum", 340719678);
        setField(term25061, term25061.getClass(), "pinHash", "TLjhFZbwKO");
        setIntField(term25061, term25061.getClass(), "pinType", 299791142);
        setIntField(term25061, term25061.getClass(), "pinKeyNum", 1862191391);
        setField(term25061, term25061.getClass(), "pinKeyHash", "nxEbLIApFc");
        setField(term25061, term25061.getClass(), "imageUrl", "zzsdNZhejE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPinKeyHash", argTypes, term25061, args);
    }

};



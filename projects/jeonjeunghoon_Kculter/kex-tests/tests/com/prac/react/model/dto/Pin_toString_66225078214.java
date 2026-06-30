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

public class Pin_toString_66225078214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25385;

    public Pin_toString_66225078214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25385 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25385, term25385.getClass(), "pinNum", 1981860404);
        setField(term25385, term25385.getClass(), "pinHash", "JqbKrmVEMy");
        setIntField(term25385, term25385.getClass(), "pinType", 732174235);
        setIntField(term25385, term25385.getClass(), "pinKeyNum", 470895808);
        setField(term25385, term25385.getClass(), "pinKeyHash", "VygCEWaefB");
        setField(term25385, term25385.getClass(), "imageUrl", "PqhYfEyDDA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25385, args);
    }

};



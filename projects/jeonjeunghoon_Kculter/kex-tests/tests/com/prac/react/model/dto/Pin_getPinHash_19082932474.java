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

public class Pin_getPinHash_19082932474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24615;

    public Pin_getPinHash_19082932474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24615 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24615, term24615.getClass(), "pinNum", -1973791064);
        setField(term24615, term24615.getClass(), "pinHash", "ywoADeiUfF");
        setIntField(term24615, term24615.getClass(), "pinType", -2072158633);
        setIntField(term24615, term24615.getClass(), "pinKeyNum", -355469363);
        setField(term24615, term24615.getClass(), "pinKeyHash", "loHiudJxbt");
        setField(term24615, term24615.getClass(), "imageUrl", "lRbxbybNew");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPinHash", argTypes, term24615, args);
    }

};



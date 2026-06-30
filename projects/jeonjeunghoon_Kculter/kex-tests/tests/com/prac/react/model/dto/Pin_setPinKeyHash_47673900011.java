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

public class Pin_setPinKeyHash_47673900011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25131;

    public Pin_setPinKeyHash_47673900011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25131 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25131, term25131.getClass(), "pinNum", 1131398807);
        setField(term25131, term25131.getClass(), "pinHash", "ILoodMZrgR");
        setIntField(term25131, term25131.getClass(), "pinType", -344907703);
        setIntField(term25131, term25131.getClass(), "pinKeyNum", 824341437);
        setField(term25131, term25131.getClass(), "pinKeyHash", "XQiKmsCacK");
        setField(term25131, term25131.getClass(), "imageUrl", "cTCixEbHYT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bqKksqtAdT";
        callMethod(klass, "setPinKeyHash", argTypes, term25131, args);
    }

};



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

public class Pin_setPinNum_17818860263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24543;
     Object term24583;

    public Pin_setPinNum_17818860263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24543 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24543, term24543.getClass(), "pinNum", -1224443634);
        setField(term24543, term24543.getClass(), "pinHash", "JJUWbMXpyM");
        setIntField(term24543, term24543.getClass(), "pinType", 1048451946);
        setIntField(term24543, term24543.getClass(), "pinKeyNum", 5603560);
        setField(term24543, term24543.getClass(), "pinKeyHash", "KDrRQWVXok");
        setField(term24543, term24543.getClass(), "imageUrl", "oOOwvWgxtf");
        term24583 = new Integer(-1079020032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24583;
        callMethod(klass, "setPinNum", argTypes, term24543, args);
    }

};



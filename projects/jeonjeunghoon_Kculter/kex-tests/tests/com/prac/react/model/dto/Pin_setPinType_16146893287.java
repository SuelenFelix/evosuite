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

public class Pin_setPinType_16146893287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24847;
     Object term24887;

    public Pin_setPinType_16146893287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24847 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24847, term24847.getClass(), "pinNum", 173952451);
        setField(term24847, term24847.getClass(), "pinHash", "djWEnlbOXu");
        setIntField(term24847, term24847.getClass(), "pinType", -1972033388);
        setIntField(term24847, term24847.getClass(), "pinKeyNum", -1005024758);
        setField(term24847, term24847.getClass(), "pinKeyHash", "MvDMzQBWME");
        setField(term24847, term24847.getClass(), "imageUrl", "sZyAwmdGVS");
        term24887 = new Integer(2634669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24887;
        callMethod(klass, "setPinType", argTypes, term24847, args);
    }

};



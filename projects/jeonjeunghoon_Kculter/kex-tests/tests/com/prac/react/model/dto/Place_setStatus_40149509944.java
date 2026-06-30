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

public class Place_setStatus_40149509944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8605;
     Object term8611;

    public Place_setStatus_40149509944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8605 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8605, term8605.getClass(), "placeNum", 0);
        setField(term8605, term8605.getClass(), "keyHash", null);
        setIntField(term8605, term8605.getClass(), "placeType", 0);
        setField(term8605, term8605.getClass(), "culture", null);
        setField(term8605, term8605.getClass(), "kpop", null);
        setDoubleField(term8605, term8605.getClass(), "lat", 0.0);
        setDoubleField(term8605, term8605.getClass(), "lng", 0.0);
        setIntField(term8605, term8605.getClass(), "status", 0);
        setField(term8605, term8605.getClass(), "name", null);
        setField(term8605, term8605.getClass(), "explain", null);
        setField(term8605, term8605.getClass(), "address", null);
        setField(term8605, term8605.getClass(), "fileUrl", null);
        term8611 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8611;
        callMethod(klass, "setStatus", argTypes, term8605, args);
    }

};



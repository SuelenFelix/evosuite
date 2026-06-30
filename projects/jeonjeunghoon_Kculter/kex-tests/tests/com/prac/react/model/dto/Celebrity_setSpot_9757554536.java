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

public class Celebrity_setSpot_9757554536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17761;
     Object term17766;

    public Celebrity_setSpot_9757554536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17761 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17761, term17761.getClass(), "keyNum", 0);
        setField(term17761, term17761.getClass(), "name", null);
        setIntField(term17761, term17761.getClass(), "likeCount", 0);
        setIntField(term17761, term17761.getClass(), "status", 0);
        setField(term17761, term17761.getClass(), "explain", null);
        setField(term17761, term17761.getClass(), "fileUrl", null);
        setField(term17761, term17761.getClass(), "keyHash", null);
        setIntField(term17761, term17761.getClass(), "spot", 0);
        term17766 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17766;
        callMethod(klass, "setSpot", argTypes, term17761, args);
    }

};


